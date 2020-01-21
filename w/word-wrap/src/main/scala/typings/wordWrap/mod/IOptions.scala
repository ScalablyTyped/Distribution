package typings.wordWrap.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOptions extends js.Object {
  /**
    * Break a word between any two letters when the word is longer
    * than the specified width.
    * @default false
    */
  var cut: js.UndefOr[Boolean] = js.undefined
  /**
    * An escape function to run on each line after splitting them.
    * @default (str: string) => string;
    */
  var escape: js.UndefOr[js.Function1[/* str */ String, String]] = js.undefined
  /**
    * The string to use at the beginning of each line.
    * @default ´  ´ (two spaces)
    */
  var indent: js.UndefOr[String] = js.undefined
  /**
    * The string to use at the end of each line.
    * @default ´\n´
    */
  var newline: js.UndefOr[String] = js.undefined
  /**
    * Trim trailing whitespace from the returned string.
    * This option is included since .trim() would also strip
    * the leading indentation from the first line.
    * @default true
    */
  var trim: js.UndefOr[Boolean] = js.undefined
  /**
    * The width of the text before wrapping to a new line.
    * @default ´50´
    */
  var width: js.UndefOr[Double] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(
    cut: js.UndefOr[Boolean] = js.undefined,
    escape: /* str */ String => String = null,
    indent: String = null,
    newline: String = null,
    trim: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null
  ): IOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cut)) __obj.updateDynamic("cut")(cut.asInstanceOf[js.Any])
    if (escape != null) __obj.updateDynamic("escape")(js.Any.fromFunction1(escape))
    if (indent != null) __obj.updateDynamic("indent")(indent.asInstanceOf[js.Any])
    if (newline != null) __obj.updateDynamic("newline")(newline.asInstanceOf[js.Any])
    if (!js.isUndefined(trim)) __obj.updateDynamic("trim")(trim.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

