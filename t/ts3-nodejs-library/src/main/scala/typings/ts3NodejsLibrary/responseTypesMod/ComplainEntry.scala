package typings.ts3NodejsLibrary.responseTypesMod

import typings.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComplainEntry extends ResponseEntry {
  var fcldbid: String = js.native
  var fname: String = js.native
  var message: String = js.native
  var tcldbid: String = js.native
  var timestamp: Double = js.native
  var tname: String = js.native
}

object ComplainEntry {
  @scala.inline
  def apply(fcldbid: String, fname: String, message: String, tcldbid: String, timestamp: Double, tname: String): ComplainEntry = {
    val __obj = js.Dynamic.literal(fcldbid = fcldbid.asInstanceOf[js.Any], fname = fname.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], tcldbid = tcldbid.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], tname = tname.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComplainEntry]
  }
  @scala.inline
  implicit class ComplainEntryOps[Self <: ComplainEntry] (val x: Self) extends AnyVal {
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
    def setFcldbid(value: String): Self = this.set("fcldbid", value.asInstanceOf[js.Any])
    @scala.inline
    def setFname(value: String): Self = this.set("fname", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setTcldbid(value: String): Self = this.set("tcldbid", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimestamp(value: Double): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def setTname(value: String): Self = this.set("tname", value.asInstanceOf[js.Any])
  }
  
}

