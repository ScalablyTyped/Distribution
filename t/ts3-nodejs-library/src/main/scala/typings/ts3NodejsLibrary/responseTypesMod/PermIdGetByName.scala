package typings.ts3NodejsLibrary.responseTypesMod

import typings.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PermIdGetByName extends ResponseEntry {
  var permid: Double = js.native
  var permsid: String = js.native
}

object PermIdGetByName {
  @scala.inline
  def apply(permid: Double, permsid: String): PermIdGetByName = {
    val __obj = js.Dynamic.literal(permid = permid.asInstanceOf[js.Any], permsid = permsid.asInstanceOf[js.Any])
    __obj.asInstanceOf[PermIdGetByName]
  }
  @scala.inline
  implicit class PermIdGetByNameOps[Self <: PermIdGetByName] (val x: Self) extends AnyVal {
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
    def setPermid(value: Double): Self = this.set("permid", value.asInstanceOf[js.Any])
    @scala.inline
    def setPermsid(value: String): Self = this.set("permsid", value.asInstanceOf[js.Any])
  }
  
}

