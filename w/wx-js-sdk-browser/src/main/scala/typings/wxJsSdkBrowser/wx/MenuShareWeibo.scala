package typings.wxJsSdkBrowser.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MenuShareWeibo
  extends StObject
     with ShareTimelineConfig {
  
  /**
    * 分享描述
    */
  var desc: String
}
object MenuShareWeibo {
  
  inline def apply(desc: String, link: String, title: String): MenuShareWeibo = {
    val __obj = js.Dynamic.literal(desc = desc.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuShareWeibo]
  }
  
  extension [Self <: MenuShareWeibo](x: Self) {
    
    inline def setDesc(value: String): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
  }
}
