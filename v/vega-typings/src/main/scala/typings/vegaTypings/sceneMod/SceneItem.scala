package typings.vegaTypings.sceneMod

import typings.vegaTypings.anon.Role
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SceneItem extends js.Object {
  var bounds: Bounds
  var datum: js.UndefOr[js.Object] = js.undefined
  var mark: Role
  var x: Double
  var y: Double
}

object SceneItem {
  @scala.inline
  def apply(bounds: Bounds, mark: Role, x: Double, y: Double, datum: js.Object = null): SceneItem = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], mark = mark.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    if (datum != null) __obj.updateDynamic("datum")(datum.asInstanceOf[js.Any])
    __obj.asInstanceOf[SceneItem]
  }
}

