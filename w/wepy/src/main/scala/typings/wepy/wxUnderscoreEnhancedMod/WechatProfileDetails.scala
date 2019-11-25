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
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (firstName != null) __obj.updateDynamic("firstName")(firstName.asInstanceOf[js.Any])
    if (homeAddressCity != null) __obj.updateDynamic("homeAddressCity")(homeAddressCity.asInstanceOf[js.Any])
    if (homeAddressCountry != null) __obj.updateDynamic("homeAddressCountry")(homeAddressCountry.asInstanceOf[js.Any])
    if (homeAddressPostalCode != null) __obj.updateDynamic("homeAddressPostalCode")(homeAddressPostalCode.asInstanceOf[js.Any])
    if (homeAddressState != null) __obj.updateDynamic("homeAddressState")(homeAddressState.asInstanceOf[js.Any])
    if (homeAddressStreet != null) __obj.updateDynamic("homeAddressStreet")(homeAddressStreet.asInstanceOf[js.Any])
    if (homeFaxNumber != null) __obj.updateDynamic("homeFaxNumber")(homeFaxNumber.asInstanceOf[js.Any])
    if (homePhoneNumber != null) __obj.updateDynamic("homePhoneNumber")(homePhoneNumber.asInstanceOf[js.Any])
    if (lastName != null) __obj.updateDynamic("lastName")(lastName.asInstanceOf[js.Any])
    if (middleName != null) __obj.updateDynamic("middleName")(middleName.asInstanceOf[js.Any])
    if (mobilePhoneNumber != null) __obj.updateDynamic("mobilePhoneNumber")(mobilePhoneNumber.asInstanceOf[js.Any])
    if (nickName != null) __obj.updateDynamic("nickName")(nickName.asInstanceOf[js.Any])
    if (photoFilePath != null) __obj.updateDynamic("photoFilePath")(photoFilePath.asInstanceOf[js.Any])
    if (remark != null) __obj.updateDynamic("remark")(remark.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (workAddressCity != null) __obj.updateDynamic("workAddressCity")(workAddressCity.asInstanceOf[js.Any])
    if (workAddressCountry != null) __obj.updateDynamic("workAddressCountry")(workAddressCountry.asInstanceOf[js.Any])
    if (workAddressPostalCode != null) __obj.updateDynamic("workAddressPostalCode")(workAddressPostalCode.asInstanceOf[js.Any])
    if (workAddressState != null) __obj.updateDynamic("workAddressState")(workAddressState.asInstanceOf[js.Any])
    if (workAddressStreet != null) __obj.updateDynamic("workAddressStreet")(workAddressStreet.asInstanceOf[js.Any])
    __obj.asInstanceOf[WechatProfileDetails]
  }
}

