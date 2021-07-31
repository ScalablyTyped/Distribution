package typings.tabris

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageEventInit
  extends StObject
     with EventInit {
  
  var channel: js.UndefOr[String] = js.undefined
  
  var data: js.UndefOr[js.Any] = js.undefined
  
  var lastEventId: js.UndefOr[String] = js.undefined
  
  var origin: js.UndefOr[String] = js.undefined
  
  var ports: js.UndefOr[js.Array[MessagePort]] = js.undefined
  
  var source: js.UndefOr[js.Any] = js.undefined
}
object MessageEventInit {
  
  @scala.inline
  def apply(): MessageEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessageEventInit]
  }
  
  @scala.inline
  implicit class MessageEventInitMutableBuilder[Self <: MessageEventInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelUndefined: Self = StObject.set(x, "channel", js.undefined)
    
    @scala.inline
    def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setLastEventId(value: String): Self = StObject.set(x, "lastEventId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastEventIdUndefined: Self = StObject.set(x, "lastEventId", js.undefined)
    
    @scala.inline
    def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    
    @scala.inline
    def setPorts(value: js.Array[MessagePort]): Self = StObject.set(x, "ports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortsUndefined: Self = StObject.set(x, "ports", js.undefined)
    
    @scala.inline
    def setPortsVarargs(value: MessagePort*): Self = StObject.set(x, "ports", js.Array(value :_*))
    
    @scala.inline
    def setSource(value: js.Any): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
