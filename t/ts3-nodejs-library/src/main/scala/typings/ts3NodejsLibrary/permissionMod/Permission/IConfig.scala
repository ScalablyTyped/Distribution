package typings.ts3NodejsLibrary.permissionMod.Permission

import typings.ts3NodejsLibrary.teamSpeakMod.TeamSpeak
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IConfig[T] extends js.Object {
  var allowSkipNegate: js.UndefOr[Boolean] = js.native
  var context: T = js.native
  var remove: String = js.native
  var teamspeak: TeamSpeak = js.native
  var update: String = js.native
}

object IConfig {
  @scala.inline
  def apply[T](context: T, remove: String, teamspeak: TeamSpeak, update: String): IConfig[T] = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], remove = remove.asInstanceOf[js.Any], teamspeak = teamspeak.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConfig[T]]
  }
  @scala.inline
  implicit class IConfigOps[Self <: IConfig[_], T] (val x: Self with IConfig[T]) extends AnyVal {
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
    def setContext(value: T): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemove(value: String): Self = this.set("remove", value.asInstanceOf[js.Any])
    @scala.inline
    def setTeamspeak(value: TeamSpeak): Self = this.set("teamspeak", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdate(value: String): Self = this.set("update", value.asInstanceOf[js.Any])
    @scala.inline
    def setAllowSkipNegate(value: Boolean): Self = this.set("allowSkipNegate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowSkipNegate: Self = this.set("allowSkipNegate", js.undefined)
  }
  
}

