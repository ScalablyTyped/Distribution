package typings.uniDashApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddPhoneContactOptions extends js.Object {
  /**
    * 联系地址城市
    */
  var addressCity: js.UndefOr[String] = js.undefined
  /**
    * 联系地址国家
    */
  var addressCountry: js.UndefOr[String] = js.undefined
  /**
    * 联系地址邮政编码
    */
  var addressPostalCode: js.UndefOr[String] = js.undefined
  /**
    * 联系地址省份
    */
  var addressState: js.UndefOr[String] = js.undefined
  /**
    * 联系地址街道
    */
  var addressStreet: js.UndefOr[String] = js.undefined
  /**
    * 接口调用结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 电子邮件
    */
  var email: js.UndefOr[String] = js.undefined
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 名字
    */
  var firstName: js.UndefOr[String] = js.undefined
  /**
    * 住宅地址城市
    */
  var homeAddressCity: js.UndefOr[String] = js.undefined
  /**
    * 住宅地址国家
    */
  var homeAddressCountry: js.UndefOr[String] = js.undefined
  /**
    * 住宅地址邮政编码
    */
  var homeAddressPostalCode: js.UndefOr[String] = js.undefined
  /**
    * 住宅地址省份
    */
  var homeAddressState: js.UndefOr[String] = js.undefined
  /**
    * 住宅地址街道
    */
  var homeAddressStreet: js.UndefOr[String] = js.undefined
  /**
    * 住宅传真
    */
  var homeFaxNumber: js.UndefOr[String] = js.undefined
  /**
    * 住宅电话
    */
  var homePhoneNumber: js.UndefOr[String] = js.undefined
  /**
    * 公司电话
    */
  var hostNumber: js.UndefOr[String] = js.undefined
  /**
    * 姓氏
    */
  var lastName: js.UndefOr[String] = js.undefined
  /**
    * 中间名
    */
  var middleName: js.UndefOr[String] = js.undefined
  /**
    * 手机号
    */
  var mobilePhoneNumber: js.UndefOr[String] = js.undefined
  /**
    * 昵称
    */
  var nickName: js.UndefOr[String] = js.undefined
  /**
    * 公司
    */
  var organization: js.UndefOr[String] = js.undefined
  /**
    * 头像本地文件路径
    */
  var photoFilePath: js.UndefOr[String] = js.undefined
  /**
    * 备注
    */
  var remark: js.UndefOr[String] = js.undefined
  /**
    * 接口调用成功的回调函数
    */
  var success: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 职位
    */
  var title: js.UndefOr[String] = js.undefined
  /**
    * 网站
    */
  var url: js.UndefOr[String] = js.undefined
  /**
    * 微信号
    */
  var weChatNumber: js.UndefOr[String] = js.undefined
  /**
    * 工作地址城市
    */
  var workAddressCity: js.UndefOr[String] = js.undefined
  /**
    * 工作地址国家
    */
  var workAddressCountry: js.UndefOr[String] = js.undefined
  /**
    * 工作地址邮政编码
    */
  var workAddressPostalCode: js.UndefOr[String] = js.undefined
  /**
    * 工作地址省份
    */
  var workAddressState: js.UndefOr[String] = js.undefined
  /**
    * 工作地址街道
    */
  var workAddressStreet: js.UndefOr[String] = js.undefined
  /**
    * 工作传真
    */
  var workFaxNumber: js.UndefOr[String] = js.undefined
  /**
    * 工作电话
    */
  var workPhoneNumber: js.UndefOr[String] = js.undefined
}

object AddPhoneContactOptions {
  @scala.inline
  def apply(
    addressCity: String = null,
    addressCountry: String = null,
    addressPostalCode: String = null,
    addressState: String = null,
    addressStreet: String = null,
    complete: () => Unit = null,
    email: String = null,
    fail: () => Unit = null,
    firstName: String = null,
    homeAddressCity: String = null,
    homeAddressCountry: String = null,
    homeAddressPostalCode: String = null,
    homeAddressState: String = null,
    homeAddressStreet: String = null,
    homeFaxNumber: String = null,
    homePhoneNumber: String = null,
    hostNumber: String = null,
    lastName: String = null,
    middleName: String = null,
    mobilePhoneNumber: String = null,
    nickName: String = null,
    organization: String = null,
    photoFilePath: String = null,
    remark: String = null,
    success: () => Unit = null,
    title: String = null,
    url: String = null,
    weChatNumber: String = null,
    workAddressCity: String = null,
    workAddressCountry: String = null,
    workAddressPostalCode: String = null,
    workAddressState: String = null,
    workAddressStreet: String = null,
    workFaxNumber: String = null,
    workPhoneNumber: String = null
  ): AddPhoneContactOptions = {
    val __obj = js.Dynamic.literal()
    if (addressCity != null) __obj.updateDynamic("addressCity")(addressCity)
    if (addressCountry != null) __obj.updateDynamic("addressCountry")(addressCountry)
    if (addressPostalCode != null) __obj.updateDynamic("addressPostalCode")(addressPostalCode)
    if (addressState != null) __obj.updateDynamic("addressState")(addressState)
    if (addressStreet != null) __obj.updateDynamic("addressStreet")(addressStreet)
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (email != null) __obj.updateDynamic("email")(email)
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction0(fail))
    if (firstName != null) __obj.updateDynamic("firstName")(firstName)
    if (homeAddressCity != null) __obj.updateDynamic("homeAddressCity")(homeAddressCity)
    if (homeAddressCountry != null) __obj.updateDynamic("homeAddressCountry")(homeAddressCountry)
    if (homeAddressPostalCode != null) __obj.updateDynamic("homeAddressPostalCode")(homeAddressPostalCode)
    if (homeAddressState != null) __obj.updateDynamic("homeAddressState")(homeAddressState)
    if (homeAddressStreet != null) __obj.updateDynamic("homeAddressStreet")(homeAddressStreet)
    if (homeFaxNumber != null) __obj.updateDynamic("homeFaxNumber")(homeFaxNumber)
    if (homePhoneNumber != null) __obj.updateDynamic("homePhoneNumber")(homePhoneNumber)
    if (hostNumber != null) __obj.updateDynamic("hostNumber")(hostNumber)
    if (lastName != null) __obj.updateDynamic("lastName")(lastName)
    if (middleName != null) __obj.updateDynamic("middleName")(middleName)
    if (mobilePhoneNumber != null) __obj.updateDynamic("mobilePhoneNumber")(mobilePhoneNumber)
    if (nickName != null) __obj.updateDynamic("nickName")(nickName)
    if (organization != null) __obj.updateDynamic("organization")(organization)
    if (photoFilePath != null) __obj.updateDynamic("photoFilePath")(photoFilePath)
    if (remark != null) __obj.updateDynamic("remark")(remark)
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction0(success))
    if (title != null) __obj.updateDynamic("title")(title)
    if (url != null) __obj.updateDynamic("url")(url)
    if (weChatNumber != null) __obj.updateDynamic("weChatNumber")(weChatNumber)
    if (workAddressCity != null) __obj.updateDynamic("workAddressCity")(workAddressCity)
    if (workAddressCountry != null) __obj.updateDynamic("workAddressCountry")(workAddressCountry)
    if (workAddressPostalCode != null) __obj.updateDynamic("workAddressPostalCode")(workAddressPostalCode)
    if (workAddressState != null) __obj.updateDynamic("workAddressState")(workAddressState)
    if (workAddressStreet != null) __obj.updateDynamic("workAddressStreet")(workAddressStreet)
    if (workFaxNumber != null) __obj.updateDynamic("workFaxNumber")(workFaxNumber)
    if (workPhoneNumber != null) __obj.updateDynamic("workPhoneNumber")(workPhoneNumber)
    __obj.asInstanceOf[AddPhoneContactOptions]
  }
}

