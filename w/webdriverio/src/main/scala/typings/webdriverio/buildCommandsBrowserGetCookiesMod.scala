package typings.webdriverio

import typings.wdioProtocols.buildTypesMod.Cookie
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildCommandsBrowserGetCookiesMod {
  
  @JSImport("webdriverio/build/commands/browser/getCookies", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): js.Promise[js.Array[Cookie]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Promise[js.Array[Cookie]]]
  inline def default(names: String): js.Promise[js.Array[Cookie]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(names.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Cookie]]]
  inline def default(names: js.Array[String]): js.Promise[js.Array[Cookie]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(names.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Cookie]]]
}
