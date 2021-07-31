package typings.vegaLite.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Offset extends StObject {
  
  var offset: Double | Signal
  
  var signal: String
}
object Offset {
  
  @scala.inline
  def apply(offset: Double | Signal, signal: String): Offset = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], signal = signal.asInstanceOf[js.Any])
    __obj.asInstanceOf[Offset]
  }
  
  @scala.inline
  implicit class OffsetMutableBuilder[Self <: Offset] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOffset(value: Double | Signal): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignal(value: String): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
  }
}
