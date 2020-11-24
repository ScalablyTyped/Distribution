package typings.terminalKit.anon

import typings.terminalKit.terminalKitStrings.button
import typings.terminalKit.terminalKitStrings.drag
import typings.terminalKit.terminalKitStrings.motion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Mouse extends js.Object {
  
  var mouse: js.UndefOr[button | drag | motion] = js.native
  
  var safe: js.UndefOr[Boolean] = js.native
}
object Mouse {
  
  @scala.inline
  def apply(): Mouse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Mouse]
  }
  
  @scala.inline
  implicit class MouseOps[Self <: Mouse] (val x: Self) extends AnyVal {
    
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
    def setMouse(value: button | drag | motion): Self = this.set("mouse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMouse: Self = this.set("mouse", js.undefined)
    
    @scala.inline
    def setSafe(value: Boolean): Self = this.set("safe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSafe: Self = this.set("safe", js.undefined)
  }
}
