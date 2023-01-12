package typings.winrtUwp.Windows.Networking.Connectivity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides the start time and duration for an established or prior connection. */
trait ConnectivityInterval extends StObject {
  
  /** Indicates the duration of connectivity. */
  var connectionDuration: Double
  
  /** Indicates when the connection was initially established. */
  var startTime: js.Date
}
object ConnectivityInterval {
  
  inline def apply(connectionDuration: Double, startTime: js.Date): ConnectivityInterval = {
    val __obj = js.Dynamic.literal(connectionDuration = connectionDuration.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectivityInterval]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConnectivityInterval] (val x: Self) extends AnyVal {
    
    inline def setConnectionDuration(value: Double): Self = StObject.set(x, "connectionDuration", value.asInstanceOf[js.Any])
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
  }
}
