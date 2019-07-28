package typings.vsoDashNodeDashApi.interfacesCoreInterfacesMod

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
    val __obj = js.Dynamic.literal(connectedServiceMetaData = connectedServiceMetaData, credentialsXml = credentialsXml, endPoint = endPoint, id = id, url = url)
  
    __obj.asInstanceOf[WebApiConnectedServiceDetails]
  }
}

