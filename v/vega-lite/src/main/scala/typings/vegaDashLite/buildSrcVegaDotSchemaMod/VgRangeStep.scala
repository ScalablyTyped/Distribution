package typings.vegaDashLite.buildSrcVegaDotSchemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VgRangeStep extends _VgRange {
  var step: Double | VgSignalRef
}

object VgRangeStep {
  @scala.inline
  def apply(step: Double | VgSignalRef): VgRangeStep = {
    val __obj = js.Dynamic.literal(step = step.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VgRangeStep]
  }
}

