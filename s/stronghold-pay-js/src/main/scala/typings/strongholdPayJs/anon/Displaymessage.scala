package typings.strongholdPayJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Displaymessage extends js.Object {
  
  var display_message: js.UndefOr[String] = js.native
  
  var drawer_id: js.UndefOr[String] = js.native
  
  var terminal_id: js.UndefOr[String] = js.native
}
object Displaymessage {
  
  @scala.inline
  def apply(): Displaymessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Displaymessage]
  }
  
  @scala.inline
  implicit class DisplaymessageOps[Self <: Displaymessage] (val x: Self) extends AnyVal {
    
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
    def setDisplay_message(value: String): Self = this.set("display_message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplay_message: Self = this.set("display_message", js.undefined)
    
    @scala.inline
    def setDrawer_id(value: String): Self = this.set("drawer_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDrawer_id: Self = this.set("drawer_id", js.undefined)
    
    @scala.inline
    def setTerminal_id(value: String): Self = this.set("terminal_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTerminal_id: Self = this.set("terminal_id", js.undefined)
  }
}
