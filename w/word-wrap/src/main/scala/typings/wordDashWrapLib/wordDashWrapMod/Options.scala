package typings
package wordDashWrapLib.wordDashWrapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Break a word between any two letters when the word is longer than the specified width.
    *
    * Default: false
    */
  var cut: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * An escape function to run on each line after splitting them.
    *
    * Default: function(str){return str;}
    */
  var escape: js.UndefOr[js.Function1[/* str */ java.lang.String, java.lang.String]] = js.undefined
  /**
    * The string to use at the beginning of each line.
    *
    * Default: `  ` (two spaces)
    */
  var indent: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The string to use at the end of each line.
    *
    * Default: \n
    */
  var newline: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Trim trailing whitespace from the returned string. This option is included since .trim() would also strip the leading indentation from the first line.
    *
    * Default: false
    */
  var trim: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The width of the text before wrapping to a new line.
    *
    * Default: 50
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    cut: js.UndefOr[scala.Boolean] = js.undefined,
    escape: /* str */ java.lang.String => java.lang.String = null,
    indent: java.lang.String = null,
    newline: java.lang.String = null,
    trim: js.UndefOr[scala.Boolean] = js.undefined,
    width: scala.Int | scala.Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cut)) __obj.updateDynamic("cut")(cut)
    if (escape != null) __obj.updateDynamic("escape")(js.Any.fromFunction1(escape))
    if (indent != null) __obj.updateDynamic("indent")(indent)
    if (newline != null) __obj.updateDynamic("newline")(newline)
    if (!js.isUndefined(trim)) __obj.updateDynamic("trim")(trim)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

