package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 特征值支持的操作 */
trait CharacteristicProperties extends StObject {
  
  /** 回包 */
  var indicate: js.UndefOr[Boolean] = js.undefined
  
  /** 订阅 */
  @JSName("notify")
  var notify_FCharacteristicProperties: js.UndefOr[Boolean] = js.undefined
  
  /** 读 */
  var read: js.UndefOr[Boolean] = js.undefined
  
  /** 写 */
  var write: js.UndefOr[Boolean] = js.undefined
}
object CharacteristicProperties {
  
  inline def apply(): CharacteristicProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CharacteristicProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CharacteristicProperties] (val x: Self) extends AnyVal {
    
    inline def setIndicate(value: Boolean): Self = StObject.set(x, "indicate", value.asInstanceOf[js.Any])
    
    inline def setIndicateUndefined: Self = StObject.set(x, "indicate", js.undefined)
    
    inline def setNotify_(value: Boolean): Self = StObject.set(x, "notify", value.asInstanceOf[js.Any])
    
    inline def setNotify_Undefined: Self = StObject.set(x, "notify", js.undefined)
    
    inline def setRead(value: Boolean): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
    
    inline def setReadUndefined: Self = StObject.set(x, "read", js.undefined)
    
    inline def setWrite(value: Boolean): Self = StObject.set(x, "write", value.asInstanceOf[js.Any])
    
    inline def setWriteUndefined: Self = StObject.set(x, "write", js.undefined)
  }
}
