package typings.tensorflowTfjsCore.randUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RandomGamma extends js.Object {
  
  def nextValue(): Double = js.native
}
object RandomGamma {
  
  @scala.inline
  def apply(nextValue: () => Double): RandomGamma = {
    val __obj = js.Dynamic.literal(nextValue = js.Any.fromFunction0(nextValue))
    __obj.asInstanceOf[RandomGamma]
  }
  
  @scala.inline
  implicit class RandomGammaOps[Self <: RandomGamma] (val x: Self) extends AnyVal {
    
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
    def setNextValue(value: () => Double): Self = this.set("nextValue", js.Any.fromFunction0(value))
  }
}
