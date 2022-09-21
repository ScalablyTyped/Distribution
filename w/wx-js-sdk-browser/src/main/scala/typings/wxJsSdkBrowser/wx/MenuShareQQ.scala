package typings.wxJsSdkBrowser.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @deprecated
  */
trait MenuShareQQ
  extends StObject
     with ShareTimelineConfig {
  
  /**
    * 分享描述
    */
  var desc: String
}
object MenuShareQQ {
  
  inline def apply(desc: String, link: String, title: String): MenuShareQQ = {
    val __obj = js.Dynamic.literal(desc = desc.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuShareQQ]
  }
  
  extension [Self <: MenuShareQQ](x: Self) {
    
    inline def setDesc(value: String): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
  }
}
