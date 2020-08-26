package typings.uiBox.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SafeHref extends js.Object {
  var safeHref: js.UndefOr[String] = js.native
  var safeRel: String = js.native
}

object SafeHref {
  @scala.inline
  def apply(safeRel: String): SafeHref = {
    val __obj = js.Dynamic.literal(safeRel = safeRel.asInstanceOf[js.Any])
    __obj.asInstanceOf[SafeHref]
  }
  @scala.inline
  implicit class SafeHrefOps[Self <: SafeHref] (val x: Self) extends AnyVal {
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
    def setSafeRel(value: String): Self = this.set("safeRel", value.asInstanceOf[js.Any])
    @scala.inline
    def setSafeHref(value: String): Self = this.set("safeHref", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSafeHref: Self = this.set("safeHref", js.undefined)
  }
  
}

