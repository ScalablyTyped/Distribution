package typings.timezonecomplete

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tokenMod {
  
  @JSImport("timezonecomplete/dist/lib/token", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait TokenType extends StObject
  @JSImport("timezonecomplete/dist/lib/token", "TokenType")
  @js.native
  object TokenType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[TokenType & Double] = js.native
    
    @js.native
    sealed trait DAY
      extends StObject
         with TokenType
    /* 6 */ val DAY: typings.timezonecomplete.tokenMod.TokenType.DAY & Double = js.native
    
    @js.native
    sealed trait DAYPERIOD
      extends StObject
         with TokenType
    /* 8 */ val DAYPERIOD: typings.timezonecomplete.tokenMod.TokenType.DAYPERIOD & Double = js.native
    
    @js.native
    sealed trait ERA
      extends StObject
         with TokenType
    /* 1 */ val ERA: typings.timezonecomplete.tokenMod.TokenType.ERA & Double = js.native
    
    @js.native
    sealed trait HOUR
      extends StObject
         with TokenType
    /* 9 */ val HOUR: typings.timezonecomplete.tokenMod.TokenType.HOUR & Double = js.native
    
    /**
      * Raw text
      */
    @js.native
    sealed trait IDENTITY
      extends StObject
         with TokenType
    /* 0 */ val IDENTITY: typings.timezonecomplete.tokenMod.TokenType.IDENTITY & Double = js.native
    
    @js.native
    sealed trait MINUTE
      extends StObject
         with TokenType
    /* 10 */ val MINUTE: typings.timezonecomplete.tokenMod.TokenType.MINUTE & Double = js.native
    
    @js.native
    sealed trait MONTH
      extends StObject
         with TokenType
    /* 4 */ val MONTH: typings.timezonecomplete.tokenMod.TokenType.MONTH & Double = js.native
    
    @js.native
    sealed trait QUARTER
      extends StObject
         with TokenType
    /* 3 */ val QUARTER: typings.timezonecomplete.tokenMod.TokenType.QUARTER & Double = js.native
    
    @js.native
    sealed trait SECOND
      extends StObject
         with TokenType
    /* 11 */ val SECOND: typings.timezonecomplete.tokenMod.TokenType.SECOND & Double = js.native
    
    @js.native
    sealed trait WEEK
      extends StObject
         with TokenType
    /* 5 */ val WEEK: typings.timezonecomplete.tokenMod.TokenType.WEEK & Double = js.native
    
    @js.native
    sealed trait WEEKDAY
      extends StObject
         with TokenType
    /* 7 */ val WEEKDAY: typings.timezonecomplete.tokenMod.TokenType.WEEKDAY & Double = js.native
    
    @js.native
    sealed trait YEAR
      extends StObject
         with TokenType
    /* 2 */ val YEAR: typings.timezonecomplete.tokenMod.TokenType.YEAR & Double = js.native
    
    @js.native
    sealed trait ZONE
      extends StObject
         with TokenType
    /* 12 */ val ZONE: typings.timezonecomplete.tokenMod.TokenType.ZONE & Double = js.native
  }
  
  inline def tokenize(formatString: String): js.Array[Token] = ^.asInstanceOf[js.Dynamic].applyDynamic("tokenize")(formatString.asInstanceOf[js.Any]).asInstanceOf[js.Array[Token]]
  
  trait Token extends StObject {
    
    /**
      * The total length of the token
      */
    var length: Double
    
    /**
      * The original string that produced this token
      */
    var raw: String
    
    /**
      * The symbol from which the token was parsed
      */
    var symbol: String
    
    /**
      * The type of token
      */
    var `type`: TokenType
  }
  object Token {
    
    inline def apply(length: Double, raw: String, symbol: String, `type`: TokenType): Token = {
      val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Token]
    }
    
    extension [Self <: Token](x: Self) {
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      inline def setSymbol(value: String): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
      
      inline def setType(value: TokenType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
