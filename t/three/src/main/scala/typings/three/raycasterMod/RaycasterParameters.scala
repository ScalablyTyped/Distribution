package typings.three.raycasterMod

import typings.three.AnonThreshold
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RaycasterParameters extends js.Object {
  var LOD: js.UndefOr[js.Any] = js.undefined
  var Line: js.UndefOr[js.Any] = js.undefined
  var Mesh: js.UndefOr[js.Any] = js.undefined
  var Points: js.UndefOr[AnonThreshold] = js.undefined
  var Sprite: js.UndefOr[js.Any] = js.undefined
}

object RaycasterParameters {
  @scala.inline
  def apply(
    LOD: js.Any = null,
    Line: js.Any = null,
    Mesh: js.Any = null,
    Points: AnonThreshold = null,
    Sprite: js.Any = null
  ): RaycasterParameters = {
    val __obj = js.Dynamic.literal()
    if (LOD != null) __obj.updateDynamic("LOD")(LOD.asInstanceOf[js.Any])
    if (Line != null) __obj.updateDynamic("Line")(Line.asInstanceOf[js.Any])
    if (Mesh != null) __obj.updateDynamic("Mesh")(Mesh.asInstanceOf[js.Any])
    if (Points != null) __obj.updateDynamic("Points")(Points.asInstanceOf[js.Any])
    if (Sprite != null) __obj.updateDynamic("Sprite")(Sprite.asInstanceOf[js.Any])
    __obj.asInstanceOf[RaycasterParameters]
  }
}

