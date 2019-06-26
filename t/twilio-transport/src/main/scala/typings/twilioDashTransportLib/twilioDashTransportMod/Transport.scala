package typings
package twilioDashTransportLib.twilioDashTransportMod

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
  def delete(url: java.lang.String, headers: Headers): js.Promise[Response] = js.native
  /**
    * Make a GET request by given URL
    */
  def get(url: java.lang.String, headers: Headers): js.Promise[Response] = js.native
  /**
    * Make a POST request by given URL
    */
  def post(url: java.lang.String, headers: Headers): js.Promise[Response] = js.native
  def post(url: java.lang.String, headers: Headers, body: java.lang.String): js.Promise[Response] = js.native
  /**
    * Make a PUT request by given URL
    */
  def put(url: java.lang.String, headers: Headers, body: js.Any): js.Promise[Response] = js.native
}

/* static members */
@JSImport("twilio-transport", "Transport")
@js.native
object Transport extends js.Object {
  var request: js.Any = js.native
}

