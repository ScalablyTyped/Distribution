package typings.vis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataGroupOptions extends js.Object {
  
  var drawPoints: js.UndefOr[Graph2dDrawPointsOption | js.Function0[Unit]] = js.native
  
   // TODO
  var excludeFromLegend: js.UndefOr[Boolean] = js.native
  
  var interpolation: js.UndefOr[Boolean | InterpolationOptions] = js.native
  
  var shaded: js.UndefOr[Graph2dShadedOption] = js.native
  
  var style: js.UndefOr[String] = js.native
  
  var yAxisOrientation: js.UndefOr[RightLeftEnumType] = js.native
}
object DataGroupOptions {
  
  @scala.inline
  def apply(): DataGroupOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataGroupOptions]
  }
  
  @scala.inline
  implicit class DataGroupOptionsOps[Self <: DataGroupOptions] (val x: Self) extends AnyVal {
    
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
    def setDrawPointsFunction0(value: () => Unit): Self = this.set("drawPoints", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDrawPoints(value: Graph2dDrawPointsOption | js.Function0[Unit]): Self = this.set("drawPoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDrawPoints: Self = this.set("drawPoints", js.undefined)
    
    @scala.inline
    def setExcludeFromLegend(value: Boolean): Self = this.set("excludeFromLegend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludeFromLegend: Self = this.set("excludeFromLegend", js.undefined)
    
    @scala.inline
    def setInterpolation(value: Boolean | InterpolationOptions): Self = this.set("interpolation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterpolation: Self = this.set("interpolation", js.undefined)
    
    @scala.inline
    def setShaded(value: Graph2dShadedOption): Self = this.set("shaded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShaded: Self = this.set("shaded", js.undefined)
    
    @scala.inline
    def setStyle(value: String): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setYAxisOrientation(value: RightLeftEnumType): Self = this.set("yAxisOrientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYAxisOrientation: Self = this.set("yAxisOrientation", js.undefined)
  }
}
