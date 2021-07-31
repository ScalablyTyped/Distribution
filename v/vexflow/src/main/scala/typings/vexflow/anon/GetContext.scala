package typings.vexflow.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetContext extends StObject {
  
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
  
  @scala.inline
  implicit class GetContextMutableBuilder[Self <: GetContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetContext(value: js.Function): Self = StObject.set(x, "getContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetMetrics(value: js.Function): Self = StObject.set(x, "getMetrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderToStave(value: js.Function): Self = StObject.set(x, "renderToStave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetStave(value: js.Function): Self = StObject.set(x, "setStave", value.asInstanceOf[js.Any])
  }
}
