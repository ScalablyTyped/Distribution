package typings.xadesjs.signedXmlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionsPolicyUserNotice extends js.Object {
  var explicitText: js.UndefOr[String] = js.native
  var noticeRef: js.UndefOr[OptionsNoticeReference] = js.native
}

object OptionsPolicyUserNotice {
  @scala.inline
  def apply(): OptionsPolicyUserNotice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsPolicyUserNotice]
  }
  @scala.inline
  implicit class OptionsPolicyUserNoticeOps[Self <: OptionsPolicyUserNotice] (val x: Self) extends AnyVal {
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
    def setExplicitText(value: String): Self = this.set("explicitText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExplicitText: Self = this.set("explicitText", js.undefined)
    @scala.inline
    def setNoticeRef(value: OptionsNoticeReference): Self = this.set("noticeRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoticeRef: Self = this.set("noticeRef", js.undefined)
  }
  
}

