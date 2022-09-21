package typings.tuyaPanelKit.mod

import org.scalablytyped.runtime.StringDictionary
import typings.tuyaPanelKit.anon.Value1
import typings.tuyaPanelKit.anon.Value2x
import typings.tuyaPanelKit.themeMod.StopsProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComposeProps
  extends StObject
     with GestureProps {
  
  /**
    * @language zh-CN
    * @description 进度条1在开始的角度上增加的角度
    * @defaultValue 215
    */
  /**
    * @language en-US
    * @description The angle that progress bar 1 adds to the starting angle
    * @defaultValue 215
    */
  var andDegree1: js.UndefOr[Double] = js.undefined
  
  /**
    * @language zh-CN
    * @description 进度条大于具体值的颜色
    * @defaultValue "#E5E5E5"
    */
  /**
    * @language en-US
    * @description Color of progress bar larger than specific value
    * @defaultValue "#E5E5E5"
    */
  var backColor: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 大于具体值的不透明度
    * @defaultValue 1
    */
  /**
    * @language en-US
    * @description Opacity greater than a specific value
    * @defaultValue 1
    */
  var backStrokeOpacity: js.UndefOr[Double] = js.undefined
  
  /**
    * @language zh-CN
    * @description 轨道结束的圆环颜色
    * @defaultValue "#E5E5E5"
    */
  /**
    * @language en-US
    * @description The color of the ring at the end of the track
    * @defaultValue "#E5E5E5"
    */
  var endColor: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 进度条小于具体值的颜色
    * @types string | <a target="_blank" href="https://github.com/tuya/DefinitelyTyped/blob/bcd9b9272bcbe9e172409f2b0b0b9fa280fdb976/types/tuya-panel-kit/theme.d.ts#L1">StopsProps[]</a> | { [key: string]: string }
    * @defaultValue "#FF4800"
    */
  /**
    * @language en-US
    * @description Color of progress bar less than specific value
    * @types string | <a target="_blank" href="https://github.com/tuya/DefinitelyTyped/blob/bcd9b9272bcbe9e172409f2b0b0b9fa280fdb976/types/tuya-panel-kit/theme.d.ts#L1">StopsProps[]</a> | { [key: string]: string }
    * @defaultValue "#FF4800"
    */
  var foreColor: js.UndefOr[String | js.Array[StopsProps] | StringDictionary[String]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 小于具体值的不透明度
    * @defaultValue 1
    */
  /**
    * @language en-US
    * @description Opacity less than a specific value
    * @defaultValue 1
    */
  var foreStrokeOpacity: js.UndefOr[Double] = js.undefined
  
  /**
    * @language zh-CN
    * @description 进度条1最大值
    * @defaultValue 100
    */
  /**
    * @language en-US
    * @description Progress bar 1 Maximum
    * @defaultValue 100
    */
  var max1: js.UndefOr[Double] = js.undefined
  
  /**
    * @language zh-CN
    * @description 进度条2最大值
    * @defaultValue 50
    */
  /**
    * @language en-US
    * @description Progress bar 2 max
    * @defaultValue 50
    */
  var max2: js.UndefOr[Double] = js.undefined
  
  /**
    * @language zh-CN
    * @description 进度条1最小值
    * @defaultValue 0
    */
  /**
    * @language en-US
    * @description Progress bar 1 minimum
    * @defaultValue 0
    */
  var min1: js.UndefOr[Double] = js.undefined
  
  /**
    * @language zh-CN
    * @description 进度条2最小值
    * @defaultValue 0
    */
  /**
    * @language en-US
    * @description Progress bar 2 min
    * @defaultValue 0
    */
  var min2: js.UndefOr[Double] = js.undefined
  
  /**
    * @language zh-CN
    * @description 是否需要最大值的 Touch
    * @defaultValue true
    */
  /**
    * @language en-US
    * @description Do you need touch with maximum value
    * @defaultValue true
    */
  var needCircle1: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @language zh-CN
    * @description 是否需要另一个轨道上的 thumb
    * @defaultValue true
    */
  /**
    * @language en-US
    * @description Do you need a thumb on another orbit
    * @defaultValue true
    */
  var needCircle2: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @language zh-CN
    * @description 滑动结束的回调
    * @defaultValue () => {}
    */
  /**
    * @language en-US
    * @description Slide end callback
    * @defaultValue () => {}
    */
  var onSlidingComplete: js.UndefOr[js.Function1[/* argus */ Value2x, Unit]] = js.undefined
  
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
  var onValueChange: js.UndefOr[js.Function1[/* argus */ Value1, Unit]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 进度条2在开始的角度上减少的角度
    * @defaultValue 100
    */
  /**
    * @language en-US
    * @description Progress bar 2 decreases the angle from the starting angle
    * @defaultValue 100
    */
  var reduceDegree2: js.UndefOr[Double] = js.undefined
  
  /**
    * @language zh-CN
    * @description 进度条1渲染的高度
    * @defaultValue 9
    */
  /**
    * @language en-US
    * @description Height of progress bar 1 rendering
    * @defaultValue 9
    */
  var scaleHeight1: js.UndefOr[Double] = js.undefined
  
  /**
    * @language zh-CN
    * @description 进度条2渲染的高度
    * @defaultValue 4
    */
  /**
    * @language en-US
    * @description Height of progress bar 2 rendering
    * @defaultValue 4
    */
  var scaleHeight2: js.UndefOr[Double] = js.undefined
  
  /**
    * @language zh-CN
    * @description 轨道开始的圆环颜色
    * @defaultValue "#FF4800"
    */
  /**
    * @language en-US
    * @description The color of the ring at the beginning of the track
    * @defaultValue "#FF4800"
    */
  var startColor: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 进度条1开始角度
    * @defaultValue 165
    */
  /**
    * @language en-US
    * @description Starting angle of progress bar 1
    * @defaultValue 165
    */
  var startDegree1: js.UndefOr[Double] = js.undefined
  
  /**
    * @language zh-CN
    * @description 进度条2开始角度
    * @defaultValue 140
    */
  /**
    * @language en-US
    * @description Progress bar 2 start angle
    * @defaultValue 140
    */
  var startDegree2: js.UndefOr[Double] = js.undefined
  
  /**
    * @language zh-CN
    * @description 步长
    * @defaultValue 0
    */
  /**
    * @language en-US
    * @description Step value
    * @defaultValue 0
    */
  var stepValue: js.UndefOr[Double] = js.undefined
  
  /**
    * @language zh-CN
    * @description 进度条1 Thumb 小圆球的填充色
    * @defaultValue "#fff"
    */
  /**
    * @language en-US
    * @description Filling color of thumb ball in progress bar 1
    * @defaultValue "#fff"
    */
  var thumbFill: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 进度条2 Thumb 小圆球的填充色
    * @defaultValue '#fff'
    */
  /**
    * @language en-US
    * @description Progress bar 2 filling color of thumb ball
    * @defaultValue '#fff'
    */
  var thumbFill2: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 进度条1 Thumb 小圆球的半径
    * @defaultValue 5
    */
  /**
    * @language en-US
    * @description Radius of progress bar 1 thumb ball
    * @defaultValue 5
    */
  var thumbRadius1: js.UndefOr[Double] = js.undefined
  
  /**
    * @language zh-CN
    * @description 进度条2 Thumb 小圆球的半径
    * @defaultValue 2
    */
  /**
    * @language en-US
    * @description Radius of progress bar 2 thumb ball
    * @defaultValue 2
    */
  var thumbRadius2: js.UndefOr[Double] = js.undefined
  
  /**
    * @language zh-CN
    * @description 进度条1 Thumb小圆球的边框色
    * @defaultValue "#fff"
    */
  /**
    * @language en-US
    * @description The border color of thumb ball in progress bar 1
    * @defaultValue "#fff"
    */
  var thumbStroke: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 进度条2 Thumb 小圆球的边框色
    * @defaultValue '#fff'
    */
  /**
    * @language en-US
    * @description Border color of progress bar 2 thumb ball
    * @defaultValue '#fff'
    */
  var thumbStroke2: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 进度条1 Thumb小圆球边框宽度
    * @defaultValue 2
    */
  /**
    * @language en-US
    * @description Border width of thumb ball in progress bar 1
    * @defaultValue 2
    */
  var thumbStrokeWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * @language zh-CN
    * @description 进度条2 Thumb小圆球边框宽度
    * @defaultValue 2
    */
  /**
    * @language en-US
    * @description Thumb small ball border width in Progress bar 2
    * @defaultValue 2
    */
  var thumbStrokeWidth2: js.UndefOr[Double] = js.undefined
  
  /**
    * @language zh-CN
    * @description 具体值1
    * @defaultValue 50
    */
  /**
    * @language en-US
    * @description value1
    * @defaultValue 50
    */
  var value1: js.UndefOr[Double] = js.undefined
  
  /**
    * @language zh-CN
    * @description 具体值2
    * @defaultValue 20
    */
  /**
    * @language en-US
    * @description value2
    * @defaultValue 20
    */
  var value2: js.UndefOr[Double] = js.undefined
}
object ComposeProps {
  
  inline def apply(): ComposeProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComposeProps]
  }
  
  extension [Self <: ComposeProps](x: Self) {
    
    inline def setAndDegree1(value: Double): Self = StObject.set(x, "andDegree1", value.asInstanceOf[js.Any])
    
    inline def setAndDegree1Undefined: Self = StObject.set(x, "andDegree1", js.undefined)
    
    inline def setBackColor(value: String): Self = StObject.set(x, "backColor", value.asInstanceOf[js.Any])
    
    inline def setBackColorUndefined: Self = StObject.set(x, "backColor", js.undefined)
    
    inline def setBackStrokeOpacity(value: Double): Self = StObject.set(x, "backStrokeOpacity", value.asInstanceOf[js.Any])
    
    inline def setBackStrokeOpacityUndefined: Self = StObject.set(x, "backStrokeOpacity", js.undefined)
    
    inline def setEndColor(value: String): Self = StObject.set(x, "endColor", value.asInstanceOf[js.Any])
    
    inline def setEndColorUndefined: Self = StObject.set(x, "endColor", js.undefined)
    
    inline def setForeColor(value: String | js.Array[StopsProps] | StringDictionary[String]): Self = StObject.set(x, "foreColor", value.asInstanceOf[js.Any])
    
    inline def setForeColorUndefined: Self = StObject.set(x, "foreColor", js.undefined)
    
    inline def setForeColorVarargs(value: StopsProps*): Self = StObject.set(x, "foreColor", js.Array(value*))
    
    inline def setForeStrokeOpacity(value: Double): Self = StObject.set(x, "foreStrokeOpacity", value.asInstanceOf[js.Any])
    
    inline def setForeStrokeOpacityUndefined: Self = StObject.set(x, "foreStrokeOpacity", js.undefined)
    
    inline def setMax1(value: Double): Self = StObject.set(x, "max1", value.asInstanceOf[js.Any])
    
    inline def setMax1Undefined: Self = StObject.set(x, "max1", js.undefined)
    
    inline def setMax2(value: Double): Self = StObject.set(x, "max2", value.asInstanceOf[js.Any])
    
    inline def setMax2Undefined: Self = StObject.set(x, "max2", js.undefined)
    
    inline def setMin1(value: Double): Self = StObject.set(x, "min1", value.asInstanceOf[js.Any])
    
    inline def setMin1Undefined: Self = StObject.set(x, "min1", js.undefined)
    
    inline def setMin2(value: Double): Self = StObject.set(x, "min2", value.asInstanceOf[js.Any])
    
    inline def setMin2Undefined: Self = StObject.set(x, "min2", js.undefined)
    
    inline def setNeedCircle1(value: Boolean): Self = StObject.set(x, "needCircle1", value.asInstanceOf[js.Any])
    
    inline def setNeedCircle1Undefined: Self = StObject.set(x, "needCircle1", js.undefined)
    
    inline def setNeedCircle2(value: Boolean): Self = StObject.set(x, "needCircle2", value.asInstanceOf[js.Any])
    
    inline def setNeedCircle2Undefined: Self = StObject.set(x, "needCircle2", js.undefined)
    
    inline def setOnSlidingComplete(value: /* argus */ Value2x => Unit): Self = StObject.set(x, "onSlidingComplete", js.Any.fromFunction1(value))
    
    inline def setOnSlidingCompleteUndefined: Self = StObject.set(x, "onSlidingComplete", js.undefined)
    
    inline def setOnValueChange(value: /* argus */ Value1 => Unit): Self = StObject.set(x, "onValueChange", js.Any.fromFunction1(value))
    
    inline def setOnValueChangeUndefined: Self = StObject.set(x, "onValueChange", js.undefined)
    
    inline def setReduceDegree2(value: Double): Self = StObject.set(x, "reduceDegree2", value.asInstanceOf[js.Any])
    
    inline def setReduceDegree2Undefined: Self = StObject.set(x, "reduceDegree2", js.undefined)
    
    inline def setScaleHeight1(value: Double): Self = StObject.set(x, "scaleHeight1", value.asInstanceOf[js.Any])
    
    inline def setScaleHeight1Undefined: Self = StObject.set(x, "scaleHeight1", js.undefined)
    
    inline def setScaleHeight2(value: Double): Self = StObject.set(x, "scaleHeight2", value.asInstanceOf[js.Any])
    
    inline def setScaleHeight2Undefined: Self = StObject.set(x, "scaleHeight2", js.undefined)
    
    inline def setStartColor(value: String): Self = StObject.set(x, "startColor", value.asInstanceOf[js.Any])
    
    inline def setStartColorUndefined: Self = StObject.set(x, "startColor", js.undefined)
    
    inline def setStartDegree1(value: Double): Self = StObject.set(x, "startDegree1", value.asInstanceOf[js.Any])
    
    inline def setStartDegree1Undefined: Self = StObject.set(x, "startDegree1", js.undefined)
    
    inline def setStartDegree2(value: Double): Self = StObject.set(x, "startDegree2", value.asInstanceOf[js.Any])
    
    inline def setStartDegree2Undefined: Self = StObject.set(x, "startDegree2", js.undefined)
    
    inline def setStepValue(value: Double): Self = StObject.set(x, "stepValue", value.asInstanceOf[js.Any])
    
    inline def setStepValueUndefined: Self = StObject.set(x, "stepValue", js.undefined)
    
    inline def setThumbFill(value: String): Self = StObject.set(x, "thumbFill", value.asInstanceOf[js.Any])
    
    inline def setThumbFill2(value: String): Self = StObject.set(x, "thumbFill2", value.asInstanceOf[js.Any])
    
    inline def setThumbFill2Undefined: Self = StObject.set(x, "thumbFill2", js.undefined)
    
    inline def setThumbFillUndefined: Self = StObject.set(x, "thumbFill", js.undefined)
    
    inline def setThumbRadius1(value: Double): Self = StObject.set(x, "thumbRadius1", value.asInstanceOf[js.Any])
    
    inline def setThumbRadius1Undefined: Self = StObject.set(x, "thumbRadius1", js.undefined)
    
    inline def setThumbRadius2(value: Double): Self = StObject.set(x, "thumbRadius2", value.asInstanceOf[js.Any])
    
    inline def setThumbRadius2Undefined: Self = StObject.set(x, "thumbRadius2", js.undefined)
    
    inline def setThumbStroke(value: String): Self = StObject.set(x, "thumbStroke", value.asInstanceOf[js.Any])
    
    inline def setThumbStroke2(value: String): Self = StObject.set(x, "thumbStroke2", value.asInstanceOf[js.Any])
    
    inline def setThumbStroke2Undefined: Self = StObject.set(x, "thumbStroke2", js.undefined)
    
    inline def setThumbStrokeUndefined: Self = StObject.set(x, "thumbStroke", js.undefined)
    
    inline def setThumbStrokeWidth(value: Double): Self = StObject.set(x, "thumbStrokeWidth", value.asInstanceOf[js.Any])
    
    inline def setThumbStrokeWidth2(value: Double): Self = StObject.set(x, "thumbStrokeWidth2", value.asInstanceOf[js.Any])
    
    inline def setThumbStrokeWidth2Undefined: Self = StObject.set(x, "thumbStrokeWidth2", js.undefined)
    
    inline def setThumbStrokeWidthUndefined: Self = StObject.set(x, "thumbStrokeWidth", js.undefined)
    
    inline def setValue1(value: Double): Self = StObject.set(x, "value1", value.asInstanceOf[js.Any])
    
    inline def setValue1Undefined: Self = StObject.set(x, "value1", js.undefined)
    
    inline def setValue2(value: Double): Self = StObject.set(x, "value2", value.asInstanceOf[js.Any])
    
    inline def setValue2Undefined: Self = StObject.set(x, "value2", js.undefined)
  }
}
