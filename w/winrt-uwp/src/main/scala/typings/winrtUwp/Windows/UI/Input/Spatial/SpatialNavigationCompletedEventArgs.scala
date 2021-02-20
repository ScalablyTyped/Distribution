package typings.winrtUwp.Windows.UI.Input.Spatial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpatialNavigationCompletedEventArgs extends StObject {
  
  var interactionSourceKind: js.Any = js.native
  
  /* unmapped type */
  var normalizedOffset: js.Any = js.native
}
object SpatialNavigationCompletedEventArgs {
  
  @scala.inline
  def apply(interactionSourceKind: js.Any, normalizedOffset: js.Any): SpatialNavigationCompletedEventArgs = {
    val __obj = js.Dynamic.literal(interactionSourceKind = interactionSourceKind.asInstanceOf[js.Any], normalizedOffset = normalizedOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialNavigationCompletedEventArgs]
  }
  
  @scala.inline
  implicit class SpatialNavigationCompletedEventArgsMutableBuilder[Self <: SpatialNavigationCompletedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInteractionSourceKind(value: js.Any): Self = StObject.set(x, "interactionSourceKind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormalizedOffset(value: js.Any): Self = StObject.set(x, "normalizedOffset", value.asInstanceOf[js.Any])
  }
}
