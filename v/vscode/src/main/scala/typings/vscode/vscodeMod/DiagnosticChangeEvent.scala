package typings.vscode.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagnosticChangeEvent extends js.Object {
  /**
  		 * An array of resources for which diagnostics have changed.
  		 */
  val uris: js.Array[Uri]
}

object DiagnosticChangeEvent {
  @scala.inline
  def apply(uris: js.Array[Uri]): DiagnosticChangeEvent = {
    val __obj = js.Dynamic.literal(uris = uris.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DiagnosticChangeEvent]
  }
}

