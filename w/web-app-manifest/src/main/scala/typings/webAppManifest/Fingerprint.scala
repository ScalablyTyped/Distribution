package typings.webAppManifest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Each `Fingerprints` represents a set of cryptographic fingerprints used for verifying the application. A
  * fingerprint has the following two properties: `type` and `value`.
  *
  * @see https://w3c.github.io/manifest/#fingerprints-member
  */
trait Fingerprint extends StObject {
  
  var `type`: js.UndefOr[String] = js.undefined
  
  var value: js.UndefOr[String] = js.undefined
}
object Fingerprint {
  
  inline def apply(): Fingerprint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Fingerprint]
  }
  
  extension [Self <: Fingerprint](x: Self) {
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
