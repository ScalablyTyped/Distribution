package typings
package vexflowLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GetContext extends js.Object {
  var getContext: js.Function
  var getMetrics: js.Function
  var renderToStave: js.Function
  var setStave: js.Function
}

object Anon_GetContext {
  @scala.inline
  def apply(
    getContext: js.Function,
    getMetrics: js.Function,
    renderToStave: js.Function,
    setStave: js.Function
  ): Anon_GetContext = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getContext")(getContext)
    __obj.updateDynamic("getMetrics")(getMetrics)
    __obj.updateDynamic("renderToStave")(renderToStave)
    __obj.updateDynamic("setStave")(setStave)
    __obj.asInstanceOf[Anon_GetContext]
  }
}

