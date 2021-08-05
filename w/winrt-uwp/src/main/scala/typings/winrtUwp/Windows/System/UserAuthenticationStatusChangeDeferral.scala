package typings.winrtUwp.Windows.System

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a user authentication status change deferral returned by the UserAuthenticationStatusChangingEventArgs.GetDeferral method. */
trait UserAuthenticationStatusChangeDeferral extends StObject {
  
  /** Reports that the application has completed its user authentication status change deferral. */
  def complete(): Unit
}
object UserAuthenticationStatusChangeDeferral {
  
  inline def apply(complete: () => Unit): UserAuthenticationStatusChangeDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[UserAuthenticationStatusChangeDeferral]
  }
  
  extension [Self <: UserAuthenticationStatusChangeDeferral](x: Self) {
    
    inline def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
  }
}
