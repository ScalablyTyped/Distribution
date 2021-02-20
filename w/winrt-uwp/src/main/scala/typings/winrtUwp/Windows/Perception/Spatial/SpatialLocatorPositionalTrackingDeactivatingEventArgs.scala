package typings.winrtUwp.Windows.Perception.Spatial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpatialLocatorPositionalTrackingDeactivatingEventArgs extends StObject {
  
  var canceled: js.Any = js.native
}
object SpatialLocatorPositionalTrackingDeactivatingEventArgs {
  
  @scala.inline
  def apply(canceled: js.Any): SpatialLocatorPositionalTrackingDeactivatingEventArgs = {
    val __obj = js.Dynamic.literal(canceled = canceled.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialLocatorPositionalTrackingDeactivatingEventArgs]
  }
  
  @scala.inline
  implicit class SpatialLocatorPositionalTrackingDeactivatingEventArgsMutableBuilder[Self <: SpatialLocatorPositionalTrackingDeactivatingEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCanceled(value: js.Any): Self = StObject.set(x, "canceled", value.asInstanceOf[js.Any])
  }
}
