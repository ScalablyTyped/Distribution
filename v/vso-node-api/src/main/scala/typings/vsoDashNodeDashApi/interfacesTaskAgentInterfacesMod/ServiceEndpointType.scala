package typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod

import typings.vsoDashNodeDashApi.interfacesCommonFormInputInterfacesMod.InputDescriptor
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
    val __obj = js.Dynamic.literal(authenticationSchemes = authenticationSchemes, dataSources = dataSources, dependencyData = dependencyData, description = description, displayName = displayName, endpointUrl = endpointUrl, helpLink = helpLink, helpMarkDown = helpMarkDown, iconUrl = iconUrl, inputDescriptors = inputDescriptors, name = name)
  
    __obj.asInstanceOf[ServiceEndpointType]
  }
}

