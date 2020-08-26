package typings.ts3NodejsLibrary.responseTypesMod

import typings.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientGetNameFromDbid extends ResponseEntry {
  var cldbid: String = js.native
  var cluid: String = js.native
  var name: String = js.native
}

object ClientGetNameFromDbid {
  @scala.inline
  def apply(cldbid: String, cluid: String, name: String): ClientGetNameFromDbid = {
    val __obj = js.Dynamic.literal(cldbid = cldbid.asInstanceOf[js.Any], cluid = cluid.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientGetNameFromDbid]
  }
  @scala.inline
  implicit class ClientGetNameFromDbidOps[Self <: ClientGetNameFromDbid] (val x: Self) extends AnyVal {
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
    def setCluid(value: String): Self = this.set("cluid", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

