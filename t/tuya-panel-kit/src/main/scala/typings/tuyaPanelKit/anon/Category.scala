package typings.tuyaPanelKit.anon

import typings.tuyaPanelKit.mod.GotoDpAlarmData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Category extends js.Object {
  
  var category: String = js.native
  
  var data: GotoDpAlarmData = js.native
  
  var repeat: Double = js.native
}
object Category {
  
  @scala.inline
  def apply(category: String, data: GotoDpAlarmData, repeat: Double): Category = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], repeat = repeat.asInstanceOf[js.Any])
    __obj.asInstanceOf[Category]
  }
  
  @scala.inline
  implicit class CategoryOps[Self <: Category] (val x: Self) extends AnyVal {
    
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
    def setCategory(value: String): Self = this.set("category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataVarargs(value: DpId*): Self = this.set("data", js.Array(value :_*))
    
    @scala.inline
    def setData(value: GotoDpAlarmData): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepeat(value: Double): Self = this.set("repeat", value.asInstanceOf[js.Any])
  }
}
