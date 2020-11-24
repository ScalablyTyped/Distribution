package typings.winrtUwp.Windows.UI.Input.Spatial

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpatialInteractionSourceState extends js.Object {
  
  var isPressed: js.Any = js.native
  
   /* unmapped type */ var properties: js.Any = js.native
  
   /* unmapped type */ var source: js.Any = js.native
  
   /* unmapped type */ var timestamp: js.Any = js.native
  
   /* unmapped type */ var tryGetPointerPose: js.Any = js.native
}
object SpatialInteractionSourceState {
  
  @scala.inline
  def apply(
    isPressed: js.Any,
    properties: js.Any,
    source: js.Any,
    timestamp: js.Any,
    tryGetPointerPose: js.Any
  ): SpatialInteractionSourceState = {
    val __obj = js.Dynamic.literal(isPressed = isPressed.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], tryGetPointerPose = tryGetPointerPose.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialInteractionSourceState]
  }
  
  @scala.inline
  implicit class SpatialInteractionSourceStateOps[Self <: SpatialInteractionSourceState] (val x: Self) extends AnyVal {
    
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
    def setIsPressed(value: js.Any): Self = this.set("isPressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperties(value: js.Any): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: js.Any): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: js.Any): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTryGetPointerPose(value: js.Any): Self = this.set("tryGetPointerPose", value.asInstanceOf[js.Any])
  }
}
