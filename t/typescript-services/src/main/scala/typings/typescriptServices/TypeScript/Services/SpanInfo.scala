package typings.typescriptServices.TypeScript.Services

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpanInfo extends StObject {
  
  var limChar: Double
  
  var minChar: Double
  
  var text: String
}
object SpanInfo {
  
  inline def apply(limChar: Double, minChar: Double, text: String): SpanInfo = {
    val __obj = js.Dynamic.literal(limChar = limChar.asInstanceOf[js.Any], minChar = minChar.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpanInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SpanInfo] (val x: Self) extends AnyVal {
    
    inline def setLimChar(value: Double): Self = StObject.set(x, "limChar", value.asInstanceOf[js.Any])
    
    inline def setMinChar(value: Double): Self = StObject.set(x, "minChar", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
