package typings.svgBakerRuntime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Ariahidden extends StObject {
    
    /**
      * @default 'true'
      */
    var `aria-hidden`: js.UndefOr[String] = js.undefined
    
    /**
      * @default ['position: absolute', 'width: 0', 'height: 0'].join('; ')
      */
    var style: js.UndefOr[String] = js.undefined
    
    /**
      * @default 'http://www.w3.org/2000/svg'
      */
    var xmlns: js.UndefOr[String] = js.undefined
    
    /**
      * @default 'http://www.w3.org/1999/xlink'
      */
    @JSName("xmlns:xlink")
    var xmlnsColonxlink: js.UndefOr[String] = js.undefined
  }
  object Ariahidden {
    
    inline def apply(): Ariahidden = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Ariahidden]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Ariahidden] (val x: Self) extends AnyVal {
      
      inline def `setAria-hidden`(value: String): Self = StObject.set(x, "aria-hidden", value.asInstanceOf[js.Any])
      
      inline def `setAria-hiddenUndefined`: Self = StObject.set(x, "aria-hidden", js.undefined)
      
      inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setXmlns(value: String): Self = StObject.set(x, "xmlns", value.asInstanceOf[js.Any])
      
      inline def setXmlnsColonxlink(value: String): Self = StObject.set(x, "xmlns:xlink", value.asInstanceOf[js.Any])
      
      inline def setXmlnsColonxlinkUndefined: Self = StObject.set(x, "xmlns:xlink", js.undefined)
      
      inline def setXmlnsUndefined: Self = StObject.set(x, "xmlns", js.undefined)
    }
  }
  
  trait Content extends StObject {
    
    var content: String
    
    var id: String
    
    var viewBox: String
  }
  object Content {
    
    inline def apply(content: String, id: String, viewBox: String): Content = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], viewBox = viewBox.asInstanceOf[js.Any])
      __obj.asInstanceOf[Content]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Content] (val x: Self) extends AnyVal {
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setViewBox(value: String): Self = StObject.set(x, "viewBox", value.asInstanceOf[js.Any])
    }
  }
}
