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
  
  @scala.inline
  def apply(end: Double, isEmpty: () => Boolean, start: Double): Range = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], isEmpty = js.Any.fromFunction0(isEmpty), start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Range]
  }
  
  @scala.inline
  implicit class RangeMutableBuilder[Self <: Range] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEmpty(value: () => Boolean): Self = StObject.set(x, "isEmpty", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOrigEnd(value: Double): Self = StObject.set(x, "origEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrigEndUndefined: Self = StObject.set(x, "origEnd", js.undefined)
    
    @scala.inline
    def setOrigStart(value: Double): Self = StObject.set(x, "origStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrigStartUndefined: Self = StObject.set(x, "origStart", js.undefined)
    
    @scala.inline
    def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
