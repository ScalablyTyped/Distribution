package typings.typedDashRestDashClient

import typings.node.Buffer
import typings.typedDashRestDashClient.interfacesMod.IHttpClientResponse
import typings.typedDashRestDashClient.interfacesMod.IRequestQueryParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typed-rest-client/Util", JSImport.Namespace)
@js.native
object utilMod extends js.Object {
  def decompressGzippedContent(buffer: Buffer): js.Promise[String] = js.native
  def decompressGzippedContent(buffer: Buffer, charset: String): js.Promise[String] = js.native
  def getUrl(resource: String): String = js.native
  def getUrl(resource: String, baseUrl: String): String = js.native
  def getUrl(resource: String, baseUrl: String, queryParams: IRequestQueryParams): String = js.native
  def obtainContentCharset(response: IHttpClientResponse): String = js.native
}

