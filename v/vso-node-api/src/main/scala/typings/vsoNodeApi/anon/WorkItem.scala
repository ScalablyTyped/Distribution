package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkItem extends StObject {
  
  var workItem: scala.Double
  
  var workItemLink: scala.Double
}
object WorkItem {
  
  inline def apply(workItem: scala.Double, workItemLink: scala.Double): WorkItem = {
    val __obj = js.Dynamic.literal(workItem = workItem.asInstanceOf[js.Any], workItemLink = workItemLink.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WorkItem] (val x: Self) extends AnyVal {
    
    inline def setWorkItem(value: scala.Double): Self = StObject.set(x, "workItem", value.asInstanceOf[js.Any])
    
    inline def setWorkItemLink(value: scala.Double): Self = StObject.set(x, "workItemLink", value.asInstanceOf[js.Any])
  }
}
