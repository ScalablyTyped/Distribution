package typings
package vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceEndpointDetails extends js.Object {
  var authorization: EndpointAuthorization
  var data: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var `type`: java.lang.String
  var url: java.lang.String
}

object ServiceEndpointDetails {
  @scala.inline
  def apply(
    authorization: EndpointAuthorization,
    data: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    `type`: java.lang.String,
    url: java.lang.String
  ): ServiceEndpointDetails = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("authorization")(authorization)
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[ServiceEndpointDetails]
  }
}

