package typings
package typedDashRestDashClientLib.httpclientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typed-rest-client/HttpClient", "HttpClientResponse")
@js.native
class HttpClientResponse protected ()
  extends typedDashRestDashClientLib.interfacesMod.IHttpClientResponse {
  def this(message: nodeLib.httpMod.IncomingMessage) = this()
  /* CompleteClass */
  override var message: nodeLib.httpMod.IncomingMessage = js.native
  /* CompleteClass */
  override def readBody(): js.Promise[java.lang.String] = js.native
}

