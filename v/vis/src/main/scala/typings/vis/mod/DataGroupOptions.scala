package typings.vis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataGroupOptions extends StObject {
  
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
  implicit class DataGroupOptionsMutableBuilder[Self <: DataGroupOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDrawPoints(value: Graph2dDrawPointsOption | js.Function0[Unit]): Self = StObject.set(x, "drawPoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrawPointsFunction0(value: () => Unit): Self = StObject.set(x, "drawPoints", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDrawPointsUndefined: Self = StObject.set(x, "drawPoints", js.undefined)
    
    @scala.inline
    def setExcludeFromLegend(value: Boolean): Self = StObject.set(x, "excludeFromLegend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeFromLegendUndefined: Self = StObject.set(x, "excludeFromLegend", js.undefined)
    
    @scala.inline
    def setInterpolation(value: Boolean | InterpolationOptions): Self = StObject.set(x, "interpolation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterpolationUndefined: Self = StObject.set(x, "interpolation", js.undefined)
    
    @scala.inline
    def setShaded(value: Graph2dShadedOption): Self = StObject.set(x, "shaded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadedUndefined: Self = StObject.set(x, "shaded", js.undefined)
    
    @scala.inline
    def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setYAxisOrientation(value: RightLeftEnumType): Self = StObject.set(x, "yAxisOrientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYAxisOrientationUndefined: Self = StObject.set(x, "yAxisOrientation", js.undefined)
  }
}
