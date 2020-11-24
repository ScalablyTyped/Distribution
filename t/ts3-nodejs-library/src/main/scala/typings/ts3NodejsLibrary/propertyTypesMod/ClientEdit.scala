package typings.ts3NodejsLibrary.propertyTypesMod

import typings.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientEdit extends ResponseEntry {
  
  var clientDescription: js.UndefOr[String] = js.native
  
  var clientIsTalker: js.UndefOr[Boolean] = js.native
}
object ClientEdit {
  
  @scala.inline
  def apply(): ClientEdit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientEdit]
  }
  
  @scala.inline
  implicit class ClientEditOps[Self <: ClientEdit] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def deleteClientDescription: Self = this.set("clientDescription", js.undefined)
    
    @scala.inline
    def setClientIsTalker(value: Boolean): Self = this.set("clientIsTalker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientIsTalker: Self = this.set("clientIsTalker", js.undefined)
  }
}
