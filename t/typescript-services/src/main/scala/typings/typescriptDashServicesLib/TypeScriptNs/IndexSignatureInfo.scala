package typings
package typescriptDashServicesLib.TypeScriptNs

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("numericSignature")(numericSignature)
    __obj.updateDynamic("stringSignature")(stringSignature)
    __obj.asInstanceOf[IndexSignatureInfo]
  }
}

