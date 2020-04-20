package typings.typescriptServices

import typings.typescriptServices.TypeScript.PullSignatureSymbol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAllSignatures extends js.Object {
  var allSignatures: js.Array[PullSignatureSymbol]
  var signature: PullSignatureSymbol
}

object AnonAllSignatures {
  @scala.inline
  def apply(allSignatures: js.Array[PullSignatureSymbol], signature: PullSignatureSymbol): AnonAllSignatures = {
    val __obj = js.Dynamic.literal(allSignatures = allSignatures.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAllSignatures]
  }
}

