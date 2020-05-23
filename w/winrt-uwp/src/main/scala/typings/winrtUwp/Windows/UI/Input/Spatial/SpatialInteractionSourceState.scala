package typings.winrtUwp.Windows.UI.Input.Spatial

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpatialInteractionSourceState extends js.Object {
  var isPressed: js.Any
   /* unmapped type */ var properties: js.Any
   /* unmapped type */ var source: js.Any
   /* unmapped type */ var timestamp: js.Any
   /* unmapped type */ var tryGetPointerPose: js.Any
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
}

