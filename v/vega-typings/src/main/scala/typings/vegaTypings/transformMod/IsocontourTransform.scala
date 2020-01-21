package typings.vegaTypings.transformMod

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.vegaTypingsStrings.independent
import typings.vegaTypings.vegaTypingsStrings.isocontour
import typings.vegaTypings.vegaTypingsStrings.shared
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IsocontourTransform extends _Transforms {
  var as: js.UndefOr[String | Null | SignalRef] = js.undefined
  var field: js.UndefOr[String | TransformField] = js.undefined
  var levels: js.UndefOr[Double | SignalRef] = js.undefined
  var nice: js.UndefOr[Boolean | SignalRef] = js.undefined
  var resolve: js.UndefOr[shared | independent | SignalRef] = js.undefined
  var scale: js.UndefOr[Double | TransformField] = js.undefined
  var smooth: js.UndefOr[Boolean | SignalRef] = js.undefined
  var thresholds: js.UndefOr[(js.Array[Double | SignalRef]) | SignalRef] = js.undefined
  var translate: js.UndefOr[js.Array[Double] | TransformField] = js.undefined
  var `type`: isocontour
  var zero: js.UndefOr[Boolean | SignalRef] = js.undefined
}

object IsocontourTransform {
  @scala.inline
  def apply(
    `type`: isocontour,
    as: String | SignalRef = null,
    field: String | TransformField = null,
    levels: Double | SignalRef = null,
    nice: Boolean | SignalRef = null,
    resolve: shared | independent | SignalRef = null,
    scale: Double | TransformField = null,
    smooth: Boolean | SignalRef = null,
    thresholds: (js.Array[Double | SignalRef]) | SignalRef = null,
    translate: js.Array[Double] | TransformField = null,
    zero: Boolean | SignalRef = null
  ): IsocontourTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (levels != null) __obj.updateDynamic("levels")(levels.asInstanceOf[js.Any])
    if (nice != null) __obj.updateDynamic("nice")(nice.asInstanceOf[js.Any])
    if (resolve != null) __obj.updateDynamic("resolve")(resolve.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (smooth != null) __obj.updateDynamic("smooth")(smooth.asInstanceOf[js.Any])
    if (thresholds != null) __obj.updateDynamic("thresholds")(thresholds.asInstanceOf[js.Any])
    if (translate != null) __obj.updateDynamic("translate")(translate.asInstanceOf[js.Any])
    if (zero != null) __obj.updateDynamic("zero")(zero.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsocontourTransform]
  }
}

