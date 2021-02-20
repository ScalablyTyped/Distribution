package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 动态消息的模板信息
  *
  * 最低基础库： `2.4.0` */
@js.native
trait UpdatableMessageFrontEndTemplateInfo extends StObject {
  
  /** 参数列表 */
  var parameterList: js.Array[UpdatableMessageFrontEndParameter] = js.native
}
object UpdatableMessageFrontEndTemplateInfo {
  
  @scala.inline
  def apply(parameterList: js.Array[UpdatableMessageFrontEndParameter]): UpdatableMessageFrontEndTemplateInfo = {
    val __obj = js.Dynamic.literal(parameterList = parameterList.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatableMessageFrontEndTemplateInfo]
  }
  
  @scala.inline
  implicit class UpdatableMessageFrontEndTemplateInfoMutableBuilder[Self <: UpdatableMessageFrontEndTemplateInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameterList(value: js.Array[UpdatableMessageFrontEndParameter]): Self = StObject.set(x, "parameterList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameterListVarargs(value: UpdatableMessageFrontEndParameter*): Self = StObject.set(x, "parameterList", js.Array(value :_*))
  }
}
