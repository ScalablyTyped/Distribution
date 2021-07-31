package typings.weixinApp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShareTickets extends StObject {
  
  /** 每一项是一个 shareTicket ，对应一个转发对象 */
  var shareTickets: js.Array[String]
}
object ShareTickets {
  
  @scala.inline
  def apply(shareTickets: js.Array[String]): ShareTickets = {
    val __obj = js.Dynamic.literal(shareTickets = shareTickets.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShareTickets]
  }
  
  @scala.inline
  implicit class ShareTicketsMutableBuilder[Self <: ShareTickets] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setShareTickets(value: js.Array[String]): Self = StObject.set(x, "shareTickets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShareTicketsVarargs(value: String*): Self = StObject.set(x, "shareTickets", js.Array(value :_*))
  }
}
