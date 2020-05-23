package typings.three.raycasterMod

import typings.three.anon.Threshold
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RaycasterParameters extends js.Object {
  var LOD: js.UndefOr[js.Any] = js.undefined
  var Line: js.UndefOr[Threshold] = js.undefined
  var Mesh: js.UndefOr[js.Any] = js.undefined
  var Points: js.UndefOr[Threshold] = js.undefined
  var Sprite: js.UndefOr[js.Any] = js.undefined
}

object RaycasterParameters {
  @scala.inline
  def apply(
    LOD: js.Any = null,
    Line: Threshold = null,
    Mesh: js.Any = null,
    Points: Threshold = null,
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

