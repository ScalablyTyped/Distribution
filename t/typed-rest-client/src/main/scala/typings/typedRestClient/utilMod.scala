package typings.typedRestClient

import typings.node.Buffer
import typings.typedRestClient.interfacesMod.IHttpClientResponse
import typings.typedRestClient.interfacesMod.IRequestQueryParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typed-rest-client/Util", JSImport.Namespace)
@js.native
object utilMod extends js.Object {
  
  def decompressGzippedContent(buffer: Buffer): js.Promise[String] = js.native
  def decompressGzippedContent(buffer: Buffer, charset: String): js.Promise[String] = js.native
  
  def getUrl(resource: String): String = js.native
  def getUrl(resource: String, baseUrl: js.UndefOr[scala.Nothing], queryParams: IRequestQueryParams): String = js.native
  def getUrl(resource: String, baseUrl: String): String = js.native
  def getUrl(resource: String, baseUrl: String, queryParams: IRequestQueryParams): String = js.native
  
  def obtainContentCharset(response: IHttpClientResponse): String = js.native
}
