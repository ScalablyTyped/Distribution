package typings.typescriptServices.TypeScript.Services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormalSignatureItemInfo extends js.Object {
  var docComment: String
  var parameters: js.Array[FormalParameterInfo]
  var signatureInfo: String
  var typeParameters: js.Array[FormalTypeParameterInfo]
}

object FormalSignatureItemInfo {
  @scala.inline
  def apply(
    docComment: String,
    parameters: js.Array[FormalParameterInfo],
    signatureInfo: String,
    typeParameters: js.Array[FormalTypeParameterInfo]
  ): FormalSignatureItemInfo = {
    val __obj = js.Dynamic.literal(docComment = docComment.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], signatureInfo = signatureInfo.asInstanceOf[js.Any], typeParameters = typeParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormalSignatureItemInfo]
  }
}

