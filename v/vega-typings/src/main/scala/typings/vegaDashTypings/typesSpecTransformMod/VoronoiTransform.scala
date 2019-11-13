package typings.vegaDashTypings.typesSpecTransformMod

import typings.vegaDashTypings.typesSpecSignalMod.SignalRef
import typings.vegaDashTypings.typesSpecUtilMod.Vector2
import typings.vegaDashTypings.vegaDashTypingsStrings.voronoi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VoronoiTransform extends Transforms {
  var as: js.UndefOr[String | SignalRef] = js.undefined
  var extent: js.UndefOr[(Vector2[(Vector2[Double | SignalRef]) | SignalRef]) | SignalRef] = js.undefined
  var size: js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef] = js.undefined
  var `type`: voronoi
  var x: FieldRef
  var y: FieldRef
}

object VoronoiTransform {
  @scala.inline
  def apply(
    `type`: voronoi,
    x: FieldRef,
    y: FieldRef,
    as: String | SignalRef = null,
    extent: (Vector2[(Vector2[Double | SignalRef]) | SignalRef]) | SignalRef = null,
    size: (Vector2[Double | SignalRef]) | SignalRef = null
  ): VoronoiTransform = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (extent != null) __obj.updateDynamic("extent")(extent.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoronoiTransform]
  }
}

