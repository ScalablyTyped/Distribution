package typings.tldjs

import typings.tldjs.anon.Domain
import typings.tldjs.anon.ExtractHostname
import typings.tldjs.anon.GetDomain
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tldjs", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def extractHostname(host: String): String | Null = js.native
  def fromUserSettings(options: ExtractHostname): GetDomain = js.native
  def getDomain(host: String): String | Null = js.native
  def getPublicSuffix(host: String): String | Null = js.native
  def getSubdomain(host: String): String | Null = js.native
  def isValid(host: String): Boolean = js.native
  def isValidHostname(host: String): Boolean = js.native
  def parse(host: String): Domain = js.native
  def tldExists(host: String): Boolean = js.native
}

