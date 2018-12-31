package typings
package weixinDashAppLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * 定义了云开发的默认配置，该配置会作为之后调用其他所有云 API 的默认配置
	 */
trait InitCloudOptions extends js.Object {
  /**
  		 * 默认环境配置，传入字符串形式的环境 ID 可以指定所有服务的默认环境，传入对象 initCloudEnvOptions 可以分别指定各个服务的默认环境
  		 * 默认值： default
  		 */
  var env: js.UndefOr[java.lang.String | InitCloudEnvOptions] = js.undefined
  /**
  		 * 是否在将用户访问记录到用户管理中，在控制台中可见
  		 * 默认值： false
  		 */
  var traceUser: js.UndefOr[scala.Boolean] = js.undefined
}

