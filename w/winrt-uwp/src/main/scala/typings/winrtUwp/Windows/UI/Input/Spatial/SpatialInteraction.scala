package typings.winrtUwp.Windows.UI.Input.Spatial

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpatialInteraction extends js.Object {
  
  var sourceState: js.Any = js.native
}
object SpatialInteraction {
  
  @scala.inline
  def apply(sourceState: js.Any): SpatialInteraction = {
    val __obj = js.Dynamic.literal(sourceState = sourceState.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialInteraction]
  }
  
  @scala.inline
  implicit class SpatialInteractionOps[Self <: SpatialInteraction] (val x: Self) extends AnyVal {
    
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
    def setSourceState(value: js.Any): Self = this.set("sourceState", value.asInstanceOf[js.Any])
  }
}
