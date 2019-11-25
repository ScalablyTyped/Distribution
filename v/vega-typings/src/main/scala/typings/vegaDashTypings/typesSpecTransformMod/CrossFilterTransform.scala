package typings.vegaDashTypings.typesSpecTransformMod

import typings.vegaDashTypings.typesSpecSignalMod.SignalRef
import typings.vegaDashTypings.typesSpecUtilMod.Vector2
import typings.vegaDashTypings.vegaDashTypingsStrings.crossfilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CrossFilterTransform extends _Transforms {
  var fields: (js.Array[String | TransformField]) | SignalRef
  var query: (js.Array[(Vector2[Double | SignalRef]) | SignalRef]) | SignalRef
  var signal: js.UndefOr[SignalName] = js.undefined
  var `type`: crossfilter
}

object CrossFilterTransform {
  @scala.inline
  def apply(
    fields: (js.Array[String | TransformField]) | SignalRef,
    query: (js.Array[(Vector2[Double | SignalRef]) | SignalRef]) | SignalRef,
    `type`: crossfilter,
    signal: SignalName = null
  ): CrossFilterTransform = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (signal != null) __obj.updateDynamic("signal")(signal.asInstanceOf[js.Any])
    __obj.asInstanceOf[CrossFilterTransform]
  }
}

