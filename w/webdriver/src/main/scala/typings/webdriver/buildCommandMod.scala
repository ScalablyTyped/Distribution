package typings.webdriver

import typings.wdioProtocols.buildTypesMod.BidiResponse
import typings.wdioProtocols.buildTypesMod.CommandEndpoint
import typings.webdriver.buildBidiMod.BidiHandler
import typings.webdriver.buildRequestMod.WebDriverResponse
import typings.webdriver.buildTypesMod.BaseClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildCommandMod {
  
  @JSImport("webdriver/build/command", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(method: String, endpointUri: String, commandInfo: CommandEndpoint): js.ThisFunction1[
    /* this */ BaseClientWithEventHandler, 
    /* repeated */ Any, 
    js.Promise[WebDriverResponse | BidiResponse | Unit]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(method.asInstanceOf[js.Any], endpointUri.asInstanceOf[js.Any], commandInfo.asInstanceOf[js.Any])).asInstanceOf[js.ThisFunction1[
    /* this */ BaseClientWithEventHandler, 
    /* repeated */ Any, 
    js.Promise[WebDriverResponse | BidiResponse | Unit]
  ]]
  inline def default(method: String, endpointUri: String, commandInfo: CommandEndpoint, doubleEncodeVariables: Boolean): js.ThisFunction1[
    /* this */ BaseClientWithEventHandler, 
    /* repeated */ Any, 
    js.Promise[WebDriverResponse | BidiResponse | Unit]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(method.asInstanceOf[js.Any], endpointUri.asInstanceOf[js.Any], commandInfo.asInstanceOf[js.Any], doubleEncodeVariables.asInstanceOf[js.Any])).asInstanceOf[js.ThisFunction1[
    /* this */ BaseClientWithEventHandler, 
    /* repeated */ Any, 
    js.Promise[WebDriverResponse | BidiResponse | Unit]
  ]]
  
  @js.native
  trait BaseClientWithEventHandler extends BaseClient {
    
    var eventMiddleware: BidiHandler = js.native
  }
}
