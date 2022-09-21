package typings.tuyaPanelKit.mod

import typings.tuyaPanelKit.anon.MaxValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DoubleProps
  extends StObject
     with ProgressProps {
  
  /**
    * @language zh-CN
    * @description 轨道不满360度结束的圆环颜色
    * @defaultValue "#E5E5E5"
    */
  /**
    * @language en-US
    * @description The color of the ring at the end of the track less than 360 degrees
    * @defaultValue "#E5E5E5"
    */
  var endColor: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 最大值
    * @defaultValue 25
    */
  /**
    * @language en-US
    * @description Max value
    * @defaultValue 25
    */
  var maxValue: js.UndefOr[Double] = js.undefined
  
  /**
    * @language zh-CN
    * @description 开始端 thumb 小圆球的填充色
    * @defaultValue "#fff"
    */
  /**
    * @language en-US
    * @description Fill color of thumb ball at the beginning of progress bar
    * @defaultValue "#fff"
    */
  var minThumbFill: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 开始端thumb小圆球的边框色
    * @defaultValue "#FF4800"
    */
  /**
    * @language en-US
    * @description The border color of the thumb ball at the beginning
    * @defaultValue "#FF4800"
    */
  var minThumbStroke: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 最小值
    * @defaultValue 0
    */
  /**
    * @language en-US
    * @description Min value
    * @defaultValue 0
    */
  var minValue: js.UndefOr[Double] = js.undefined
  
  /**
    * @language zh-CN
    * @description 滑动结束回调
    * @defaultValue () => {}
    */
  /**
    * @language en-US
    * @description Callback of ending the slide.
    * @defaultValue () => {}
    */
  var onSlidingComplete: js.UndefOr[js.Function1[/* argus */ MaxValue, Unit]] = js.undefined
  
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
  var onValueChange: js.UndefOr[js.Function1[/* argus */ MaxValue, Unit]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 轨道不满360度开始的圆环颜色
    * @defaultValue "#E5E5E5"
    */
  /**
    * @language en-US
    * @description The color of the ring that begins at less than 360 degrees
    * @defaultValue "#E5E5E5"
    */
  var startColor: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 结束端thumb小圆球的填充色
    * @defaultValue "#fff"
    */
  /**
    * @language en-US
    * @description Fill color of the thumb ball at the end
    * @defaultValue "#fff"
    */
  var thumbFill: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description thumb小圆球的半径
    * @defaultValue 3.5
    */
  /**
    * @language en-US
    * @description Radius of thumb ball
    * @defaultValue 3.5
    */
  var thumbRadius: js.UndefOr[Double] = js.undefined
  
  /**
    * @language zh-CN
    * @description 结束端thumb小圆球的边框色
    * @defaultValue "#FF4800"
    */
  /**
    * @language en-US
    * @description The border color of the thumb ball at the end
    * @defaultValue "#FF4800"
    */
  var thumbStroke: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description thumb 小圆球边框宽度
    * @defaultValue 2
    */
  /**
    * @language en-US
    * @description Border width of thumb ball
    * @defaultValue 2
    */
  var thumbStrokeWidth: js.UndefOr[Double] = js.undefined
}
object DoubleProps {
  
  inline def apply(): DoubleProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DoubleProps]
  }
  
  extension [Self <: DoubleProps](x: Self) {
    
    inline def setEndColor(value: String): Self = StObject.set(x, "endColor", value.asInstanceOf[js.Any])
    
    inline def setEndColorUndefined: Self = StObject.set(x, "endColor", js.undefined)
    
    inline def setMaxValue(value: Double): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
    
    inline def setMaxValueUndefined: Self = StObject.set(x, "maxValue", js.undefined)
    
    inline def setMinThumbFill(value: String): Self = StObject.set(x, "minThumbFill", value.asInstanceOf[js.Any])
    
    inline def setMinThumbFillUndefined: Self = StObject.set(x, "minThumbFill", js.undefined)
    
    inline def setMinThumbStroke(value: String): Self = StObject.set(x, "minThumbStroke", value.asInstanceOf[js.Any])
    
    inline def setMinThumbStrokeUndefined: Self = StObject.set(x, "minThumbStroke", js.undefined)
    
    inline def setMinValue(value: Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
    
    inline def setMinValueUndefined: Self = StObject.set(x, "minValue", js.undefined)
    
    inline def setOnSlidingComplete(value: /* argus */ MaxValue => Unit): Self = StObject.set(x, "onSlidingComplete", js.Any.fromFunction1(value))
    
    inline def setOnSlidingCompleteUndefined: Self = StObject.set(x, "onSlidingComplete", js.undefined)
    
    inline def setOnValueChange(value: /* argus */ MaxValue => Unit): Self = StObject.set(x, "onValueChange", js.Any.fromFunction1(value))
    
    inline def setOnValueChangeUndefined: Self = StObject.set(x, "onValueChange", js.undefined)
    
    inline def setStartColor(value: String): Self = StObject.set(x, "startColor", value.asInstanceOf[js.Any])
    
    inline def setStartColorUndefined: Self = StObject.set(x, "startColor", js.undefined)
    
    inline def setThumbFill(value: String): Self = StObject.set(x, "thumbFill", value.asInstanceOf[js.Any])
    
    inline def setThumbFillUndefined: Self = StObject.set(x, "thumbFill", js.undefined)
    
    inline def setThumbRadius(value: Double): Self = StObject.set(x, "thumbRadius", value.asInstanceOf[js.Any])
    
    inline def setThumbRadiusUndefined: Self = StObject.set(x, "thumbRadius", js.undefined)
    
    inline def setThumbStroke(value: String): Self = StObject.set(x, "thumbStroke", value.asInstanceOf[js.Any])
    
    inline def setThumbStrokeUndefined: Self = StObject.set(x, "thumbStroke", js.undefined)
    
    inline def setThumbStrokeWidth(value: Double): Self = StObject.set(x, "thumbStrokeWidth", value.asInstanceOf[js.Any])
    
    inline def setThumbStrokeWidthUndefined: Self = StObject.set(x, "thumbStrokeWidth", js.undefined)
  }
}
