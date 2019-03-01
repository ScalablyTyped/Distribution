package typings
package typescriptDashServicesLib.TypeScriptNs.PullHelpersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignatureInfoForFuncDecl extends js.Object {
  var allSignatures: js.Array[typescriptDashServicesLib.TypeScriptNs.PullSignatureSymbol]
  var signature: typescriptDashServicesLib.TypeScriptNs.PullSignatureSymbol
}

object SignatureInfoForFuncDecl {
  @scala.inline
  def apply(
    allSignatures: js.Array[typescriptDashServicesLib.TypeScriptNs.PullSignatureSymbol],
    signature: typescriptDashServicesLib.TypeScriptNs.PullSignatureSymbol
  ): SignatureInfoForFuncDecl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("allSignatures")(allSignatures)
    __obj.updateDynamic("signature")(signature)
    __obj.asInstanceOf[SignatureInfoForFuncDecl]
  }
}

