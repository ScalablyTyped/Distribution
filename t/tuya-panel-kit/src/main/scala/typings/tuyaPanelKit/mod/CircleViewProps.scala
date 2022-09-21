package typings.tuyaPanelKit.mod

import typings.reactNative.mod.ViewProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CircleViewProps
  extends StObject
     with ViewProps {
  
  /**
    * @language zh-CN
    * @description 圆形视图边框的背景色
    * @defaultValue undefined
    */
  /**
    * @language en-US
    * @description The background color of the circular view border
    * @defaultValue undefined
    */
  var borderColor: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description The size of the circular view border
    * @defaultValue undefined
    */
  /**
    * @language en-US
    * @description The size of the circular view border
    * @defaultValue undefined
    */
  var borderWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * @language zh-CN
    * @description 圆形视图的背景色
    * @defaultValue undefined
    */
  /**
    * @language en-US
    * @description The background color of the circular view
    * @defaultValue undefined
    */
  var color: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 圆形视图的半径
    * @defaultValue undefined
    */
  /**
    * @language en-US
    * @description Radius of circular view
    * @defaultValue undefined
    */
  var radius: Double
}
object CircleViewProps {
  
  inline def apply(radius: Double): CircleViewProps = {
    val __obj = js.Dynamic.literal(radius = radius.asInstanceOf[js.Any])
    __obj.asInstanceOf[CircleViewProps]
  }
  
  extension [Self <: CircleViewProps](x: Self) {
    
    inline def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    inline def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
    
    inline def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    inline def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
  }
}
