package typings.urlDashParse.urlDashParseMod

import typings.urlDashParse.Anon_Parse
import typings.urlDashParse.Anon_Protocol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("url-parse", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var qs: Anon_Parse = js.native
  def apply(address: String): URLParse = js.native
  def apply(address: String, location: String): URLParse = js.native
  def apply(address: String, location: String, parser: Boolean): URLParse = js.native
  def apply(address: String, location: String, parser: QueryParser): URLParse = js.native
  def apply(address: String, location: js.Object): URLParse = js.native
  def apply(address: String, location: js.Object, parser: Boolean): URLParse = js.native
  def apply(address: String, location: js.Object, parser: QueryParser): URLParse = js.native
  def apply(address: String, parser: Boolean): URLParse = js.native
  def apply(address: String, parser: QueryParser): URLParse = js.native
  def extractProtocol(url: String): Anon_Protocol = js.native
  def location(url: String): js.Object = js.native
}

