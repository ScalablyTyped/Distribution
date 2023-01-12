package typings.winrtUwp.Windows.UI.Input.Spatial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpatialHoldCompletedEventArgs extends StObject {
  
  var interactionSourceKind: Any
}
object SpatialHoldCompletedEventArgs {
  
  inline def apply(interactionSourceKind: Any): SpatialHoldCompletedEventArgs = {
    val __obj = js.Dynamic.literal(interactionSourceKind = interactionSourceKind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialHoldCompletedEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SpatialHoldCompletedEventArgs] (val x: Self) extends AnyVal {
    
    inline def setInteractionSourceKind(value: Any): Self = StObject.set(x, "interactionSourceKind", value.asInstanceOf[js.Any])
  }
}
