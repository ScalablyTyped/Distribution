package typings.wordpressDeprecated

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Alternative extends StObject {
    
    var alternative: js.UndefOr[String] = js.undefined
    
    var hint: js.UndefOr[String] = js.undefined
    
    var link: js.UndefOr[String] = js.undefined
    
    var plugin: js.UndefOr[String] = js.undefined
    
    var since: js.UndefOr[String] = js.undefined
    
    var version: js.UndefOr[String] = js.undefined
  }
  object Alternative {
    
    inline def apply(): Alternative = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Alternative]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Alternative] (val x: Self) extends AnyVal {
      
      inline def setAlternative(value: String): Self = StObject.set(x, "alternative", value.asInstanceOf[js.Any])
      
      inline def setAlternativeUndefined: Self = StObject.set(x, "alternative", js.undefined)
      
      inline def setHint(value: String): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
      
      inline def setHintUndefined: Self = StObject.set(x, "hint", js.undefined)
      
      inline def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
      
      inline def setPlugin(value: String): Self = StObject.set(x, "plugin", value.asInstanceOf[js.Any])
      
      inline def setPluginUndefined: Self = StObject.set(x, "plugin", js.undefined)
      
      inline def setSince(value: String): Self = StObject.set(x, "since", value.asInstanceOf[js.Any])
      
      inline def setSinceUndefined: Self = StObject.set(x, "since", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
}
