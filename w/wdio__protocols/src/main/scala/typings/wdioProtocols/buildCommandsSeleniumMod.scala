package typings.wdioProtocols

import typings.wdioProtocols.buildTypesMod.ProtocolCommandResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildCommandsSeleniumMod {
  
  trait SeleniumCommands extends StObject {
    
    /**
      * Selenium Protocol Command
      *
      * Upload a file to remote machine on which the browser is running.
      * @ref https://www.seleniumhq.org/
      *
      */
    def file(file: String): js.Promise[String]
    
    /**
      * Selenium Protocol Command
      *
      * Receive hub config remotely.
      * @ref https://github.com/nicegraham/selenium-grid2-api#gridapihub
      *
      */
    def getHubConfig(): js.Promise[ProtocolCommandResponse]
    
    /**
      * Selenium Protocol Command
      *
      * Get proxy details.
      * @ref https://github.com/nicegraham/selenium-grid2-api#gridapiproxy
      *
      */
    def gridProxyDetails(id: String): js.Promise[ProtocolCommandResponse]
    
    /**
      * Selenium Protocol Command
      *
      * Get the details of the Selenium Grid node running a session.
      * @ref https://github.com/nicegraham/selenium-grid2-api#gridapitestsession
      *
      */
    def gridTestSession(session: String): js.Promise[ProtocolCommandResponse]
    
    /**
      * Selenium Protocol Command
      *
      * Manage lifecycle of hub node.
      * @ref https://github.com/nicegraham/selenium-grid2-api#lifecycle-manager
      *
      */
    def manageSeleniumHubLifecycle(action: String): js.Promise[Unit]
    
    /**
      * Selenium Protocol Command
      *
      * Send GraphQL queries to the Selenium (hub or node) server to fetch data. (Only supported with Selenium v4 Server)
      * @ref https://www.selenium.dev/documentation/grid/advanced_features/graphql_support/
      *
      * @example
      * ```js
      * const result = await browser.queryGrid('{ nodesInfo { nodes { status, uri } } }');
      * console.log(JSON.stringify(result, null, 4))
      * //
      * // outputs:
      * // {
      * //   "data": {
      * //     "nodesInfo": {
      * //       "nodes": [{
      * //         "status": "UP",
      * //         "uri": "http://192.168.0.39:4444"
      * //       }]
      * //     }
      * //   }
      * // }
      * //
      * ```
      */
    def queryGrid(query: String): js.Promise[ProtocolCommandResponse]
  }
  object SeleniumCommands {
    
    inline def apply(
      file: String => js.Promise[String],
      getHubConfig: () => js.Promise[ProtocolCommandResponse],
      gridProxyDetails: String => js.Promise[ProtocolCommandResponse],
      gridTestSession: String => js.Promise[ProtocolCommandResponse],
      manageSeleniumHubLifecycle: String => js.Promise[Unit],
      queryGrid: String => js.Promise[ProtocolCommandResponse]
    ): SeleniumCommands = {
      val __obj = js.Dynamic.literal(file = js.Any.fromFunction1(file), getHubConfig = js.Any.fromFunction0(getHubConfig), gridProxyDetails = js.Any.fromFunction1(gridProxyDetails), gridTestSession = js.Any.fromFunction1(gridTestSession), manageSeleniumHubLifecycle = js.Any.fromFunction1(manageSeleniumHubLifecycle), queryGrid = js.Any.fromFunction1(queryGrid))
      __obj.asInstanceOf[SeleniumCommands]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SeleniumCommands] (val x: Self) extends AnyVal {
      
      inline def setFile(value: String => js.Promise[String]): Self = StObject.set(x, "file", js.Any.fromFunction1(value))
      
      inline def setGetHubConfig(value: () => js.Promise[ProtocolCommandResponse]): Self = StObject.set(x, "getHubConfig", js.Any.fromFunction0(value))
      
      inline def setGridProxyDetails(value: String => js.Promise[ProtocolCommandResponse]): Self = StObject.set(x, "gridProxyDetails", js.Any.fromFunction1(value))
      
      inline def setGridTestSession(value: String => js.Promise[ProtocolCommandResponse]): Self = StObject.set(x, "gridTestSession", js.Any.fromFunction1(value))
      
      inline def setManageSeleniumHubLifecycle(value: String => js.Promise[Unit]): Self = StObject.set(x, "manageSeleniumHubLifecycle", js.Any.fromFunction1(value))
      
      inline def setQueryGrid(value: String => js.Promise[ProtocolCommandResponse]): Self = StObject.set(x, "queryGrid", js.Any.fromFunction1(value))
    }
  }
}
