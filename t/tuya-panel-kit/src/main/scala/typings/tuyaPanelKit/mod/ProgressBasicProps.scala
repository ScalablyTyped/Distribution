package typings.tuyaPanelKit.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProgressBasicProps
  extends StObject
     with ProgressProps {
  
  /**
    * @language zh-CN
    * @description 轨道不满 360 度开始的圆环颜色
    * @defaultValue "#E5E5E5"
    */
  /**
    * @language en-US
    * @description The color of the ring at the ending point when the track is less than 360 degrees.
    * @defaultValue "#E5E5E5"
    */
  var endColor: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 是否需要最大值的 thumb
    * @defaultValue false
    */
  /**
    * @language en-US
    * @description Whether to set the progress thumb of the maximum value.
    * @defaultValue false
    */
  var needMaxCircle: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @language zh-CN
    * @description 是否需要最小值的 thumb
    * @defaultValue false
    */
  /**
    * @language en-US
    * @description Whether to set the progress thumb of the minimum value.
    * @defaultValue false
    */
  var needMinCircle: js.UndefOr[Boolean] = js.undefined
  
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
    * @description 轨道不满 360 度开始的圆环颜色
    * @defaultValue "#FF4800"
    */
  /**
    * @language en-US
    * @description The color of the ring at the starting point when the track is less than 360 degrees.
    * @defaultValue "#FF4800"
    */
  var startColor: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description thumb 小圆球的填充色
    * @defaultValue "#fff"
    */
  /**
    * @language en-US
    * @description Filling color of thumb ball
    * @defaultValue "#fff"
    */
  var thumbFill: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description thumb小圆球的半径
    * @defaultValue 2
    */
  /**
    * @language en-US
    * @description Radius of thumb ball
    * @defaultValue 2
    */
  var thumbRadius: js.UndefOr[Double] = js.undefined
  
  /**
    * @language zh-CN
    * @description thumb 小圆球的边框色
    * @defaultValue "#fff"
    */
  /**
    * @language en-US
    * @description The border color of thumb ball
    * @defaultValue "#fff"
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
  
  /**
    * @language zh-CN
    * @description 具体值
    * @defaultValue 50
    */
  /**
    * @language en-US
    * @description value
    * @defaultValue 50
    */
  var value: js.UndefOr[Double] = js.undefined
}
object ProgressBasicProps {
  
  inline def apply(): ProgressBasicProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProgressBasicProps]
  }
  
  extension [Self <: ProgressBasicProps](x: Self) {
    
    inline def setEndColor(value: String): Self = StObject.set(x, "endColor", value.asInstanceOf[js.Any])
    
    inline def setEndColorUndefined: Self = StObject.set(x, "endColor", js.undefined)
    
    inline def setNeedMaxCircle(value: Boolean): Self = StObject.set(x, "needMaxCircle", value.asInstanceOf[js.Any])
    
    inline def setNeedMaxCircleUndefined: Self = StObject.set(x, "needMaxCircle", js.undefined)
    
    inline def setNeedMinCircle(value: Boolean): Self = StObject.set(x, "needMinCircle", value.asInstanceOf[js.Any])
    
    inline def setNeedMinCircleUndefined: Self = StObject.set(x, "needMinCircle", js.undefined)
    
    inline def setOnSlidingComplete(value: /* value */ Double => Unit): Self = StObject.set(x, "onSlidingComplete", js.Any.fromFunction1(value))
    
    inline def setOnSlidingCompleteUndefined: Self = StObject.set(x, "onSlidingComplete", js.undefined)
    
    inline def setOnValueChange(value: /* value */ Double => Unit): Self = StObject.set(x, "onValueChange", js.Any.fromFunction1(value))
    
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
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
