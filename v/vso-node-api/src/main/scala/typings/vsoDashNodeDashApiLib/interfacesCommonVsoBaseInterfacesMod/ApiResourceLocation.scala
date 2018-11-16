package typings
package vsoDashNodeDashApiLib.interfacesCommonVsoBaseInterfacesMod

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

