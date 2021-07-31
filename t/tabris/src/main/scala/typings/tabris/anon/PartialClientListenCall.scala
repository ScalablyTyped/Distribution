package typings.tabris.anon

import typings.tabris.tabrisStrings.listen
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<tabris.tabris/ClientMock.ClientListenCall> */
trait PartialClientListenCall extends StObject {
  
  var event: js.UndefOr[String] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var listen: js.UndefOr[Boolean] = js.undefined
  
  var op: js.UndefOr[listen] = js.undefined
}
object PartialClientListenCall {
  
  @scala.inline
  def apply(): PartialClientListenCall = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClientListenCall]
  }
  
  @scala.inline
  implicit class PartialClientListenCallMutableBuilder[Self <: PartialClientListenCall] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setListen(value: Boolean): Self = StObject.set(x, "listen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListenUndefined: Self = StObject.set(x, "listen", js.undefined)
    
    @scala.inline
    def setOp(value: listen): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpUndefined: Self = StObject.set(x, "op", js.undefined)
  }
}
