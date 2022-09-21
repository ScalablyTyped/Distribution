package typings.weixinApp.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateShareMenuOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  /** 是否使用带 shareTicket 的转发详情 */
  var withShareTicket: js.UndefOr[Boolean] = js.undefined
}
object UpdateShareMenuOptions {
  
  inline def apply(): UpdateShareMenuOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateShareMenuOptions]
  }
  
  extension [Self <: UpdateShareMenuOptions](x: Self) {
    
    inline def setWithShareTicket(value: Boolean): Self = StObject.set(x, "withShareTicket", value.asInstanceOf[js.Any])
    
    inline def setWithShareTicketUndefined: Self = StObject.set(x, "withShareTicket", js.undefined)
  }
}
