package typings.textTable.mod

import typings.textTable.textTableStrings.Dot
import typings.textTable.textTableStrings.c
import typings.textTable.textTableStrings.l
import typings.textTable.textTableStrings.r
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /** An array of alignment types for each column, default ['l','l',...]. */
  var align: js.UndefOr[js.Array[js.UndefOr[l | r | c | Dot | Null]]] = js.undefined
  /** Separator to use between columns, (default: ' '). */
  var hsep: js.UndefOr[String] = js.undefined
  /** A callback function to use when calculating the string length. */
  var stringLength: js.UndefOr[js.Function1[/* str */ String, Double]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    align: js.Array[js.UndefOr[l | r | c | Dot | Null]] = null,
    hsep: String = null,
    stringLength: /* str */ String => Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (hsep != null) __obj.updateDynamic("hsep")(hsep.asInstanceOf[js.Any])
    if (stringLength != null) __obj.updateDynamic("stringLength")(js.Any.fromFunction1(stringLength))
    __obj.asInstanceOf[Options]
  }
}

