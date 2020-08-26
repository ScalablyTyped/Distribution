package typings.ts3NodejsLibrary.propertyTypesMod

import typings.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerTempPasswordAdd extends ResponseEntry {
  /** description of the password */
  var desc: js.UndefOr[String] = js.native
  /** the duration the password is valid in seconds */
  var duration: Double = js.native
  /** the temporary password */
  var pw: String = js.native
  /** the channel to let the user join */
  var tcid: js.UndefOr[String] = js.native
  /** the password to the channel */
  var tcpw: js.UndefOr[String] = js.native
}

object ServerTempPasswordAdd {
  @scala.inline
  def apply(duration: Double, pw: String): ServerTempPasswordAdd = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], pw = pw.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerTempPasswordAdd]
  }
  @scala.inline
  implicit class ServerTempPasswordAddOps[Self <: ServerTempPasswordAdd] (val x: Self) extends AnyVal {
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
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def setPw(value: String): Self = this.set("pw", value.asInstanceOf[js.Any])
    @scala.inline
    def setDesc(value: String): Self = this.set("desc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDesc: Self = this.set("desc", js.undefined)
    @scala.inline
    def setTcid(value: String): Self = this.set("tcid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTcid: Self = this.set("tcid", js.undefined)
    @scala.inline
    def setTcpw(value: String): Self = this.set("tcpw", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTcpw: Self = this.set("tcpw", js.undefined)
  }
  
}

