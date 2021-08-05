package typings.winrtUwp.Windows.Devices.Geolocation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the PositionChanged event. */
trait PositionChangedEventArgs extends StObject {
  
  /** The location data associated with the PositionChanged event. */
  var position: Geoposition
}
object PositionChangedEventArgs {
  
  inline def apply(position: Geoposition): PositionChangedEventArgs = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[PositionChangedEventArgs]
  }
  
  extension [Self <: PositionChangedEventArgs](x: Self) {
    
    inline def setPosition(value: Geoposition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
