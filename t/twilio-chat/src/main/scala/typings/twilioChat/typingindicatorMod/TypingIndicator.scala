package typings.twilioChat.typingindicatorMod

import typings.twilioChat.configurationMod.Configuration
import scala.scalajs.js
import scala.scalajs.js.`|`
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
@JSImport("twilio-chat/lib/services/typingindicator", "TypingIndicator")
@js.native
class TypingIndicator protected () extends js.Object {
  def this(config: Configuration, services: TypingIndicatorServices, getChannel: js.Any) = this()
  
  var _send: js.Any = js.native
  
  val config: js.Any = js.native
  
  var getChannel: js.Any = js.native
  
  /**
    * Remote members typing events handler
    * @private
    */
  def handleRemoteTyping(message: js.Any): Unit = js.native
  
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
  def send(channelSid: String): js.Any = js.native
  
  var sentUpdates: js.Any = js.native
  
  var serviceTypingTimeout: js.Any = js.native
  
  val services: js.Any = js.native
  
  def typingTimeout: Double = js.native
}
