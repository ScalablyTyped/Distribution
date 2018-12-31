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

