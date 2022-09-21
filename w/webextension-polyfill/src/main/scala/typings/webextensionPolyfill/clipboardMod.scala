package typings.webextensionPolyfill

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clipboardMod {
  
  object Clipboard {
    
    /**
      * The type of imageData.
      */
    /* Rewritten from type alias, can be one of: 
      - typings.webextensionPolyfill.webextensionPolyfillStrings.jpeg
      - typings.webextensionPolyfill.webextensionPolyfillStrings.png
    */
    trait SetImageDataImageTypeEnum extends StObject
    object SetImageDataImageTypeEnum {
      
      inline def jpeg: typings.webextensionPolyfill.webextensionPolyfillStrings.jpeg = "jpeg".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.jpeg]
      
      inline def png: typings.webextensionPolyfill.webextensionPolyfillStrings.png = "png".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.png]
    }
    
    trait Static extends StObject {
      
      /**
        * Copy an image to the clipboard. The image is re-encoded before it is written to the clipboard. If the image is invalid,
        * the clipboard is not modified.
        *
        * @param imageData The image data to be copied.
        * @param imageType The type of imageData.
        */
      def setImageData(imageData: js.typedarray.ArrayBuffer, imageType: SetImageDataImageTypeEnum): js.Promise[Unit]
    }
    object Static {
      
      inline def apply(setImageData: (js.typedarray.ArrayBuffer, SetImageDataImageTypeEnum) => js.Promise[Unit]): Static = {
        val __obj = js.Dynamic.literal(setImageData = js.Any.fromFunction2(setImageData))
        __obj.asInstanceOf[Static]
      }
      
      extension [Self <: Static](x: Self) {
        
        inline def setSetImageData(value: (js.typedarray.ArrayBuffer, SetImageDataImageTypeEnum) => js.Promise[Unit]): Self = StObject.set(x, "setImageData", js.Any.fromFunction2(value))
      }
    }
  }
}
