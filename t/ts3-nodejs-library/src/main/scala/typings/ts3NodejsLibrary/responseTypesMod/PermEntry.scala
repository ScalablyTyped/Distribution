package typings.ts3NodejsLibrary.responseTypesMod

import typings.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PermEntry extends ResponseEntry {
  
  var permid: js.UndefOr[Double] = js.native
  
  var permnegated: Boolean = js.native
  
  var permsid: js.UndefOr[String] = js.native
  
  var permskip: Boolean = js.native
  
  var permvalue: Double = js.native
}
object PermEntry {
  
  @scala.inline
  def apply(permnegated: Boolean, permskip: Boolean, permvalue: Double): PermEntry = {
    val __obj = js.Dynamic.literal(permnegated = permnegated.asInstanceOf[js.Any], permskip = permskip.asInstanceOf[js.Any], permvalue = permvalue.asInstanceOf[js.Any])
    __obj.asInstanceOf[PermEntry]
  }
  
  @scala.inline
  implicit class PermEntryOps[Self <: PermEntry] (val x: Self) extends AnyVal {
    
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
    def setPermnegated(value: Boolean): Self = this.set("permnegated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermskip(value: Boolean): Self = this.set("permskip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermvalue(value: Double): Self = this.set("permvalue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermid(value: Double): Self = this.set("permid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePermid: Self = this.set("permid", js.undefined)
    
    @scala.inline
    def setPermsid(value: String): Self = this.set("permsid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePermsid: Self = this.set("permsid", js.undefined)
  }
}
