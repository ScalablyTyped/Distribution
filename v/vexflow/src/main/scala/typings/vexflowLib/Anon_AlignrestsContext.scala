package typings
package vexflowLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AlignrestsContext extends js.Object {
  var align_rests: js.UndefOr[scala.Boolean] = js.undefined
  var context: vexflowLib.VexNs.IRenderContext
}

object Anon_AlignrestsContext {
  @scala.inline
  def apply(context: vexflowLib.VexNs.IRenderContext, align_rests: js.UndefOr[scala.Boolean] = js.undefined): Anon_AlignrestsContext = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("context")(context)
    if (!js.isUndefined(align_rests)) __obj.updateDynamic("align_rests")(align_rests)
    __obj.asInstanceOf[Anon_AlignrestsContext]
  }
}

