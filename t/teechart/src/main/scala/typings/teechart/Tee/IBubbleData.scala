package typings.teechart.Tee

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
  implicit class IBubbleDataOps[Self <: IBubbleData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRadiusVarargs(value: Double*): Self = this.set("radius", js.Array(value :_*))
    
    @scala.inline
    def setRadius(value: js.Array[Double]): Self = this.set("radius", value.asInstanceOf[js.Any])
  }
}
