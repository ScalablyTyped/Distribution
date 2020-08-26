package typings.weixinApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 设备-----手机联系人
@js.native
trait PhoneContact
  extends BaseOptions[js.Any, js.Any] {
  /** 联系地址城市 */
  var addressCity: js.UndefOr[String] = js.native
  /** 联系地址国家 */
  var addressCountry: js.UndefOr[String] = js.native
  /** 联系地址邮政编码 */
  var addressPostalCode: js.UndefOr[String] = js.native
  /** 联系地址省份 */
  var addressState: js.UndefOr[String] = js.native
  /** 联系地址街道 */
  var addressStreet: js.UndefOr[String] = js.native
  /** 电子邮件 */
  var email: js.UndefOr[String] = js.native
  /** 名字 */
  var firstName: String = js.native
  /** 住宅地址城市 */
  var homeAddressCity: js.UndefOr[String] = js.native
  /** 住宅地址国家 */
  var homeAddressCountry: js.UndefOr[String] = js.native
  /** 住宅地址邮政编码 */
  var homeAddressPostalCode: js.UndefOr[String] = js.native
  /** 住宅地址省份 */
  var homeAddressState: js.UndefOr[String] = js.native
  /** 住宅地址街道 */
  var homeAddressStreet: js.UndefOr[String] = js.native
  /** 住宅传真 */
  var homeFaxNumber: js.UndefOr[String] = js.native
  /** 住宅电话 */
  var homePhoneNumber: js.UndefOr[String] = js.native
  /** 公司电话 */
  var hostNumber: js.UndefOr[String] = js.native
  /** 姓氏 */
  var lastName: js.UndefOr[String] = js.native
  /** 中间名 */
  var middleName: js.UndefOr[String] = js.native
  /** 手机号 */
  var mobilePhoneNumber: js.UndefOr[String] = js.native
  /** 昵称 */
  var nickName: js.UndefOr[String] = js.native
  /** 公司 */
  var organization: js.UndefOr[String] = js.native
  /** 头像本地文件路径 */
  var photoFilePath: js.UndefOr[String] = js.native
  /** 备注 */
  var remark: js.UndefOr[String] = js.native
  /** 职位 */
  var title: js.UndefOr[String] = js.native
  /** 网站 */
  var url: js.UndefOr[String] = js.native
  /** 微信号 */
  var weChatNumber: js.UndefOr[String] = js.native
  /** 工作地址城市 */
  var workAddressCity: js.UndefOr[String] = js.native
  /** 工作地址国家 */
  var workAddressCountry: js.UndefOr[String] = js.native
  /** 工作地址邮政编码 */
  var workAddressPostalCode: js.UndefOr[String] = js.native
  /** 工作地址省份 */
  var workAddressState: js.UndefOr[String] = js.native
  /** 工作地址街道 */
  var workAddressStreet: js.UndefOr[String] = js.native
  /** 工作传真 */
  var workFaxNumber: js.UndefOr[String] = js.native
  /** 工作电话 */
  var workPhoneNumber: js.UndefOr[String] = js.native
}

object PhoneContact {
  @scala.inline
  def apply(firstName: String): PhoneContact = {
    val __obj = js.Dynamic.literal(firstName = firstName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhoneContact]
  }
  @scala.inline
  implicit class PhoneContactOps[Self <: PhoneContact] (val x: Self) extends AnyVal {
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
    def setFirstName(value: String): Self = this.set("firstName", value.asInstanceOf[js.Any])
    @scala.inline
    def setAddressCity(value: String): Self = this.set("addressCity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddressCity: Self = this.set("addressCity", js.undefined)
    @scala.inline
    def setAddressCountry(value: String): Self = this.set("addressCountry", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddressCountry: Self = this.set("addressCountry", js.undefined)
    @scala.inline
    def setAddressPostalCode(value: String): Self = this.set("addressPostalCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddressPostalCode: Self = this.set("addressPostalCode", js.undefined)
    @scala.inline
    def setAddressState(value: String): Self = this.set("addressState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddressState: Self = this.set("addressState", js.undefined)
    @scala.inline
    def setAddressStreet(value: String): Self = this.set("addressStreet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddressStreet: Self = this.set("addressStreet", js.undefined)
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    @scala.inline
    def setHomeAddressCity(value: String): Self = this.set("homeAddressCity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHomeAddressCity: Self = this.set("homeAddressCity", js.undefined)
    @scala.inline
    def setHomeAddressCountry(value: String): Self = this.set("homeAddressCountry", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHomeAddressCountry: Self = this.set("homeAddressCountry", js.undefined)
    @scala.inline
    def setHomeAddressPostalCode(value: String): Self = this.set("homeAddressPostalCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHomeAddressPostalCode: Self = this.set("homeAddressPostalCode", js.undefined)
    @scala.inline
    def setHomeAddressState(value: String): Self = this.set("homeAddressState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHomeAddressState: Self = this.set("homeAddressState", js.undefined)
    @scala.inline
    def setHomeAddressStreet(value: String): Self = this.set("homeAddressStreet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHomeAddressStreet: Self = this.set("homeAddressStreet", js.undefined)
    @scala.inline
    def setHomeFaxNumber(value: String): Self = this.set("homeFaxNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHomeFaxNumber: Self = this.set("homeFaxNumber", js.undefined)
    @scala.inline
    def setHomePhoneNumber(value: String): Self = this.set("homePhoneNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHomePhoneNumber: Self = this.set("homePhoneNumber", js.undefined)
    @scala.inline
    def setHostNumber(value: String): Self = this.set("hostNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHostNumber: Self = this.set("hostNumber", js.undefined)
    @scala.inline
    def setLastName(value: String): Self = this.set("lastName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastName: Self = this.set("lastName", js.undefined)
    @scala.inline
    def setMiddleName(value: String): Self = this.set("middleName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMiddleName: Self = this.set("middleName", js.undefined)
    @scala.inline
    def setMobilePhoneNumber(value: String): Self = this.set("mobilePhoneNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMobilePhoneNumber: Self = this.set("mobilePhoneNumber", js.undefined)
    @scala.inline
    def setNickName(value: String): Self = this.set("nickName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNickName: Self = this.set("nickName", js.undefined)
    @scala.inline
    def setOrganization(value: String): Self = this.set("organization", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrganization: Self = this.set("organization", js.undefined)
    @scala.inline
    def setPhotoFilePath(value: String): Self = this.set("photoFilePath", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhotoFilePath: Self = this.set("photoFilePath", js.undefined)
    @scala.inline
    def setRemark(value: String): Self = this.set("remark", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemark: Self = this.set("remark", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    @scala.inline
    def setWeChatNumber(value: String): Self = this.set("weChatNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWeChatNumber: Self = this.set("weChatNumber", js.undefined)
    @scala.inline
    def setWorkAddressCity(value: String): Self = this.set("workAddressCity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkAddressCity: Self = this.set("workAddressCity", js.undefined)
    @scala.inline
    def setWorkAddressCountry(value: String): Self = this.set("workAddressCountry", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkAddressCountry: Self = this.set("workAddressCountry", js.undefined)
    @scala.inline
    def setWorkAddressPostalCode(value: String): Self = this.set("workAddressPostalCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkAddressPostalCode: Self = this.set("workAddressPostalCode", js.undefined)
    @scala.inline
    def setWorkAddressState(value: String): Self = this.set("workAddressState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkAddressState: Self = this.set("workAddressState", js.undefined)
    @scala.inline
    def setWorkAddressStreet(value: String): Self = this.set("workAddressStreet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkAddressStreet: Self = this.set("workAddressStreet", js.undefined)
    @scala.inline
    def setWorkFaxNumber(value: String): Self = this.set("workFaxNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkFaxNumber: Self = this.set("workFaxNumber", js.undefined)
    @scala.inline
    def setWorkPhoneNumber(value: String): Self = this.set("workPhoneNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkPhoneNumber: Self = this.set("workPhoneNumber", js.undefined)
  }
  
}

