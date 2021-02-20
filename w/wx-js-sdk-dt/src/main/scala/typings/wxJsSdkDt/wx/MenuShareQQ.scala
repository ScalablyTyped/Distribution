package typings.wxJsSdkDt.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @deprecated
  */
@js.native
trait MenuShareQQ extends ShareTimelineConfig {
  
  /**
    * 分享描述
    */
  var desc: String = js.native
}
object MenuShareQQ {
  
  @scala.inline
  def apply(desc: String, link: String, title: String): MenuShareQQ = {
    val __obj = js.Dynamic.literal(desc = desc.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuShareQQ]
  }
  
  @scala.inline
  implicit class MenuShareQQMutableBuilder[Self <: MenuShareQQ] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDesc(value: String): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
  }
}
