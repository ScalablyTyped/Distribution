package typings.vexflow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetContext extends js.Object {
  var getContext: js.Function
  var getMetrics: js.Function
  var renderToStave: js.Function
  var setStave: js.Function
}

object GetContext {
  @scala.inline
  def apply(
    getContext: js.Function,
    getMetrics: js.Function,
    renderToStave: js.Function,
    setStave: js.Function
  ): GetContext = {
    val __obj = js.Dynamic.literal(getContext = getContext.asInstanceOf[js.Any], getMetrics = getMetrics.asInstanceOf[js.Any], renderToStave = renderToStave.asInstanceOf[js.Any], setStave = setStave.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetContext]
  }
}

