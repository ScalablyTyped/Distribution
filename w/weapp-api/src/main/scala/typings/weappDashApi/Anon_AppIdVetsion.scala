package typings.weappDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AppIdVetsion extends js.Object {
  //  插件appId
  var appId: String
  //  插件版本号
  var vetsion: String
}

object Anon_AppIdVetsion {
  @scala.inline
  def apply(appId: String, vetsion: String): Anon_AppIdVetsion = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], vetsion = vetsion.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_AppIdVetsion]
  }
}

