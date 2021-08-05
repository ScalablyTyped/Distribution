package typings.yaml.parseCstMod.CST

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Range extends StObject {
  
  var end: Double
  
  def isEmpty(): Boolean
  
  var origEnd: js.UndefOr[Double] = js.undefined
  
  var origStart: js.UndefOr[Double] = js.undefined
  
  var start: Double
}
object Range {
  
  inline def apply(end: Double, isEmpty: () => Boolean, start: Double): Range = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], isEmpty = js.Any.fromFunction0(isEmpty), start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Range]
  }
  
  extension [Self <: Range](x: Self) {
    
    inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setIsEmpty(value: () => Boolean): Self = StObject.set(x, "isEmpty", js.Any.fromFunction0(value))
    
    inline def setOrigEnd(value: Double): Self = StObject.set(x, "origEnd", value.asInstanceOf[js.Any])
    
    inline def setOrigEndUndefined: Self = StObject.set(x, "origEnd", js.undefined)
    
    inline def setOrigStart(value: Double): Self = StObject.set(x, "origStart", value.asInstanceOf[js.Any])
    
    inline def setOrigStartUndefined: Self = StObject.set(x, "origStart", js.undefined)
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
