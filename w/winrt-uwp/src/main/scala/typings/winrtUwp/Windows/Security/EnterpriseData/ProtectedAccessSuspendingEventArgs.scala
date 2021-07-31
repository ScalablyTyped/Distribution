package typings.winrtUwp.Windows.Security.EnterpriseData

import typings.std.Date
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.Deferral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data when content protection is being suspended. */
trait ProtectedAccessSuspendingEventArgs extends StObject {
  
  /** DateTime at which content protection will be suspended. The app can subtract DateTime.Now from this value to determine how much time there is to perform any processing before the suspension occurs. */
  var deadline: Date
  
  /**
    * Gets the Deferral object that manages the protection suspension. The app must call Deferral.Complete before it returns from the event handler.
    * @return The Deferral object.
    */
  def getDeferral(): Deferral
  
  /** Contains the enterprise identities for which content protection is being suspended. */
  var identities: IVectorView[String]
}
object ProtectedAccessSuspendingEventArgs {
  
  @scala.inline
  def apply(deadline: Date, getDeferral: () => Deferral, identities: IVectorView[String]): ProtectedAccessSuspendingEventArgs = {
    val __obj = js.Dynamic.literal(deadline = deadline.asInstanceOf[js.Any], getDeferral = js.Any.fromFunction0(getDeferral), identities = identities.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProtectedAccessSuspendingEventArgs]
  }
  
  @scala.inline
  implicit class ProtectedAccessSuspendingEventArgsMutableBuilder[Self <: ProtectedAccessSuspendingEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeadline(value: Date): Self = StObject.set(x, "deadline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetDeferral(value: () => Deferral): Self = StObject.set(x, "getDeferral", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIdentities(value: IVectorView[String]): Self = StObject.set(x, "identities", value.asInstanceOf[js.Any])
  }
}
