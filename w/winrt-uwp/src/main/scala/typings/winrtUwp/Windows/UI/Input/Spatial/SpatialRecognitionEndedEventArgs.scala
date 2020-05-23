package typings.winrtUwp.Windows.UI.Input.Spatial

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpatialRecognitionEndedEventArgs extends js.Object {
  var interactionSourceKind: js.Any
}

object SpatialRecognitionEndedEventArgs {
  @scala.inline
  def apply(interactionSourceKind: js.Any): SpatialRecognitionEndedEventArgs = {
    val __obj = js.Dynamic.literal(interactionSourceKind = interactionSourceKind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialRecognitionEndedEventArgs]
  }
}

