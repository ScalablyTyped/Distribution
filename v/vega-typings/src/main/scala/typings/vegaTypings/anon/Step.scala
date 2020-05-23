package typings.vegaTypings.anon

import typings.vegaTypings.scaleMod._RangeBand
import typings.vegaTypings.signalMod.SignalRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Step extends _RangeBand {
  var step: Double | SignalRef
}

object Step {
  @scala.inline
  def apply(step: Double | SignalRef): Step = {
    val __obj = js.Dynamic.literal(step = step.asInstanceOf[js.Any])
    __obj.asInstanceOf[Step]
  }
}

