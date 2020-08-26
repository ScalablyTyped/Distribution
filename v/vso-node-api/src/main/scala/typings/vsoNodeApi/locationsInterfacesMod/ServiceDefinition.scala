package typings.vsoNodeApi.locationsInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceDefinition extends js.Object {
  var description: String = js.native
  var displayName: String = js.native
  var identifier: String = js.native
  var inheritLevel: InheritLevel = js.native
  var locationMappings: js.Array[LocationMapping] = js.native
  /**
    * Maximum api version that this resource supports (current server version for this resource). Copied from <c>ApiResourceLocation</c>.
    */
  var maxVersion: String = js.native
  /**
    * Minimum api version that this resource supports. Copied from <c>ApiResourceLocation</c>.
    */
  var minVersion: String = js.native
  var parentIdentifier: String = js.native
  var parentServiceType: String = js.native
  var properties: js.Any = js.native
  var relativePath: String = js.native
  var relativeToSetting: RelativeToSetting = js.native
  /**
    * The latest version of this resource location that is in "Release" (non-preview) mode. Copied from <c>ApiResourceLocation</c>.
    */
  var releasedVersion: String = js.native
  /**
    * The current resource version supported by this resource location. Copied from <c>ApiResourceLocation</c>.
    */
  var resourceVersion: Double = js.native
  /**
    * The service which owns this definition e.g. TFS, ELS, etc.
    */
  var serviceOwner: String = js.native
  var serviceType: String = js.native
  var status: ServiceStatus = js.native
  var toolId: String = js.native
}

object ServiceDefinition {
  @scala.inline
  def apply(
    description: String,
    displayName: String,
    identifier: String,
    inheritLevel: InheritLevel,
    locationMappings: js.Array[LocationMapping],
    maxVersion: String,
    minVersion: String,
    parentIdentifier: String,
    parentServiceType: String,
    properties: js.Any,
    relativePath: String,
    relativeToSetting: RelativeToSetting,
    releasedVersion: String,
    resourceVersion: Double,
    serviceOwner: String,
    serviceType: String,
    status: ServiceStatus,
    toolId: String
  ): ServiceDefinition = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], inheritLevel = inheritLevel.asInstanceOf[js.Any], locationMappings = locationMappings.asInstanceOf[js.Any], maxVersion = maxVersion.asInstanceOf[js.Any], minVersion = minVersion.asInstanceOf[js.Any], parentIdentifier = parentIdentifier.asInstanceOf[js.Any], parentServiceType = parentServiceType.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], relativePath = relativePath.asInstanceOf[js.Any], relativeToSetting = relativeToSetting.asInstanceOf[js.Any], releasedVersion = releasedVersion.asInstanceOf[js.Any], resourceVersion = resourceVersion.asInstanceOf[js.Any], serviceOwner = serviceOwner.asInstanceOf[js.Any], serviceType = serviceType.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], toolId = toolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceDefinition]
  }
  @scala.inline
  implicit class ServiceDefinitionOps[Self <: ServiceDefinition] (val x: Self) extends AnyVal {
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def setIdentifier(value: String): Self = this.set("identifier", value.asInstanceOf[js.Any])
    @scala.inline
    def setInheritLevel(value: InheritLevel): Self = this.set("inheritLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocationMappingsVarargs(value: LocationMapping*): Self = this.set("locationMappings", js.Array(value :_*))
    @scala.inline
    def setLocationMappings(value: js.Array[LocationMapping]): Self = this.set("locationMappings", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxVersion(value: String): Self = this.set("maxVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinVersion(value: String): Self = this.set("minVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setParentIdentifier(value: String): Self = this.set("parentIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def setParentServiceType(value: String): Self = this.set("parentServiceType", value.asInstanceOf[js.Any])
    @scala.inline
    def setProperties(value: js.Any): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def setRelativePath(value: String): Self = this.set("relativePath", value.asInstanceOf[js.Any])
    @scala.inline
    def setRelativeToSetting(value: RelativeToSetting): Self = this.set("relativeToSetting", value.asInstanceOf[js.Any])
    @scala.inline
    def setReleasedVersion(value: String): Self = this.set("releasedVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setResourceVersion(value: Double): Self = this.set("resourceVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setServiceOwner(value: String): Self = this.set("serviceOwner", value.asInstanceOf[js.Any])
    @scala.inline
    def setServiceType(value: String): Self = this.set("serviceType", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: ServiceStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setToolId(value: String): Self = this.set("toolId", value.asInstanceOf[js.Any])
  }
  
}

