package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitAsyncRefOperationDetail extends js.Object {
  /**
    * Indicates if there was a conflict generated when trying to cherry pick or revert the changes.
    */
  var conflict: scala.Boolean
  /**
    * The current commit from the list of commits that are being cherry picked or reverted.
    */
  var currentCommitId: java.lang.String
  /**
    * Detailed information about why the cherry pick or revert failed to complete.
    */
  var failureMessage: java.lang.String
  /**
    * A number between 0 and 1 indicating the percent complete of the operation.
    */
  var progress: scala.Double
  /**
    * Provides a status code that indicates the reason the cherry pick or revert failed.
    */
  var status: GitAsyncRefOperationFailureStatus
  /**
    * Indicates if the operation went beyond the maximum time allowed for a cherry pick or revert operation.
    */
  var timedout: scala.Boolean
}

