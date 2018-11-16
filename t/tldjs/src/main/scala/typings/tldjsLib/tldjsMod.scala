package typings
package tldjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tldjs", JSImport.Namespace)
@js.native
object tldjsMod extends js.Object {
  def extractHostname(host: java.lang.String): java.lang.String | scala.Null = js.native
  def fromUserSettings(options: tldjsLib.Anon_ExtractHostname): tldjsLib.Anon_TldExistsHost = js.native
  def getDomain(host: java.lang.String): java.lang.String | scala.Null = js.native
  def getPublicSuffix(host: java.lang.String): java.lang.String | scala.Null = js.native
  def getSubdomain(host: java.lang.String): java.lang.String | scala.Null = js.native
  def isValid(host: java.lang.String): scala.Boolean = js.native
  def isValidHostname(host: java.lang.String): scala.Boolean = js.native
  def parse(host: java.lang.String): tldjsLib.Anon_PublicSuffix = js.native
  def tldExists(host: java.lang.String): scala.Boolean = js.native
}

