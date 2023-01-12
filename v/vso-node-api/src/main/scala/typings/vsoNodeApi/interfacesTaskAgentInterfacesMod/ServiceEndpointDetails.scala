package typings.vsoNodeApi.interfacesTaskAgentInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceEndpointDetails extends StObject {
  
  var authorization: EndpointAuthorization
  
  var data: StringDictionary[String]
  
  var `type`: String
  
  var url: String
}
object ServiceEndpointDetails {
  
  inline def apply(authorization: EndpointAuthorization, data: StringDictionary[String], `type`: String, url: String): ServiceEndpointDetails = {
    val __obj = js.Dynamic.literal(authorization = authorization.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceEndpointDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServiceEndpointDetails] (val x: Self) extends AnyVal {
    
    inline def setAuthorization(value: EndpointAuthorization): Self = StObject.set(x, "authorization", value.asInstanceOf[js.Any])
    
    inline def setData(value: StringDictionary[String]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
