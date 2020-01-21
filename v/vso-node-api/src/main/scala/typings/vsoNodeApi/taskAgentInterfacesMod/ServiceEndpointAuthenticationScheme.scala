package typings.vsoNodeApi.taskAgentInterfacesMod

import typings.vsoNodeApi.formInputInterfacesMod.InputDescriptor
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
    val __obj = js.Dynamic.literal(authorizationHeaders = authorizationHeaders.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], inputDescriptors = inputDescriptors.asInstanceOf[js.Any], scheme = scheme.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ServiceEndpointAuthenticationScheme]
  }
}

