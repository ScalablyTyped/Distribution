package typings.winrtUwp.Windows.Media.DialProtocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the state of the DIAL app. */
trait DialAppStateDetails extends StObject {
  
  /** Gets the entire XML response that is provided by the app when state of the app was requested. */
  var fullXml: String
  
  /** Gets the state of the application at the time the GetAppStateAsync was completed. */
  var state: DialAppState
}
object DialAppStateDetails {
  
  inline def apply(fullXml: String, state: DialAppState): DialAppStateDetails = {
    val __obj = js.Dynamic.literal(fullXml = fullXml.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialAppStateDetails]
  }
  
  extension [Self <: DialAppStateDetails](x: Self) {
    
    inline def setFullXml(value: String): Self = StObject.set(x, "fullXml", value.asInstanceOf[js.Any])
    
    inline def setState(value: DialAppState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
