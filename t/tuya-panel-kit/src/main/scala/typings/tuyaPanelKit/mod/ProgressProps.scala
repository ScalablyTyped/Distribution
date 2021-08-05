package typings.tuyaPanelKit.mod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactNode
import typings.tuyaPanelKit.themeMod.StopsProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProgressProps
  extends StObject
     with GestureProps {
  
  var andDegree: js.UndefOr[Double] = js.undefined
  
  var backColor: js.UndefOr[String] = js.undefined
  
  var backStrokeOpacity: js.UndefOr[Double] = js.undefined
  
  var foreColor: js.UndefOr[String | js.Array[StopsProps] | StringDictionary[String]] = js.undefined
  
  var foreStrokeOpacity: js.UndefOr[Double] = js.undefined
  
  var gradientId: js.UndefOr[String] = js.undefined
  
  var max: js.UndefOr[Double] = js.undefined
  
  var min: js.UndefOr[Double] = js.undefined
  
  var renderCenterView: js.UndefOr[ReactNode] = js.undefined
  
  var scaleHeight: js.UndefOr[Double] = js.undefined
  
  var startDegree: js.UndefOr[Double] = js.undefined
  
  var stepValue: js.UndefOr[Double] = js.undefined
  
  var x1: js.UndefOr[String] = js.undefined
  
  var x2: js.UndefOr[String] = js.undefined
  
  var y1: js.UndefOr[String] = js.undefined
  
  var y2: js.UndefOr[String] = js.undefined
}
object ProgressProps {
  
  inline def apply(): ProgressProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProgressProps]
  }
  
  extension [Self <: ProgressProps](x: Self) {
    
    inline def setAndDegree(value: Double): Self = StObject.set(x, "andDegree", value.asInstanceOf[js.Any])
    
    inline def setAndDegreeUndefined: Self = StObject.set(x, "andDegree", js.undefined)
    
    inline def setBackColor(value: String): Self = StObject.set(x, "backColor", value.asInstanceOf[js.Any])
    
    inline def setBackColorUndefined: Self = StObject.set(x, "backColor", js.undefined)
    
    inline def setBackStrokeOpacity(value: Double): Self = StObject.set(x, "backStrokeOpacity", value.asInstanceOf[js.Any])
    
    inline def setBackStrokeOpacityUndefined: Self = StObject.set(x, "backStrokeOpacity", js.undefined)
    
    inline def setForeColor(value: String | js.Array[StopsProps] | StringDictionary[String]): Self = StObject.set(x, "foreColor", value.asInstanceOf[js.Any])
    
    inline def setForeColorUndefined: Self = StObject.set(x, "foreColor", js.undefined)
    
    inline def setForeColorVarargs(value: StopsProps*): Self = StObject.set(x, "foreColor", js.Array(value :_*))
    
    inline def setForeStrokeOpacity(value: Double): Self = StObject.set(x, "foreStrokeOpacity", value.asInstanceOf[js.Any])
    
    inline def setForeStrokeOpacityUndefined: Self = StObject.set(x, "foreStrokeOpacity", js.undefined)
    
    inline def setGradientId(value: String): Self = StObject.set(x, "gradientId", value.asInstanceOf[js.Any])
    
    inline def setGradientIdUndefined: Self = StObject.set(x, "gradientId", js.undefined)
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setRenderCenterView(value: ReactNode): Self = StObject.set(x, "renderCenterView", value.asInstanceOf[js.Any])
    
    inline def setRenderCenterViewUndefined: Self = StObject.set(x, "renderCenterView", js.undefined)
    
    inline def setScaleHeight(value: Double): Self = StObject.set(x, "scaleHeight", value.asInstanceOf[js.Any])
    
    inline def setScaleHeightUndefined: Self = StObject.set(x, "scaleHeight", js.undefined)
    
    inline def setStartDegree(value: Double): Self = StObject.set(x, "startDegree", value.asInstanceOf[js.Any])
    
    inline def setStartDegreeUndefined: Self = StObject.set(x, "startDegree", js.undefined)
    
    inline def setStepValue(value: Double): Self = StObject.set(x, "stepValue", value.asInstanceOf[js.Any])
    
    inline def setStepValueUndefined: Self = StObject.set(x, "stepValue", js.undefined)
    
    inline def setX1(value: String): Self = StObject.set(x, "x1", value.asInstanceOf[js.Any])
    
    inline def setX1Undefined: Self = StObject.set(x, "x1", js.undefined)
    
    inline def setX2(value: String): Self = StObject.set(x, "x2", value.asInstanceOf[js.Any])
    
    inline def setX2Undefined: Self = StObject.set(x, "x2", js.undefined)
    
    inline def setY1(value: String): Self = StObject.set(x, "y1", value.asInstanceOf[js.Any])
    
    inline def setY1Undefined: Self = StObject.set(x, "y1", js.undefined)
    
    inline def setY2(value: String): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
    
    inline def setY2Undefined: Self = StObject.set(x, "y2", js.undefined)
  }
}
