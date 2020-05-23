package typings.vscodeLanguageserverTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignatureHelp extends js.Object {
  /**
    * The active parameter of the active signature. Set to `null`
    * if the active signature has no parameters.
    */
  var activeParameter: Double | Null
  /**
    * The active signature. Set to `null` if no
    * signatures exist.
    */
  var activeSignature: Double | Null
  /**
    * One or more signatures.
    */
  var signatures: js.Array[SignatureInformation]
}

object SignatureHelp {
  @scala.inline
  def apply(
    signatures: js.Array[SignatureInformation],
    activeParameter: Double = null.asInstanceOf[Double],
    activeSignature: Double = null.asInstanceOf[Double]
  ): SignatureHelp = {
    val __obj = js.Dynamic.literal(signatures = signatures.asInstanceOf[js.Any], activeParameter = activeParameter.asInstanceOf[js.Any], activeSignature = activeSignature.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignatureHelp]
  }
}

