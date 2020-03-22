package typings.vexflow

import typings.vexflow.Vex.IRenderContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContext extends js.Object {
  var align_rests: js.UndefOr[Boolean] = js.undefined
  var context: IRenderContext
}

object AnonContext {
  @scala.inline
  def apply(context: IRenderContext, align_rests: js.UndefOr[Boolean] = js.undefined): AnonContext = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any])
    if (!js.isUndefined(align_rests)) __obj.updateDynamic("align_rests")(align_rests.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContext]
  }
}

