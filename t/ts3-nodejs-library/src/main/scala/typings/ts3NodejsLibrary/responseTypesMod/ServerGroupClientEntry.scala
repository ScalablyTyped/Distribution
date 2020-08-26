package typings.ts3NodejsLibrary.responseTypesMod

import typings.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerGroupClientEntry extends ResponseEntry {
  var cldbid: String = js.native
  var clientNickname: String = js.native
  var clientUniqueIdentifier: String = js.native
}

object ServerGroupClientEntry {
  @scala.inline
  def apply(cldbid: String, clientNickname: String, clientUniqueIdentifier: String): ServerGroupClientEntry = {
    val __obj = js.Dynamic.literal(cldbid = cldbid.asInstanceOf[js.Any], clientNickname = clientNickname.asInstanceOf[js.Any], clientUniqueIdentifier = clientUniqueIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerGroupClientEntry]
  }
  @scala.inline
  implicit class ServerGroupClientEntryOps[Self <: ServerGroupClientEntry] (val x: Self) extends AnyVal {
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
    def setCldbid(value: String): Self = this.set("cldbid", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientNickname(value: String): Self = this.set("clientNickname", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientUniqueIdentifier(value: String): Self = this.set("clientUniqueIdentifier", value.asInstanceOf[js.Any])
  }
  
}

