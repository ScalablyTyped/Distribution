package typings.vegaDashTypings.typesSpecTransformMod

import typings.vegaDashTypings.typesSpecSignalMod.SignalRef
import typings.vegaDashTypings.vegaDashTypingsStrings.sequence
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SequenceTransform extends _Transforms {
  var as: js.UndefOr[String | SignalRef] = js.undefined
  var start: Double | SignalRef
  var step: js.UndefOr[Double | SignalRef] = js.undefined
  var stop: Double | SignalRef
  var `type`: sequence
}

object SequenceTransform {
  @scala.inline
  def apply(
    start: Double | SignalRef,
    stop: Double | SignalRef,
    `type`: sequence,
    as: String | SignalRef = null,
    step: Double | SignalRef = null
  ): SequenceTransform = {
    val __obj = js.Dynamic.literal(start = start.asInstanceOf[js.Any], stop = stop.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    __obj.asInstanceOf[SequenceTransform]
  }
}

