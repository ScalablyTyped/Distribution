package typings.wxJsSdkDt.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartSearchBeaconsConfig
  extends StObject
     with WxBaseRequestConfig {
  
  /**
    * 完成后的回调
    */
  @JSName("complete")
  def complete_MStartSearchBeaconsConfig(argv: js.Any): Unit
  
  /**
    * 摇周边的业务ticket, 系统自动添加在摇出来的页面链接后面
    */
  var ticket: String
}
object StartSearchBeaconsConfig {
  
  inline def apply(complete: js.Any => Unit, ticket: String): StartSearchBeaconsConfig = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction1(complete), ticket = ticket.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartSearchBeaconsConfig]
  }
  
  extension [Self <: StartSearchBeaconsConfig](x: Self) {
    
    inline def setComplete(value: js.Any => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    inline def setTicket(value: String): Self = StObject.set(x, "ticket", value.asInstanceOf[js.Any])
  }
}
