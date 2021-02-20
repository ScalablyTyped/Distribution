package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 特征值权限 */
@js.native
trait CharacteristicPermission extends StObject {
  
  /** 加密读请求 */
  var readEncryptionRequired: js.UndefOr[Boolean] = js.native
  
  /** 可读 */
  var readable: js.UndefOr[Boolean] = js.native
  
  /** 加密写请求 */
  var writeEncryptionRequired: js.UndefOr[Boolean] = js.native
  
  /** 可写 */
  var writeable: js.UndefOr[Boolean] = js.native
}
object CharacteristicPermission {
  
  @scala.inline
  def apply(): CharacteristicPermission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CharacteristicPermission]
  }
  
  @scala.inline
  implicit class CharacteristicPermissionMutableBuilder[Self <: CharacteristicPermission] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReadEncryptionRequired(value: Boolean): Self = StObject.set(x, "readEncryptionRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadEncryptionRequiredUndefined: Self = StObject.set(x, "readEncryptionRequired", js.undefined)
    
    @scala.inline
    def setReadable(value: Boolean): Self = StObject.set(x, "readable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadableUndefined: Self = StObject.set(x, "readable", js.undefined)
    
    @scala.inline
    def setWriteEncryptionRequired(value: Boolean): Self = StObject.set(x, "writeEncryptionRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWriteEncryptionRequiredUndefined: Self = StObject.set(x, "writeEncryptionRequired", js.undefined)
    
    @scala.inline
    def setWriteable(value: Boolean): Self = StObject.set(x, "writeable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWriteableUndefined: Self = StObject.set(x, "writeable", js.undefined)
  }
}
