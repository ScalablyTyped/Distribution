package typings.vegaLite.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Offset extends StObject {
  
  var offset: Double | Signal
  
  var signal: String
}
object Offset {
  
  inline def apply(offset: Double | Signal, signal: String): Offset = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], signal = signal.asInstanceOf[js.Any])
    __obj.asInstanceOf[Offset]
  }
  
  extension [Self <: Offset](x: Self) {
    
    inline def setOffset(value: Double | Signal): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setSignal(value: String): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
  }
}
