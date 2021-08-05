package typings.weixinApp.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// 界面-----设置置顶信息
trait SetTopBarTextOptions
  extends StObject
     with BaseOptions[js.Any, js.Any] {
  
  /**
    * 置顶栏文字内容
    */
  var text: String
}
object SetTopBarTextOptions {
  
  inline def apply(text: String): SetTopBarTextOptions = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetTopBarTextOptions]
  }
  
  extension [Self <: SetTopBarTextOptions](x: Self) {
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
