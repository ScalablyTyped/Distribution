package typings
package vsoDashNodeDashApiLib.interfacesCoreInterfacesMod

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
  var credentialsXml: java.lang.String
  /**
    * Optional uri to connect directly to the service such as https://windows.azure.com
    */
  var endPoint: java.lang.String
}

object WebApiConnectedServiceDetails {
  @scala.inline
  def apply(
    connectedServiceMetaData: WebApiConnectedService,
    credentialsXml: java.lang.String,
    endPoint: java.lang.String,
    id: java.lang.String,
    url: java.lang.String
  ): WebApiConnectedServiceDetails = {
    val __obj = js.Dynamic.literal(connectedServiceMetaData = connectedServiceMetaData, credentialsXml = credentialsXml, endPoint = endPoint, id = id, url = url)
  
    __obj.asInstanceOf[WebApiConnectedServiceDetails]
  }
}

