package typings.vsoNodeApi.testInterfacesMod

import typings.vsoNodeApi.anon.ValueAny
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PointWorkItemProperty extends StObject {
  
  var workItem: ValueAny
}
object PointWorkItemProperty {
  
  @scala.inline
  def apply(workItem: ValueAny): PointWorkItemProperty = {
    val __obj = js.Dynamic.literal(workItem = workItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointWorkItemProperty]
  }
  
  @scala.inline
  implicit class PointWorkItemPropertyMutableBuilder[Self <: PointWorkItemProperty] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWorkItem(value: ValueAny): Self = StObject.set(x, "workItem", value.asInstanceOf[js.Any])
  }
}
