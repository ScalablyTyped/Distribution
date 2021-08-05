package typings.webrtc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://www.w3.org/TR/webrtc/#dom-rtccertificate
trait RTCCertificate extends StObject {
  
  val expires: Double
  
  def getAlgorithm(): String
}
object RTCCertificate {
  
  inline def apply(expires: Double, getAlgorithm: () => String): RTCCertificate = {
    val __obj = js.Dynamic.literal(expires = expires.asInstanceOf[js.Any], getAlgorithm = js.Any.fromFunction0(getAlgorithm))
    __obj.asInstanceOf[RTCCertificate]
  }
  
  extension [Self <: RTCCertificate](x: Self) {
    
    inline def setExpires(value: Double): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
    
    inline def setGetAlgorithm(value: () => String): Self = StObject.set(x, "getAlgorithm", js.Any.fromFunction0(value))
  }
}
