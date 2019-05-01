package typings
package twilioDashChatLib.libServicesTypingindicatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class TypingIndicator
  *
  * @constructor
  * @private
  */
@JSImport("twilio-chat/lib/services/typingindicator", "TypingIndicator")
@js.native
class TypingIndicator protected () extends js.Object {
  def this(config: twilioDashChatLib.libConfigurationMod.Configuration, services: TypingIndicatorServices, getChannel: js.Any) = this()
  var _send: js.Any = js.native
  val config: js.Any = js.native
  var getChannel: js.Any = js.native
  var sentUpdates: js.Any = js.native
  var serviceTypingTimeout: js.Any = js.native
  val services: js.Any = js.native
  val typingTimeout: scala.Double = js.native
  /**
    * Remote members typing events handler
    * @private
    */
  def handleRemoteTyping(message: js.Any): scala.Unit = js.native
  /**
    * Initialize TypingIndicator controller
    * Registers for needed message types and sets listeners
    * @private
    */
  def initialize(): scala.Unit = js.native
  /**
    * Send typing event for the given channel sid
    * @param {String} channelSid
    */
  def send(channelSid: java.lang.String): js.Any = js.native
}

