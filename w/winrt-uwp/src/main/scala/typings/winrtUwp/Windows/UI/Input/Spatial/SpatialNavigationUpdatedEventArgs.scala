package typings.winrtUwp.Windows.UI.Input.Spatial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpatialNavigationUpdatedEventArgs extends StObject {
  
  var interactionSourceKind: js.Any
  
  /* unmapped type */
  var normalizedOffset: js.Any
}
object SpatialNavigationUpdatedEventArgs {
  
  @scala.inline
  def apply(interactionSourceKind: js.Any, normalizedOffset: js.Any): SpatialNavigationUpdatedEventArgs = {
    val __obj = js.Dynamic.literal(interactionSourceKind = interactionSourceKind.asInstanceOf[js.Any], normalizedOffset = normalizedOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialNavigationUpdatedEventArgs]
  }
  
  @scala.inline
  implicit class SpatialNavigationUpdatedEventArgsMutableBuilder[Self <: SpatialNavigationUpdatedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInteractionSourceKind(value: js.Any): Self = StObject.set(x, "interactionSourceKind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormalizedOffset(value: js.Any): Self = StObject.set(x, "normalizedOffset", value.asInstanceOf[js.Any])
  }
}
