package typings
package xlsxLib.xlsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Hyperlink extends js.Object {
  /** Target of the link (HREF) */
  var Target: java.lang.String
  /** Plaintext tooltip to display when mouse is over cell */
  var Tooltip: js.UndefOr[java.lang.String] = js.undefined
}

object Hyperlink {
  @scala.inline
  def apply(Target: java.lang.String, Tooltip: java.lang.String = null): Hyperlink = {
    val __obj = js.Dynamic.literal(Target = Target)
    if (Tooltip != null) __obj.updateDynamic("Tooltip")(Tooltip)
    __obj.asInstanceOf[Hyperlink]
  }
}

