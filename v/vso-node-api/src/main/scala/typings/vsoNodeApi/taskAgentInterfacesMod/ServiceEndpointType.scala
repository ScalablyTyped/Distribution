package typings.vsoNodeApi.taskAgentInterfacesMod

import typings.vsoNodeApi.formInputInterfacesMod.InputDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceEndpointType extends js.Object {
  var authenticationSchemes: js.Array[ServiceEndpointAuthenticationScheme] = js.native
  var dataSources: js.Array[DataSource] = js.native
  var dependencyData: js.Array[DependencyData] = js.native
  var description: String = js.native
  var displayName: String = js.native
  var endpointUrl: EndpointUrl = js.native
  var helpLink: HelpLink = js.native
  var helpMarkDown: String = js.native
  var iconUrl: String = js.native
  var inputDescriptors: js.Array[InputDescriptor] = js.native
  var name: String = js.native
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
  @scala.inline
  implicit class ServiceEndpointTypeOps[Self <: ServiceEndpointType] (val x: Self) extends AnyVal {
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
    def setAuthenticationSchemesVarargs(value: ServiceEndpointAuthenticationScheme*): Self = this.set("authenticationSchemes", js.Array(value :_*))
    @scala.inline
    def setAuthenticationSchemes(value: js.Array[ServiceEndpointAuthenticationScheme]): Self = this.set("authenticationSchemes", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataSourcesVarargs(value: DataSource*): Self = this.set("dataSources", js.Array(value :_*))
    @scala.inline
    def setDataSources(value: js.Array[DataSource]): Self = this.set("dataSources", value.asInstanceOf[js.Any])
    @scala.inline
    def setDependencyDataVarargs(value: DependencyData*): Self = this.set("dependencyData", js.Array(value :_*))
    @scala.inline
    def setDependencyData(value: js.Array[DependencyData]): Self = this.set("dependencyData", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndpointUrl(value: EndpointUrl): Self = this.set("endpointUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setHelpLink(value: HelpLink): Self = this.set("helpLink", value.asInstanceOf[js.Any])
    @scala.inline
    def setHelpMarkDown(value: String): Self = this.set("helpMarkDown", value.asInstanceOf[js.Any])
    @scala.inline
    def setIconUrl(value: String): Self = this.set("iconUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setInputDescriptorsVarargs(value: InputDescriptor*): Self = this.set("inputDescriptors", js.Array(value :_*))
    @scala.inline
    def setInputDescriptors(value: js.Array[InputDescriptor]): Self = this.set("inputDescriptors", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

