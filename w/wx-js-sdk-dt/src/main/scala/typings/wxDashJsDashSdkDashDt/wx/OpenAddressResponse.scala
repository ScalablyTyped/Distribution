package typings.wxDashJsDashSdkDashDt.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * openAddress的返回数据
  */
trait OpenAddressResponse extends js.Object {
   // 国标收货地址第一级地址（省）
  var cityName: String
   // 国标收货地址第二级地址（市）
  var countryName: String
   // 国标收货地址第三级地址（国家）
  var detailInfo: String
  var errMsg: String
   // 详细收货地址信息
  var nationalCode: String
   // 收货人姓名
  var postalCode: String
   // 邮编
  var provinceName: String
   // 收货地址国家码
  var telNumber: String
  var userName: String
}

object OpenAddressResponse {
  @scala.inline
  def apply(
    cityName: String,
    countryName: String,
    detailInfo: String,
    errMsg: String,
    nationalCode: String,
    postalCode: String,
    provinceName: String,
    telNumber: String,
    userName: String
  ): OpenAddressResponse = {
    val __obj = js.Dynamic.literal(cityName = cityName, countryName = countryName, detailInfo = detailInfo, errMsg = errMsg, nationalCode = nationalCode, postalCode = postalCode, provinceName = provinceName, telNumber = telNumber, userName = userName)
  
    __obj.asInstanceOf[OpenAddressResponse]
  }
}

