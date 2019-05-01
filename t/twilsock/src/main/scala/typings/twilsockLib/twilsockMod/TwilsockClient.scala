package typings
package twilsockLib.twilsockMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @alias Twilsock
  * @classdesc Client library for the Twilsock service
  * It allows to recevie service-generated updates as well as bi-directional transport
  */
@JSImport("twilsock", "TwilsockClient")
@js.native
class TwilsockClient protected ()
  extends twilsockLib.libClientMod.TwilsockClient {
  /**
    * @param {string} Token Twilio access token
    * @param {string} ProductId Product identifier. Should be the same as a grant name in token
    */
  def this(token: java.lang.String, productId: java.lang.String) = this()
  def this(token: java.lang.String, productId: java.lang.String, options: js.Any) = this()
}

