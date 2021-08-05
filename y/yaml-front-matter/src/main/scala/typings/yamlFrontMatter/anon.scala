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
    
    extension [Self <: ContentKeyName[?], contentKeyName /* <: String */](x: Self & ContentKeyName[contentKeyName]) {
      
      inline def setContentKeyName(value: contentKeyName): Self = StObject.set(x, "contentKeyName", value.asInstanceOf[js.Any])
    }
  }
  
  trait Dictkey
    extends StObject
       with /* key */ StringDictionary[js.Any] {
    
    val __content: String
  }
  object Dictkey {
    
    inline def apply(__content: String): Dictkey = {
      val __obj = js.Dynamic.literal(__content = __content.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dictkey]
    }
    
    extension [Self <: Dictkey](x: Self) {
      
      inline def set__content(value: String): Self = StObject.set(x, "__content", value.asInstanceOf[js.Any])
    }
  }
}
