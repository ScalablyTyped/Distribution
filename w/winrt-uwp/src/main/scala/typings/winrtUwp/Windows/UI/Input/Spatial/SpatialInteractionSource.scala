package typings.winrtUwp.Windows.UI.Input.Spatial

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpatialInteractionSource extends js.Object {
  var id: js.Any
   /* unmapped type */ var kind: js.Any
}

object SpatialInteractionSource {
  @scala.inline
  def apply(id: js.Any, kind: js.Any): SpatialInteractionSource = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialInteractionSource]
  }
}

