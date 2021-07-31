package typings.tuyaPanelKit.anon

import typings.tuyaPanelKit.mod.GotoDpAlarmData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Category extends StObject {
  
  var category: String
  
  var data: GotoDpAlarmData
  
  var repeat: Double
}
object Category {
  
  @scala.inline
  def apply(category: String, data: GotoDpAlarmData, repeat: Double): Category = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], repeat = repeat.asInstanceOf[js.Any])
    __obj.asInstanceOf[Category]
  }
  
  @scala.inline
  implicit class CategoryMutableBuilder[Self <: Category] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: GotoDpAlarmData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataVarargs(value: DpId*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    @scala.inline
    def setRepeat(value: Double): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
  }
}
