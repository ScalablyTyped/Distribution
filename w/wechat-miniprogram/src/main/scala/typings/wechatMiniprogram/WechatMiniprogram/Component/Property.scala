package typings.wechatMiniprogram.WechatMiniprogram.Component

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Property[P /* <: PropertyOption */] extends StObject {
  
  /** 组件的对外属性，是属性名到属性设置的映射表 */
  var properties: P
}
object Property {
  
  inline def apply[P /* <: PropertyOption */](properties: P): Property[P] = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[Property[P]]
  }
  
  extension [Self <: Property[?], P /* <: PropertyOption */](x: Self & Property[P]) {
    
    inline def setProperties(value: P): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
  }
}
