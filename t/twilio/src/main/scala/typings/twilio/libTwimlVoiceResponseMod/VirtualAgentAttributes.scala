package typings.twilio.libTwimlVoiceResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualAgentAttributes extends StObject {
  
  var connectorName: js.UndefOr[String] = js.undefined
  
  var language: js.UndefOr[String] = js.undefined
  
  var sentimentAnalysis: js.UndefOr[Boolean] = js.undefined
  
  var statusCallback: js.UndefOr[String] = js.undefined
  
  var statusCallbackMethod: js.UndefOr[String] = js.undefined
}
object VirtualAgentAttributes {
  
  inline def apply(): VirtualAgentAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VirtualAgentAttributes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VirtualAgentAttributes] (val x: Self) extends AnyVal {
    
    inline def setConnectorName(value: String): Self = StObject.set(x, "connectorName", value.asInstanceOf[js.Any])
    
    inline def setConnectorNameUndefined: Self = StObject.set(x, "connectorName", js.undefined)
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setSentimentAnalysis(value: Boolean): Self = StObject.set(x, "sentimentAnalysis", value.asInstanceOf[js.Any])
    
    inline def setSentimentAnalysisUndefined: Self = StObject.set(x, "sentimentAnalysis", js.undefined)
    
    inline def setStatusCallback(value: String): Self = StObject.set(x, "statusCallback", value.asInstanceOf[js.Any])
    
    inline def setStatusCallbackMethod(value: String): Self = StObject.set(x, "statusCallbackMethod", value.asInstanceOf[js.Any])
    
    inline def setStatusCallbackMethodUndefined: Self = StObject.set(x, "statusCallbackMethod", js.undefined)
    
    inline def setStatusCallbackUndefined: Self = StObject.set(x, "statusCallback", js.undefined)
  }
}
