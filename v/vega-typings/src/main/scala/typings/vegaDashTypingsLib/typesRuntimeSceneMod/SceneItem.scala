package typings
package vegaDashTypingsLib.typesRuntimeSceneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SceneItem extends js.Object {
  var bounds: Bounds
  var mark: vegaDashTypingsLib.Anon_Role
  var x: scala.Double
  var y: scala.Double
}

object SceneItem {
  @scala.inline
  def apply(bounds: Bounds, mark: vegaDashTypingsLib.Anon_Role, x: scala.Double, y: scala.Double): SceneItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bounds")(bounds)
    __obj.updateDynamic("mark")(mark)
    __obj.updateDynamic("x")(x)
    __obj.updateDynamic("y")(y)
    __obj.asInstanceOf[SceneItem]
  }
}

