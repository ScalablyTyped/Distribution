package typings.twilsock

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilsock", JSImport.Namespace)
@js.native
object twilsockMod extends js.Object {
  @js.native
  class TransportUnavailableError protected ()
    extends typings.twilsock.libErrorTransportunavailableerrorMod.TransportUnavailableError {
    def this(description: String) = this()
  }
  
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
  @js.native
  class Twilsock protected ()
    extends typings.twilsock.libClientMod.TwilsockClient {
    /**
      * @param {string} token Twilio access token
      * @param {string} productId Product identifier. Should be the same as a grant name in token
      */
    def this(token: String, productId: String) = this()
    def this(token: String, productId: String, options: js.Any) = this()
  }
  
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
  @js.native
  class TwilsockClient protected ()
    extends typings.twilsock.libClientMod.TwilsockClient {
    /**
      * @param {string} token Twilio access token
      * @param {string} productId Product identifier. Should be the same as a grant name in token
      */
    def this(token: String, productId: String) = this()
    def this(token: String, productId: String, options: js.Any) = this()
  }
  
  @js.native
  class TwilsockError protected ()
    extends typings.twilsock.libErrorTwilsockerrorMod.TwilsockError {
    def this(description: String) = this()
  }
  
}

