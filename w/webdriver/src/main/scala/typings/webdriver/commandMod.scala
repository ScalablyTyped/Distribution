package typings.webdriver

import typings.wdioProtocols.WDIOProtocols.CommandEndpoint
import typings.webdriver.requestMod.WebDriverResponse
import typings.webdriver.typesMod.BaseClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandMod {
  
  @JSImport("webdriver/build/command", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(method: String, endpointUri: String, commandInfo: CommandEndpoint): js.ThisFunction1[/* this */ BaseClient, /* repeated */ js.Any, js.Promise[WebDriverResponse]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(method.asInstanceOf[js.Any], endpointUri.asInstanceOf[js.Any], commandInfo.asInstanceOf[js.Any])).asInstanceOf[js.ThisFunction1[/* this */ BaseClient, /* repeated */ js.Any, js.Promise[WebDriverResponse]]]
  inline def default(method: String, endpointUri: String, commandInfo: CommandEndpoint, doubleEncodeVariables: Boolean): js.ThisFunction1[/* this */ BaseClient, /* repeated */ js.Any, js.Promise[WebDriverResponse]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(method.asInstanceOf[js.Any], endpointUri.asInstanceOf[js.Any], commandInfo.asInstanceOf[js.Any], doubleEncodeVariables.asInstanceOf[js.Any])).asInstanceOf[js.ThisFunction1[/* this */ BaseClient, /* repeated */ js.Any, js.Promise[WebDriverResponse]]]
}
