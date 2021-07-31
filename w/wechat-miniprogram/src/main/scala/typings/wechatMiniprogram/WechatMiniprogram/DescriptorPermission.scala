package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 描述符的权限 */
trait DescriptorPermission extends StObject {
  
  /** 读 */
  var read: js.UndefOr[Boolean] = js.undefined
  
  /** 写 */
  var write: js.UndefOr[Boolean] = js.undefined
}
object DescriptorPermission {
  
  @scala.inline
  def apply(): DescriptorPermission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescriptorPermission]
  }
  
  @scala.inline
  implicit class DescriptorPermissionMutableBuilder[Self <: DescriptorPermission] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRead(value: Boolean): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadUndefined: Self = StObject.set(x, "read", js.undefined)
    
    @scala.inline
    def setWrite(value: Boolean): Self = StObject.set(x, "write", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWriteUndefined: Self = StObject.set(x, "write", js.undefined)
  }
}
