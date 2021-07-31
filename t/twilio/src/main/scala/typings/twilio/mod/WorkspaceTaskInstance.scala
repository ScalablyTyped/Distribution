package typings.twilio.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkspaceTaskInstance
  extends StObject
     with InstanceResource {
  
  var reservations: WorkspaceTaskReservationResource
}
object WorkspaceTaskInstance {
  
  @scala.inline
  def apply(
    delete: RestMethod,
    get: RestMethod,
    post: RestMethod,
    reservations: WorkspaceTaskReservationResource,
    update: RestMethod
  ): WorkspaceTaskInstance = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any], reservations = reservations.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkspaceTaskInstance]
  }
  
  @scala.inline
  implicit class WorkspaceTaskInstanceMutableBuilder[Self <: WorkspaceTaskInstance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReservations(value: WorkspaceTaskReservationResource): Self = StObject.set(x, "reservations", value.asInstanceOf[js.Any])
  }
}
