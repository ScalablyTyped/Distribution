package typings.winrtUwp.global.Windows.Networking.NetworkOperators

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the results of a StartTetheringAsync or StopTetheringAsync operation. In addition to the TetheringOperationStatus value, it can include an optional error message string that provides mobile operator specific context to the error. */
@JSGlobal("Windows.Networking.NetworkOperators.NetworkOperatorTetheringOperationResult")
@js.native
abstract class NetworkOperatorTetheringOperationResult ()
  extends typings.winrtUwp.Windows.Networking.NetworkOperators.NetworkOperatorTetheringOperationResult {
  /** An optional error message string that provides mobile operator specific context to the error. */
  /* CompleteClass */
  override var additionalErrorMessage: String = js.native
  /** Indicates the result of a tethering operation. Possible values are defined by TetheringOperationStatus . */
  /* CompleteClass */
  override var status: typings.winrtUwp.Windows.Networking.NetworkOperators.TetheringOperationStatus = js.native
}

