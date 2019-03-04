package typings
package vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignatureHelp extends js.Object {
  /**
    * The active parameter of the active signature. Set to `null`
    * if the active signature has no parameters.
    */
  var activeParameter: scala.Double | scala.Null
  /**
    * The active signature. Set to `null` if no
    * signatures exist.
    */
  var activeSignature: scala.Double | scala.Null
  /**
    * One or more signatures.
    */
  var signatures: js.Array[SignatureInformation]
}

object SignatureHelp {
  @scala.inline
  def apply(
    signatures: js.Array[SignatureInformation],
    activeParameter: scala.Int | scala.Double = null,
    activeSignature: scala.Int | scala.Double = null
  ): SignatureHelp = {
    val __obj = js.Dynamic.literal(signatures = signatures)
    if (activeParameter != null) __obj.updateDynamic("activeParameter")(activeParameter.asInstanceOf[js.Any])
    if (activeSignature != null) __obj.updateDynamic("activeSignature")(activeSignature.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignatureHelp]
  }
}

