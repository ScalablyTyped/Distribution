package typings.teechart.Tee

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBubbleData
  extends StObject
     with ISeriesData {
  
  var radius: js.Array[Double]
}
object IBubbleData {
  
  inline def apply(labels: js.Array[String], radius: js.Array[Double], source: Any, values: js.Array[Double]): IBubbleData = {
    val __obj = js.Dynamic.literal(labels = labels.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBubbleData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IBubbleData] (val x: Self) extends AnyVal {
    
    inline def setRadius(value: js.Array[Double]): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setRadiusVarargs(value: Double*): Self = StObject.set(x, "radius", js.Array(value*))
  }
}
