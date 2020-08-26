package typings.xlsx.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Hyperlink extends js.Object {
  /** Target of the link (HREF) */
  var Target: String = js.native
  /** Plaintext tooltip to display when mouse is over cell */
  var Tooltip: js.UndefOr[String] = js.native
}

object Hyperlink {
  @scala.inline
  def apply(Target: String): Hyperlink = {
    val __obj = js.Dynamic.literal(Target = Target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hyperlink]
  }
  @scala.inline
  implicit class HyperlinkOps[Self <: Hyperlink] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTarget(value: String): Self = this.set("Target", value.asInstanceOf[js.Any])
    @scala.inline
    def setTooltip(value: String): Self = this.set("Tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltip: Self = this.set("Tooltip", js.undefined)
  }
  
}

