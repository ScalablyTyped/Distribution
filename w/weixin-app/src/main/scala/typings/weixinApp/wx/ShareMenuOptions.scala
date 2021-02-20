package typings.weixinApp.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShareMenuOptions
  extends BaseOptions[js.Any, js.Any] {
  
  var withShareTicket: js.UndefOr[Boolean] = js.native
}
object ShareMenuOptions {
  
  @scala.inline
  def apply(): ShareMenuOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShareMenuOptions]
  }
  
  @scala.inline
  implicit class ShareMenuOptionsMutableBuilder[Self <: ShareMenuOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWithShareTicket(value: Boolean): Self = StObject.set(x, "withShareTicket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWithShareTicketUndefined: Self = StObject.set(x, "withShareTicket", js.undefined)
  }
}
