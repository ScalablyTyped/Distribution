package typings.vexflow

import typings.vexflow.VexNs.IRenderContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AlignrestsContext extends js.Object {
  var align_rests: js.UndefOr[Boolean] = js.undefined
  var context: IRenderContext
}

object Anon_AlignrestsContext {
  @scala.inline
  def apply(context: IRenderContext, align_rests: js.UndefOr[Boolean] = js.undefined): Anon_AlignrestsContext = {
    val __obj = js.Dynamic.literal(context = context)
    if (!js.isUndefined(align_rests)) __obj.updateDynamic("align_rests")(align_rests)
    __obj.asInstanceOf[Anon_AlignrestsContext]
  }
}

