package typings.winrtUwp.Windows.Media

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Occurs when a property is changed on the SystemMediaTransportControls . */
trait SystemMediaTransportControlsPropertyChangedEventArgs extends StObject {
  
  /** The property that was changed on the SystemMediaTransportControls . */
  var property: SystemMediaTransportControlsProperty
}
object SystemMediaTransportControlsPropertyChangedEventArgs {
  
  inline def apply(property: SystemMediaTransportControlsProperty): SystemMediaTransportControlsPropertyChangedEventArgs = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemMediaTransportControlsPropertyChangedEventArgs]
  }
  
  extension [Self <: SystemMediaTransportControlsPropertyChangedEventArgs](x: Self) {
    
    inline def setProperty(value: SystemMediaTransportControlsProperty): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
  }
}
