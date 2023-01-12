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
  
  /**
    * @language zh-CN
    * @description 在开始的角度上增加的角度
    * @defaultValue 270
    */
  /**
    * @language en-US
    * @description The number of degrees added to the starting degree.
    * @defaultValue 270
    */
  var andDegree: js.UndefOr[Double] = js.undefined
  
  /**
    * @language zh-CN
    * @description 大于具体值的颜色
    * @defaultValue "#E5E5E5"
    */
  /**
    * @language en-US
    * @description Colors greater than specific values
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
    * @description Opacity greater than the specific value.
    * @defaultValue 1
    */
  var backStrokeOpacity: js.UndefOr[Double] = js.undefined
  
  /**
    * @language zh-CN
    * @description 进度条小于具体值的颜色
    * @types string | <a target="_blank" href="https://github.com/tuya/DefinitelyTyped/blob/bcd9b9272bcbe9e172409f2b0b0b9fa280fdb976/types/tuya-panel-kit/theme.d.ts#L1">StopsProps</a>[] | { [key: string]: string }
    * @defaultValue "#FF4800"
    */
  /**
    * @language en-US
    * @description Color of progress bar less than specific value
    * @types string | <a target="_blank" href="https://github.com/tuya/DefinitelyTyped/blob/bcd9b9272bcbe9e172409f2b0b0b9fa280fdb976/types/tuya-panel-kit/theme.d.ts#L1">StopsProps</a>[] | { [key: string]: string }
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
    * @description Opacity less than the specific value.
    * @defaultValue 1
    */
  var foreStrokeOpacity: js.UndefOr[Double] = js.undefined
  
  /**
    * @language zh-CN
    * @description 渐变 Id
    * @defaultValue "Progress"
    */
  /**
    * @language en-US
    * @description GradientId
    * @defaultValue "Progress"
    */
  var gradientId: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 最大值
    * @defaultValue 100
    */
  /**
    * @language en-US
    * @description The maximum value of the progress, in degrees.
    * @defaultValue 100
    */
  var max: js.UndefOr[Double] = js.undefined
  
  /**
    * @language zh-CN
    * @description 最小值
    * @defaultValue 0
    */
  /**
    * @language en-US
    * @description The minimum value of the progress, in degrees.
    * @defaultValue 0
    */
  var min: js.UndefOr[Double] = js.undefined
  
  /**
    * @language zh-CN
    * @description 圆环中心自定义内容
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description Custom content in the center of the ring.
    * @defaultValue null
    */
  var renderCenterView: js.UndefOr[ReactNode] = js.undefined
  
  /**
    * @language zh-CN
    * @description 进度条渲染的高度
    * @defaultValue 9
    */
  /**
    * @language en-US
    * @description The number of rendering lines of the progress bar.
    * @defaultValue 9
    */
  var scaleHeight: js.UndefOr[Double] = js.undefined
  
  /**
    * @language zh-CN
    * @description 开始角度
    * @defaultValue 135
    */
  /**
    * @language en-US
    * @description The start degree. The degree of clockwise operation, starting from the three o’clock position.
    * @defaultValue 135
    */
  var startDegree: js.UndefOr[Double] = js.undefined
  
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
    * @description 渐变起始点的 x 轴坐标
    * @defaultValue "0%"
    */
  /**
    * @language en-US
    * @description The x-axis coordinate of the starting point of gradient.
    * @defaultValue "0%"
    */
  var x1: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 渐变终点的 x 轴坐标
    * @defaultValue "100%"
    */
  /**
    * @language en-US
    * @description The x-axis coordinate of the ending point of gradient.
    * @defaultValue "100%"
    */
  var x2: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 渐变起始点的 y 轴坐标
    * @defaultValue "0%"
    */
  /**
    * @language en-US
    * @description The y-axis coordinate of the starting point of gradient.
    * @defaultValue "0%"
    */
  var y1: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 渐变终点的 y 轴坐标
    * @defaultValue "0%"
    */
  /**
    * @language en-US
    * @description The y-axis coordinate of the ending point of gradient.
    * @defaultValue "0%"
    */
  var y2: js.UndefOr[String] = js.undefined
}
object ProgressProps {
  
  inline def apply(): ProgressProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProgressProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProgressProps] (val x: Self) extends AnyVal {
    
    inline def setAndDegree(value: Double): Self = StObject.set(x, "andDegree", value.asInstanceOf[js.Any])
    
    inline def setAndDegreeUndefined: Self = StObject.set(x, "andDegree", js.undefined)
    
    inline def setBackColor(value: String): Self = StObject.set(x, "backColor", value.asInstanceOf[js.Any])
    
    inline def setBackColorUndefined: Self = StObject.set(x, "backColor", js.undefined)
    
    inline def setBackStrokeOpacity(value: Double): Self = StObject.set(x, "backStrokeOpacity", value.asInstanceOf[js.Any])
    
    inline def setBackStrokeOpacityUndefined: Self = StObject.set(x, "backStrokeOpacity", js.undefined)
    
    inline def setForeColor(value: String | js.Array[StopsProps] | StringDictionary[String]): Self = StObject.set(x, "foreColor", value.asInstanceOf[js.Any])
    
    inline def setForeColorUndefined: Self = StObject.set(x, "foreColor", js.undefined)
    
    inline def setForeColorVarargs(value: StopsProps*): Self = StObject.set(x, "foreColor", js.Array(value*))
    
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
