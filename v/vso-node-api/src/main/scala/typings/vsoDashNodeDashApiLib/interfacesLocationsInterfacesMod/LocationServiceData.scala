package typings
package vsoDashNodeDashApiLib.interfacesLocationsInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait LocationServiceData extends js.Object {
  /**
       * Data about the access mappings contained by this location service.
       */
  var accessMappings: js.Array[AccessMapping]
  /**
       * Data that the location service holds.
       */
  var clientCacheFresh: scala.Boolean
  /**
       * The time to live on the location service cache.
       */
  var clientCacheTimeToLive: scala.Double
  /**
       * The default access mapping moniker for the server.
       */
  var defaultAccessMappingMoniker: java.lang.String
  /**
       * The obsolete id for the last change that took place on the server (use LastChangeId64).
       */
  var lastChangeId: scala.Double
  /**
       * The non-truncated 64-bit id for the last change that took place on the server.
       */
  var lastChangeId64: scala.Double
  /**
       * Data about the service definitions contained by this location service.
       */
  var serviceDefinitions: js.Array[ServiceDefinition]
  /**
       * The identifier of the deployment which is hosting this location data (e.g. SPS, TFS, ELS, Napa, etc.)
       */
  var serviceOwner: java.lang.String
}

