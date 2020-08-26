package typings.ts3NodejsLibrary.responseTypesMod

import typings.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PermissionEntry extends ResponseEntry {
  var permdesc: String = js.native
  var permid: Double = js.native
  var permname: String = js.native
}

object PermissionEntry {
  @scala.inline
  def apply(permdesc: String, permid: Double, permname: String): PermissionEntry = {
    val __obj = js.Dynamic.literal(permdesc = permdesc.asInstanceOf[js.Any], permid = permid.asInstanceOf[js.Any], permname = permname.asInstanceOf[js.Any])
    __obj.asInstanceOf[PermissionEntry]
  }
  @scala.inline
  implicit class PermissionEntryOps[Self <: PermissionEntry] (val x: Self) extends AnyVal {
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
    def setPermdesc(value: String): Self = this.set("permdesc", value.asInstanceOf[js.Any])
    @scala.inline
    def setPermid(value: Double): Self = this.set("permid", value.asInstanceOf[js.Any])
    @scala.inline
    def setPermname(value: String): Self = this.set("permname", value.asInstanceOf[js.Any])
  }
  
}

