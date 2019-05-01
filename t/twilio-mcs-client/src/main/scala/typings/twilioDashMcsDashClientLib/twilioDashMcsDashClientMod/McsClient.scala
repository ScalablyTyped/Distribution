package typings
package twilioDashMcsDashClientLib.twilioDashMcsDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @classdesc A Client provides an interface for Media Content Service
  */
@JSImport("twilio-mcs-client", "McsClient")
@js.native
class McsClient protected () extends Client {
  /**
    * @param {String} token - Access token
    * @param {String} baseUrl - Base URL for Media Content Service, i.e. /v1/Services/{serviceSid}/Media
    * @param {Client#ClientOptions} [options] - Options to customize the Client
    */
  def this(token: java.lang.String, baseUrl: java.lang.String) = this()
  def this(token: java.lang.String, baseUrl: java.lang.String, options: Options) = this()
}

/* static members */
@JSImport("twilio-mcs-client", "McsClient")
@js.native
object McsClient extends js.Object {
  val version: java.lang.String = js.native
}

