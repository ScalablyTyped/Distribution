package typings.textEncoding

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextEncodeOptions extends StObject {
  
  var stream: js.UndefOr[Boolean] = js.undefined
}
object TextEncodeOptions {
  
  inline def apply(): TextEncodeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextEncodeOptions]
  }
  
  extension [Self <: TextEncodeOptions](x: Self) {
    
    inline def setStream(value: Boolean): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
    
    inline def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
  }
}
