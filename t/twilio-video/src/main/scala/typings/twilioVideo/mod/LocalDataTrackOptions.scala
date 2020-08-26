package typings.twilioVideo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocalDataTrackOptions extends js.Object {
  var maxPacketLifeTime: js.UndefOr[Double | Null] = js.native
  var maxRetransmits: js.UndefOr[Double | Null] = js.native
  var ordered: js.UndefOr[Boolean] = js.native
}

object LocalDataTrackOptions {
  @scala.inline
  def apply(): LocalDataTrackOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalDataTrackOptions]
  }
  @scala.inline
  implicit class LocalDataTrackOptionsOps[Self <: LocalDataTrackOptions] (val x: Self) extends AnyVal {
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
    def setMaxPacketLifeTime(value: Double): Self = this.set("maxPacketLifeTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxPacketLifeTime: Self = this.set("maxPacketLifeTime", js.undefined)
    @scala.inline
    def setMaxPacketLifeTimeNull: Self = this.set("maxPacketLifeTime", null)
    @scala.inline
    def setMaxRetransmits(value: Double): Self = this.set("maxRetransmits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxRetransmits: Self = this.set("maxRetransmits", js.undefined)
    @scala.inline
    def setMaxRetransmitsNull: Self = this.set("maxRetransmits", null)
    @scala.inline
    def setOrdered(value: Boolean): Self = this.set("ordered", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrdered: Self = this.set("ordered", js.undefined)
  }
  
}

