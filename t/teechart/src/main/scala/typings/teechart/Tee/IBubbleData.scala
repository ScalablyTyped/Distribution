package typings.teechart.Tee

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBubbleData extends ISeriesData {
  
  var radius: js.Array[Double] = js.native
}
object IBubbleData {
  
  @scala.inline
  def apply(labels: js.Array[String], radius: js.Array[Double], source: js.Any, values: js.Array[Double]): IBubbleData = {
    val __obj = js.Dynamic.literal(labels = labels.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBubbleData]
  }
  
  @scala.inline
  implicit class IBubbleDataMutableBuilder[Self <: IBubbleData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRadius(value: js.Array[Double]): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadiusVarargs(value: Double*): Self = StObject.set(x, "radius", js.Array(value :_*))
  }
}
