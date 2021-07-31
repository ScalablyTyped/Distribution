package typings.wechatMiniprogram.WechatMiniprogram

import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 描述符数据 */
trait CharacteristicDescriptor extends StObject {
  
  /** 描述符的权限 */
  var permission: js.UndefOr[DescriptorPermission] = js.undefined
  
  /** Descriptor 的 uuid */
  var uuid: String
  
  /** 描述符数据 */
  var value: js.UndefOr[ArrayBuffer] = js.undefined
}
object CharacteristicDescriptor {
  
  @scala.inline
  def apply(uuid: String): CharacteristicDescriptor = {
    val __obj = js.Dynamic.literal(uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[CharacteristicDescriptor]
  }
  
  @scala.inline
  implicit class CharacteristicDescriptorMutableBuilder[Self <: CharacteristicDescriptor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPermission(value: DescriptorPermission): Self = StObject.set(x, "permission", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionUndefined: Self = StObject.set(x, "permission", js.undefined)
    
    @scala.inline
    def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: ArrayBuffer): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
