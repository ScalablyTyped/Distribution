package typings.teechart.Tee

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IImage extends StObject {
  
  var chart: IChart = js.native
  
  var url: String = js.native
  
  var visible: Boolean = js.native
}
object IImage {
  
  @scala.inline
  def apply(chart: IChart, url: String, visible: Boolean): IImage = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[IImage]
  }
  
  @scala.inline
  implicit class IImageMutableBuilder[Self <: IImage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChart(value: IChart): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
  }
}
