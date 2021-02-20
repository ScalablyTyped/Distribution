package typings.teechart.Tee

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMinorTicks extends ITicks {
  
  var count: Double = js.native
}
object IMinorTicks {
  
  @scala.inline
  def apply(chart: IChart, count: Double, length: Double, stroke: IStroke, visible: Boolean): IMinorTicks = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], stroke = stroke.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMinorTicks]
  }
  
  @scala.inline
  implicit class IMinorTicksMutableBuilder[Self <: IMinorTicks] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
  }
}
