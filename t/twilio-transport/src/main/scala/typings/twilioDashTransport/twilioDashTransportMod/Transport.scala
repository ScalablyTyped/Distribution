package typings.twilioDashTransport.twilioDashTransportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides generic network interface
  */
@JSImport("twilio-transport", "Transport")
@js.native
class Transport () extends js.Object {
  /**
    * Make a DELETE request by given URL
    */
  def delete(url: String, headers: Headers): js.Promise[Response] = js.native
  /**
    * Make a GET request by given URL
    */
  def get(url: String, headers: Headers): js.Promise[Response] = js.native
  /**
    * Make a POST request by given URL
    */
  def post(url: String, headers: Headers): js.Promise[Response] = js.native
  def post(url: String, headers: Headers, body: String): js.Promise[Response] = js.native
  /**
    * Make a PUT request by given URL
    */
  def put(url: String, headers: Headers, body: js.Any): js.Promise[Response] = js.native
}

/* static members */
@JSImport("twilio-transport", "Transport")
@js.native
object Transport extends js.Object {
  var request: js.Any = js.native
}

