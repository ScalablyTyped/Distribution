package typings.winrtUwp.Windows.UI.Input.Spatial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpatialHoldCompletedEventArgs extends StObject {
  
  var interactionSourceKind: js.Any
}
object SpatialHoldCompletedEventArgs {
  
  @scala.inline
  def apply(interactionSourceKind: js.Any): SpatialHoldCompletedEventArgs = {
    val __obj = js.Dynamic.literal(interactionSourceKind = interactionSourceKind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialHoldCompletedEventArgs]
  }
  
  @scala.inline
  implicit class SpatialHoldCompletedEventArgsMutableBuilder[Self <: SpatialHoldCompletedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInteractionSourceKind(value: js.Any): Self = StObject.set(x, "interactionSourceKind", value.asInstanceOf[js.Any])
  }
}
