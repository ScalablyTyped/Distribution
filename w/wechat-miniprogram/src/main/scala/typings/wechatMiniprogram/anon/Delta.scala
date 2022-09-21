package typings.wechatMiniprogram.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Delta extends StObject {
  
  // eslint-disable-next-line @typescript-eslint/no-explicit-any
  var delta: js.Array[Any]
  
  var html: String
  
  var text: String
}
object Delta {
  
  inline def apply(delta: js.Array[Any], html: String, text: String): Delta = {
    val __obj = js.Dynamic.literal(delta = delta.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Delta]
  }
  
  extension [Self <: Delta](x: Self) {
    
    inline def setDelta(value: js.Array[Any]): Self = StObject.set(x, "delta", value.asInstanceOf[js.Any])
    
    inline def setDeltaVarargs(value: Any*): Self = StObject.set(x, "delta", js.Array(value*))
    
    inline def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
