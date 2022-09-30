package typings.victoryCore.anon

import typings.victoryCore.callbacksMod.CallbackArgs
import typings.victoryCore.callbacksMod.NumberOrCallback
import typings.victoryCore.callbacksMod.OrientationOrCallback
import typings.victoryCore.callbacksMod.PaddingOrCallback
import typings.victoryCore.victoryThemeTypesMod.BlockProps
import typings.victoryCore.victoryThemeTypesMod.OrientationTypes
import typings.victoryCore.victoryThemeTypesMod.VictoryLabelStyleObject
import typings.victoryCore.victoryThemeTypesMod.VictoryStyleObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CornerRadius extends StObject {
  
  var cornerRadius: js.UndefOr[NumberOrCallback] = js.undefined
  
  var flyoutHeight: js.UndefOr[NumberOrCallback] = js.undefined
  
  var flyoutPadding: js.UndefOr[PaddingOrCallback] = js.undefined
  
  var flyoutStyle: js.UndefOr[VictoryStyleObject] = js.undefined
  
  var flyoutWidth: js.UndefOr[NumberOrCallback] = js.undefined
  
  var orientation: js.UndefOr[OrientationOrCallback] = js.undefined
  
  var pointerLength: js.UndefOr[NumberOrCallback] = js.undefined
  
  var pointerOrientation: js.UndefOr[OrientationOrCallback] = js.undefined
  
  var style: js.UndefOr[VictoryLabelStyleObject | js.Array[VictoryLabelStyleObject]] = js.undefined
}
object CornerRadius {
  
  inline def apply(): CornerRadius = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CornerRadius]
  }
  
  extension [Self <: CornerRadius](x: Self) {
    
    inline def setCornerRadius(value: NumberOrCallback): Self = StObject.set(x, "cornerRadius", value.asInstanceOf[js.Any])
    
    inline def setCornerRadiusFunction1(value: /* args */ CallbackArgs => Double): Self = StObject.set(x, "cornerRadius", js.Any.fromFunction1(value))
    
    inline def setCornerRadiusUndefined: Self = StObject.set(x, "cornerRadius", js.undefined)
    
    inline def setFlyoutHeight(value: NumberOrCallback): Self = StObject.set(x, "flyoutHeight", value.asInstanceOf[js.Any])
    
    inline def setFlyoutHeightFunction1(value: /* args */ CallbackArgs => Double): Self = StObject.set(x, "flyoutHeight", js.Any.fromFunction1(value))
    
    inline def setFlyoutHeightUndefined: Self = StObject.set(x, "flyoutHeight", js.undefined)
    
    inline def setFlyoutPadding(value: PaddingOrCallback): Self = StObject.set(x, "flyoutPadding", value.asInstanceOf[js.Any])
    
    inline def setFlyoutPaddingFunction1(value: /* args */ CallbackArgs => Double | BlockProps): Self = StObject.set(x, "flyoutPadding", js.Any.fromFunction1(value))
    
    inline def setFlyoutPaddingUndefined: Self = StObject.set(x, "flyoutPadding", js.undefined)
    
    inline def setFlyoutStyle(value: VictoryStyleObject): Self = StObject.set(x, "flyoutStyle", value.asInstanceOf[js.Any])
    
    inline def setFlyoutStyleUndefined: Self = StObject.set(x, "flyoutStyle", js.undefined)
    
    inline def setFlyoutWidth(value: NumberOrCallback): Self = StObject.set(x, "flyoutWidth", value.asInstanceOf[js.Any])
    
    inline def setFlyoutWidthFunction1(value: /* args */ CallbackArgs => Double): Self = StObject.set(x, "flyoutWidth", js.Any.fromFunction1(value))
    
    inline def setFlyoutWidthUndefined: Self = StObject.set(x, "flyoutWidth", js.undefined)
    
    inline def setOrientation(value: OrientationOrCallback): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationFunction1(value: /* args */ CallbackArgs => OrientationTypes): Self = StObject.set(x, "orientation", js.Any.fromFunction1(value))
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    inline def setPointerLength(value: NumberOrCallback): Self = StObject.set(x, "pointerLength", value.asInstanceOf[js.Any])
    
    inline def setPointerLengthFunction1(value: /* args */ CallbackArgs => Double): Self = StObject.set(x, "pointerLength", js.Any.fromFunction1(value))
    
    inline def setPointerLengthUndefined: Self = StObject.set(x, "pointerLength", js.undefined)
    
    inline def setPointerOrientation(value: OrientationOrCallback): Self = StObject.set(x, "pointerOrientation", value.asInstanceOf[js.Any])
    
    inline def setPointerOrientationFunction1(value: /* args */ CallbackArgs => OrientationTypes): Self = StObject.set(x, "pointerOrientation", js.Any.fromFunction1(value))
    
    inline def setPointerOrientationUndefined: Self = StObject.set(x, "pointerOrientation", js.undefined)
    
    inline def setStyle(value: VictoryLabelStyleObject | js.Array[VictoryLabelStyleObject]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setStyleVarargs(value: VictoryLabelStyleObject*): Self = StObject.set(x, "style", js.Array(value*))
  }
}
