package typings.uniDashApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChooseAddressRes extends js.Object {
  /**
    * 国标收货地址第二级地址
    */
  var cityName: js.UndefOr[String] = js.undefined
  /**
    * 国标收货地址第三级地址
    */
  var countyName: js.UndefOr[String] = js.undefined
  /**
    * 详细收货地址信息
    */
  var detailInfo: js.UndefOr[String] = js.undefined
  /**
    * 调用结果
    */
  var errMsg: js.UndefOr[String] = js.undefined
  /**
    * 收货地址国家码
    */
  var nationalCode: js.UndefOr[String] = js.undefined
  /**
    * 邮编
    */
  var postalCode: js.UndefOr[String] = js.undefined
  /**
    * 国标收货地址第一级地址
    */
  var provinceName: js.UndefOr[String] = js.undefined
  /**
    * 收货人手机号码
    */
  var telNumber: js.UndefOr[String] = js.undefined
  /**
    * 收货人姓名
    */
  var userName: js.UndefOr[String] = js.undefined
}

object ChooseAddressRes {
  @scala.inline
  def apply(
    cityName: String = null,
    countyName: String = null,
    detailInfo: String = null,
    errMsg: String = null,
    nationalCode: String = null,
    postalCode: String = null,
    provinceName: String = null,
    telNumber: String = null,
    userName: String = null
  ): ChooseAddressRes = {
    val __obj = js.Dynamic.literal()
    if (cityName != null) __obj.updateDynamic("cityName")(cityName.asInstanceOf[js.Any])
    if (countyName != null) __obj.updateDynamic("countyName")(countyName.asInstanceOf[js.Any])
    if (detailInfo != null) __obj.updateDynamic("detailInfo")(detailInfo.asInstanceOf[js.Any])
    if (errMsg != null) __obj.updateDynamic("errMsg")(errMsg.asInstanceOf[js.Any])
    if (nationalCode != null) __obj.updateDynamic("nationalCode")(nationalCode.asInstanceOf[js.Any])
    if (postalCode != null) __obj.updateDynamic("postalCode")(postalCode.asInstanceOf[js.Any])
    if (provinceName != null) __obj.updateDynamic("provinceName")(provinceName.asInstanceOf[js.Any])
    if (telNumber != null) __obj.updateDynamic("telNumber")(telNumber.asInstanceOf[js.Any])
    if (userName != null) __obj.updateDynamic("userName")(userName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChooseAddressRes]
  }
}

