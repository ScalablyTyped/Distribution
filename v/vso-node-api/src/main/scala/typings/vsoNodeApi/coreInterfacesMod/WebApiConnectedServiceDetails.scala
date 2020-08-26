package typings.vsoNodeApi.coreInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class WebApiConnectedServiceDetailsOps[Self <: WebApiConnectedServiceDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setConnectedServiceMetaData(value: WebApiConnectedService): Self = this.set("connectedServiceMetaData", value.asInstanceOf[js.Any])
    @scala.inline
    def setCredentialsXml(value: String): Self = this.set("credentialsXml", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndPoint(value: String): Self = this.set("endPoint", value.asInstanceOf[js.Any])
  }
  
}

