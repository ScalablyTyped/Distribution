package typings.xadesjs.signedXmlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionsNoticeReference extends js.Object {
  var noticeNumbers: js.Array[Double] = js.native
  var organization: String = js.native
}

object OptionsNoticeReference {
  @scala.inline
  def apply(noticeNumbers: js.Array[Double], organization: String): OptionsNoticeReference = {
    val __obj = js.Dynamic.literal(noticeNumbers = noticeNumbers.asInstanceOf[js.Any], organization = organization.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsNoticeReference]
  }
  @scala.inline
  implicit class OptionsNoticeReferenceOps[Self <: OptionsNoticeReference] (val x: Self) extends AnyVal {
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
    def setNoticeNumbersVarargs(value: Double*): Self = this.set("noticeNumbers", js.Array(value :_*))
    @scala.inline
    def setNoticeNumbers(value: js.Array[Double]): Self = this.set("noticeNumbers", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrganization(value: String): Self = this.set("organization", value.asInstanceOf[js.Any])
  }
  
}

