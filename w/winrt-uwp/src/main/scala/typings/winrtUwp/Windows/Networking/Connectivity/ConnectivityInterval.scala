package typings.winrtUwp.Windows.Networking.Connectivity

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides the start time and duration for an established or prior connection. */
@js.native
trait ConnectivityInterval extends StObject {
  
  /** Indicates the duration of connectivity. */
  var connectionDuration: Double = js.native
  
  /** Indicates when the connection was initially established. */
  var startTime: Date = js.native
}
object ConnectivityInterval {
  
  @scala.inline
  def apply(connectionDuration: Double, startTime: Date): ConnectivityInterval = {
    val __obj = js.Dynamic.literal(connectionDuration = connectionDuration.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectivityInterval]
  }
  
  @scala.inline
  implicit class ConnectivityIntervalMutableBuilder[Self <: ConnectivityInterval] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectionDuration(value: Double): Self = StObject.set(x, "connectionDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTime(value: Date): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
  }
}
