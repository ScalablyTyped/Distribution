package typings
package weixinDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AppIdVersion extends js.Object {
  /* 插件 appId	 */
  var appId: java.lang.String
  /* 插件版本号	 */
  var version: java.lang.String
}

object Anon_AppIdVersion {
  @scala.inline
  def apply(appId: java.lang.String, version: java.lang.String): Anon_AppIdVersion = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("appId")(appId)
    __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[Anon_AppIdVersion]
  }
}

