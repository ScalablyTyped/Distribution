package typings
package vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceEndpointAuthenticationScheme extends js.Object {
  var authorizationHeaders: js.Array[AuthorizationHeader]
  var displayName: java.lang.String
  var inputDescriptors: js.Array[vsoDashNodeDashApiLib.interfacesCommonFormInputInterfacesMod.InputDescriptor]
  var scheme: java.lang.String
}

object ServiceEndpointAuthenticationScheme {
  @scala.inline
  def apply(
    authorizationHeaders: js.Array[AuthorizationHeader],
    displayName: java.lang.String,
    inputDescriptors: js.Array[vsoDashNodeDashApiLib.interfacesCommonFormInputInterfacesMod.InputDescriptor],
    scheme: java.lang.String
  ): ServiceEndpointAuthenticationScheme = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("authorizationHeaders")(authorizationHeaders)
    __obj.updateDynamic("displayName")(displayName)
    __obj.updateDynamic("inputDescriptors")(inputDescriptors)
    __obj.updateDynamic("scheme")(scheme)
    __obj.asInstanceOf[ServiceEndpointAuthenticationScheme]
  }
}

