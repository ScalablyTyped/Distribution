package typings.typescriptServices.TypeScript.Services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignatureInfo extends js.Object {
  var activeFormal: Double
  var actual: ActualSignatureInfo
  var formal: js.Array[FormalSignatureItemInfo]
}

object SignatureInfo {
  @scala.inline
  def apply(activeFormal: Double, actual: ActualSignatureInfo, formal: js.Array[FormalSignatureItemInfo]): SignatureInfo = {
    val __obj = js.Dynamic.literal(activeFormal = activeFormal.asInstanceOf[js.Any], actual = actual.asInstanceOf[js.Any], formal = formal.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignatureInfo]
  }
}

