package typings.tldjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tldjs", JSImport.Namespace)
@js.native
object tldjsMod extends js.Object {
  def extractHostname(host: String): String | Null = js.native
  def fromUserSettings(options: Anon_ExtractHostname): Anon_ExtractHostnameFromUserSettingsGetDomain = js.native
  def getDomain(host: String): String | Null = js.native
  def getPublicSuffix(host: String): String | Null = js.native
  def getSubdomain(host: String): String | Null = js.native
  def isValid(host: String): Boolean = js.native
  def isValidHostname(host: String): Boolean = js.native
  def parse(host: String): Anon_Domain = js.native
  def tldExists(host: String): Boolean = js.native
}

