package typings.webcryptoCore.mod

import typings.pvtsutils.mod.BufferSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EcSignaturePoint extends StObject {
  
  var r: BufferSource
  
  var s: BufferSource
}
object EcSignaturePoint {
  
  inline def apply(r: BufferSource, s: BufferSource): EcSignaturePoint = {
    val __obj = js.Dynamic.literal(r = r.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any])
    __obj.asInstanceOf[EcSignaturePoint]
  }
  
  extension [Self <: EcSignaturePoint](x: Self) {
    
    inline def setR(value: BufferSource): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    
    inline def setS(value: BufferSource): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
  }
}
