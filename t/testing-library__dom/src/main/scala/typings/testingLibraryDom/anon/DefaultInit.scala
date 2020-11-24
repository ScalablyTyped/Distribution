package typings.testingLibraryDom.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultInit extends js.Object {
  
  var EventType: js.UndefOr[String] = js.native
  
  var defaultInit: js.UndefOr[js.Object] = js.native
}
object DefaultInit {
  
  @scala.inline
  def apply(): DefaultInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultInit]
  }
  
  @scala.inline
  implicit class DefaultInitOps[Self <: DefaultInit] (val x: Self) extends AnyVal {
    
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
    def setEventType(value: String): Self = this.set("EventType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventType: Self = this.set("EventType", js.undefined)
    
    @scala.inline
    def setDefaultInit(value: js.Object): Self = this.set("defaultInit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultInit: Self = this.set("defaultInit", js.undefined)
  }
}
