package typings.tokeyCore

import typings.tokeyCore.distTypesMod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait End[Type /* <: String */] extends StObject {
    
    var end: Double
    
    var start: Double
    
    var `type`: Type
    
    var value: String
  }
  object End {
    
    inline def apply[Type /* <: String */](end: Double, start: Double, `type`: Type, value: String): End[Type] = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[End[Type]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: End[?], Type /* <: String */] (val x: Self & End[Type]) extends AnyVal {
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setType(value: Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Start[T /* <: String */, Tokens /* <: js.Array[Token[Any]] */] extends StObject {
    
    var end: Double
    
    var start: Double
    
    var tokens: Tokens
    
    var `type`: T
    
    var value: String
  }
  object Start {
    
    inline def apply[T /* <: String */, Tokens /* <: js.Array[Token[Any]] */](end: Double, start: Double, tokens: Tokens, `type`: T, value: String): Start[T, Tokens] = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Start[T, Tokens]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Start[?, ?], T /* <: String */, Tokens /* <: js.Array[Token[Any]] */] (val x: Self & (Start[T, Tokens])) extends AnyVal {
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setTokens(value: Tokens): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
      
      inline def setType(value: T): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
