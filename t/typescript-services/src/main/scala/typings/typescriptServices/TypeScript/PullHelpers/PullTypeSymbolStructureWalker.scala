package typings.typescriptServices.TypeScript.PullHelpers

import typings.typescriptServices.TypeScript.PullSignatureSymbol
import typings.typescriptServices.TypeScript.PullSymbol
import typings.typescriptServices.TypeScript.PullTypeSymbol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PullTypeSymbolStructureWalker extends js.Object {
  
  def callSignatureWalk(signatureSymbol: PullSignatureSymbol): Boolean = js.native
  
  def constructSignatureWalk(signatureSymbol: PullSignatureSymbol): Boolean = js.native
  
  def indexSignatureWalk(signatureSymbol: PullSignatureSymbol): Boolean = js.native
  
  def memberSymbolWalk(memberSymbol: PullSymbol): Boolean = js.native
  
  def signatureParameterWalk(parameterSymbol: PullSymbol): Boolean = js.native
  
  def signatureReturnTypeWalk(returnType: PullTypeSymbol): Boolean = js.native
}
object PullTypeSymbolStructureWalker {
  
  @scala.inline
  def apply(
    callSignatureWalk: PullSignatureSymbol => Boolean,
    constructSignatureWalk: PullSignatureSymbol => Boolean,
    indexSignatureWalk: PullSignatureSymbol => Boolean,
    memberSymbolWalk: PullSymbol => Boolean,
    signatureParameterWalk: PullSymbol => Boolean,
    signatureReturnTypeWalk: PullTypeSymbol => Boolean
  ): PullTypeSymbolStructureWalker = {
    val __obj = js.Dynamic.literal(callSignatureWalk = js.Any.fromFunction1(callSignatureWalk), constructSignatureWalk = js.Any.fromFunction1(constructSignatureWalk), indexSignatureWalk = js.Any.fromFunction1(indexSignatureWalk), memberSymbolWalk = js.Any.fromFunction1(memberSymbolWalk), signatureParameterWalk = js.Any.fromFunction1(signatureParameterWalk), signatureReturnTypeWalk = js.Any.fromFunction1(signatureReturnTypeWalk))
    __obj.asInstanceOf[PullTypeSymbolStructureWalker]
  }
  
  @scala.inline
  implicit class PullTypeSymbolStructureWalkerOps[Self <: PullTypeSymbolStructureWalker] (val x: Self) extends AnyVal {
    
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
    def setCallSignatureWalk(value: PullSignatureSymbol => Boolean): Self = this.set("callSignatureWalk", js.Any.fromFunction1(value))
    
    @scala.inline
    def setConstructSignatureWalk(value: PullSignatureSymbol => Boolean): Self = this.set("constructSignatureWalk", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIndexSignatureWalk(value: PullSignatureSymbol => Boolean): Self = this.set("indexSignatureWalk", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMemberSymbolWalk(value: PullSymbol => Boolean): Self = this.set("memberSymbolWalk", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSignatureParameterWalk(value: PullSymbol => Boolean): Self = this.set("signatureParameterWalk", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSignatureReturnTypeWalk(value: PullTypeSymbol => Boolean): Self = this.set("signatureReturnTypeWalk", js.Any.fromFunction1(value))
  }
}
