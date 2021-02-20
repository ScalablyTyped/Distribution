package typings.wechatMiniprogram.WechatMiniprogram

import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** characteristics列表 */
@js.native
trait Characteristic extends StObject {
  
  /** 描述符数据 */
  var descriptors: js.UndefOr[js.Array[CharacteristicDescriptor]] = js.native
  
  /** 特征值权限 */
  var permission: js.UndefOr[CharacteristicPermission] = js.native
  
  /** 特征值支持的操作 */
  var properties: js.UndefOr[CharacteristicProperties] = js.native
  
  /** Characteristic 的 uuid */
  var uuid: String = js.native
  
  /** 特征值对应的二进制值 */
  var value: js.UndefOr[ArrayBuffer] = js.native
}
object Characteristic {
  
  @scala.inline
  def apply(uuid: String): Characteristic = {
    val __obj = js.Dynamic.literal(uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Characteristic]
  }
  
  @scala.inline
  implicit class CharacteristicMutableBuilder[Self <: Characteristic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescriptors(value: js.Array[CharacteristicDescriptor]): Self = StObject.set(x, "descriptors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptorsUndefined: Self = StObject.set(x, "descriptors", js.undefined)
    
    @scala.inline
    def setDescriptorsVarargs(value: CharacteristicDescriptor*): Self = StObject.set(x, "descriptors", js.Array(value :_*))
    
    @scala.inline
    def setPermission(value: CharacteristicPermission): Self = StObject.set(x, "permission", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionUndefined: Self = StObject.set(x, "permission", js.undefined)
    
    @scala.inline
    def setProperties(value: CharacteristicProperties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    @scala.inline
    def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: ArrayBuffer): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
