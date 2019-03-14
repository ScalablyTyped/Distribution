package typings
package vscodeLib.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode", "SignatureInformation")
@js.native
class SignatureInformation protected () extends js.Object {
  /**
  		 * Creates a new signature information object.
  		 *
  		 * @param label A label string.
  		 * @param documentation A doc string.
  		 */
  def this(label: java.lang.String) = this()
  def this(label: java.lang.String, documentation: java.lang.String) = this()
  /**
  		 * The human-readable doc-comment of this signature. Will be shown
  		 * in the UI but can be omitted.
  		 */
  var documentation: js.UndefOr[java.lang.String] = js.native
  /**
  		 * The label of this signature. Will be shown in
  		 * the UI.
  		 */
  var label: java.lang.String = js.native
  /**
  		 * The parameters of this signature.
  		 */
  var parameters: js.Array[ParameterInformation] = js.native
}

