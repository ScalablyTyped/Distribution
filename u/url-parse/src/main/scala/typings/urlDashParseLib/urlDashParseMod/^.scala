package typings
package urlDashParseLib.urlDashParseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("url-parse", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var qs: urlDashParseLib.Anon_Parse = js.native
  def apply(address: java.lang.String): URLParse = js.native
  def apply(address: java.lang.String, location: java.lang.String): URLParse = js.native
  def apply(address: java.lang.String, location: java.lang.String, parser: scala.Boolean): URLParse = js.native
  def apply(address: java.lang.String, location: java.lang.String, parser: QueryParser): URLParse = js.native
  def apply(address: java.lang.String, location: js.Object): URLParse = js.native
  def apply(address: java.lang.String, location: js.Object, parser: scala.Boolean): URLParse = js.native
  def apply(address: java.lang.String, location: js.Object, parser: QueryParser): URLParse = js.native
  def apply(address: java.lang.String, parser: scala.Boolean): URLParse = js.native
  def apply(address: java.lang.String, parser: QueryParser): URLParse = js.native
  def extractProtocol(url: java.lang.String): urlDashParseLib.Anon_Protocol = js.native
  def location(url: java.lang.String): js.Object = js.native
}

