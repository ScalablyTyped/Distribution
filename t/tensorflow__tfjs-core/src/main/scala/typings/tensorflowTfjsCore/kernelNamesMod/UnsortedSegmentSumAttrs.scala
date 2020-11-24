package typings.tensorflowTfjsCore.kernelNamesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnsortedSegmentSumAttrs extends js.Object {
  
  var numSegments: Double = js.native
}
object UnsortedSegmentSumAttrs {
  
  @scala.inline
  def apply(numSegments: Double): UnsortedSegmentSumAttrs = {
    val __obj = js.Dynamic.literal(numSegments = numSegments.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnsortedSegmentSumAttrs]
  }
  
  @scala.inline
  implicit class UnsortedSegmentSumAttrsOps[Self <: UnsortedSegmentSumAttrs] (val x: Self) extends AnyVal {
    
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
    def setNumSegments(value: Double): Self = this.set("numSegments", value.asInstanceOf[js.Any])
  }
}
