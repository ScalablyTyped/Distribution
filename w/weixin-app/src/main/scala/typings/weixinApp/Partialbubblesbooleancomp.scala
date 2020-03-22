package typings.weixinApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  bubbles  :boolean,   composed  :boolean,   capturePhase  :boolean}> */
trait Partialbubblesbooleancomp extends js.Object {
  var bubbles: js.UndefOr[Boolean] = js.undefined
  var capturePhase: js.UndefOr[Boolean] = js.undefined
  var composed: js.UndefOr[Boolean] = js.undefined
}

object Partialbubblesbooleancomp {
  @scala.inline
  def apply(
    bubbles: js.UndefOr[Boolean] = js.undefined,
    capturePhase: js.UndefOr[Boolean] = js.undefined,
    composed: js.UndefOr[Boolean] = js.undefined
  ): Partialbubblesbooleancomp = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bubbles)) __obj.updateDynamic("bubbles")(bubbles.asInstanceOf[js.Any])
    if (!js.isUndefined(capturePhase)) __obj.updateDynamic("capturePhase")(capturePhase.asInstanceOf[js.Any])
    if (!js.isUndefined(composed)) __obj.updateDynamic("composed")(composed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Partialbubblesbooleancomp]
  }
}

