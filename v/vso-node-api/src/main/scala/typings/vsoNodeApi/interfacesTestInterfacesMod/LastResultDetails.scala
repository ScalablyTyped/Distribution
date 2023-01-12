package typings.vsoNodeApi.interfacesTestInterfacesMod

import typings.vsoNodeApi.interfacesCommonVssinterfacesMod.IdentityRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LastResultDetails extends StObject {
  
  var dateCompleted: js.Date
  
  var duration: Double
  
  var runBy: IdentityRef
}
object LastResultDetails {
  
  inline def apply(dateCompleted: js.Date, duration: Double, runBy: IdentityRef): LastResultDetails = {
    val __obj = js.Dynamic.literal(dateCompleted = dateCompleted.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], runBy = runBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[LastResultDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LastResultDetails] (val x: Self) extends AnyVal {
    
    inline def setDateCompleted(value: js.Date): Self = StObject.set(x, "dateCompleted", value.asInstanceOf[js.Any])
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setRunBy(value: IdentityRef): Self = StObject.set(x, "runBy", value.asInstanceOf[js.Any])
  }
}
