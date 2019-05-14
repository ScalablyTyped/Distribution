package typings
package weappDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AppIdVetsion extends js.Object {
  //  插件appId
  var appId: java.lang.String
  //  插件版本号
  var vetsion: java.lang.String
}

object Anon_AppIdVetsion {
  @scala.inline
  def apply(appId: java.lang.String, vetsion: java.lang.String): Anon_AppIdVetsion = {
    val __obj = js.Dynamic.literal(appId = appId, vetsion = vetsion)
  
    __obj.asInstanceOf[Anon_AppIdVetsion]
  }
}

