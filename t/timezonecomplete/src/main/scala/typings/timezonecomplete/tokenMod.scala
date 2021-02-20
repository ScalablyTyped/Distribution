package typings.timezonecomplete

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tokenMod {
  
  @js.native
  sealed trait TokenType extends StObject
  @JSImport("timezonecomplete/dist/lib/token", "TokenType")
  @js.native
  object TokenType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[TokenType with Double] = js.native
    
    @js.native
    sealed trait DAY extends TokenType
    /* 6 */ val DAY: typings.timezonecomplete.tokenMod.TokenType.DAY with Double = js.native
    
    @js.native
    sealed trait DAYPERIOD extends TokenType
    /* 8 */ val DAYPERIOD: typings.timezonecomplete.tokenMod.TokenType.DAYPERIOD with Double = js.native
    
    @js.native
    sealed trait ERA extends TokenType
    /* 1 */ val ERA: typings.timezonecomplete.tokenMod.TokenType.ERA with Double = js.native
    
    @js.native
    sealed trait HOUR extends TokenType
    /* 9 */ val HOUR: typings.timezonecomplete.tokenMod.TokenType.HOUR with Double = js.native
    
    /**
      * Raw text
      */
    @js.native
    sealed trait IDENTITY extends TokenType
    /* 0 */ val IDENTITY: typings.timezonecomplete.tokenMod.TokenType.IDENTITY with Double = js.native
    
    @js.native
    sealed trait MINUTE extends TokenType
    /* 10 */ val MINUTE: typings.timezonecomplete.tokenMod.TokenType.MINUTE with Double = js.native
    
    @js.native
    sealed trait MONTH extends TokenType
    /* 4 */ val MONTH: typings.timezonecomplete.tokenMod.TokenType.MONTH with Double = js.native
    
    @js.native
    sealed trait QUARTER extends TokenType
    /* 3 */ val QUARTER: typings.timezonecomplete.tokenMod.TokenType.QUARTER with Double = js.native
    
    @js.native
    sealed trait SECOND extends TokenType
    /* 11 */ val SECOND: typings.timezonecomplete.tokenMod.TokenType.SECOND with Double = js.native
    
    @js.native
    sealed trait WEEK extends TokenType
    /* 5 */ val WEEK: typings.timezonecomplete.tokenMod.TokenType.WEEK with Double = js.native
    
    @js.native
    sealed trait WEEKDAY extends TokenType
    /* 7 */ val WEEKDAY: typings.timezonecomplete.tokenMod.TokenType.WEEKDAY with Double = js.native
    
    @js.native
    sealed trait YEAR extends TokenType
    /* 2 */ val YEAR: typings.timezonecomplete.tokenMod.TokenType.YEAR with Double = js.native
    
    @js.native
    sealed trait ZONE extends TokenType
    /* 12 */ val ZONE: typings.timezonecomplete.tokenMod.TokenType.ZONE with Double = js.native
  }
  
  @JSImport("timezonecomplete/dist/lib/token", "tokenize")
  @js.native
  def tokenize(formatString: String): js.Array[Token] = js.native
  
  @js.native
  trait Token extends StObject {
    
    /**
      * The total length of the token
      */
    var length: Double = js.native
    
    /**
      * The original string that produced this token
      */
    var raw: String = js.native
    
    /**
      * The symbol from which the token was parsed
      */
    var symbol: String = js.native
    
    /**
      * The type of token
      */
    var `type`: TokenType = js.native
  }
  object Token {
    
    @scala.inline
    def apply(length: Double, raw: String, symbol: String, `type`: TokenType): Token = {
      val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Token]
    }
    
    @scala.inline
    implicit class TokenMutableBuilder[Self <: Token] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSymbol(value: String): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: TokenType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
