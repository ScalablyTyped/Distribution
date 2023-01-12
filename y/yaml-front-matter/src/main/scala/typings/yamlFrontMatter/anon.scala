package typings.yamlFrontMatter

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ContentKeyName[contentKeyName /* <: String */] extends StObject {
    
    var contentKeyName: contentKeyName
  }
  object ContentKeyName {
    
    inline def apply[contentKeyName /* <: String */](contentKeyName: contentKeyName): ContentKeyName[contentKeyName] = {
      val __obj = js.Dynamic.literal(contentKeyName = contentKeyName.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContentKeyName[contentKeyName]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ContentKeyName[?], contentKeyName /* <: String */] (val x: Self & ContentKeyName[contentKeyName]) extends AnyVal {
      
      inline def setContentKeyName(value: contentKeyName): Self = StObject.set(x, "contentKeyName", value.asInstanceOf[js.Any])
    }
  }
  
  trait Dictkey
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    val __content: String
  }
  object Dictkey {
    
    inline def apply(__content: String): Dictkey = {
      val __obj = js.Dynamic.literal(__content = __content.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dictkey]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Dictkey] (val x: Self) extends AnyVal {
      
      inline def set__content(value: String): Self = StObject.set(x, "__content", value.asInstanceOf[js.Any])
    }
  }
}
