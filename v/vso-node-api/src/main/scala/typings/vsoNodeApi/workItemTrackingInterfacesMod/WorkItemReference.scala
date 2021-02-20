package typings.vsoNodeApi.workItemTrackingInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkItemReference extends StObject {
  
  /**
    * Work item ID.
    */
  var id: Double = js.native
  
  /**
    * REST API URL of the resource
    */
  var url: String = js.native
}
object WorkItemReference {
  
  @scala.inline
  def apply(id: Double, url: String): WorkItemReference = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItemReference]
  }
  
  @scala.inline
  implicit class WorkItemReferenceMutableBuilder[Self <: WorkItemReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
