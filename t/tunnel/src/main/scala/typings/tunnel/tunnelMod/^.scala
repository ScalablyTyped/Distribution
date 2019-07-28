package typings.tunnel.tunnelMod

import typings.node.httpMod.Agent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tunnel", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def httpOverHttp(): Agent = js.native
  def httpOverHttp(options: HttpOptions): Agent = js.native
  def httpOverHttps(): Agent = js.native
  def httpOverHttps(options: HttpOverHttpsOptions): Agent = js.native
  def httpsOverHttp(): Agent = js.native
  def httpsOverHttp(options: HttpsOverHttpOptions): Agent = js.native
  def httpsOverHttps(): Agent = js.native
  def httpsOverHttps(options: HttpsOverHttpsOptions): Agent = js.native
}

