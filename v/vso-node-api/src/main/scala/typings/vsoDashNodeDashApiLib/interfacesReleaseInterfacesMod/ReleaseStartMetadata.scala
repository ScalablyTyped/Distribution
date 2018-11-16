package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ReleaseStartMetadata extends js.Object {
  /**
       * Sets list of artifact to create a release.
       */
  var artifacts: js.Array[ArtifactMetadata]
  /**
       * Sets definition Id to create a release.
       */
  var definitionId: scala.Double
  /**
       * Sets description to create a release.
       */
  var description: java.lang.String
  /**
       * Sets 'true' to create release in draft mode, 'false' otherwise.
       */
  var isDraft: scala.Boolean
  /**
       * Sets list of environments to manual as condition.
       */
  var manualEnvironments: js.Array[java.lang.String]
  var properties: js.Any
  /**
       * Sets reason to create a release.
       */
  var reason: ReleaseReason
}

