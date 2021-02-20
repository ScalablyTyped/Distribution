package typings.winrtUwp.Windows.Devices.SmartCards

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a wait time for a requested smart card personal identification number (PIN) reset. */
@js.native
trait SmartCardPinResetDeferral extends StObject {
  
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
  implicit class SmartCardPinResetDeferralMutableBuilder[Self <: SmartCardPinResetDeferral] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
  }
}
