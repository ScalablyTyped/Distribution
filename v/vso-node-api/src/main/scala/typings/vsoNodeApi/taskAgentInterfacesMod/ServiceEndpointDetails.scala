package typings.vsoNodeApi.taskAgentInterfacesMod

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
  
  @scala.inline
  def apply(authorization: EndpointAuthorization, data: StringDictionary[String], `type`: String, url: String): ServiceEndpointDetails = {
    val __obj = js.Dynamic.literal(authorization = authorization.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceEndpointDetails]
  }
  
  @scala.inline
  implicit class ServiceEndpointDetailsMutableBuilder[Self <: ServiceEndpointDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthorization(value: EndpointAuthorization): Self = StObject.set(x, "authorization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: StringDictionary[String]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
