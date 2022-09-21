package typings.webcryptoCore.mod

import typings.pvtsutils.mod.BufferSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EcPoint extends StObject {
  
  var x: BufferSource
  
  var y: BufferSource
}
object EcPoint {
  
  inline def apply(x: BufferSource, y: BufferSource): EcPoint = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[EcPoint]
  }
  
  extension [Self <: EcPoint](x: Self) {
    
    inline def setX(value: BufferSource): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: BufferSource): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
