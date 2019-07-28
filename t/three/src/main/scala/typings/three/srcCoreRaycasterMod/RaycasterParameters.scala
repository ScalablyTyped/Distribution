package typings.three.srcCoreRaycasterMod

import typings.three.Anon_Threshold
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RaycasterParameters extends js.Object {
  var LOD: js.UndefOr[js.Any] = js.undefined
  var Line: js.UndefOr[js.Any] = js.undefined
  var Mesh: js.UndefOr[js.Any] = js.undefined
  var Points: js.UndefOr[Anon_Threshold] = js.undefined
  var Sprite: js.UndefOr[js.Any] = js.undefined
}

object RaycasterParameters {
  @scala.inline
  def apply(
    LOD: js.Any = null,
    Line: js.Any = null,
    Mesh: js.Any = null,
    Points: Anon_Threshold = null,
    Sprite: js.Any = null
  ): RaycasterParameters = {
    val __obj = js.Dynamic.literal()
    if (LOD != null) __obj.updateDynamic("LOD")(LOD)
    if (Line != null) __obj.updateDynamic("Line")(Line)
    if (Mesh != null) __obj.updateDynamic("Mesh")(Mesh)
    if (Points != null) __obj.updateDynamic("Points")(Points)
    if (Sprite != null) __obj.updateDynamic("Sprite")(Sprite)
    __obj.asInstanceOf[RaycasterParameters]
  }
}

