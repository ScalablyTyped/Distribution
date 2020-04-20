package typings.weixinApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonVersion extends js.Object {
  /* 插件 appId	 */
  var appId: String
  /* 插件版本号	 */
  var version: String
}

object AnonVersion {
  @scala.inline
  def apply(appId: String, version: String): AnonVersion = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonVersion]
  }
}

