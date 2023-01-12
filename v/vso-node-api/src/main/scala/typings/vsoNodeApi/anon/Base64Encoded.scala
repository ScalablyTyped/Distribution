package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Base64Encoded extends StObject {
  
  var base64Encoded: scala.Double
  
  var rawText: scala.Double
}
object Base64Encoded {
  
  inline def apply(base64Encoded: scala.Double, rawText: scala.Double): Base64Encoded = {
    val __obj = js.Dynamic.literal(base64Encoded = base64Encoded.asInstanceOf[js.Any], rawText = rawText.asInstanceOf[js.Any])
    __obj.asInstanceOf[Base64Encoded]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Base64Encoded] (val x: Self) extends AnyVal {
    
    inline def setBase64Encoded(value: scala.Double): Self = StObject.set(x, "base64Encoded", value.asInstanceOf[js.Any])
    
    inline def setRawText(value: scala.Double): Self = StObject.set(x, "rawText", value.asInstanceOf[js.Any])
  }
}
