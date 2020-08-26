package typings.ts3NodejsLibrary.responseTypesMod

import typings.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerTempPasswordEntry extends ResponseEntry {
  var desc: String = js.native
  var end: Double = js.native
  var nickname: String = js.native
  var pwClear: String = js.native
  var start: Double = js.native
  var tcid: String = js.native
  var uid: String = js.native
}

object ServerTempPasswordEntry {
  @scala.inline
  def apply(
    desc: String,
    end: Double,
    nickname: String,
    pwClear: String,
    start: Double,
    tcid: String,
    uid: String
  ): ServerTempPasswordEntry = {
    val __obj = js.Dynamic.literal(desc = desc.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], nickname = nickname.asInstanceOf[js.Any], pwClear = pwClear.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], tcid = tcid.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerTempPasswordEntry]
  }
  @scala.inline
  implicit class ServerTempPasswordEntryOps[Self <: ServerTempPasswordEntry] (val x: Self) extends AnyVal {
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
    def setDesc(value: String): Self = this.set("desc", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnd(value: Double): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def setNickname(value: String): Self = this.set("nickname", value.asInstanceOf[js.Any])
    @scala.inline
    def setPwClear(value: String): Self = this.set("pwClear", value.asInstanceOf[js.Any])
    @scala.inline
    def setStart(value: Double): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def setTcid(value: String): Self = this.set("tcid", value.asInstanceOf[js.Any])
    @scala.inline
    def setUid(value: String): Self = this.set("uid", value.asInstanceOf[js.Any])
  }
  
}

