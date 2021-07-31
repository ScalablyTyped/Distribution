package typings.xterm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IViewportRange extends StObject {
  
  /**
    * The end of the range.
    */
  var end: IViewportRangePosition
  
  /**
    * The start of the range.
    */
  var start: IViewportRangePosition
}
object IViewportRange {
  
  @scala.inline
  def apply(end: IViewportRangePosition, start: IViewportRangePosition): IViewportRange = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[IViewportRange]
  }
  
  @scala.inline
  implicit class IViewportRangeMutableBuilder[Self <: IViewportRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnd(value: IViewportRangePosition): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: IViewportRangePosition): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
