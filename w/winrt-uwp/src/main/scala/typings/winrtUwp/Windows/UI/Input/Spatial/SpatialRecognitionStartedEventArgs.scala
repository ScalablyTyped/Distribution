package typings.winrtUwp.Windows.UI.Input.Spatial

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpatialRecognitionStartedEventArgs extends js.Object {
  var interactionSourceKind: js.Any
   /* unmapped type */ var isGesturePossible: js.Any
   /* unmapped type */ var tryGetPointerPose: js.Any
}

object SpatialRecognitionStartedEventArgs {
  @scala.inline
  def apply(interactionSourceKind: js.Any, isGesturePossible: js.Any, tryGetPointerPose: js.Any): SpatialRecognitionStartedEventArgs = {
    val __obj = js.Dynamic.literal(interactionSourceKind = interactionSourceKind.asInstanceOf[js.Any], isGesturePossible = isGesturePossible.asInstanceOf[js.Any], tryGetPointerPose = tryGetPointerPose.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialRecognitionStartedEventArgs]
  }
}

