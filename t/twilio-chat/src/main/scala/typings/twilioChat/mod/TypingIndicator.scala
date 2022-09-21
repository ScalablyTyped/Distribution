package typings.twilioChat.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An important note in regards to typing timeout timers. There are two places that the SDK can get the "typing_timeout" attribute from. The first
  * place that the attribute appears in is the response received from POST -> /v1/typing REST call. In the body of that response, the value of the
  * "typing_timeout" attribute will be exactly the same as defined in the console. The second place that the attribute appears in is from a
  * notification of type "twilio.ipmsg.typing_indicator". In this case, the "typing_timeout" value will be +1 of that in the console. This
  * intentional. The timeout returned from the POST -> /v1/typing call should be used to disable further calls for that period of time. On contrary,
  * the timeout returned from the notification should be used as the timeout for the "typingEnded" event, +1 is to account for latency.
  *
  * @private
  */
/**
  * @class TypingIndicator
  *
  * @constructor
  * @private
  */
@js.native
trait TypingIndicator extends StObject {
  
  /**
    * Remote members typing events handler
    * @private
    */
  /* private */ var _handleRemoteTyping: Any = js.native
  
  /* private */ var _send: Any = js.native
  
  /* private */ val configuration: Any = js.native
  
  /* private */ val getChannel: Any = js.native
  
  /**
    * Initialize TypingIndicator controller
    * Registers for needed message types and sets listeners
    * @private
    */
  def initialize(): Unit = js.native
  
  /**
    * Send typing event for the given channel sid
    * @param {String} channelSid
    */
  def send(channelSid: String): js.Promise[Unit] = js.native
  
  /* private */ var sentUpdates: Any = js.native
  
  /* private */ var serviceTypingTimeout: Any = js.native
  
  /* private */ val services: Any = js.native
  
  def typingTimeout: Double = js.native
}
