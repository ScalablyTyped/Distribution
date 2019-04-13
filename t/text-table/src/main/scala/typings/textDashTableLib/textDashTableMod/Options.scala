package typings
package textDashTableLib.textDashTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /** An array of alignment types for each column, default ['l','l',...]. */
  var align: js.UndefOr[
    js.Array[
      textDashTableLib.textDashTableLibStrings.l | textDashTableLib.textDashTableLibStrings.r | textDashTableLib.textDashTableLibStrings.c | textDashTableLib.textDashTableLibStrings.DOT
    ]
  ] = js.undefined
  /** Separator to use between columns, (default: ' '). */
  var hsep: js.UndefOr[java.lang.String] = js.undefined
  /** A callback function to use when calculating the string length. */
  var stringLength: js.UndefOr[js.Function1[/* str */ java.lang.String, scala.Double]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    align: js.Array[
      textDashTableLib.textDashTableLibStrings.l | textDashTableLib.textDashTableLibStrings.r | textDashTableLib.textDashTableLibStrings.c | textDashTableLib.textDashTableLibStrings.DOT
    ] = null,
    hsep: java.lang.String = null,
    stringLength: /* str */ java.lang.String => scala.Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align)
    if (hsep != null) __obj.updateDynamic("hsep")(hsep)
    if (stringLength != null) __obj.updateDynamic("stringLength")(js.Any.fromFunction1(stringLength))
    __obj.asInstanceOf[Options]
  }
}

