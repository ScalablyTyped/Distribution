package typings.weixinApp.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// 界面-----设置置顶信息
@js.native
trait SetTopBarTextOptions
  extends BaseOptions[js.Any, js.Any] {
  
  /**
    * 置顶栏文字内容
    */
  var text: String = js.native
}
object SetTopBarTextOptions {
  
  @scala.inline
  def apply(text: String): SetTopBarTextOptions = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetTopBarTextOptions]
  }
  
  @scala.inline
  implicit class SetTopBarTextOptionsMutableBuilder[Self <: SetTopBarTextOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
