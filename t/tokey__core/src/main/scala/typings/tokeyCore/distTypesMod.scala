package typings.tokeyCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.tokeyCore.tokeyCoreStrings.string
    - typings.tokeyCore.tokeyCoreStrings.text
    - typings.tokeyCore.tokeyCoreStrings.`line-comment`
    - typings.tokeyCore.tokeyCoreStrings.`multi-comment`
    - typings.tokeyCore.tokeyCoreStrings.`unclosed-string`
    - typings.tokeyCore.tokeyCoreStrings.`unclosed-comment`
    - typings.tokeyCore.tokeyCoreStrings.space
  */
  trait Descriptors extends StObject
  object Descriptors {
    
    inline def `line-comment`: typings.tokeyCore.tokeyCoreStrings.`line-comment` = "line-comment".asInstanceOf[typings.tokeyCore.tokeyCoreStrings.`line-comment`]
    
    inline def `multi-comment`: typings.tokeyCore.tokeyCoreStrings.`multi-comment` = "multi-comment".asInstanceOf[typings.tokeyCore.tokeyCoreStrings.`multi-comment`]
    
    inline def space: typings.tokeyCore.tokeyCoreStrings.space = "space".asInstanceOf[typings.tokeyCore.tokeyCoreStrings.space]
    
    inline def string: typings.tokeyCore.tokeyCoreStrings.string = "string".asInstanceOf[typings.tokeyCore.tokeyCoreStrings.string]
    
    inline def text: typings.tokeyCore.tokeyCoreStrings.text = "text".asInstanceOf[typings.tokeyCore.tokeyCoreStrings.text]
    
    inline def `unclosed-comment`: typings.tokeyCore.tokeyCoreStrings.`unclosed-comment` = "unclosed-comment".asInstanceOf[typings.tokeyCore.tokeyCoreStrings.`unclosed-comment`]
    
    inline def `unclosed-string`: typings.tokeyCore.tokeyCoreStrings.`unclosed-string` = "unclosed-string".asInstanceOf[typings.tokeyCore.tokeyCoreStrings.`unclosed-string`]
  }
  
  trait Token[Type] extends StObject {
    
    var end: Double
    
    var start: Double
    
    var `type`: Type
    
    var value: String
  }
  object Token {
    
    inline def apply[Type](end: Double, start: Double, `type`: Type, value: String): Token[Type] = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Token[Type]]
    }
    
    extension [Self <: Token[?], Type](x: Self & Token[Type]) {
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setType(value: Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait TokenGroup[GroupType, Type] extends StObject {
    
    var end: Double
    
    var start: Double
    
    var tokens: js.Array[Token[Type]]
    
    var `type`: GroupType
    
    var value: String
  }
  object TokenGroup {
    
    inline def apply[GroupType, Type](end: Double, start: Double, tokens: js.Array[Token[Type]], `type`: GroupType, value: String): TokenGroup[GroupType, Type] = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TokenGroup[GroupType, Type]]
    }
    
    extension [Self <: TokenGroup[?, ?], GroupType, Type](x: Self & (TokenGroup[GroupType, Type])) {
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setTokens(value: js.Array[Token[Type]]): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
      
      inline def setTokensVarargs(value: Token[Type]*): Self = StObject.set(x, "tokens", js.Array(value*))
      
      inline def setType(value: GroupType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
