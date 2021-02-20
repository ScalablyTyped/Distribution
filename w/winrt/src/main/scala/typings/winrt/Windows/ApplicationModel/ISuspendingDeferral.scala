package typings.winrt.Windows.ApplicationModel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISuspendingDeferral extends StObject {
  
  def complete(): Unit = js.native
}
object ISuspendingDeferral {
  
  @scala.inline
  def apply(complete: () => Unit): ISuspendingDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[ISuspendingDeferral]
  }
  
  @scala.inline
  implicit class ISuspendingDeferralMutableBuilder[Self <: ISuspendingDeferral] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
  }
}
