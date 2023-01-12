package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IASTSpan extends StObject {
  
  var _end: Double
  
  var _start: Double
  
  def end(): Double
  
  def start(): Double
}
object IASTSpan {
  
  inline def apply(_end: Double, _start: Double, end: () => Double, start: () => Double): IASTSpan = {
    val __obj = js.Dynamic.literal(_end = _end.asInstanceOf[js.Any], _start = _start.asInstanceOf[js.Any], end = js.Any.fromFunction0(end), start = js.Any.fromFunction0(start))
    __obj.asInstanceOf[IASTSpan]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IASTSpan] (val x: Self) extends AnyVal {
    
    inline def setEnd(value: () => Double): Self = StObject.set(x, "end", js.Any.fromFunction0(value))
    
    inline def setStart(value: () => Double): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
    
    inline def set_end(value: Double): Self = StObject.set(x, "_end", value.asInstanceOf[js.Any])
    
    inline def set_start(value: Double): Self = StObject.set(x, "_start", value.asInstanceOf[js.Any])
  }
}
