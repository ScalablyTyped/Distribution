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
    val __obj = js.Dynamic.literal(authorizationHeaders = authorizationHeaders, displayName = displayName, inputDescriptors = inputDescriptors, scheme = scheme)
  
    __obj.asInstanceOf[ServiceEndpointAuthenticationScheme]
  }
}

