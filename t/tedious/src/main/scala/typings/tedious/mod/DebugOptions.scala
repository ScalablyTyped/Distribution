package typings.tedious.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DebugOptions extends js.Object {
  /**
    * A boolean, controlling whether debug events will be emitted with text describing packet data details (default: false).
    */
  var data: js.UndefOr[Boolean] = js.native
  /**
    * A boolean, controlling whether debug events will be emitted with text describing packet details (default: false).
    */
  var packet: js.UndefOr[Boolean] = js.native
  /**
    * A boolean, controlling whether debug events will be emitted with text describing packet payload details (default: false).
    */
  var payload: js.UndefOr[Boolean] = js.native
  /**
    * A boolean, controlling whether debug events will be emitted with text describing token stream tokens (default: false).
    */
  var token: js.UndefOr[Boolean] = js.native
}

object DebugOptions {
  @scala.inline
  def apply(): DebugOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DebugOptions]
  }
  @scala.inline
  implicit class DebugOptionsOps[Self <: DebugOptions] (val x: Self) extends AnyVal {
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
    def setData(value: Boolean): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setPacket(value: Boolean): Self = this.set("packet", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePacket: Self = this.set("packet", js.undefined)
    @scala.inline
    def setPayload(value: Boolean): Self = this.set("payload", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePayload: Self = this.set("payload", js.undefined)
    @scala.inline
    def setToken(value: Boolean): Self = this.set("token", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToken: Self = this.set("token", js.undefined)
  }
  
}

