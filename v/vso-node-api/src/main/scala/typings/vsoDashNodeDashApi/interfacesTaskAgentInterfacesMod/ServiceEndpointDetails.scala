package typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceEndpointDetails extends js.Object {
  var authorization: EndpointAuthorization
  var data: StringDictionary[String]
  var `type`: String
  var url: String
}

object ServiceEndpointDetails {
  @scala.inline
  def apply(authorization: EndpointAuthorization, data: StringDictionary[String], `type`: String, url: String): ServiceEndpointDetails = {
    val __obj = js.Dynamic.literal(authorization = authorization, data = data, url = url)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ServiceEndpointDetails]
  }
}

