package typings.vsoNodeApi.interfacesTaskAgentInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EndpointAuthorization extends StObject {
  
  var parameters: StringDictionary[String]
  
  var scheme: String
}
object EndpointAuthorization {
  
  inline def apply(parameters: StringDictionary[String], scheme: String): EndpointAuthorization = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], scheme = scheme.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointAuthorization]
  }
  
  extension [Self <: EndpointAuthorization](x: Self) {
    
    inline def setParameters(value: StringDictionary[String]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setScheme(value: String): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
  }
}
