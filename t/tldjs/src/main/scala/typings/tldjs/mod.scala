package typings.tldjs

import typings.tldjs.anon.Domain
import typings.tldjs.anon.ExtractHostname
import typings.tldjs.anon.GetDomain
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("tldjs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def extractHostname(host: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("extractHostname")(host.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  inline def fromUserSettings(options: ExtractHostname): GetDomain = ^.asInstanceOf[js.Dynamic].applyDynamic("fromUserSettings")(options.asInstanceOf[js.Any]).asInstanceOf[GetDomain]
  
  inline def getDomain(host: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getDomain")(host.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  inline def getPublicSuffix(host: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getPublicSuffix")(host.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  inline def getSubdomain(host: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getSubdomain")(host.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  inline def isValid(host: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValid")(host.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isValidHostname(host: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidHostname")(host.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def parse(host: String): Domain = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(host.asInstanceOf[js.Any]).asInstanceOf[Domain]
  
  inline def tldExists(host: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("tldExists")(host.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
