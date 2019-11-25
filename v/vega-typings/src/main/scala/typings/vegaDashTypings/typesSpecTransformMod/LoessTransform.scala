package typings.vegaDashTypings.typesSpecTransformMod

import typings.vegaDashTypings.typesSpecSignalMod.SignalRef
import typings.vegaDashTypings.typesSpecUtilMod.Vector2
import typings.vegaDashTypings.vegaDashTypingsStrings.loess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoessTransform extends _Transforms {
  var as: js.UndefOr[(Vector2[String | SignalRef]) | SignalRef] = js.undefined
  var bandwidth: js.UndefOr[Double | SignalRef] = js.undefined
  var groupby: js.UndefOr[js.Array[FieldRef] | SignalRef] = js.undefined
  var `type`: loess
  var x: FieldRef
  var y: FieldRef
}

object LoessTransform {
  @scala.inline
  def apply(
    `type`: loess,
    x: FieldRef,
    y: FieldRef,
    as: (Vector2[String | SignalRef]) | SignalRef = null,
    bandwidth: Double | SignalRef = null,
    groupby: js.Array[FieldRef] | SignalRef = null
  ): LoessTransform = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (bandwidth != null) __obj.updateDynamic("bandwidth")(bandwidth.asInstanceOf[js.Any])
    if (groupby != null) __obj.updateDynamic("groupby")(groupby.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoessTransform]
  }
}

