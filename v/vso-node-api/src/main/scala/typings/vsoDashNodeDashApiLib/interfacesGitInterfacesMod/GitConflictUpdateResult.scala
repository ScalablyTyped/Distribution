package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait GitConflictUpdateResult extends js.Object {
  /**
       * Conflict ID that was provided by input
       */
  var conflictId: scala.Double
  /**
       * Reason for failing
       */
  var customMessage: java.lang.String
  /**
       * Status of the update on the server
       */
  var updateStatus: GitConflictUpdateStatus
  /**
       * New state of the conflict after updating
       */
  var updatedConflict: GitConflict
}

