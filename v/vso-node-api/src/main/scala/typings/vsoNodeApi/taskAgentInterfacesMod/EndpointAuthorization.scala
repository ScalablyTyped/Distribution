package typings.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EndpointAuthorization extends StObject {
  
  var parameters: StringDictionary[String]
  
  var scheme: String
}
object EndpointAuthorization {
  
  @scala.inline
  def apply(parameters: StringDictionary[String], scheme: String): EndpointAuthorization = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], scheme = scheme.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointAuthorization]
  }
  
  @scala.inline
  implicit class EndpointAuthorizationMutableBuilder[Self <: EndpointAuthorization] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: StringDictionary[String]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheme(value: String): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
  }
}
