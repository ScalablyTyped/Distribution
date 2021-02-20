package typings.typescriptServices.TypeScript.Services.Formatting

import typings.typescriptServices.TypeScript.SyntaxKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Shared {
  
  @js.native
  trait ITokenAccess extends StObject {
    
    def Contains(token: SyntaxKind): Boolean = js.native
    
    def GetTokens(): js.Array[SyntaxKind] = js.native
  }
  object ITokenAccess {
    
    @scala.inline
    def apply(Contains: SyntaxKind => Boolean, GetTokens: () => js.Array[SyntaxKind]): ITokenAccess = {
      val __obj = js.Dynamic.literal(Contains = js.Any.fromFunction1(Contains), GetTokens = js.Any.fromFunction0(GetTokens))
      __obj.asInstanceOf[ITokenAccess]
    }
    
    @scala.inline
    implicit class ITokenAccessMutableBuilder[Self <: ITokenAccess] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContains(value: SyntaxKind => Boolean): Self = StObject.set(x, "Contains", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetTokens(value: () => js.Array[SyntaxKind]): Self = StObject.set(x, "GetTokens", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait TokenAllAccess extends ITokenAccess
  object TokenAllAccess {
    
    @scala.inline
    def apply(Contains: SyntaxKind => Boolean, GetTokens: () => js.Array[SyntaxKind]): TokenAllAccess = {
      val __obj = js.Dynamic.literal(Contains = js.Any.fromFunction1(Contains), GetTokens = js.Any.fromFunction0(GetTokens))
      __obj.asInstanceOf[TokenAllAccess]
    }
  }
  
  @js.native
  trait TokenRange extends StObject {
    
    def Contains(token: SyntaxKind): Boolean = js.native
    
    def GetTokens(): js.Array[SyntaxKind] = js.native
    
    var tokenAccess: ITokenAccess = js.native
  }
  object TokenRange {
    
    @scala.inline
    def apply(Contains: SyntaxKind => Boolean, GetTokens: () => js.Array[SyntaxKind], tokenAccess: ITokenAccess): TokenRange = {
      val __obj = js.Dynamic.literal(Contains = js.Any.fromFunction1(Contains), GetTokens = js.Any.fromFunction0(GetTokens), tokenAccess = tokenAccess.asInstanceOf[js.Any])
      __obj.asInstanceOf[TokenRange]
    }
    
    @scala.inline
    implicit class TokenRangeMutableBuilder[Self <: TokenRange] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContains(value: SyntaxKind => Boolean): Self = StObject.set(x, "Contains", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetTokens(value: () => js.Array[SyntaxKind]): Self = StObject.set(x, "GetTokens", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTokenAccess(value: ITokenAccess): Self = StObject.set(x, "tokenAccess", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TokenRangeAccess extends ITokenAccess {
    
    var tokens: js.Any = js.native
  }
  object TokenRangeAccess {
    
    @scala.inline
    def apply(Contains: SyntaxKind => Boolean, GetTokens: () => js.Array[SyntaxKind], tokens: js.Any): TokenRangeAccess = {
      val __obj = js.Dynamic.literal(Contains = js.Any.fromFunction1(Contains), GetTokens = js.Any.fromFunction0(GetTokens), tokens = tokens.asInstanceOf[js.Any])
      __obj.asInstanceOf[TokenRangeAccess]
    }
    
    @scala.inline
    implicit class TokenRangeAccessMutableBuilder[Self <: TokenRangeAccess] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTokens(value: js.Any): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TokenSingleValueAccess extends ITokenAccess {
    
    var token: SyntaxKind = js.native
  }
  object TokenSingleValueAccess {
    
    @scala.inline
    def apply(Contains: SyntaxKind => Boolean, GetTokens: () => js.Array[SyntaxKind], token: SyntaxKind): TokenSingleValueAccess = {
      val __obj = js.Dynamic.literal(Contains = js.Any.fromFunction1(Contains), GetTokens = js.Any.fromFunction0(GetTokens), token = token.asInstanceOf[js.Any])
      __obj.asInstanceOf[TokenSingleValueAccess]
    }
    
    @scala.inline
    implicit class TokenSingleValueAccessMutableBuilder[Self <: TokenSingleValueAccess] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setToken(value: SyntaxKind): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TokenValuesAccess extends ITokenAccess {
    
    var tokens: js.Any = js.native
  }
  object TokenValuesAccess {
    
    @scala.inline
    def apply(Contains: SyntaxKind => Boolean, GetTokens: () => js.Array[SyntaxKind], tokens: js.Any): TokenValuesAccess = {
      val __obj = js.Dynamic.literal(Contains = js.Any.fromFunction1(Contains), GetTokens = js.Any.fromFunction0(GetTokens), tokens = tokens.asInstanceOf[js.Any])
      __obj.asInstanceOf[TokenValuesAccess]
    }
    
    @scala.inline
    implicit class TokenValuesAccessMutableBuilder[Self <: TokenValuesAccess] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTokens(value: js.Any): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
    }
  }
}
