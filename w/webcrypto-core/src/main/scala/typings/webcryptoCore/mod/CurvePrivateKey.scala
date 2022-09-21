package typings.webcryptoCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ASN.1
  * ```
  * CurvePrivateKey ::= OCTET STRING
  * ```
  *
  * JSON
  * ```json
  * {
  *   "d": "base64url"
  * }
  * ```
  */
trait CurvePrivateKey extends StObject {
  
  var d: js.typedarray.ArrayBuffer
}
object CurvePrivateKey {
  
  inline def apply(d: js.typedarray.ArrayBuffer): CurvePrivateKey = {
    val __obj = js.Dynamic.literal(d = d.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurvePrivateKey]
  }
  
  extension [Self <: CurvePrivateKey](x: Self) {
    
    inline def setD(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
  }
}
