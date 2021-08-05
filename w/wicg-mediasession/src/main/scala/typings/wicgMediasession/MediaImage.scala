package typings.wicgMediasession

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaImage extends StObject {
  
  // Specify the MediaImage object’s sizes. It follows the spec of sizes attribute in HTML link element.
  var sizes: js.UndefOr[String] = js.undefined
  
  // URL from which the user agent can fetch the image’s data.
  var src: String
  
  // A hint as to the media type of the image.
  var `type`: js.UndefOr[String] = js.undefined
}
object MediaImage {
  
  inline def apply(src: String): MediaImage = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaImage]
  }
  
  extension [Self <: MediaImage](x: Self) {
    
    inline def setSizes(value: String): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
    
    inline def setSizesUndefined: Self = StObject.set(x, "sizes", js.undefined)
    
    inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
