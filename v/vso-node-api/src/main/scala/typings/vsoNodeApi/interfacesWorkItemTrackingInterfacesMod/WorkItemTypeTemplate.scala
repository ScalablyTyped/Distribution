package typings.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkItemTypeTemplate extends StObject {
  
  /**
    * XML template in string format.
    */
  var template: String
}
object WorkItemTypeTemplate {
  
  inline def apply(template: String): WorkItemTypeTemplate = {
    val __obj = js.Dynamic.literal(template = template.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItemTypeTemplate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WorkItemTypeTemplate] (val x: Self) extends AnyVal {
    
    inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
  }
}
