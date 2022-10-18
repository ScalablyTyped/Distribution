package typings.vsoNodeApi.interfacesTaskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobEvent extends StObject {
  
  var jobId: String
  
  var name: String
}
object JobEvent {
  
  inline def apply(jobId: String, name: String): JobEvent = {
    val __obj = js.Dynamic.literal(jobId = jobId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobEvent]
  }
  
  extension [Self <: JobEvent](x: Self) {
    
    inline def setJobId(value: String): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
