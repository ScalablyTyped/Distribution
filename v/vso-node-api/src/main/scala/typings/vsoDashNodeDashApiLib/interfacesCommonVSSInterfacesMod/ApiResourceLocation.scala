package typings
package vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApiResourceLocation extends js.Object {
  /**
    * Area name for this resource
    */
  var area: java.lang.String
  /**
    * Unique Identifier for this location
    */
  var id: java.lang.String
  /**
    * Maximum api version that this resource supports (current server version for this resource)
    */
  var maxVersion: java.lang.String
  /**
    * Minimum api version that this resource supports
    */
  var minVersion: java.lang.String
  /**
    * The latest version of this resource location that is in "Release" (non-preview) mode
    */
  var releasedVersion: java.lang.String
  /**
    * Resource name
    */
  var resourceName: java.lang.String
  /**
    * The current resource version supported by this resource location
    */
  var resourceVersion: scala.Double
  /**
    * This location's route template (templated relative path)
    */
  var routeTemplate: java.lang.String
}

object ApiResourceLocation {
  @scala.inline
  def apply(
    area: java.lang.String,
    id: java.lang.String,
    maxVersion: java.lang.String,
    minVersion: java.lang.String,
    releasedVersion: java.lang.String,
    resourceName: java.lang.String,
    resourceVersion: scala.Double,
    routeTemplate: java.lang.String
  ): ApiResourceLocation = {
    val __obj = js.Dynamic.literal(area = area, id = id, maxVersion = maxVersion, minVersion = minVersion, releasedVersion = releasedVersion, resourceName = resourceName, resourceVersion = resourceVersion, routeTemplate = routeTemplate)
  
    __obj.asInstanceOf[ApiResourceLocation]
  }
}

