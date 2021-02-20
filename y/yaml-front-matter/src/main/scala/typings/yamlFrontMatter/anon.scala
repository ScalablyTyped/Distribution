package typings.yamlFrontMatter

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait ContentKeyName[contentKeyName /* <: String */] extends StObject {
    
    var contentKeyName: contentKeyName = js.native
  }
  object ContentKeyName {
    
    @scala.inline
    def apply[contentKeyName /* <: String */](contentKeyName: contentKeyName): ContentKeyName[contentKeyName] = {
      val __obj = js.Dynamic.literal(contentKeyName = contentKeyName.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContentKeyName[contentKeyName]]
    }
    
    @scala.inline
    implicit class ContentKeyNameMutableBuilder[Self <: ContentKeyName[_], contentKeyName /* <: String */] (val x: Self with ContentKeyName[contentKeyName]) extends AnyVal {
      
      @scala.inline
      def setContentKeyName(value: contentKeyName): Self = StObject.set(x, "contentKeyName", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Dictkey
    extends /* key */ StringDictionary[js.Any] {
    
    val __content: String = js.native
  }
  object Dictkey {
    
    @scala.inline
    def apply(__content: String): Dictkey = {
      val __obj = js.Dynamic.literal(__content = __content.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dictkey]
    }
    
    @scala.inline
    implicit class DictkeyMutableBuilder[Self <: Dictkey] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set__content(value: String): Self = StObject.set(x, "__content", value.asInstanceOf[js.Any])
    }
  }
}
