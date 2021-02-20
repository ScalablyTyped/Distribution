package typings.teechart.Tee

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IShadow extends StObject {
  
  var blur: Double = js.native
  
  var chart: IChart = js.native
  
  var color: String = js.native
  
  var height: Double = js.native
  
  var visible: Boolean = js.native
  
  var width: Double = js.native
}
object IShadow {
  
  @scala.inline
  def apply(blur: Double, chart: IChart, color: String, height: Double, visible: Boolean, width: Double): IShadow = {
    val __obj = js.Dynamic.literal(blur = blur.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IShadow]
  }
  
  @scala.inline
  implicit class IShadowMutableBuilder[Self <: IShadow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlur(value: Double): Self = StObject.set(x, "blur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChart(value: IChart): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
