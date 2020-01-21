package typings.weixinApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAppIdVersion extends js.Object {
  /* 插件 appId	 */
  var appId: String
  /* 插件版本号	 */
  var version: String
}

object AnonAppIdVersion {
  @scala.inline
  def apply(appId: String, version: String): AnonAppIdVersion = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAppIdVersion]
  }
}

