package typings.webdriverio

import typings.std.Record
import typings.std.Set
import typings.webdriverio.interceptionMod.default
import typings.webdriverio.interceptionTypesMod.MockFilterOptions
import typings.webdriverio.typesMod.Mock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mockMod {
  
  @JSImport("webdriverio/build/commands/browser/mock", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(url: String): js.Promise[Mock] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Mock]]
  inline def default(url: String, filterOptions: MockFilterOptions): js.Promise[Mock] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(url.asInstanceOf[js.Any], filterOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Mock]]
  inline def default(url: js.RegExp): js.Promise[Mock] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Mock]]
  inline def default(url: js.RegExp, filterOptions: MockFilterOptions): js.Promise[Mock] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(url.asInstanceOf[js.Any], filterOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Mock]]
  
  @JSImport("webdriverio/build/commands/browser/mock", "SESSION_MOCKS")
  @js.native
  val SESSION_MOCKS: Record[String, Set[default]] = js.native
}
