package typings.wechatMiniprogram.anon

import typings.wechatMiniprogram.WechatMiniprogram.IAnyObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormId extends StObject {
  
  var formId: js.UndefOr[js.Any] = js.undefined
  
  var target: typings.wechatMiniprogram.WechatMiniprogram.Target[IAnyObject]
  
  /** 表单中的数据，需要在表单组件中加上 name 来作为 key。 */
  var value: IAnyObject
}
object FormId {
  
  @scala.inline
  def apply(target: typings.wechatMiniprogram.WechatMiniprogram.Target[IAnyObject], value: IAnyObject): FormId = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormId]
  }
  
  @scala.inline
  implicit class FormIdMutableBuilder[Self <: FormId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormId(value: js.Any): Self = StObject.set(x, "formId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormIdUndefined: Self = StObject.set(x, "formId", js.undefined)
    
    @scala.inline
    def setTarget(value: typings.wechatMiniprogram.WechatMiniprogram.Target[IAnyObject]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: IAnyObject): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
