package typings.textEncoding

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextDecoderOptions extends StObject {
  
  var stream: js.UndefOr[Boolean] = js.undefined
}
object TextDecoderOptions {
  
  inline def apply(): TextDecoderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextDecoderOptions]
  }
  
  extension [Self <: TextDecoderOptions](x: Self) {
    
    inline def setStream(value: Boolean): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
    
    inline def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
  }
}
