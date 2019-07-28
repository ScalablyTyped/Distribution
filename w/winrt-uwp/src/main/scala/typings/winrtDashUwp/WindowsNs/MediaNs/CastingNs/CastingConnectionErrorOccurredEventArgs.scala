package typings.winrtDashUwp.WindowsNs.MediaNs.CastingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents arguments for the ErrorOccurred event from the CastingConnection */
@JSGlobal("Windows.Media.Casting.CastingConnectionErrorOccurredEventArgs")
@js.native
abstract class CastingConnectionErrorOccurredEventArgs () extends js.Object {
  /** Gets the particular error that triggered the casting error event, ErrorOccurred . */
  var errorStatus: CastingConnectionErrorStatus = js.native
  /** Gets human-readable message to accompany the error status code, ErrorStatus . */
  var message: String = js.native
}

