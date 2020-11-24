package typings.yaml.parseCstMod.CST

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Range extends js.Object {
  
  var end: Double = js.native
  
  def isEmpty(): Boolean = js.native
  
  var origEnd: js.UndefOr[Double] = js.native
  
  var origStart: js.UndefOr[Double] = js.native
  
  var start: Double = js.native
}
object Range {
  
  @scala.inline
  def apply(end: Double, isEmpty: () => Boolean, start: Double): Range = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], isEmpty = js.Any.fromFunction0(isEmpty), start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Range]
  }
  
  @scala.inline
  implicit class RangeOps[Self <: Range] (val x: Self) extends AnyVal {
    
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
    def setEnd(value: Double): Self = this.set("end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEmpty(value: () => Boolean): Self = this.set("isEmpty", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStart(value: Double): Self = this.set("start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrigEnd(value: Double): Self = this.set("origEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrigEnd: Self = this.set("origEnd", js.undefined)
    
    @scala.inline
    def setOrigStart(value: Double): Self = this.set("origStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrigStart: Self = this.set("origStart", js.undefined)
  }
}
