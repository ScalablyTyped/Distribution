package typings.teechart.Tee

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISeriesData extends StObject {
  
  var labels: js.Array[String] = js.native
  
  var source: js.Any = js.native
  
  var values: js.Array[Double] = js.native
}
object ISeriesData {
  
  @scala.inline
  def apply(labels: js.Array[String], source: js.Any, values: js.Array[Double]): ISeriesData = {
    val __obj = js.Dynamic.literal(labels = labels.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISeriesData]
  }
  
  @scala.inline
  implicit class ISeriesDataMutableBuilder[Self <: ISeriesData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabels(value: js.Array[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsVarargs(value: String*): Self = StObject.set(x, "labels", js.Array(value :_*))
    
    @scala.inline
    def setSource(value: js.Any): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValues(value: js.Array[Double]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesVarargs(value: Double*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
