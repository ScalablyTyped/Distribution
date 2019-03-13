package typings
package vscodeLib.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode", "SignatureHelp")
@js.native
class SignatureHelp () extends js.Object {
  /**
  		 * The active parameter of the active signature.
  		 */
  var activeParameter: scala.Double = js.native
  /**
  		 * The active signature.
  		 */
  var activeSignature: scala.Double = js.native
  /**
  		 * One or more signatures.
  		 */
  var signatures: js.Array[SignatureInformation] = js.native
}

