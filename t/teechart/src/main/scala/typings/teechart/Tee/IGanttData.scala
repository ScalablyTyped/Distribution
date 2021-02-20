package typings.teechart.Tee

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGanttData extends ISeriesData {
  
  var end: js.Array[Double] = js.native
  
  var start: js.Array[Double] = js.native
  
  var x: js.Array[Double] = js.native
}
object IGanttData {
  
  @scala.inline
  def apply(
    end: js.Array[Double],
    labels: js.Array[String],
    source: js.Any,
    start: js.Array[Double],
    values: js.Array[Double],
    x: js.Array[Double]
  ): IGanttData = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGanttData]
  }
  
  @scala.inline
  implicit class IGanttDataMutableBuilder[Self <: IGanttData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnd(value: js.Array[Double]): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndVarargs(value: Double*): Self = StObject.set(x, "end", js.Array(value :_*))
    
    @scala.inline
    def setStart(value: js.Array[Double]): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartVarargs(value: Double*): Self = StObject.set(x, "start", js.Array(value :_*))
    
    @scala.inline
    def setX(value: js.Array[Double]): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXVarargs(value: Double*): Self = StObject.set(x, "x", js.Array(value :_*))
  }
}
