package typings.wepy.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShareTicket extends StObject {
  
  var shareTicket: String = js.native
  
  var timeout: Double = js.native
}
object ShareTicket {
  
  @scala.inline
  def apply(shareTicket: String, timeout: Double): ShareTicket = {
    val __obj = js.Dynamic.literal(shareTicket = shareTicket.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShareTicket]
  }
  
  @scala.inline
  implicit class ShareTicketMutableBuilder[Self <: ShareTicket] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setShareTicket(value: String): Self = StObject.set(x, "shareTicket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
  }
}
