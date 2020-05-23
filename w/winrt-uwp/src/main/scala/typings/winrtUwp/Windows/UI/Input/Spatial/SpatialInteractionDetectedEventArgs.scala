package typings.winrtUwp.Windows.UI.Input.Spatial

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpatialInteractionDetectedEventArgs extends js.Object {
  var interaction: js.Any
   /* unmapped type */ var interactionSourceKind: js.Any
   /* unmapped type */ var tryGetPointerPose: js.Any
}

object SpatialInteractionDetectedEventArgs {
  @scala.inline
  def apply(interaction: js.Any, interactionSourceKind: js.Any, tryGetPointerPose: js.Any): SpatialInteractionDetectedEventArgs = {
    val __obj = js.Dynamic.literal(interaction = interaction.asInstanceOf[js.Any], interactionSourceKind = interactionSourceKind.asInstanceOf[js.Any], tryGetPointerPose = tryGetPointerPose.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialInteractionDetectedEventArgs]
  }
}

