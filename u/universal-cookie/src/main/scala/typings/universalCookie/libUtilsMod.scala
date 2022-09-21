package typings.universalCookie

import typings.universalCookie.libTypesMod.Cookie
import typings.universalCookie.libTypesMod.CookieGetOptions
import typings.universalCookie.libTypesMod.CookieParseOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsMod {
  
  @JSImport("universal-cookie/lib/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def cleanCookies(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cleanCookies")().asInstanceOf[Unit]
  
  inline def hasDocumentCookie(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasDocumentCookie")().asInstanceOf[Boolean]
  
  inline def isParsingCookie(value: Cookie): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isParsingCookie")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isParsingCookie(value: Cookie, doNotParse: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isParsingCookie")(value.asInstanceOf[js.Any], doNotParse.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def parseCookies(): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("parseCookies")().asInstanceOf[js.Object]
  inline def parseCookies(cookies: String): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("parseCookies")(cookies.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  inline def parseCookies(cookies: String, options: CookieParseOptions): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("parseCookies")(cookies.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  inline def parseCookies(cookies: js.Object): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("parseCookies")(cookies.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  inline def parseCookies(cookies: js.Object, options: CookieParseOptions): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("parseCookies")(cookies.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  inline def parseCookies(cookies: Null, options: CookieParseOptions): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("parseCookies")(cookies.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  inline def parseCookies(cookies: Unit, options: CookieParseOptions): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("parseCookies")(cookies.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  inline def readCookie(value: Cookie): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("readCookie")(value.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def readCookie(value: Cookie, options: CookieGetOptions): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("readCookie")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
}
