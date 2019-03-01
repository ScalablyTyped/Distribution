package typings
package vsoDashNodeDashApiLib.interfacesLocationsInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceDefinition extends js.Object {
  var description: java.lang.String
  var displayName: java.lang.String
  var identifier: java.lang.String
  var inheritLevel: InheritLevel
  var locationMappings: js.Array[LocationMapping]
  /**
    * Maximum api version that this resource supports (current server version for this resource). Copied from <c>ApiResourceLocation</c>.
    */
  var maxVersion: java.lang.String
  /**
    * Minimum api version that this resource supports. Copied from <c>ApiResourceLocation</c>.
    */
  var minVersion: java.lang.String
  var parentIdentifier: java.lang.String
  var parentServiceType: java.lang.String
  var properties: js.Any
  var relativePath: java.lang.String
  var relativeToSetting: RelativeToSetting
  /**
    * The latest version of this resource location that is in "Release" (non-preview) mode. Copied from <c>ApiResourceLocation</c>.
    */
  var releasedVersion: java.lang.String
  /**
    * The current resource version supported by this resource location. Copied from <c>ApiResourceLocation</c>.
    */
  var resourceVersion: scala.Double
  /**
    * The service which owns this definition e.g. TFS, ELS, etc.
    */
  var serviceOwner: java.lang.String
  var serviceType: java.lang.String
  var status: ServiceStatus
  var toolId: java.lang.String
}

object ServiceDefinition {
  @scala.inline
  def apply(
    description: java.lang.String,
    displayName: java.lang.String,
    identifier: java.lang.String,
    inheritLevel: InheritLevel,
    locationMappings: js.Array[LocationMapping],
    maxVersion: java.lang.String,
    minVersion: java.lang.String,
    parentIdentifier: java.lang.String,
    parentServiceType: java.lang.String,
    properties: js.Any,
    relativePath: java.lang.String,
    relativeToSetting: RelativeToSetting,
    releasedVersion: java.lang.String,
    resourceVersion: scala.Double,
    serviceOwner: java.lang.String,
    serviceType: java.lang.String,
    status: ServiceStatus,
    toolId: java.lang.String
  ): ServiceDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("displayName")(displayName)
    __obj.updateDynamic("identifier")(identifier)
    __obj.updateDynamic("inheritLevel")(inheritLevel)
    __obj.updateDynamic("locationMappings")(locationMappings)
    __obj.updateDynamic("maxVersion")(maxVersion)
    __obj.updateDynamic("minVersion")(minVersion)
    __obj.updateDynamic("parentIdentifier")(parentIdentifier)
    __obj.updateDynamic("parentServiceType")(parentServiceType)
    __obj.updateDynamic("properties")(properties)
    __obj.updateDynamic("relativePath")(relativePath)
    __obj.updateDynamic("relativeToSetting")(relativeToSetting)
    __obj.updateDynamic("releasedVersion")(releasedVersion)
    __obj.updateDynamic("resourceVersion")(resourceVersion)
    __obj.updateDynamic("serviceOwner")(serviceOwner)
    __obj.updateDynamic("serviceType")(serviceType)
    __obj.updateDynamic("status")(status)
    __obj.updateDynamic("toolId")(toolId)
    __obj.asInstanceOf[ServiceDefinition]
  }
}

