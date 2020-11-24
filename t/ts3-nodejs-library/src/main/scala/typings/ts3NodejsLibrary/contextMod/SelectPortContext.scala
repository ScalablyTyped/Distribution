package typings.ts3NodejsLibrary.contextMod

import typings.ts3NodejsLibrary.contextMod.SelectType.PORT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelectPortContext
  extends BaseContext
     with Context {
  
  @JSName("selectType")
  var selectType_SelectPortContext: PORT = js.native
  
  var selected: Double = js.native
}
object SelectPortContext {
  
  @scala.inline
  def apply(events: js.Array[ActiveEvent], selectType: PORT, selected: Double): SelectPortContext = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], selectType = selectType.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectPortContext]
  }
  
  @scala.inline
  implicit class SelectPortContextOps[Self <: SelectPortContext] (val x: Self) extends AnyVal {
    
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
    def setSelectType(value: PORT): Self = this.set("selectType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelected(value: Double): Self = this.set("selected", value.asInstanceOf[js.Any])
  }
}
