package typings.vis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataGroupOptions extends StObject {
  
  var drawPoints: js.UndefOr[Graph2dDrawPointsOption | js.Function0[Unit]] = js.undefined
  
  // TODO
  var excludeFromLegend: js.UndefOr[Boolean] = js.undefined
  
  var interpolation: js.UndefOr[Boolean | InterpolationOptions] = js.undefined
  
  var shaded: js.UndefOr[Graph2dShadedOption] = js.undefined
  
  var style: js.UndefOr[String] = js.undefined
  
  var yAxisOrientation: js.UndefOr[RightLeftEnumType] = js.undefined
}
object DataGroupOptions {
  
  inline def apply(): DataGroupOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataGroupOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataGroupOptions] (val x: Self) extends AnyVal {
    
    inline def setDrawPoints(value: Graph2dDrawPointsOption | js.Function0[Unit]): Self = StObject.set(x, "drawPoints", value.asInstanceOf[js.Any])
    
    inline def setDrawPointsFunction0(value: () => Unit): Self = StObject.set(x, "drawPoints", js.Any.fromFunction0(value))
    
    inline def setDrawPointsUndefined: Self = StObject.set(x, "drawPoints", js.undefined)
    
    inline def setExcludeFromLegend(value: Boolean): Self = StObject.set(x, "excludeFromLegend", value.asInstanceOf[js.Any])
    
    inline def setExcludeFromLegendUndefined: Self = StObject.set(x, "excludeFromLegend", js.undefined)
    
    inline def setInterpolation(value: Boolean | InterpolationOptions): Self = StObject.set(x, "interpolation", value.asInstanceOf[js.Any])
    
    inline def setInterpolationUndefined: Self = StObject.set(x, "interpolation", js.undefined)
    
    inline def setShaded(value: Graph2dShadedOption): Self = StObject.set(x, "shaded", value.asInstanceOf[js.Any])
    
    inline def setShadedUndefined: Self = StObject.set(x, "shaded", js.undefined)
    
    inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setYAxisOrientation(value: RightLeftEnumType): Self = StObject.set(x, "yAxisOrientation", value.asInstanceOf[js.Any])
    
    inline def setYAxisOrientationUndefined: Self = StObject.set(x, "yAxisOrientation", js.undefined)
  }
}
