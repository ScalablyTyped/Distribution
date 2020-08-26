package typings.voximplantWebsdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *    Audio playback device info
  */
@js.native
trait AudioOutputInfo extends js.Object {
  /**
    *    Device id that can be used to choose audio playback device
    */
  var id: Double | String = js.native
  /**
    *    Device name , in WebRTC mode populated with real data only when app has been opened using HTTPS protocol
    */
  var name: String = js.native
}

object AudioOutputInfo {
  @scala.inline
  def apply(id: Double | String, name: String): AudioOutputInfo = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioOutputInfo]
  }
  @scala.inline
  implicit class AudioOutputInfoOps[Self <: AudioOutputInfo] (val x: Self) extends AnyVal {
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
    def setId(value: Double | String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

