package typings.typedRestClient.httpClientMod

import typings.node.httpMod.IncomingMessage
import typings.typedRestClient.interfacesMod.IHttpClientResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typed-rest-client/HttpClient", "HttpClientResponse")
@js.native
class HttpClientResponse protected () extends IHttpClientResponse {
  def this(message: IncomingMessage) = this()
}
