package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 参数列表 */
trait UpdatableMessageFrontEndParameter extends StObject {
  
  /** 参数名 */
  var name: String
  
  /** 参数值 */
  var value: String
}
object UpdatableMessageFrontEndParameter {
  
  inline def apply(name: String, value: String): UpdatableMessageFrontEndParameter = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatableMessageFrontEndParameter]
  }
  
  extension [Self <: UpdatableMessageFrontEndParameter](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
