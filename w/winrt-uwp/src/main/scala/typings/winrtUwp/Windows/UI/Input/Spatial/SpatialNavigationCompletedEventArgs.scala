package typings.winrtUwp.Windows.UI.Input.Spatial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpatialNavigationCompletedEventArgs extends StObject {
  
  var interactionSourceKind: Any
  
  /* unmapped type */
  var normalizedOffset: Any
}
object SpatialNavigationCompletedEventArgs {
  
  inline def apply(interactionSourceKind: Any, normalizedOffset: Any): SpatialNavigationCompletedEventArgs = {
    val __obj = js.Dynamic.literal(interactionSourceKind = interactionSourceKind.asInstanceOf[js.Any], normalizedOffset = normalizedOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialNavigationCompletedEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SpatialNavigationCompletedEventArgs] (val x: Self) extends AnyVal {
    
    inline def setInteractionSourceKind(value: Any): Self = StObject.set(x, "interactionSourceKind", value.asInstanceOf[js.Any])
    
    inline def setNormalizedOffset(value: Any): Self = StObject.set(x, "normalizedOffset", value.asInstanceOf[js.Any])
  }
}
