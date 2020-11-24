package typings.twilioSync.servicesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @alias Twilsock
  * @classdesc Client library for the Twilsock service
  * It allows to recevie service-generated updates as well as bi-directional transport
  * @fires Twilsock#message
  * @fires Twilsock#connected
  * @fires Twilsock#disconnected
  * @fires Twilsock#tokenAboutToExpire
  * @fires Twilsock#stateChanged
  * @fires Twilsock#connectionError
  */
@JSImport("twilio-sync/lib/interfaces/services", "Twilsock")
@js.native
class Twilsock protected ()
  extends typings.twilsock.mod.Twilsock {
  /**
    * @param {string} token Twilio access token
    * @param {string} productId Product identifier. Should be the same as a grant name in token
    */
  def this(token: String, productId: String) = this()
  def this(token: String, productId: String, options: js.Any) = this()
}
