package typings.winrtUwp.Windows.Devices.AllJoyn

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains information about the stopped session watcher object. */
trait AllJoynWatcherStoppedEventArgs extends StObject {
  
  /** Returns a status code that was returned when the watcher object is stopped. This value is represented by AllJoynStatus . */
  var status: Double
}
object AllJoynWatcherStoppedEventArgs {
  
  @scala.inline
  def apply(status: Double): AllJoynWatcherStoppedEventArgs = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllJoynWatcherStoppedEventArgs]
  }
  
  @scala.inline
  implicit class AllJoynWatcherStoppedEventArgsMutableBuilder[Self <: AllJoynWatcherStoppedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
