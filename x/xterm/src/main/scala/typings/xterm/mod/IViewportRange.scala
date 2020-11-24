package typings.xterm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IViewportRange extends js.Object {
  
  /**
    * The end of the range.
    */
  var end: IViewportRangePosition = js.native
  
  /**
    * The start of the range.
    */
  var start: IViewportRangePosition = js.native
}
object IViewportRange {
  
  @scala.inline
  def apply(end: IViewportRangePosition, start: IViewportRangePosition): IViewportRange = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[IViewportRange]
  }
  
  @scala.inline
  implicit class IViewportRangeOps[Self <: IViewportRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEnd(value: IViewportRangePosition): Self = this.set("end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: IViewportRangePosition): Self = this.set("start", value.asInstanceOf[js.Any])
  }
}
