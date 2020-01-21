package typings.vsoNodeApi.coreInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebApiConnectedServiceDetails extends WebApiConnectedServiceRef {
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
}

