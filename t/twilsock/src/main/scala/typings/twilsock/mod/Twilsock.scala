package typings.twilsock.mod

import typings.twilsock.anon.PartialClientOptionsType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @alias Twilsock
  * @classdesc Client library for the Twilsock service
  * It allows to recevie service-generated updates as well as bi-directional transport
  * @fires Twilsock#message
  * @fires Twilsock#connected
  * @fires Twilsock#disconnected
  * @fires Twilsock#tokenAboutToExpire
  * @fires Twilsock#tokenExpired
  * @fires Twilsock#stateChanged
  * @fires Twilsock#connectionError
  */
@JSImport("twilsock", "Twilsock")
@js.native
open class Twilsock protected () extends TwilsockClient {
  /**
    * @param {string} token Twilio access token
    * @param {string} productId Product identifier. Should be the same as a grant name in token
    * @param {object} options Twilsock configuration options
    */
  def this(token: String, productId: String, options: PartialClientOptionsType) = this()
}
