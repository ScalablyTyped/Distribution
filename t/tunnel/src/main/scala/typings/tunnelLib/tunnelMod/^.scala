package typings
package tunnelLib.tunnelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tunnel", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def httpOverHttp(): nodeLib.httpMod.Agent = js.native
  def httpOverHttp(options: tunnelLib.tunnelMod.HttpOptions): nodeLib.httpMod.Agent = js.native
  def httpOverHttps(): nodeLib.httpMod.Agent = js.native
  def httpOverHttps(options: tunnelLib.tunnelMod.HttpOverHttpsOptions): nodeLib.httpMod.Agent = js.native
  def httpsOverHttp(): nodeLib.httpMod.Agent = js.native
  def httpsOverHttp(options: tunnelLib.tunnelMod.HttpsOverHttpOptions): nodeLib.httpMod.Agent = js.native
  def httpsOverHttps(): nodeLib.httpMod.Agent = js.native
  def httpsOverHttps(options: tunnelLib.tunnelMod.HttpsOverHttpsOptions): nodeLib.httpMod.Agent = js.native
}

