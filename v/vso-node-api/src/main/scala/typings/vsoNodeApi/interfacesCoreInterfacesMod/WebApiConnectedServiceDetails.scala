package typings.vsoNodeApi.interfacesCoreInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebApiConnectedServiceDetails
  extends StObject
     with WebApiConnectedServiceRef {
  
  /**
    * Meta data for service connection
    */
  var connectedServiceMetaData: WebApiConnectedService
  
  /**
    * Credential info
    */
  var credentialsXml: String
  
  /**
    * Optional uri to connect directly to the service such as https://windows.azure.com
    */
  var endPoint: String
}
object WebApiConnectedServiceDetails {
  
  inline def apply(
    connectedServiceMetaData: WebApiConnectedService,
    credentialsXml: String,
    endPoint: String,
    id: String,
    url: String
  ): WebApiConnectedServiceDetails = {
    val __obj = js.Dynamic.literal(connectedServiceMetaData = connectedServiceMetaData.asInstanceOf[js.Any], credentialsXml = credentialsXml.asInstanceOf[js.Any], endPoint = endPoint.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebApiConnectedServiceDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebApiConnectedServiceDetails] (val x: Self) extends AnyVal {
    
    inline def setConnectedServiceMetaData(value: WebApiConnectedService): Self = StObject.set(x, "connectedServiceMetaData", value.asInstanceOf[js.Any])
    
    inline def setCredentialsXml(value: String): Self = StObject.set(x, "credentialsXml", value.asInstanceOf[js.Any])
    
    inline def setEndPoint(value: String): Self = StObject.set(x, "endPoint", value.asInstanceOf[js.Any])
  }
}
