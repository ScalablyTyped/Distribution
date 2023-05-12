package typings.twilio.libTwimlVoiceResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamAttributes extends StObject {
  
  /** connectorName - Unique name for Stream Connector */
  var connectorName: js.UndefOr[String] = js.undefined
  
  /** name - Friendly name given to the Stream */
  var name: js.UndefOr[String] = js.undefined
  
  /** statusCallback - Status Callback URL */
  var statusCallback: js.UndefOr[String] = js.undefined
  
  /** statusCallbackMethod - Status Callback URL method */
  var statusCallbackMethod: js.UndefOr[StreamStatusCallbackMethod] = js.undefined
  
  /** track - Track to be streamed to remote service */
  var track: js.UndefOr[StreamTrack] = js.undefined
  
  /** url - URL of the remote service where the Stream is routed */
  var url: js.UndefOr[String] = js.undefined
}
object StreamAttributes {
  
  inline def apply(): StreamAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreamAttributes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StreamAttributes] (val x: Self) extends AnyVal {
    
    inline def setConnectorName(value: String): Self = StObject.set(x, "connectorName", value.asInstanceOf[js.Any])
    
    inline def setConnectorNameUndefined: Self = StObject.set(x, "connectorName", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setStatusCallback(value: String): Self = StObject.set(x, "statusCallback", value.asInstanceOf[js.Any])
    
    inline def setStatusCallbackMethod(value: StreamStatusCallbackMethod): Self = StObject.set(x, "statusCallbackMethod", value.asInstanceOf[js.Any])
    
    inline def setStatusCallbackMethodUndefined: Self = StObject.set(x, "statusCallbackMethod", js.undefined)
    
    inline def setStatusCallbackUndefined: Self = StObject.set(x, "statusCallback", js.undefined)
    
    inline def setTrack(value: StreamTrack): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
    
    inline def setTrackUndefined: Self = StObject.set(x, "track", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
