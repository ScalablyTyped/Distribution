package typings.tuyaPanelKit.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UiId extends js.Object {
  
  var uiId: String = js.native
}
object UiId {
  
  @scala.inline
  def apply(uiId: String): UiId = {
    val __obj = js.Dynamic.literal(uiId = uiId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UiId]
  }
  
  @scala.inline
  implicit class UiIdOps[Self <: UiId] (val x: Self) extends AnyVal {
    
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
    def setUiId(value: String): Self = this.set("uiId", value.asInstanceOf[js.Any])
  }
}
