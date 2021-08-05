package typings.webdriverio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object setCookiesMod {
  
  @JSImport("webdriverio/build/commands/browser/setCookies", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(
    cookieObjs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebDriver.Cookie */ js.Any
  ): js.Promise[js.Array[Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(cookieObjs.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Unit]]]
  inline def default(
    cookieObjs: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebDriver.Cookie */ js.Any
    ]
  ): js.Promise[js.Array[Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(cookieObjs.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Unit]]]
}
