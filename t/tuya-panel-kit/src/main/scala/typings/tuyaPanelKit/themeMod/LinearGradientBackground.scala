package typings.tuyaPanelKit.themeMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LinearGradientBackground
  extends StObject
     with _BackgroundProps {
  
  /**
    * @language zh-CN
    * @description 渐变梯度停点
    * @defaultValue { '0%': 'rgb(255, 255, 255)', '100%': 'rgb(0, 0, 0)' }
    */
  /**
    * @language en-US
    * @description The stop point of gradient
    * @defaultValue { '0%': 'rgb(255, 255, 255)', '100%': 'rgb(0, 0, 0)' }
    */
  var stops: js.UndefOr[Record[String, String]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 起始点的x轴坐标
    * @defaultValue '0%'
    */
  /**
    * @language en-US
    * @description The x-axis coordinate of the starting point
    * @defaultValue '0%'
    */
  var x1: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 终点的x轴坐标
    * @defaultValue '0%'
    */
  /**
    * @language en-US
    * @description The x-axis coordinate of the ending point
    * @defaultValue '0%'
    */
  var x2: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 起始点的y轴坐标
    * @defaultValue '0%'
    */
  /**
    * @language en-US
    * @description The y-axis coordinate of the starting point
    * @defaultValue '0%'
    */
  var y1: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 终点的y轴坐标
    * @defaultValue '100%'
    */
  /**
    * @language en-US
    * @description The y-axis coordinate of the ending point
    * @defaultValue '0%'
    */
  var y2: js.UndefOr[String] = js.undefined
}
object LinearGradientBackground {
  
  inline def apply(): LinearGradientBackground = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinearGradientBackground]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LinearGradientBackground] (val x: Self) extends AnyVal {
    
    inline def setStops(value: Record[String, String]): Self = StObject.set(x, "stops", value.asInstanceOf[js.Any])
    
    inline def setStopsUndefined: Self = StObject.set(x, "stops", js.undefined)
    
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
