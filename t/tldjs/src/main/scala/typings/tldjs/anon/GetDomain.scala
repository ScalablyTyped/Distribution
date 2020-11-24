package typings.tldjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDomain extends js.Object {
  
  def extractHostname(host: String): String | Null = js.native
  @JSName("extractHostname")
  var extractHostname_Original: js.Function1[/* host */ String, String | Null] = js.native
  
  def fromUserSettings(options: Rules): FromUserSettings = js.native
  @JSName("fromUserSettings")
  var fromUserSettings_Original: js.Function1[/* options */ Rules, FromUserSettings] = js.native
  
  def getDomain(host: String): String | Null = js.native
  @JSName("getDomain")
  var getDomain_Original: js.Function1[/* host */ String, String | Null] = js.native
  
  def getPublicSuffix(host: String): String | Null = js.native
  @JSName("getPublicSuffix")
  var getPublicSuffix_Original: js.Function1[/* host */ String, String | Null] = js.native
  
  def getSubdomain(host: String): String | Null = js.native
  @JSName("getSubdomain")
  var getSubdomain_Original: js.Function1[/* host */ String, String | Null] = js.native
  
  def isValid(host: String): Boolean = js.native
  
  def isValidHostname(host: String): Boolean = js.native
  @JSName("isValidHostname")
  var isValidHostname_Original: js.Function1[/* host */ String, Boolean] = js.native
  
  @JSName("isValid")
  var isValid_Original: js.Function1[/* host */ String, Boolean] = js.native
  
  def parse(host: String): Hostname = js.native
  @JSName("parse")
  var parse_Original: js.Function1[/* host */ String, Hostname] = js.native
  
  def tldExists(host: String): Boolean = js.native
  @JSName("tldExists")
  var tldExists_Original: js.Function1[/* host */ String, Boolean] = js.native
}
