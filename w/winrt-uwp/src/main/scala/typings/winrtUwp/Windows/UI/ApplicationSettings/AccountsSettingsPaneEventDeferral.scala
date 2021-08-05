package typings.winrtUwp.Windows.UI.ApplicationSettings

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Enables the app to signal when it has finished populating command collections while handling the AccountCommandsRequested event. */
trait AccountsSettingsPaneEventDeferral extends StObject {
  
  /** Signals that the app has finished populating command collections while handling the AccountCommandsRequested event. */
  def complete(): Unit
}
object AccountsSettingsPaneEventDeferral {
  
  inline def apply(complete: () => Unit): AccountsSettingsPaneEventDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[AccountsSettingsPaneEventDeferral]
  }
  
  extension [Self <: AccountsSettingsPaneEventDeferral](x: Self) {
    
    inline def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
  }
}
