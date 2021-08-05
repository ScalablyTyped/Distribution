package typings.twilio.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkspaceWorkerInstance
  extends StObject
     with InstanceResource {
  
  var reservations: WorkspaceWorkerReservationResource
  
  var statistics: WorkspaceInstanceStatisticResource
}
object WorkspaceWorkerInstance {
  
  inline def apply(
    delete: RestMethod,
    get: RestMethod,
    post: RestMethod,
    reservations: WorkspaceWorkerReservationResource,
    statistics: WorkspaceInstanceStatisticResource,
    update: RestMethod
  ): WorkspaceWorkerInstance = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any], reservations = reservations.asInstanceOf[js.Any], statistics = statistics.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkspaceWorkerInstance]
  }
  
  extension [Self <: WorkspaceWorkerInstance](x: Self) {
    
    inline def setReservations(value: WorkspaceWorkerReservationResource): Self = StObject.set(x, "reservations", value.asInstanceOf[js.Any])
    
    inline def setStatistics(value: WorkspaceInstanceStatisticResource): Self = StObject.set(x, "statistics", value.asInstanceOf[js.Any])
  }
}
