package typings
package tunnelLib.tunnelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tunnel", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def httpOverHttp(): nodeLib.httpMod.Agent = js.native
  def httpOverHttp(options: HttpOptions): nodeLib.httpMod.Agent = js.native
  def httpOverHttps(): nodeLib.httpMod.Agent = js.native
  def httpOverHttps(options: HttpOverHttpsOptions): nodeLib.httpMod.Agent = js.native
  def httpsOverHttp(): nodeLib.httpMod.Agent = js.native
  def httpsOverHttp(options: HttpsOverHttpOptions): nodeLib.httpMod.Agent = js.native
  def httpsOverHttps(): nodeLib.httpMod.Agent = js.native
  def httpsOverHttps(options: HttpsOverHttpsOptions): nodeLib.httpMod.Agent = js.native
}

