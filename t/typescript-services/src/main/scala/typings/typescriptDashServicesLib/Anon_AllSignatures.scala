package typings
package typescriptDashServicesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllSignatures extends js.Object {
  var allSignatures: js.Array[typescriptDashServicesLib.TypeScriptNs.PullSignatureSymbol]
  var signature: typescriptDashServicesLib.TypeScriptNs.PullSignatureSymbol
}

object Anon_AllSignatures {
  @scala.inline
  def apply(
    allSignatures: js.Array[typescriptDashServicesLib.TypeScriptNs.PullSignatureSymbol],
    signature: typescriptDashServicesLib.TypeScriptNs.PullSignatureSymbol
  ): Anon_AllSignatures = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("allSignatures")(allSignatures)
    __obj.updateDynamic("signature")(signature)
    __obj.asInstanceOf[Anon_AllSignatures]
  }
}

