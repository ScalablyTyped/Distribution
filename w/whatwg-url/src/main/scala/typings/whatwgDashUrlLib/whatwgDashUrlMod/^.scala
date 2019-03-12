package typings
package whatwgDashUrlLib.whatwgDashUrlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("whatwg-url", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def basicURLParse(input: java.lang.String): URLRecord | scala.Null = js.native
  def basicURLParse(input: java.lang.String, options: whatwgDashUrlLib.Anon_BaseURLEncodingOverride): URLRecord | scala.Null = js.native
  def cannotHaveAUsernamePasswordPort(urlRecord: URLRecord): scala.Boolean = js.native
  def parseURL(input: java.lang.String): URLRecord | scala.Null = js.native
  def parseURL(input: java.lang.String, options: whatwgDashUrlLib.Anon_BaseURL): URLRecord | scala.Null = js.native
  def percentDecode(buffer: nodeLib.Buffer): nodeLib.Buffer = js.native
  def serializeHost(host: java.lang.String): java.lang.String = js.native
  def serializeHost(host: scala.Double): java.lang.String = js.native
  def serializeHost(host: IPv6Address): java.lang.String = js.native
  def serializeInteger(number: scala.Double): java.lang.String = js.native
  def serializeURL(urlRecord: URLRecord): java.lang.String = js.native
  def serializeURL(urlRecord: URLRecord, excludeFragment: scala.Boolean): java.lang.String = js.native
  def serializeURLOrigin(urlRecord: URLRecord): java.lang.String = js.native
  def setThePassword(urlRecord: URLRecord, password: java.lang.String): scala.Unit = js.native
  def setTheUsername(urlRecord: URLRecord, username: java.lang.String): scala.Unit = js.native
}

