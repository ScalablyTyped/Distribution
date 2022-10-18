package typings.testcafe.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideoConfigOptions extends StObject {
  
  var encodingOptions: js.UndefOr[VideoEncodingOptions] = js.undefined
  
  var options: js.UndefOr[VideoOptions] = js.undefined
  
  var path: String
}
object VideoConfigOptions {
  
  inline def apply(path: String): VideoConfigOptions = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoConfigOptions]
  }
  
  extension [Self <: VideoConfigOptions](x: Self) {
    
    inline def setEncodingOptions(value: VideoEncodingOptions): Self = StObject.set(x, "encodingOptions", value.asInstanceOf[js.Any])
    
    inline def setEncodingOptionsUndefined: Self = StObject.set(x, "encodingOptions", js.undefined)
    
    inline def setOptions(value: VideoOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
