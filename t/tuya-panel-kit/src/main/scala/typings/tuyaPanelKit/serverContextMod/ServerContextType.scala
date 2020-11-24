package typings.tuyaPanelKit.serverContextMod

import typings.tuyaPanelKit.anon.Pathname
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServerContextType extends js.Object {
  
  var location: js.UndefOr[Pathname] = js.native
}
object ServerContextType {
  
  @scala.inline
  def apply(): ServerContextType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerContextType]
  }
  
  @scala.inline
  implicit class ServerContextTypeOps[Self <: ServerContextType] (val x: Self) extends AnyVal {
    
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
    def setLocation(value: Pathname): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
  }
}
