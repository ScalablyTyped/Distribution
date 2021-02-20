package typings.vsoNodeApi.coreInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebApiConnectedServiceDetails extends WebApiConnectedServiceRef {
  
  /**
    * Meta data for service connection
    */
  var connectedServiceMetaData: WebApiConnectedService = js.native
  
  /**
    * Credential info
    */
  var credentialsXml: String = js.native
  
  /**
    * Optional uri to connect directly to the service such as https://windows.azure.com
    */
  var endPoint: String = js.native
}
object WebApiConnectedServiceDetails {
  
  @scala.inline
  def apply(
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
  implicit class WebApiConnectedServiceDetailsMutableBuilder[Self <: WebApiConnectedServiceDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectedServiceMetaData(value: WebApiConnectedService): Self = StObject.set(x, "connectedServiceMetaData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCredentialsXml(value: String): Self = StObject.set(x, "credentialsXml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndPoint(value: String): Self = StObject.set(x, "endPoint", value.asInstanceOf[js.Any])
  }
}
