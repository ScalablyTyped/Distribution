package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PullCallSymbolInfo extends StObject {
  
  var ast: AST = js.native
  
  var candidateSignature: PullSignatureSymbol = js.native
  
  var enclosingScopeSymbol: PullSymbol = js.native
  
  var isConstructorCall: Boolean = js.native
  
  var resolvedSignatures: js.Array[PullSignatureSymbol] = js.native
  
  var targetSymbol: PullSymbol = js.native
}
object PullCallSymbolInfo {
  
  @scala.inline
  def apply(
    ast: AST,
    candidateSignature: PullSignatureSymbol,
    enclosingScopeSymbol: PullSymbol,
    isConstructorCall: Boolean,
    resolvedSignatures: js.Array[PullSignatureSymbol],
    targetSymbol: PullSymbol
  ): PullCallSymbolInfo = {
    val __obj = js.Dynamic.literal(ast = ast.asInstanceOf[js.Any], candidateSignature = candidateSignature.asInstanceOf[js.Any], enclosingScopeSymbol = enclosingScopeSymbol.asInstanceOf[js.Any], isConstructorCall = isConstructorCall.asInstanceOf[js.Any], resolvedSignatures = resolvedSignatures.asInstanceOf[js.Any], targetSymbol = targetSymbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullCallSymbolInfo]
  }
  
  @scala.inline
  implicit class PullCallSymbolInfoMutableBuilder[Self <: PullCallSymbolInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAst(value: AST): Self = StObject.set(x, "ast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCandidateSignature(value: PullSignatureSymbol): Self = StObject.set(x, "candidateSignature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnclosingScopeSymbol(value: PullSymbol): Self = StObject.set(x, "enclosingScopeSymbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsConstructorCall(value: Boolean): Self = StObject.set(x, "isConstructorCall", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolvedSignatures(value: js.Array[PullSignatureSymbol]): Self = StObject.set(x, "resolvedSignatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolvedSignaturesVarargs(value: PullSignatureSymbol*): Self = StObject.set(x, "resolvedSignatures", js.Array(value :_*))
    
    @scala.inline
    def setTargetSymbol(value: PullSymbol): Self = StObject.set(x, "targetSymbol", value.asInstanceOf[js.Any])
  }
}
