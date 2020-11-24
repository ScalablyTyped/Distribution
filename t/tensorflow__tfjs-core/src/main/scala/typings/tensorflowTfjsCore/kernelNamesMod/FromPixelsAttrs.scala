package typings.tensorflowTfjsCore.kernelNamesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FromPixelsAttrs extends js.Object {
  
  var numChannels: Double = js.native
}
object FromPixelsAttrs {
  
  @scala.inline
  def apply(numChannels: Double): FromPixelsAttrs = {
    val __obj = js.Dynamic.literal(numChannels = numChannels.asInstanceOf[js.Any])
    __obj.asInstanceOf[FromPixelsAttrs]
  }
  
  @scala.inline
  implicit class FromPixelsAttrsOps[Self <: FromPixelsAttrs] (val x: Self) extends AnyVal {
    
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
    def setNumChannels(value: Double): Self = this.set("numChannels", value.asInstanceOf[js.Any])
  }
}
