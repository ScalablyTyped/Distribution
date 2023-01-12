package typings.tuyaPanelKit.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpaceProps
  extends StObject
     with ProgressProps {
  
  /**
    * @language zh-CN
    * @description 滑动结束回调
    * @defaultValue undefined
    */
  /**
    * @language en-US
    * @description Callback of ending the slide.
    * @defaultValue undefined
    */
  var onSlidingComplete: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 值改变的回调
    * @defaultValue () => {}
    */
  /**
    * @language en-US
    * @description Callback of value change
    * @defaultValue () => {}
    */
  var onValueChange: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 进度条渲染线条的数目
    * @defaultValue 120
    */
  /**
    * @language en-US
    * @description The number of rendering lines of the progress bar.
    * @defaultValue 120
    */
  var scaleNumber: js.UndefOr[Double] = js.undefined
  
  /**
    * @language zh-CN
    * @description 进度条块状的宽度
    * @defaultValue 0
    */
  /**
    * @language en-US
    * @description Width of progress bar block
    * @defaultValue 0
    */
  var strokeWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * @language zh-CN
    * @description 具体值
    * @defaultValue 50
    */
  /**
    * @language en-US
    * @description Value
    * @defaultValue 50
    */
  var value: js.UndefOr[Double] = js.undefined
}
object SpaceProps {
  
  inline def apply(): SpaceProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpaceProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SpaceProps] (val x: Self) extends AnyVal {
    
    inline def setOnSlidingComplete(value: /* value */ Double => Unit): Self = StObject.set(x, "onSlidingComplete", js.Any.fromFunction1(value))
    
    inline def setOnSlidingCompleteUndefined: Self = StObject.set(x, "onSlidingComplete", js.undefined)
    
    inline def setOnValueChange(value: /* value */ Double => Unit): Self = StObject.set(x, "onValueChange", js.Any.fromFunction1(value))
    
    inline def setOnValueChangeUndefined: Self = StObject.set(x, "onValueChange", js.undefined)
    
    inline def setScaleNumber(value: Double): Self = StObject.set(x, "scaleNumber", value.asInstanceOf[js.Any])
    
    inline def setScaleNumberUndefined: Self = StObject.set(x, "scaleNumber", js.undefined)
    
    inline def setStrokeWidth(value: Double): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
    
    inline def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
