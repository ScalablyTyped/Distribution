package typings.wepy.wxUnderscoreEnhancedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WechatProfileDetails extends js.Object {
  var email: js.UndefOr[String] = js.undefined
  var firstName: js.UndefOr[String] = js.undefined
  var homeAddressCity: js.UndefOr[String] = js.undefined
  var homeAddressCountry: js.UndefOr[String] = js.undefined
  var homeAddressPostalCode: js.UndefOr[String] = js.undefined
  var homeAddressState: js.UndefOr[String] = js.undefined
  var homeAddressStreet: js.UndefOr[String] = js.undefined
  var homeFaxNumber: js.UndefOr[String] = js.undefined
  var homePhoneNumber: js.UndefOr[String] = js.undefined
  var lastName: js.UndefOr[String] = js.undefined
  var middleName: js.UndefOr[String] = js.undefined
  var mobilePhoneNumber: js.UndefOr[String] = js.undefined
  var nickName: js.UndefOr[String] = js.undefined
  var photoFilePath: js.UndefOr[String] = js.undefined
  var remark: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String] = js.undefined
  var workAddressCity: js.UndefOr[String] = js.undefined
  var workAddressCountry: js.UndefOr[String] = js.undefined
  var workAddressPostalCode: js.UndefOr[String] = js.undefined
  var workAddressState: js.UndefOr[String] = js.undefined
  var workAddressStreet: js.UndefOr[String] = js.undefined
}

object WechatProfileDetails {
  @scala.inline
  def apply(
    email: String = null,
    firstName: String = null,
    homeAddressCity: String = null,
    homeAddressCountry: String = null,
    homeAddressPostalCode: String = null,
    homeAddressState: String = null,
    homeAddressStreet: String = null,
    homeFaxNumber: String = null,
    homePhoneNumber: String = null,
    lastName: String = null,
    middleName: String = null,
    mobilePhoneNumber: String = null,
    nickName: String = null,
    photoFilePath: String = null,
    remark: String = null,
    url: String = null,
    workAddressCity: String = null,
    workAddressCountry: String = null,
    workAddressPostalCode: String = null,
    workAddressState: String = null,
    workAddressStreet: String = null
  ): WechatProfileDetails = {
    val __obj = js.Dynamic.literal()
    if (email != null) __obj.updateDynamic("email")(email)
    if (firstName != null) __obj.updateDynamic("firstName")(firstName)
    if (homeAddressCity != null) __obj.updateDynamic("homeAddressCity")(homeAddressCity)
    if (homeAddressCountry != null) __obj.updateDynamic("homeAddressCountry")(homeAddressCountry)
    if (homeAddressPostalCode != null) __obj.updateDynamic("homeAddressPostalCode")(homeAddressPostalCode)
    if (homeAddressState != null) __obj.updateDynamic("homeAddressState")(homeAddressState)
    if (homeAddressStreet != null) __obj.updateDynamic("homeAddressStreet")(homeAddressStreet)
    if (homeFaxNumber != null) __obj.updateDynamic("homeFaxNumber")(homeFaxNumber)
    if (homePhoneNumber != null) __obj.updateDynamic("homePhoneNumber")(homePhoneNumber)
    if (lastName != null) __obj.updateDynamic("lastName")(lastName)
    if (middleName != null) __obj.updateDynamic("middleName")(middleName)
    if (mobilePhoneNumber != null) __obj.updateDynamic("mobilePhoneNumber")(mobilePhoneNumber)
    if (nickName != null) __obj.updateDynamic("nickName")(nickName)
    if (photoFilePath != null) __obj.updateDynamic("photoFilePath")(photoFilePath)
    if (remark != null) __obj.updateDynamic("remark")(remark)
    if (url != null) __obj.updateDynamic("url")(url)
    if (workAddressCity != null) __obj.updateDynamic("workAddressCity")(workAddressCity)
    if (workAddressCountry != null) __obj.updateDynamic("workAddressCountry")(workAddressCountry)
    if (workAddressPostalCode != null) __obj.updateDynamic("workAddressPostalCode")(workAddressPostalCode)
    if (workAddressState != null) __obj.updateDynamic("workAddressState")(workAddressState)
    if (workAddressStreet != null) __obj.updateDynamic("workAddressStreet")(workAddressStreet)
    __obj.asInstanceOf[WechatProfileDetails]
  }
}

