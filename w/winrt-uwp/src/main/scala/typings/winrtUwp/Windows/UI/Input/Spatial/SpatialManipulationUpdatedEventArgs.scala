package typings.winrtUwp.Windows.UI.Input.Spatial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpatialManipulationUpdatedEventArgs extends StObject {
  
  var interactionSourceKind: js.Any = js.native
  
  /* unmapped type */
  var tryGetCumulativeDelta: js.Any = js.native
}
object SpatialManipulationUpdatedEventArgs {
  
  @scala.inline
  def apply(interactionSourceKind: js.Any, tryGetCumulativeDelta: js.Any): SpatialManipulationUpdatedEventArgs = {
    val __obj = js.Dynamic.literal(interactionSourceKind = interactionSourceKind.asInstanceOf[js.Any], tryGetCumulativeDelta = tryGetCumulativeDelta.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialManipulationUpdatedEventArgs]
  }
  
  @scala.inline
  implicit class SpatialManipulationUpdatedEventArgsMutableBuilder[Self <: SpatialManipulationUpdatedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInteractionSourceKind(value: js.Any): Self = StObject.set(x, "interactionSourceKind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTryGetCumulativeDelta(value: js.Any): Self = StObject.set(x, "tryGetCumulativeDelta", value.asInstanceOf[js.Any])
  }
}
