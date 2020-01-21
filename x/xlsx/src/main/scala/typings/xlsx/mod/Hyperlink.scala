package typings.xlsx.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Hyperlink extends js.Object {
  /** Target of the link (HREF) */
  var Target: String
  /** Plaintext tooltip to display when mouse is over cell */
  var Tooltip: js.UndefOr[String] = js.undefined
}

object Hyperlink {
  @scala.inline
  def apply(Target: String, Tooltip: String = null): Hyperlink = {
    val __obj = js.Dynamic.literal(Target = Target.asInstanceOf[js.Any])
    if (Tooltip != null) __obj.updateDynamic("Tooltip")(Tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hyperlink]
  }
}

