package typings.tuyaPanelKit.themeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RadialGradientBackground
  extends StObject
     with _BackgroundProps {
  
  /**
    * @language zh-CN
    * @description 最外侧圆的x轴坐标点
    * @defaultValue '50%'
    */
  /**
    * @language en-US
    * @description The x-axis coordinate point of the outermost circle
    * @defaultValue '50%'
    */
  var cx: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 最外侧圆的y轴坐标点
    * @defaultValue '50%'
    */
  /**
    * @language en-US
    * @description The y-axis coordinate point of the outermost circle
    * @defaultValue '50%'
    */
  var cy: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 最内侧圆的x轴坐标点(渐变中心点)
    * @defaultValue '50%'
    */
  /**
    * @language en-US
    * @description The x-axis coordinate point of the innermost circle (gradient center point)
    * @defaultValue '50%'
    */
  var fx: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 最内侧圆的y轴坐标点(渐变中心点)
    * @defaultValue '50%'
    */
  /**
    * @language en-US
    * @description The y-axis coordinate point of the innermost circle (gradient center point)
    * @defaultValue '50%'
    */
  var fy: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 最内侧圆水平方向的半径(渐变长度)
    * @defaultValue '50%'
    */
  /**
    * @language en-US
    * @description The horizontal radius of the innermost circle (gradient length)
    * @defaultValue '50%'
    */
  var rx: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 最内侧圆垂直方向的半径(渐变高度)
    * @defaultValue '50%'
    */
  /**
    * @language en-US
    * @description The vertical radius of the innermost circle (gradient height)
    * @defaultValue '50%'
    */
  var ry: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 渐变梯度停点
    * @defaultValue [{ offset: '0%', stopColor: '#ff0', stopOpacity: '1' }, { offset: '100%', stopColor: '#00f', stopOpacity: '1' }]
    */
  /**
    * @language en-US
    * @description The stop point of gradient
    * @defaultValue [{ offset: '0%', stopColor: '#ff0', stopOpacity: '1' }, { offset: '100%', stopColor: '#00f', stopOpacity: '1' }]
    */
  var stops: js.UndefOr[js.Array[StopsProps]] = js.undefined
}
object RadialGradientBackground {
  
  inline def apply(): RadialGradientBackground = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RadialGradientBackground]
  }
  
  extension [Self <: RadialGradientBackground](x: Self) {
    
    inline def setCx(value: String): Self = StObject.set(x, "cx", value.asInstanceOf[js.Any])
    
    inline def setCxUndefined: Self = StObject.set(x, "cx", js.undefined)
    
    inline def setCy(value: String): Self = StObject.set(x, "cy", value.asInstanceOf[js.Any])
    
    inline def setCyUndefined: Self = StObject.set(x, "cy", js.undefined)
    
    inline def setFx(value: String): Self = StObject.set(x, "fx", value.asInstanceOf[js.Any])
    
    inline def setFxUndefined: Self = StObject.set(x, "fx", js.undefined)
    
    inline def setFy(value: String): Self = StObject.set(x, "fy", value.asInstanceOf[js.Any])
    
    inline def setFyUndefined: Self = StObject.set(x, "fy", js.undefined)
    
    inline def setRx(value: String): Self = StObject.set(x, "rx", value.asInstanceOf[js.Any])
    
    inline def setRxUndefined: Self = StObject.set(x, "rx", js.undefined)
    
    inline def setRy(value: String): Self = StObject.set(x, "ry", value.asInstanceOf[js.Any])
    
    inline def setRyUndefined: Self = StObject.set(x, "ry", js.undefined)
    
    inline def setStops(value: js.Array[StopsProps]): Self = StObject.set(x, "stops", value.asInstanceOf[js.Any])
    
    inline def setStopsUndefined: Self = StObject.set(x, "stops", js.undefined)
    
    inline def setStopsVarargs(value: StopsProps*): Self = StObject.set(x, "stops", js.Array(value*))
  }
}
