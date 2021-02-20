package typings.xss

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait IsClosing extends StObject {
    
    var isClosing: Boolean = js.native
    
    var position: Double = js.native
  }
  object IsClosing {
    
    @scala.inline
    def apply(isClosing: Boolean, position: Double): IsClosing = {
      val __obj = js.Dynamic.literal(isClosing = isClosing.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
      __obj.asInstanceOf[IsClosing]
    }
    
    @scala.inline
    implicit class IsClosingMutableBuilder[Self <: IsClosing] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsClosing(value: Boolean): Self = StObject.set(x, "isClosing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait OnIgnoreTag extends StObject {
    
    def onIgnoreTag(tag: String, html: String, options: IsClosing): String = js.native
    
    def remove(html: String): String = js.native
  }
  object OnIgnoreTag {
    
    @scala.inline
    def apply(onIgnoreTag: (String, String, IsClosing) => String, remove: String => String): OnIgnoreTag = {
      val __obj = js.Dynamic.literal(onIgnoreTag = js.Any.fromFunction3(onIgnoreTag), remove = js.Any.fromFunction1(remove))
      __obj.asInstanceOf[OnIgnoreTag]
    }
    
    @scala.inline
    implicit class OnIgnoreTagMutableBuilder[Self <: OnIgnoreTag] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnIgnoreTag(value: (String, String, IsClosing) => String): Self = StObject.set(x, "onIgnoreTag", js.Any.fromFunction3(value))
      
      @scala.inline
      def setRemove(value: String => String): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
    }
  }
}
