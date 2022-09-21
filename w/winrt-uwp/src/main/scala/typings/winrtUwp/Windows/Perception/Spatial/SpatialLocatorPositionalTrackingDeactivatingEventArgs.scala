package typings.winrtUwp.Windows.Perception.Spatial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpatialLocatorPositionalTrackingDeactivatingEventArgs extends StObject {
  
  var canceled: Any
}
object SpatialLocatorPositionalTrackingDeactivatingEventArgs {
  
  inline def apply(canceled: Any): SpatialLocatorPositionalTrackingDeactivatingEventArgs = {
    val __obj = js.Dynamic.literal(canceled = canceled.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialLocatorPositionalTrackingDeactivatingEventArgs]
  }
  
  extension [Self <: SpatialLocatorPositionalTrackingDeactivatingEventArgs](x: Self) {
    
    inline def setCanceled(value: Any): Self = StObject.set(x, "canceled", value.asInstanceOf[js.Any])
  }
}
