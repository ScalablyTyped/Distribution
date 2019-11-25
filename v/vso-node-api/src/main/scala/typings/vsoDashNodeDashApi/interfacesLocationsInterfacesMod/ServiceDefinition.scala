package typings.vsoDashNodeDashApi.interfacesLocationsInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceDefinition extends js.Object {
  var description: String
  var displayName: String
  var identifier: String
  var inheritLevel: InheritLevel
  var locationMappings: js.Array[LocationMapping]
  /**
    * Maximum api version that this resource supports (current server version for this resource). Copied from <c>ApiResourceLocation</c>.
    */
  var maxVersion: String
  /**
    * Minimum api version that this resource supports. Copied from <c>ApiResourceLocation</c>.
    */
  var minVersion: String
  var parentIdentifier: String
  var parentServiceType: String
  var properties: js.Any
  var relativePath: String
  var relativeToSetting: RelativeToSetting
  /**
    * The latest version of this resource location that is in "Release" (non-preview) mode. Copied from <c>ApiResourceLocation</c>.
    */
  var releasedVersion: String
  /**
    * The current resource version supported by this resource location. Copied from <c>ApiResourceLocation</c>.
    */
  var resourceVersion: Double
  /**
    * The service which owns this definition e.g. TFS, ELS, etc.
    */
  var serviceOwner: String
  var serviceType: String
  var status: ServiceStatus
  var toolId: String
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
}

