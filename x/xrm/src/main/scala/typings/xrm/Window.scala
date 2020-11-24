package typings.xrm

import typings.xrm.Xrm.GlobalContext
import typings.xrm.Xrm.XrmStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Window extends js.Object {
  
  def GetGlobalContext(): GlobalContext = js.native
  
  var Xrm: XrmStatic = js.native
}
object Window {
  
  @scala.inline
  def apply(GetGlobalContext: () => GlobalContext, Xrm: XrmStatic): Window = {
    val __obj = js.Dynamic.literal(GetGlobalContext = js.Any.fromFunction0(GetGlobalContext), Xrm = Xrm.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
  
  @scala.inline
  implicit class WindowOps[Self <: Window] (val x: Self) extends AnyVal {
    
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
    def setGetGlobalContext(value: () => GlobalContext): Self = this.set("GetGlobalContext", js.Any.fromFunction0(value))
    
    @scala.inline
    def setXrm(value: XrmStatic): Self = this.set("Xrm", value.asInstanceOf[js.Any])
  }
}
