package typings.twilioMcsClient.transportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides generic network interface
  */
@JSImport("twilio-mcs-client/lib/services/transport", "Transport")
@js.native
class Transport () extends js.Object {
  /**
    * Make a GET request by given URL
    */
  def get(url: String, headers: Headers): js.Promise[Response] = js.native
  /**
    * Make a POST request by given URL
    */
  def post(url: String, headers: Headers): js.Promise[Response] = js.native
  def post(url: String, headers: Headers, body: js.Any): js.Promise[Response] = js.native
}

/* static members */
@JSImport("twilio-mcs-client/lib/services/transport", "Transport")
@js.native
object Transport extends js.Object {
  var request: js.Any = js.native
}

