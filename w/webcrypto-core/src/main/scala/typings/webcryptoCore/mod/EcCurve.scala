package typings.webcryptoCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EcCurve
  extends StObject
     with EcCurveParams {
  
  var raw: js.typedarray.ArrayBuffer
}
object EcCurve {
  
  inline def apply(id: String, name: String, raw: js.typedarray.ArrayBuffer, size: Double): EcCurve = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[EcCurve]
  }
  
  extension [Self <: EcCurve](x: Self) {
    
    inline def setRaw(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
  }
}
