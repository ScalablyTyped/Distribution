package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ReleaseUpdateMetadata extends js.Object {
  /**
       * Sets comment for release.
       */
  var comment: java.lang.String
  /**
       * Set 'true' to exclude the release from retention policies.
       */
  var keepForever: scala.Boolean
  /**
       * Sets list of manual environments.
       */
  var manualEnvironments: js.Array[java.lang.String]
  /**
       * Sets status of the release.
       */
  var status: ReleaseStatus
}

