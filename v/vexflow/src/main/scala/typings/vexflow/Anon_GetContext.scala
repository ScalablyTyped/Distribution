package typings.vexflow

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
    val __obj = js.Dynamic.literal(getContext = getContext.asInstanceOf[js.Any], getMetrics = getMetrics.asInstanceOf[js.Any], renderToStave = renderToStave.asInstanceOf[js.Any], setStave = setStave.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_GetContext]
  }
}

