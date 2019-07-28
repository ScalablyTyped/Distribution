package typings.weixinDashApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AppIdVersion extends js.Object {
  /* 插件 appId	 */
  var appId: String
  /* 插件版本号	 */
  var version: String
}

object Anon_AppIdVersion {
  @scala.inline
  def apply(appId: String, version: String): Anon_AppIdVersion = {
    val __obj = js.Dynamic.literal(appId = appId, version = version)
  
    __obj.asInstanceOf[Anon_AppIdVersion]
  }
}

