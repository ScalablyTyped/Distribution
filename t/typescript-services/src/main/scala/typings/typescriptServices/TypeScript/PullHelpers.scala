package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PullHelpers {
  
  @js.native
  trait OtherPullDeclsWalker extends StObject {
    
    var currentlyWalkingOtherDecls: js.Any = js.native
    
    def walkOtherPullDecls(
      currentDecl: PullDecl,
      otherDecls: js.Array[PullDecl],
      callBack: js.Function1[/* otherDecl */ PullDecl, Unit]
    ): Unit = js.native
  }
  object OtherPullDeclsWalker {
    
    @scala.inline
    def apply(
      currentlyWalkingOtherDecls: js.Any,
      walkOtherPullDecls: (PullDecl, js.Array[PullDecl], js.Function1[/* otherDecl */ PullDecl, Unit]) => Unit
    ): OtherPullDeclsWalker = {
      val __obj = js.Dynamic.literal(currentlyWalkingOtherDecls = currentlyWalkingOtherDecls.asInstanceOf[js.Any], walkOtherPullDecls = js.Any.fromFunction3(walkOtherPullDecls))
      __obj.asInstanceOf[OtherPullDeclsWalker]
    }
    
    @scala.inline
    implicit class OtherPullDeclsWalkerMutableBuilder[Self <: OtherPullDeclsWalker] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrentlyWalkingOtherDecls(value: js.Any): Self = StObject.set(x, "currentlyWalkingOtherDecls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWalkOtherPullDecls(value: (PullDecl, js.Array[PullDecl], js.Function1[/* otherDecl */ PullDecl, Unit]) => Unit): Self = StObject.set(x, "walkOtherPullDecls", js.Any.fromFunction3(value))
    }
  }
  
  @js.native
  trait PullTypeSymbolStructureWalker extends StObject {
    
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
    implicit class PullTypeSymbolStructureWalkerMutableBuilder[Self <: PullTypeSymbolStructureWalker] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallSignatureWalk(value: PullSignatureSymbol => Boolean): Self = StObject.set(x, "callSignatureWalk", js.Any.fromFunction1(value))
      
      @scala.inline
      def setConstructSignatureWalk(value: PullSignatureSymbol => Boolean): Self = StObject.set(x, "constructSignatureWalk", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIndexSignatureWalk(value: PullSignatureSymbol => Boolean): Self = StObject.set(x, "indexSignatureWalk", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMemberSymbolWalk(value: PullSymbol => Boolean): Self = StObject.set(x, "memberSymbolWalk", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSignatureParameterWalk(value: PullSymbol => Boolean): Self = StObject.set(x, "signatureParameterWalk", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSignatureReturnTypeWalk(value: PullTypeSymbol => Boolean): Self = StObject.set(x, "signatureReturnTypeWalk", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait SignatureInfoForFuncDecl extends StObject {
    
    var allSignatures: js.Array[PullSignatureSymbol] = js.native
    
    var signature: PullSignatureSymbol = js.native
  }
  object SignatureInfoForFuncDecl {
    
    @scala.inline
    def apply(allSignatures: js.Array[PullSignatureSymbol], signature: PullSignatureSymbol): SignatureInfoForFuncDecl = {
      val __obj = js.Dynamic.literal(allSignatures = allSignatures.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
      __obj.asInstanceOf[SignatureInfoForFuncDecl]
    }
    
    @scala.inline
    implicit class SignatureInfoForFuncDeclMutableBuilder[Self <: SignatureInfoForFuncDecl] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllSignatures(value: js.Array[PullSignatureSymbol]): Self = StObject.set(x, "allSignatures", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllSignaturesVarargs(value: PullSignatureSymbol*): Self = StObject.set(x, "allSignatures", js.Array(value :_*))
      
      @scala.inline
      def setSignature(value: PullSignatureSymbol): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    }
  }
}
