package typings.typescriptServices.TypeScript.Services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormalSignatureItemInfo extends js.Object {
  
  var docComment: String = js.native
  
  var parameters: js.Array[FormalParameterInfo] = js.native
  
  var signatureInfo: String = js.native
  
  var typeParameters: js.Array[FormalTypeParameterInfo] = js.native
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
  
  @scala.inline
  implicit class FormalSignatureItemInfoOps[Self <: FormalSignatureItemInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDocComment(value: String): Self = this.set("docComment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersVarargs(value: FormalParameterInfo*): Self = this.set("parameters", js.Array(value :_*))
    
    @scala.inline
    def setParameters(value: js.Array[FormalParameterInfo]): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatureInfo(value: String): Self = this.set("signatureInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeParametersVarargs(value: FormalTypeParameterInfo*): Self = this.set("typeParameters", js.Array(value :_*))
    
    @scala.inline
    def setTypeParameters(value: js.Array[FormalTypeParameterInfo]): Self = this.set("typeParameters", value.asInstanceOf[js.Any])
  }
}
