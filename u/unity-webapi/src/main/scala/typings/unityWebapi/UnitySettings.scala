package typings.unityWebapi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnitySettings extends js.Object {
  var iconUrl: String = js.native
  var name: String = js.native
  var onInit: js.Function = js.native
}

object UnitySettings {
  @scala.inline
  def apply(iconUrl: String, name: String, onInit: js.Function): UnitySettings = {
    val __obj = js.Dynamic.literal(iconUrl = iconUrl.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], onInit = onInit.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnitySettings]
  }
  @scala.inline
  implicit class UnitySettingsOps[Self <: UnitySettings] (val x: Self) extends AnyVal {
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
    def setIconUrl(value: String): Self = this.set("iconUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnInit(value: js.Function): Self = this.set("onInit", value.asInstanceOf[js.Any])
  }
  
}

