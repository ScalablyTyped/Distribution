package typings.winrtUwp.Windows.UI.Input.Spatial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpatialHoldCanceledEventArgs extends StObject {
  
  var interactionSourceKind: js.Any = js.native
}
object SpatialHoldCanceledEventArgs {
  
  @scala.inline
  def apply(interactionSourceKind: js.Any): SpatialHoldCanceledEventArgs = {
    val __obj = js.Dynamic.literal(interactionSourceKind = interactionSourceKind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialHoldCanceledEventArgs]
  }
  
  @scala.inline
  implicit class SpatialHoldCanceledEventArgsMutableBuilder[Self <: SpatialHoldCanceledEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInteractionSourceKind(value: js.Any): Self = StObject.set(x, "interactionSourceKind", value.asInstanceOf[js.Any])
  }
}
