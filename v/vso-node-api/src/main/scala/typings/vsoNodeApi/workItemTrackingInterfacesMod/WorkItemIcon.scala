package typings.vsoNodeApi.workItemTrackingInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkItemIcon extends StObject {
  
  /**
    * The identifier of the icon.
    */
  var id: String = js.native
  
  /**
    * The REST URL of the resource.
    */
  var url: String = js.native
}
object WorkItemIcon {
  
  @scala.inline
  def apply(id: String, url: String): WorkItemIcon = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItemIcon]
  }
  
  @scala.inline
  implicit class WorkItemIconMutableBuilder[Self <: WorkItemIcon] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
