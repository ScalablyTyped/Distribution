package typings
package uniDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetProviderRes extends js.Object {
  /**
    * 得到的服务供应商
    */
  var provider: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * 服务类型
    */
  var service: js.UndefOr[java.lang.String] = js.undefined
}

object GetProviderRes {
  @scala.inline
  def apply(provider: js.Array[_] = null, service: java.lang.String = null): GetProviderRes = {
    val __obj = js.Dynamic.literal()
    if (provider != null) __obj.updateDynamic("provider")(provider)
    if (service != null) __obj.updateDynamic("service")(service)
    __obj.asInstanceOf[GetProviderRes]
  }
}

