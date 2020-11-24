package typings.tensorflowTfjsCore.kernelNamesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LinSpaceAttrs extends js.Object {
  
  var num: Double = js.native
  
  var start: Double = js.native
  
  var stop: Double = js.native
}
object LinSpaceAttrs {
  
  @scala.inline
  def apply(num: Double, start: Double, stop: Double): LinSpaceAttrs = {
    val __obj = js.Dynamic.literal(num = num.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], stop = stop.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinSpaceAttrs]
  }
  
  @scala.inline
  implicit class LinSpaceAttrsOps[Self <: LinSpaceAttrs] (val x: Self) extends AnyVal {
    
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
    def setNum(value: Double): Self = this.set("num", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: Double): Self = this.set("start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStop(value: Double): Self = this.set("stop", value.asInstanceOf[js.Any])
  }
}
