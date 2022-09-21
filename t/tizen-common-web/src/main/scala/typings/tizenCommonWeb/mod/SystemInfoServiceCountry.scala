package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SystemInfoServiceCountry
  extends StObject
     with SystemInfoProperty {
  
  /**
    * Represents a country of which basic policy is set.
    */
  val serviceCountry: String
}
object SystemInfoServiceCountry {
  
  inline def apply(serviceCountry: String): SystemInfoServiceCountry = {
    val __obj = js.Dynamic.literal(serviceCountry = serviceCountry.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemInfoServiceCountry]
  }
  
  extension [Self <: SystemInfoServiceCountry](x: Self) {
    
    inline def setServiceCountry(value: String): Self = StObject.set(x, "serviceCountry", value.asInstanceOf[js.Any])
  }
}
