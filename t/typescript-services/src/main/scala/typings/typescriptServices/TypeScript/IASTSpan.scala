package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IASTSpan extends StObject {
  
  var _end: Double = js.native
  
  var _start: Double = js.native
  
  def end(): Double = js.native
  
  def start(): Double = js.native
}
object IASTSpan {
  
  @scala.inline
  def apply(_end: Double, _start: Double, end: () => Double, start: () => Double): IASTSpan = {
    val __obj = js.Dynamic.literal(_end = _end.asInstanceOf[js.Any], _start = _start.asInstanceOf[js.Any], end = js.Any.fromFunction0(end), start = js.Any.fromFunction0(start))
    __obj.asInstanceOf[IASTSpan]
  }
  
  @scala.inline
  implicit class IASTSpanMutableBuilder[Self <: IASTSpan] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnd(value: () => Double): Self = StObject.set(x, "end", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStart(value: () => Double): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
    
    @scala.inline
    def set_end(value: Double): Self = StObject.set(x, "_end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_start(value: Double): Self = StObject.set(x, "_start", value.asInstanceOf[js.Any])
  }
}
