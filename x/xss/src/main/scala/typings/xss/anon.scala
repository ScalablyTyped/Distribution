package typings.xss

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait IsClosing extends StObject {
    
    var isClosing: js.UndefOr[Boolean] = js.undefined
    
    var isWhite: js.UndefOr[Boolean] = js.undefined
    
    var position: js.UndefOr[Double] = js.undefined
    
    var sourcePosition: js.UndefOr[Double] = js.undefined
  }
  object IsClosing {
    
    inline def apply(): IsClosing = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IsClosing]
    }
    
    extension [Self <: IsClosing](x: Self) {
      
      inline def setIsClosing(value: Boolean): Self = StObject.set(x, "isClosing", value.asInstanceOf[js.Any])
      
      inline def setIsClosingUndefined: Self = StObject.set(x, "isClosing", js.undefined)
      
      inline def setIsWhite(value: Boolean): Self = StObject.set(x, "isWhite", value.asInstanceOf[js.Any])
      
      inline def setIsWhiteUndefined: Self = StObject.set(x, "isWhite", js.undefined)
      
      inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setSourcePosition(value: Double): Self = StObject.set(x, "sourcePosition", value.asInstanceOf[js.Any])
      
      inline def setSourcePositionUndefined: Self = StObject.set(x, "sourcePosition", js.undefined)
    }
  }
  
  trait OnIgnoreTag extends StObject {
    
    def onIgnoreTag(tag: String, html: String, options: Position): String
    
    def remove(html: String): String
  }
  object OnIgnoreTag {
    
    inline def apply(onIgnoreTag: (String, String, Position) => String, remove: String => String): OnIgnoreTag = {
      val __obj = js.Dynamic.literal(onIgnoreTag = js.Any.fromFunction3(onIgnoreTag), remove = js.Any.fromFunction1(remove))
      __obj.asInstanceOf[OnIgnoreTag]
    }
    
    extension [Self <: OnIgnoreTag](x: Self) {
      
      inline def setOnIgnoreTag(value: (String, String, Position) => String): Self = StObject.set(x, "onIgnoreTag", js.Any.fromFunction3(value))
      
      inline def setRemove(value: String => String): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
    }
  }
  
  trait Position extends StObject {
    
    var isClosing: Boolean
    
    var position: Double
  }
  object Position {
    
    inline def apply(isClosing: Boolean, position: Double): Position = {
      val __obj = js.Dynamic.literal(isClosing = isClosing.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
      __obj.asInstanceOf[Position]
    }
    
    extension [Self <: Position](x: Self) {
      
      inline def setIsClosing(value: Boolean): Self = StObject.set(x, "isClosing", value.asInstanceOf[js.Any])
      
      inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    }
  }
}
