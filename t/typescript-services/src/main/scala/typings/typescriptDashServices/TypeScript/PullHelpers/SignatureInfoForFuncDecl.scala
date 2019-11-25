package typings.typescriptDashServices.TypeScript.PullHelpers

import typings.typescriptDashServices.TypeScript.PullSignatureSymbol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignatureInfoForFuncDecl extends js.Object {
  var allSignatures: js.Array[PullSignatureSymbol]
  var signature: PullSignatureSymbol
}

object SignatureInfoForFuncDecl {
  @scala.inline
  def apply(allSignatures: js.Array[PullSignatureSymbol], signature: PullSignatureSymbol): SignatureInfoForFuncDecl = {
    val __obj = js.Dynamic.literal(allSignatures = allSignatures.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SignatureInfoForFuncDecl]
  }
}

