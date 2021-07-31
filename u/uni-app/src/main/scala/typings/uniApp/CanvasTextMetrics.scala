package typings.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanvasTextMetrics extends StObject {
  
  /**
    * 文本的宽度
    */
  var width: js.UndefOr[Double] = js.undefined
}
object CanvasTextMetrics {
  
  @scala.inline
  def apply(): CanvasTextMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CanvasTextMetrics]
  }
  
  @scala.inline
  implicit class CanvasTextMetricsMutableBuilder[Self <: CanvasTextMetrics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
