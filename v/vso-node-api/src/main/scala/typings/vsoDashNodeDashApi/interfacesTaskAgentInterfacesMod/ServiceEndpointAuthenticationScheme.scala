package typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod

import typings.vsoDashNodeDashApi.interfacesCommonFormInputInterfacesMod.InputDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceEndpointAuthenticationScheme extends js.Object {
  var authorizationHeaders: js.Array[AuthorizationHeader]
  var displayName: String
  var inputDescriptors: js.Array[InputDescriptor]
  var scheme: String
}

object ServiceEndpointAuthenticationScheme {
  @scala.inline
  def apply(
    authorizationHeaders: js.Array[AuthorizationHeader],
    displayName: String,
    inputDescriptors: js.Array[InputDescriptor],
    scheme: String
  ): ServiceEndpointAuthenticationScheme = {
    val __obj = js.Dynamic.literal(authorizationHeaders = authorizationHeaders, displayName = displayName, inputDescriptors = inputDescriptors, scheme = scheme)
  
    __obj.asInstanceOf[ServiceEndpointAuthenticationScheme]
  }
}

