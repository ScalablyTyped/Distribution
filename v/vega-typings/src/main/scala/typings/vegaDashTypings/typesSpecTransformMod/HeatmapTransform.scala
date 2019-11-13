package typings.vegaDashTypings.typesSpecTransformMod

import typings.vegaDashTypings.typesSpecSignalMod.SignalRef
import typings.vegaDashTypings.vegaDashTypingsStrings.heatmap
import typings.vegaDashTypings.vegaDashTypingsStrings.independent
import typings.vegaDashTypings.vegaDashTypingsStrings.shared
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeatmapTransform extends Transforms {
  var as: js.UndefOr[String | SignalRef] = js.undefined
  var color: js.UndefOr[String | TransformField] = js.undefined
  var field: js.UndefOr[String | TransformField] = js.undefined
  var opacity: js.UndefOr[Double | TransformField] = js.undefined
  var resolve: js.UndefOr[independent | shared | SignalRef] = js.undefined
  var `type`: heatmap
}

object HeatmapTransform {
  @scala.inline
  def apply(
    `type`: heatmap,
    as: String | SignalRef = null,
    color: String | TransformField = null,
    field: String | TransformField = null,
    opacity: Double | TransformField = null,
    resolve: independent | shared | SignalRef = null
  ): HeatmapTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (resolve != null) __obj.updateDynamic("resolve")(resolve.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeatmapTransform]
  }
}

