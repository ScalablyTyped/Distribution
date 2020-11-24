package typings.winrtUwp.Windows.Devices.SmartCards

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a wait time for a requested smart card personal identification number (PIN) reset. */
@js.native
trait SmartCardPinResetDeferral extends js.Object {
  
  /** Returns a wait time completion for a smart card personal identification number (PIN) reset. */
  def complete(): Unit = js.native
}
object SmartCardPinResetDeferral {
  
  @scala.inline
  def apply(complete: () => Unit): SmartCardPinResetDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[SmartCardPinResetDeferral]
  }
  
  @scala.inline
  implicit class SmartCardPinResetDeferralOps[Self <: SmartCardPinResetDeferral] (val x: Self) extends AnyVal {
    
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
    def setComplete(value: () => Unit): Self = this.set("complete", js.Any.fromFunction0(value))
  }
}
