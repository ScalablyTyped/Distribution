package typings.strongholdPayJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisplayMessage_ extends js.Object {
  
  var displayMessage: js.UndefOr[String] = js.native
  
  var drawerId: js.UndefOr[String] = js.native
  
  var terminalId: js.UndefOr[String] = js.native
}
object DisplayMessage_ {
  
  @scala.inline
  def apply(): DisplayMessage_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisplayMessage_]
  }
  
  @scala.inline
  implicit class DisplayMessage_Ops[Self <: DisplayMessage_] (val x: Self) extends AnyVal {
    
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
    def setDisplayMessage(value: String): Self = this.set("displayMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayMessage: Self = this.set("displayMessage", js.undefined)
    
    @scala.inline
    def setDrawerId(value: String): Self = this.set("drawerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDrawerId: Self = this.set("drawerId", js.undefined)
    
    @scala.inline
    def setTerminalId(value: String): Self = this.set("terminalId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTerminalId: Self = this.set("terminalId", js.undefined)
  }
}
