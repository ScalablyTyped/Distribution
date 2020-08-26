package typings.ts3NodejsLibrary.responseTypesMod

import typings.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientGetUidFromClid extends ResponseEntry {
  var clid: String = js.native
  var cluid: String = js.native
  var nickname: String = js.native
}

object ClientGetUidFromClid {
  @scala.inline
  def apply(clid: String, cluid: String, nickname: String): ClientGetUidFromClid = {
    val __obj = js.Dynamic.literal(clid = clid.asInstanceOf[js.Any], cluid = cluid.asInstanceOf[js.Any], nickname = nickname.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientGetUidFromClid]
  }
  @scala.inline
  implicit class ClientGetUidFromClidOps[Self <: ClientGetUidFromClid] (val x: Self) extends AnyVal {
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
    def setClid(value: String): Self = this.set("clid", value.asInstanceOf[js.Any])
    @scala.inline
    def setCluid(value: String): Self = this.set("cluid", value.asInstanceOf[js.Any])
    @scala.inline
    def setNickname(value: String): Self = this.set("nickname", value.asInstanceOf[js.Any])
  }
  
}

