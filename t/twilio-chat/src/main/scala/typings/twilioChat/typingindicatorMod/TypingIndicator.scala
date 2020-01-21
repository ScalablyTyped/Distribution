package typings.twilioChat.typingindicatorMod

import typings.twilioChat.configurationMod.Configuration
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
  def this(config: Configuration, services: TypingIndicatorServices, getChannel: js.Any) = this()
  var _send: js.Any = js.native
  val config: js.Any = js.native
  var getChannel: js.Any = js.native
  var sentUpdates: js.Any = js.native
  var serviceTypingTimeout: js.Any = js.native
  val services: js.Any = js.native
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
  def typingTimeout(): Double = js.native
}

