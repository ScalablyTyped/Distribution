package typings.twemoji

import typings.twemoji.mod.ParseCallback
import typings.twemoji.twemojiBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<twemoji.twemoji.ParseObject> */
  trait PartialParseObject extends StObject {
    
    var attributes: js.UndefOr[js.Function2[/* icon */ String, /* variant */ String, js.Object]] = js.undefined
    
    var base: js.UndefOr[String] = js.undefined
    
    var callback: js.UndefOr[ParseCallback] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var ext: js.UndefOr[String] = js.undefined
    
    var folder: js.UndefOr[String] = js.undefined
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object PartialParseObject {
    
    inline def apply(): PartialParseObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialParseObject]
    }
    
    extension [Self <: PartialParseObject](x: Self) {
      
      inline def setAttributes(value: (/* icon */ String, /* variant */ String) => js.Object): Self = StObject.set(x, "attributes", js.Any.fromFunction2(value))
      
      inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      inline def setBase(value: String): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      inline def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
      
      inline def setCallback(value: (/* icon */ String, /* options */ js.Object, /* variant */ String) => String | `false`): Self = StObject.set(x, "callback", js.Any.fromFunction3(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setExt(value: String): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
      
      inline def setExtUndefined: Self = StObject.set(x, "ext", js.undefined)
      
      inline def setFolder(value: String): Self = StObject.set(x, "folder", value.asInstanceOf[js.Any])
      
      inline def setFolderUndefined: Self = StObject.set(x, "folder", js.undefined)
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
}
