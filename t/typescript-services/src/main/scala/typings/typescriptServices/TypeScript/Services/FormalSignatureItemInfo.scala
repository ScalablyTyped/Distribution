package typings.typescriptServices.TypeScript.Services

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormalSignatureItemInfo extends StObject {
  
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
  implicit class FormalSignatureItemInfoMutableBuilder[Self <: FormalSignatureItemInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocComment(value: String): Self = StObject.set(x, "docComment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameters(value: js.Array[FormalParameterInfo]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersVarargs(value: FormalParameterInfo*): Self = StObject.set(x, "parameters", js.Array(value :_*))
    
    @scala.inline
    def setSignatureInfo(value: String): Self = StObject.set(x, "signatureInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeParameters(value: js.Array[FormalTypeParameterInfo]): Self = StObject.set(x, "typeParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeParametersVarargs(value: FormalTypeParameterInfo*): Self = StObject.set(x, "typeParameters", js.Array(value :_*))
  }
}
