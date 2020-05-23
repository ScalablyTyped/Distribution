package typings.weappApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Vetsion extends js.Object {
  //  插件appId
  var appId: String
  //  插件版本号
  var vetsion: String
}

object Vetsion {
  @scala.inline
  def apply(appId: String, vetsion: String): Vetsion = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], vetsion = vetsion.asInstanceOf[js.Any])
    __obj.asInstanceOf[Vetsion]
  }
}

