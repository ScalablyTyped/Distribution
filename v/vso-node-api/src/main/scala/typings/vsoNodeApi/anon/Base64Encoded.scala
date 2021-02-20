package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Base64Encoded extends StObject {
  
  var base64Encoded: scala.Double = js.native
  
  var rawText: scala.Double = js.native
}
object Base64Encoded {
  
  @scala.inline
  def apply(base64Encoded: scala.Double, rawText: scala.Double): Base64Encoded = {
    val __obj = js.Dynamic.literal(base64Encoded = base64Encoded.asInstanceOf[js.Any], rawText = rawText.asInstanceOf[js.Any])
    __obj.asInstanceOf[Base64Encoded]
  }
  
  @scala.inline
  implicit class Base64EncodedMutableBuilder[Self <: Base64Encoded] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBase64Encoded(value: scala.Double): Self = StObject.set(x, "base64Encoded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawText(value: scala.Double): Self = StObject.set(x, "rawText", value.asInstanceOf[js.Any])
  }
}
