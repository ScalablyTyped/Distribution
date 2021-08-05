package typings.winrtUwp.Windows.Media.PlayTo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides information about the CurrentTimeChangeRequested event. */
trait CurrentTimeChangeRequestedEventArgs extends StObject {
  
  /** Gets the new time that the Play To source audio or video stream has been changed to. */
  var time: Double
}
object CurrentTimeChangeRequestedEventArgs {
  
  inline def apply(time: Double): CurrentTimeChangeRequestedEventArgs = {
    val __obj = js.Dynamic.literal(time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrentTimeChangeRequestedEventArgs]
  }
  
  extension [Self <: CurrentTimeChangeRequestedEventArgs](x: Self) {
    
    inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
  }
}
