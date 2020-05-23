package typings.vexflow.anon

import typings.vexflow.Vex.IRenderContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context extends js.Object {
  var align_rests: js.UndefOr[Boolean] = js.undefined
  var context: IRenderContext
}

object Context {
  @scala.inline
  def apply(context: IRenderContext, align_rests: js.UndefOr[Boolean] = js.undefined): Context = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any])
    if (!js.isUndefined(align_rests)) __obj.updateDynamic("align_rests")(align_rests.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context]
  }
}

