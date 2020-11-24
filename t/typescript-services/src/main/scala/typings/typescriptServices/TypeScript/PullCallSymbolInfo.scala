package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PullCallSymbolInfo extends js.Object {
  
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
  implicit class PullCallSymbolInfoOps[Self <: PullCallSymbolInfo] (val x: Self) extends AnyVal {
    
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
    def setAst(value: AST): Self = this.set("ast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCandidateSignature(value: PullSignatureSymbol): Self = this.set("candidateSignature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnclosingScopeSymbol(value: PullSymbol): Self = this.set("enclosingScopeSymbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsConstructorCall(value: Boolean): Self = this.set("isConstructorCall", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolvedSignaturesVarargs(value: PullSignatureSymbol*): Self = this.set("resolvedSignatures", js.Array(value :_*))
    
    @scala.inline
    def setResolvedSignatures(value: js.Array[PullSignatureSymbol]): Self = this.set("resolvedSignatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetSymbol(value: PullSymbol): Self = this.set("targetSymbol", value.asInstanceOf[js.Any])
  }
}
