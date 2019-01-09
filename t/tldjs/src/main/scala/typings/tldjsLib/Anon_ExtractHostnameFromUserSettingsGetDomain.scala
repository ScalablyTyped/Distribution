package typings
package tldjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ExtractHostnameFromUserSettingsGetDomain extends js.Object {
  @JSName("extractHostname")
  var extractHostname_Original: js.Function1[/* host */ java.lang.String, java.lang.String | scala.Null] = js.native
  @JSName("fromUserSettings")
  var fromUserSettings_Original: js.Function1[/* options */ Anon_ExtractHostnameRules, Anon_ExtractHostnameFromUserSettings] = js.native
  @JSName("getDomain")
  var getDomain_Original: js.Function1[/* host */ java.lang.String, java.lang.String | scala.Null] = js.native
  @JSName("getPublicSuffix")
  var getPublicSuffix_Original: js.Function1[/* host */ java.lang.String, java.lang.String | scala.Null] = js.native
  @JSName("getSubdomain")
  var getSubdomain_Original: js.Function1[/* host */ java.lang.String, java.lang.String | scala.Null] = js.native
  @JSName("isValidHostname")
  var isValidHostname_Original: js.Function1[/* host */ java.lang.String, scala.Boolean] = js.native
  @JSName("isValid")
  var isValid_Original: js.Function1[/* host */ java.lang.String, scala.Boolean] = js.native
  @JSName("parse")
  var parse_Original: js.Function1[/* host */ java.lang.String, Anon_DomainHostname] = js.native
  @JSName("tldExists")
  var tldExists_Original: js.Function1[/* host */ java.lang.String, scala.Boolean] = js.native
  def extractHostname(host: java.lang.String): java.lang.String | scala.Null = js.native
  def fromUserSettings(options: Anon_ExtractHostnameRules): Anon_ExtractHostnameFromUserSettings = js.native
  def getDomain(host: java.lang.String): java.lang.String | scala.Null = js.native
  def getPublicSuffix(host: java.lang.String): java.lang.String | scala.Null = js.native
  def getSubdomain(host: java.lang.String): java.lang.String | scala.Null = js.native
  def isValid(host: java.lang.String): scala.Boolean = js.native
  def isValidHostname(host: java.lang.String): scala.Boolean = js.native
  def parse(host: java.lang.String): Anon_DomainHostname = js.native
  def tldExists(host: java.lang.String): scala.Boolean = js.native
}

