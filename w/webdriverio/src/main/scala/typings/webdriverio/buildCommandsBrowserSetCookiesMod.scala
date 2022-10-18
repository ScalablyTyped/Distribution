package typings.webdriverio

import typings.wdioProtocols.buildTypesMod.Cookie
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildCommandsBrowserSetCookiesMod {
  
  @JSImport("webdriverio/build/commands/browser/setCookies", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(cookieObjs: js.Array[Cookie]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(cookieObjs.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def default(cookieObjs: Cookie): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(cookieObjs.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
