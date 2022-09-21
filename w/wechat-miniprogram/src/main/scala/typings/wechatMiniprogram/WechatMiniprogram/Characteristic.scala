package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** characteristics列表 */
trait Characteristic extends StObject {
  
  /** 描述符数据 */
  var descriptors: js.UndefOr[js.Array[CharacteristicDescriptor]] = js.undefined
  
  /** 特征值权限 */
  var permission: js.UndefOr[CharacteristicPermission] = js.undefined
  
  /** 特征值支持的操作 */
  var properties: js.UndefOr[CharacteristicProperties] = js.undefined
  
  /** Characteristic 的 uuid */
  var uuid: String
  
  /** 特征值对应的二进制值 */
  var value: js.UndefOr[js.typedarray.ArrayBuffer] = js.undefined
}
object Characteristic {
  
  inline def apply(uuid: String): Characteristic = {
    val __obj = js.Dynamic.literal(uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Characteristic]
  }
  
  extension [Self <: Characteristic](x: Self) {
    
    inline def setDescriptors(value: js.Array[CharacteristicDescriptor]): Self = StObject.set(x, "descriptors", value.asInstanceOf[js.Any])
    
    inline def setDescriptorsUndefined: Self = StObject.set(x, "descriptors", js.undefined)
    
    inline def setDescriptorsVarargs(value: CharacteristicDescriptor*): Self = StObject.set(x, "descriptors", js.Array(value*))
    
    inline def setPermission(value: CharacteristicPermission): Self = StObject.set(x, "permission", value.asInstanceOf[js.Any])
    
    inline def setPermissionUndefined: Self = StObject.set(x, "permission", js.undefined)
    
    inline def setProperties(value: CharacteristicProperties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    
    inline def setValue(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
