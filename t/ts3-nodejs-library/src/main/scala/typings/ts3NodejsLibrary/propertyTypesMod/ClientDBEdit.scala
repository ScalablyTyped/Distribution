package typings.ts3NodejsLibrary.propertyTypesMod

import typings.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientDBEdit extends ResponseEntry {
  
  var clientDescription: String = js.native
}
object ClientDBEdit {
  
  @scala.inline
  def apply(clientDescription: String): ClientDBEdit = {
    val __obj = js.Dynamic.literal(clientDescription = clientDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientDBEdit]
  }
  
  @scala.inline
  implicit class ClientDBEditOps[Self <: ClientDBEdit] (val x: Self) extends AnyVal {
    
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
    def setClientDescription(value: String): Self = this.set("clientDescription", value.asInstanceOf[js.Any])
  }
}
