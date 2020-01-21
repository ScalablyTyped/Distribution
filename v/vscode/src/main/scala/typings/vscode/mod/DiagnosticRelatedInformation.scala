package typings.vscode.mod

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
  def this(location: Location, message: String) = this()
  /**
  		 * The location of this related diagnostic information.
  		 */
  var location: Location = js.native
  /**
  		 * The message of this related diagnostic information.
  		 */
  var message: String = js.native
}

