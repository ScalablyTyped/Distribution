package typings.winrtUwp.Windows.Media.PlayTo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about the Error event. */
@JSGlobal("Windows.Media.PlayTo.PlayToConnectionErrorEventArgs")
@js.native
abstract class PlayToConnectionErrorEventArgs () extends js.Object {
  /** Gets the error code for a Play To connection error. */
  var code: PlayToConnectionError = js.native
  /** Gets the error message for a Play To connection error. */
  var message: String = js.native
}

