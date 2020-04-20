package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndexSignatureInfo extends js.Object {
  var numericSignature: PullSignatureSymbol
  var stringSignature: PullSignatureSymbol
}

object IndexSignatureInfo {
  @scala.inline
  def apply(numericSignature: PullSignatureSymbol, stringSignature: PullSignatureSymbol): IndexSignatureInfo = {
    val __obj = js.Dynamic.literal(numericSignature = numericSignature.asInstanceOf[js.Any], stringSignature = stringSignature.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexSignatureInfo]
  }
}

