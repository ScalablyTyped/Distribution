package typings
package wepyLib.wxUnderscoreEnhancedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WechatProfileDetails extends js.Object {
  var email: js.UndefOr[java.lang.String] = js.undefined
  var firstName: js.UndefOr[java.lang.String] = js.undefined
  var homeAddressCity: js.UndefOr[java.lang.String] = js.undefined
  var homeAddressCountry: js.UndefOr[java.lang.String] = js.undefined
  var homeAddressPostalCode: js.UndefOr[java.lang.String] = js.undefined
  var homeAddressState: js.UndefOr[java.lang.String] = js.undefined
  var homeAddressStreet: js.UndefOr[java.lang.String] = js.undefined
  var homeFaxNumber: js.UndefOr[java.lang.String] = js.undefined
  var homePhoneNumber: js.UndefOr[java.lang.String] = js.undefined
  var lastName: js.UndefOr[java.lang.String] = js.undefined
  var middleName: js.UndefOr[java.lang.String] = js.undefined
  var mobilePhoneNumber: js.UndefOr[java.lang.String] = js.undefined
  var nickName: js.UndefOr[java.lang.String] = js.undefined
  var photoFilePath: js.UndefOr[java.lang.String] = js.undefined
  var remark: js.UndefOr[java.lang.String] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
  var workAddressCity: js.UndefOr[java.lang.String] = js.undefined
  var workAddressCountry: js.UndefOr[java.lang.String] = js.undefined
  var workAddressPostalCode: js.UndefOr[java.lang.String] = js.undefined
  var workAddressState: js.UndefOr[java.lang.String] = js.undefined
  var workAddressStreet: js.UndefOr[java.lang.String] = js.undefined
}

object WechatProfileDetails {
  @scala.inline
  def apply(
    email: java.lang.String = null,
    firstName: java.lang.String = null,
    homeAddressCity: java.lang.String = null,
    homeAddressCountry: java.lang.String = null,
    homeAddressPostalCode: java.lang.String = null,
    homeAddressState: java.lang.String = null,
    homeAddressStreet: java.lang.String = null,
    homeFaxNumber: java.lang.String = null,
    homePhoneNumber: java.lang.String = null,
    lastName: java.lang.String = null,
    middleName: java.lang.String = null,
    mobilePhoneNumber: java.lang.String = null,
    nickName: java.lang.String = null,
    photoFilePath: java.lang.String = null,
    remark: java.lang.String = null,
    url: java.lang.String = null,
    workAddressCity: java.lang.String = null,
    workAddressCountry: java.lang.String = null,
    workAddressPostalCode: java.lang.String = null,
    workAddressState: java.lang.String = null,
    workAddressStreet: java.lang.String = null
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

