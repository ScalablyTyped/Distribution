package typings
package vscodeLib.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode", "DiagnosticRelatedInformation")
@js.native
class DiagnosticRelatedInformation protected () extends js.Object {
  /**
  		 * Creates a new related diagnostic information object.
  		 *
  		 * @param location The location.
  		 * @param message The message.
  		 */
  def this(location: Location, message: java.lang.String) = this()
  /**
  		 * The location of this related diagnostic information.
  		 */
  var location: Location = js.native
  /**
  		 * The message of this related diagnostic information.
  		 */
  var message: java.lang.String = js.native
}

