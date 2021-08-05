package typings.twilioChat

import typings.twilioChat.sessionMod.Session
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object consumptionhorizonMod {
  
  /**
    * @classdesc Provides consumption horizon management functionality
    */
  @JSImport("twilio-chat/lib/services/consumptionhorizon", "ConsumptionHorizon")
  @js.native
  class ConsumptionHorizon protected () extends StObject {
    def this(services: ConsumptionHorizonServices) = this()
    
    /* private */ var addPendingConsumptionHorizonRequest: js.Any = js.native
    
    /**
      * Move consumption horizon forward
      */
    def advanceLastConsumedMessageIndexForChannel(channelSid: String, messageIdx: Double, currentChannelLastConsumedIndex: Double): js.Promise[Double] = js.native
    
    /* private */ val consumptionHorizonRequests: js.Any = js.native
    
    /* private */ var consumptionHorizonUpdateTimer: js.Any = js.native
    
    /* private */ var delayedSendConsumptionHorizon: js.Any = js.native
    
    /* private */ var getReportInterval: js.Any = js.native
    
    /* private */ var processConsumptionReportError: js.Any = js.native
    
    /* private */ var processConsumptionReportResponse: js.Any = js.native
    
    /* private */ var sendConsumptionReport: js.Any = js.native
    
    /* private */ val services: js.Any = js.native
    
    /**
      * Updates consumption horizon value without any checks
      */
    def updateLastConsumedMessageIndexForChannel(channelSid: String, messageIdx: Double): js.Promise[Double] = js.native
  }
  
  trait ConsumptionHorizonServices extends StObject {
    
    var session: Session
  }
  object ConsumptionHorizonServices {
    
    inline def apply(session: Session): ConsumptionHorizonServices = {
      val __obj = js.Dynamic.literal(session = session.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConsumptionHorizonServices]
    }
    
    extension [Self <: ConsumptionHorizonServices](x: Self) {
      
      inline def setSession(value: Session): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    }
  }
}
