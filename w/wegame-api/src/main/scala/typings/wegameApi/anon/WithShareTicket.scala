package typings.wegameApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WithShareTicket extends StObject {
  
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var success: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * 是否使用带 shareTicket 的转发详情
    */
  var withShareTicket: Boolean
}
object WithShareTicket {
  
  @scala.inline
  def apply(withShareTicket: Boolean): WithShareTicket = {
    val __obj = js.Dynamic.literal(withShareTicket = withShareTicket.asInstanceOf[js.Any])
    __obj.asInstanceOf[WithShareTicket]
  }
  
  @scala.inline
  implicit class WithShareTicketMutableBuilder[Self <: WithShareTicket] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setFail(value: () => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setSuccess(value: () => Unit): Self = StObject.set(x, "success", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    @scala.inline
    def setWithShareTicket(value: Boolean): Self = StObject.set(x, "withShareTicket", value.asInstanceOf[js.Any])
  }
}
