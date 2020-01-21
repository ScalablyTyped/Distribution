package typings.vsoNodeApi.taskAgentInterfacesMod

import typings.vsoNodeApi.formInputInterfacesMod.InputDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceEndpointType extends js.Object {
  var authenticationSchemes: js.Array[ServiceEndpointAuthenticationScheme]
  var dataSources: js.Array[DataSource]
  var dependencyData: js.Array[DependencyData]
  var description: String
  var displayName: String
  var endpointUrl: EndpointUrl
  var helpLink: HelpLink
  var helpMarkDown: String
  var iconUrl: String
  var inputDescriptors: js.Array[InputDescriptor]
  var name: String
}

object ServiceEndpointType {
  @scala.inline
  def apply(
    authenticationSchemes: js.Array[ServiceEndpointAuthenticationScheme],
    dataSources: js.Array[DataSource],
    dependencyData: js.Array[DependencyData],
    description: String,
    displayName: String,
    endpointUrl: EndpointUrl,
    helpLink: HelpLink,
    helpMarkDown: String,
    iconUrl: String,
    inputDescriptors: js.Array[InputDescriptor],
    name: String
  ): ServiceEndpointType = {
    val __obj = js.Dynamic.literal(authenticationSchemes = authenticationSchemes.asInstanceOf[js.Any], dataSources = dataSources.asInstanceOf[js.Any], dependencyData = dependencyData.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], endpointUrl = endpointUrl.asInstanceOf[js.Any], helpLink = helpLink.asInstanceOf[js.Any], helpMarkDown = helpMarkDown.asInstanceOf[js.Any], iconUrl = iconUrl.asInstanceOf[js.Any], inputDescriptors = inputDescriptors.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ServiceEndpointType]
  }
}

