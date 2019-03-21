package typings
package vegaDashTypingsLib.typesRuntimeSceneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SceneItem extends js.Object {
  var bounds: Bounds
  var datum: js.UndefOr[js.Object] = js.undefined
  var mark: vegaDashTypingsLib.Anon_Role
  var x: scala.Double
  var y: scala.Double
}

object SceneItem {
  @scala.inline
  def apply(
    bounds: Bounds,
    mark: vegaDashTypingsLib.Anon_Role,
    x: scala.Double,
    y: scala.Double,
    datum: js.Object = null
  ): SceneItem = {
    val __obj = js.Dynamic.literal(bounds = bounds, mark = mark, x = x, y = y)
    if (datum != null) __obj.updateDynamic("datum")(datum)
    __obj.asInstanceOf[SceneItem]
  }
}

