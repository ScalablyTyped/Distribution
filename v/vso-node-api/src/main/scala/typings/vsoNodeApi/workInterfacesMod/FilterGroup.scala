package typings.vsoNodeApi.workInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterGroup extends StObject {
  
  var end: Double
  
  var level: Double
  
  var start: Double
}
object FilterGroup {
  
  @scala.inline
  def apply(end: Double, level: Double, start: Double): FilterGroup = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterGroup]
  }
  
  @scala.inline
  implicit class FilterGroupMutableBuilder[Self <: FilterGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
