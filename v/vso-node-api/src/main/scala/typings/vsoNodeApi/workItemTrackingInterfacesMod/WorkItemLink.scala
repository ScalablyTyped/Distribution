package typings.vsoNodeApi.workItemTrackingInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkItemLink extends StObject {
  
  /**
    * The type of link.
    */
  var rel: String = js.native
  
  /**
    * The source work item.
    */
  var source: WorkItemReference = js.native
  
  /**
    * The target work item.
    */
  var target: WorkItemReference = js.native
}
object WorkItemLink {
  
  @scala.inline
  def apply(rel: String, source: WorkItemReference, target: WorkItemReference): WorkItemLink = {
    val __obj = js.Dynamic.literal(rel = rel.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItemLink]
  }
  
  @scala.inline
  implicit class WorkItemLinkMutableBuilder[Self <: WorkItemLink] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRel(value: String): Self = StObject.set(x, "rel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: WorkItemReference): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: WorkItemReference): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
