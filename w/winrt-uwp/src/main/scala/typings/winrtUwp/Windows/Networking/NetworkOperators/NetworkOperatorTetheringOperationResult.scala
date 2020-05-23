package typings.winrtUwp.Windows.Networking.NetworkOperators

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the results of a StartTetheringAsync or StopTetheringAsync operation. In addition to the TetheringOperationStatus value, it can include an optional error message string that provides mobile operator specific context to the error. */
trait NetworkOperatorTetheringOperationResult extends js.Object {
  /** An optional error message string that provides mobile operator specific context to the error. */
  var additionalErrorMessage: String
  /** Indicates the result of a tethering operation. Possible values are defined by TetheringOperationStatus . */
  var status: TetheringOperationStatus
}

object NetworkOperatorTetheringOperationResult {
  @scala.inline
  def apply(additionalErrorMessage: String, status: TetheringOperationStatus): NetworkOperatorTetheringOperationResult = {
    val __obj = js.Dynamic.literal(additionalErrorMessage = additionalErrorMessage.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkOperatorTetheringOperationResult]
  }
}

