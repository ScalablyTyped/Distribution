package typings
package whatwgDashUrlLib.whatwgDashUrlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("whatwg-url", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def basicURLParse(input: java.lang.String): whatwgDashUrlLib.whatwgDashUrlMod.URLRecord | scala.Null = js.native
  def basicURLParse(input: java.lang.String, options: whatwgDashUrlLib.Anon_BaseURLEncodingOverride): whatwgDashUrlLib.whatwgDashUrlMod.URLRecord | scala.Null = js.native
  def cannotHaveAUsernamePasswordPort(urlRecord: whatwgDashUrlLib.whatwgDashUrlMod.URLRecord): scala.Boolean = js.native
  def parseURL(input: java.lang.String): whatwgDashUrlLib.whatwgDashUrlMod.URLRecord | scala.Null = js.native
  def parseURL(input: java.lang.String, options: whatwgDashUrlLib.Anon_BaseURL): whatwgDashUrlLib.whatwgDashUrlMod.URLRecord | scala.Null = js.native
  def percentDecode(buffer: nodeLib.Buffer): nodeLib.Buffer = js.native
  def serializeHost(host: java.lang.String): java.lang.String = js.native
  def serializeHost(host: scala.Double): java.lang.String = js.native
  def serializeHost(host: whatwgDashUrlLib.whatwgDashUrlMod.IPv6Address): java.lang.String = js.native
  def serializeInteger(number: scala.Double): java.lang.String = js.native
  def serializeURL(urlRecord: whatwgDashUrlLib.whatwgDashUrlMod.URLRecord): java.lang.String = js.native
  def serializeURL(urlRecord: whatwgDashUrlLib.whatwgDashUrlMod.URLRecord, excludeFragment: scala.Boolean): java.lang.String = js.native
  def serializeURLOrigin(urlRecord: whatwgDashUrlLib.whatwgDashUrlMod.URLRecord): java.lang.String = js.native
  def setThePassword(urlRecord: whatwgDashUrlLib.whatwgDashUrlMod.URLRecord, password: java.lang.String): scala.Unit = js.native
  def setTheUsername(urlRecord: whatwgDashUrlLib.whatwgDashUrlMod.URLRecord, username: java.lang.String): scala.Unit = js.native
}

