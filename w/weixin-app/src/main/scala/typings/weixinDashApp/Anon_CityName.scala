package typings.weixinDashApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CityName extends js.Object {
  /**
  			 * 国标收货地址第二级地址
  			 *
  			 */
  var cityName: String
  /**
  			 * 国标收货地址第三级地址
  			 *
  			 */
  var countyName: String
  /**
  			 * 详细收货地址信息
  			 *
  			 */
  var detailInfo: String
  /**
  			 * 调用结果
  			 *
  			 */
  var errMsg: String
  /**
  			 * 收货地址国家码
  			 *
  			 */
  var nationalCode: String
  /**
  			 * 邮编
  			 *
  			 */
  var postalCode: String
  /**
  			 * 国标收货地址第一级地址
  			 *
  			 */
  var provinceName: String
  /**
  			 * 收货人手机号码
  			 *
  			 */
  var telNumber: String
  /**
  			 * 收货人姓名
  			 *
  			 */
  var userName: String
}

object Anon_CityName {
  @scala.inline
  def apply(
    cityName: String,
    countyName: String,
    detailInfo: String,
    errMsg: String,
    nationalCode: String,
    postalCode: String,
    provinceName: String,
    telNumber: String,
    userName: String
  ): Anon_CityName = {
    val __obj = js.Dynamic.literal(cityName = cityName, countyName = countyName, detailInfo = detailInfo, errMsg = errMsg, nationalCode = nationalCode, postalCode = postalCode, provinceName = provinceName, telNumber = telNumber, userName = userName)
  
    __obj.asInstanceOf[Anon_CityName]
  }
}

