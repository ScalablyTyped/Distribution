package typings.weappApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Vetsion extends js.Object {
  //  插件appId
  var appId: String = js.native
  //  插件版本号
  var vetsion: String = js.native
}

object Vetsion {
  @scala.inline
  def apply(appId: String, vetsion: String): Vetsion = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], vetsion = vetsion.asInstanceOf[js.Any])
    __obj.asInstanceOf[Vetsion]
  }
  @scala.inline
  implicit class VetsionOps[Self <: Vetsion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAppId(value: String): Self = this.set("appId", value.asInstanceOf[js.Any])
    @scala.inline
    def setVetsion(value: String): Self = this.set("vetsion", value.asInstanceOf[js.Any])
  }
  
}

