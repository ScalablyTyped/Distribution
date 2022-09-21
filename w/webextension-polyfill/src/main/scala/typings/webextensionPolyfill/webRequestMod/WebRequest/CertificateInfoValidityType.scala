package typings.webextensionPolyfill.webRequestMod.WebRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains start and end timestamps.
  */
trait CertificateInfoValidityType extends StObject {
  
  var end: Double
  
  var start: Double
}
object CertificateInfoValidityType {
  
  inline def apply(end: Double, start: Double): CertificateInfoValidityType = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateInfoValidityType]
  }
  
  extension [Self <: CertificateInfoValidityType](x: Self) {
    
    inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
