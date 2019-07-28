package typings.vsoDashNodeDashApi.interfacesCommonVSSInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApiResourceLocation extends js.Object {
  /**
    * Area name for this resource
    */
  var area: String
  /**
    * Unique Identifier for this location
    */
  var id: String
  /**
    * Maximum api version that this resource supports (current server version for this resource)
    */
  var maxVersion: String
  /**
    * Minimum api version that this resource supports
    */
  var minVersion: String
  /**
    * The latest version of this resource location that is in "Release" (non-preview) mode
    */
  var releasedVersion: String
  /**
    * Resource name
    */
  var resourceName: String
  /**
    * The current resource version supported by this resource location
    */
  var resourceVersion: Double
  /**
    * This location's route template (templated relative path)
    */
  var routeTemplate: String
}

object ApiResourceLocation {
  @scala.inline
  def apply(
    area: String,
    id: String,
    maxVersion: String,
    minVersion: String,
    releasedVersion: String,
    resourceName: String,
    resourceVersion: Double,
    routeTemplate: String
  ): ApiResourceLocation = {
    val __obj = js.Dynamic.literal(area = area, id = id, maxVersion = maxVersion, minVersion = minVersion, releasedVersion = releasedVersion, resourceName = resourceName, resourceVersion = resourceVersion, routeTemplate = routeTemplate)
  
    __obj.asInstanceOf[ApiResourceLocation]
  }
}

