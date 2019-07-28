package typings.whatwgDashUrl.whatwgDashUrlMod

import typings.node.Buffer
import typings.whatwgDashUrl.Anon_BaseURL
import typings.whatwgDashUrl.Anon_BaseURLEncodingOverride
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("whatwg-url", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def basicURLParse(input: String): URLRecord | Null = js.native
  def basicURLParse(input: String, options: Anon_BaseURLEncodingOverride): URLRecord | Null = js.native
  def cannotHaveAUsernamePasswordPort(urlRecord: URLRecord): Boolean = js.native
  def parseURL(input: String): URLRecord | Null = js.native
  def parseURL(input: String, options: Anon_BaseURL): URLRecord | Null = js.native
  def percentDecode(buffer: Buffer): Buffer = js.native
  def serializeHost(host: String): String = js.native
  def serializeHost(host: Double): String = js.native
  def serializeHost(host: IPv6Address): String = js.native
  def serializeInteger(number: Double): String = js.native
  def serializeURL(urlRecord: URLRecord): String = js.native
  def serializeURL(urlRecord: URLRecord, excludeFragment: Boolean): String = js.native
  def serializeURLOrigin(urlRecord: URLRecord): String = js.native
  def setThePassword(urlRecord: URLRecord, password: String): Unit = js.native
  def setTheUsername(urlRecord: URLRecord, username: String): Unit = js.native
}

