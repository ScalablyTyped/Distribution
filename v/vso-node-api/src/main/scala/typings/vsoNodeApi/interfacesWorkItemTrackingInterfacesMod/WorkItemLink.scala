package typings.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkItemLink extends StObject {
  
  /**
    * The type of link.
    */
  var rel: String
  
  /**
    * The source work item.
    */
  var source: WorkItemReference
  
  /**
    * The target work item.
    */
  var target: WorkItemReference
}
object WorkItemLink {
  
  inline def apply(rel: String, source: WorkItemReference, target: WorkItemReference): WorkItemLink = {
    val __obj = js.Dynamic.literal(rel = rel.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItemLink]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WorkItemLink] (val x: Self) extends AnyVal {
    
    inline def setRel(value: String): Self = StObject.set(x, "rel", value.asInstanceOf[js.Any])
    
    inline def setSource(value: WorkItemReference): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: WorkItemReference): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
