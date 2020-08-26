package typings.winrtUwp.Windows.Networking.NetworkOperators

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the results of a StartTetheringAsync or StopTetheringAsync operation. In addition to the TetheringOperationStatus value, it can include an optional error message string that provides mobile operator specific context to the error. */
@js.native
trait NetworkOperatorTetheringOperationResult extends js.Object {
  /** An optional error message string that provides mobile operator specific context to the error. */
  var additionalErrorMessage: String = js.native
  /** Indicates the result of a tethering operation. Possible values are defined by TetheringOperationStatus . */
  var status: TetheringOperationStatus = js.native
}

object NetworkOperatorTetheringOperationResult {
  @scala.inline
  def apply(additionalErrorMessage: String, status: TetheringOperationStatus): NetworkOperatorTetheringOperationResult = {
    val __obj = js.Dynamic.literal(additionalErrorMessage = additionalErrorMessage.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkOperatorTetheringOperationResult]
  }
  @scala.inline
  implicit class NetworkOperatorTetheringOperationResultOps[Self <: NetworkOperatorTetheringOperationResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAdditionalErrorMessage(value: String): Self = this.set("additionalErrorMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: TetheringOperationStatus): Self = this.set("status", value.asInstanceOf[js.Any])
  }
  
}

