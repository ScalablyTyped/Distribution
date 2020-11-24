package typings.winrtUwp.Windows.UI.Input.Spatial

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpatialManipulationCompletedEventArgs extends js.Object {
  
  var interactionSourceKind: js.Any = js.native
  
   /* unmapped type */ var tryGetCumulativeDelta: js.Any = js.native
}
object SpatialManipulationCompletedEventArgs {
  
  @scala.inline
  def apply(interactionSourceKind: js.Any, tryGetCumulativeDelta: js.Any): SpatialManipulationCompletedEventArgs = {
    val __obj = js.Dynamic.literal(interactionSourceKind = interactionSourceKind.asInstanceOf[js.Any], tryGetCumulativeDelta = tryGetCumulativeDelta.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialManipulationCompletedEventArgs]
  }
  
  @scala.inline
  implicit class SpatialManipulationCompletedEventArgsOps[Self <: SpatialManipulationCompletedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setInteractionSourceKind(value: js.Any): Self = this.set("interactionSourceKind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTryGetCumulativeDelta(value: js.Any): Self = this.set("tryGetCumulativeDelta", value.asInstanceOf[js.Any])
  }
}
