package typings.vsoNodeApi.interfacesTestInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestMessageLogDetails extends StObject {
  
  /**
    * Date when the resource is created
    */
  var dateCreated: js.Date
  
  /**
    * Id of the resource
    */
  var entryId: Double
  
  /**
    * Message of the resource
    */
  var message: String
}
object TestMessageLogDetails {
  
  inline def apply(dateCreated: js.Date, entryId: Double, message: String): TestMessageLogDetails = {
    val __obj = js.Dynamic.literal(dateCreated = dateCreated.asInstanceOf[js.Any], entryId = entryId.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestMessageLogDetails]
  }
  
  extension [Self <: TestMessageLogDetails](x: Self) {
    
    inline def setDateCreated(value: js.Date): Self = StObject.set(x, "dateCreated", value.asInstanceOf[js.Any])
    
    inline def setEntryId(value: Double): Self = StObject.set(x, "entryId", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
