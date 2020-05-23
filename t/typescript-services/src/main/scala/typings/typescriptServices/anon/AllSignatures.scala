package typings.typescriptServices.anon

import typings.typescriptServices.TypeScript.PullSignatureSymbol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AllSignatures extends js.Object {
  var allSignatures: js.Array[PullSignatureSymbol]
  var signature: PullSignatureSymbol
}

object AllSignatures {
  @scala.inline
  def apply(allSignatures: js.Array[PullSignatureSymbol], signature: PullSignatureSymbol): AllSignatures = {
    val __obj = js.Dynamic.literal(allSignatures = allSignatures.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllSignatures]
  }
}

