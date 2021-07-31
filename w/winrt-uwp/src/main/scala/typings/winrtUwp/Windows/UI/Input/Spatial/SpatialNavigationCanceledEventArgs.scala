package typings.winrtUwp.Windows.UI.Input.Spatial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpatialNavigationCanceledEventArgs extends StObject {
  
  var interactionSourceKind: js.Any
}
object SpatialNavigationCanceledEventArgs {
  
  @scala.inline
  def apply(interactionSourceKind: js.Any): SpatialNavigationCanceledEventArgs = {
    val __obj = js.Dynamic.literal(interactionSourceKind = interactionSourceKind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialNavigationCanceledEventArgs]
  }
  
  @scala.inline
  implicit class SpatialNavigationCanceledEventArgsMutableBuilder[Self <: SpatialNavigationCanceledEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInteractionSourceKind(value: js.Any): Self = StObject.set(x, "interactionSourceKind", value.asInstanceOf[js.Any])
  }
}
