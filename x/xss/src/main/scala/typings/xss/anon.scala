package typings.xss

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait IsClosing extends StObject {
    
    var isClosing: Boolean
    
    var position: Double
  }
  object IsClosing {
    
    inline def apply(isClosing: Boolean, position: Double): IsClosing = {
      val __obj = js.Dynamic.literal(isClosing = isClosing.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
      __obj.asInstanceOf[IsClosing]
    }
    
    extension [Self <: IsClosing](x: Self) {
      
      inline def setIsClosing(value: Boolean): Self = StObject.set(x, "isClosing", value.asInstanceOf[js.Any])
      
      inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    }
  }
  
  trait OnIgnoreTag extends StObject {
    
    def onIgnoreTag(tag: String, html: String, options: IsClosing): String
    
    def remove(html: String): String
  }
  object OnIgnoreTag {
    
    inline def apply(onIgnoreTag: (String, String, IsClosing) => String, remove: String => String): OnIgnoreTag = {
      val __obj = js.Dynamic.literal(onIgnoreTag = js.Any.fromFunction3(onIgnoreTag), remove = js.Any.fromFunction1(remove))
      __obj.asInstanceOf[OnIgnoreTag]
    }
    
    extension [Self <: OnIgnoreTag](x: Self) {
      
      inline def setOnIgnoreTag(value: (String, String, IsClosing) => String): Self = StObject.set(x, "onIgnoreTag", js.Any.fromFunction3(value))
      
      inline def setRemove(value: String => String): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
    }
  }
}
