package typings.tldjs

import typings.tldjs.anon.Domain
import typings.tldjs.anon.ExtractHostname
import typings.tldjs.anon.GetDomain
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("tldjs", "extractHostname")
  @js.native
  def extractHostname(host: String): String | Null = js.native
  
  @JSImport("tldjs", "fromUserSettings")
  @js.native
  def fromUserSettings(options: ExtractHostname): GetDomain = js.native
  
  @JSImport("tldjs", "getDomain")
  @js.native
  def getDomain(host: String): String | Null = js.native
  
  @JSImport("tldjs", "getPublicSuffix")
  @js.native
  def getPublicSuffix(host: String): String | Null = js.native
  
  @JSImport("tldjs", "getSubdomain")
  @js.native
  def getSubdomain(host: String): String | Null = js.native
  
  @JSImport("tldjs", "isValid")
  @js.native
  def isValid(host: String): Boolean = js.native
  
  @JSImport("tldjs", "isValidHostname")
  @js.native
  def isValidHostname(host: String): Boolean = js.native
  
  @JSImport("tldjs", "parse")
  @js.native
  def parse(host: String): Domain = js.native
  
  @JSImport("tldjs", "tldExists")
  @js.native
  def tldExists(host: String): Boolean = js.native
}
