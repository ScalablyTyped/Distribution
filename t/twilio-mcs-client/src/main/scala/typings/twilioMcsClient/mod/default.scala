package typings.twilioMcsClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @classdesc A Client provides an interface for Media Content Service
  */
@JSImport("twilio-mcs-client", JSImport.Default)
@js.native
class default protected () extends Client {
  /**
    * @param {String} token - Access token
    * @param {String} baseUrl - Base URL for Media Content Service, i.e. /v1/Services/{serviceSid}/Media
    * @param {Client#ClientOptions} [options] - Options to customize the Client
    */
  def this(token: String, baseUrl: String) = this()
  def this(token: String, baseUrl: String, options: Options) = this()
}
/* static members */
@JSImport("twilio-mcs-client", JSImport.Default)
@js.native
object default extends js.Object {
  
  val version: String = js.native
}
