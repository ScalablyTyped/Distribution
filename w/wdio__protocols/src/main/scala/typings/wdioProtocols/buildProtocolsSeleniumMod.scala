package typings.wdioProtocols

import typings.wdioProtocols.anon.GETCommandDescriptionIsHubCommand
import typings.wdioProtocols.anon.GETDescriptionIsHubCommand
import typings.wdioProtocols.anon.GETIsHubCommand
import typings.wdioProtocols.anon.GETIsHubCommandParameters
import typings.wdioProtocols.anon.POST
import typings.wdioProtocols.anon.POSTExamplesIsHubCommand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildProtocolsSeleniumMod {
  
  object default {
    
    @JSImport("@wdio/protocols/build/protocols/selenium", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@wdio/protocols/build/protocols/selenium", "default./graphql")
    @js.native
    def graphql: POSTExamplesIsHubCommand = js.native
    
    inline def graphql_=(x: POSTExamplesIsHubCommand): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/graphql")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/selenium", "default./grid/api/hub/")
    @js.native
    def gridApiHub: GETIsHubCommand = js.native
    
    inline def gridApiHub_=(x: GETIsHubCommand): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/grid/api/hub/")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/selenium", "default./grid/api/proxy")
    @js.native
    def gridApiProxy: GETIsHubCommandParameters = js.native
    
    inline def gridApiProxy_=(x: GETIsHubCommandParameters): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/grid/api/proxy")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/selenium", "default./grid/api/testsession?session=:session")
    @js.native
    def gridApiTestsessionSessionSession: GETDescriptionIsHubCommand = js.native
    
    inline def gridApiTestsessionSessionSession_=(x: GETDescriptionIsHubCommand): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/grid/api/testsession?session=:session")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/selenium", "default./lifecycle-manager?action=:action")
    @js.native
    def lifecycleManagerActionAction: GETCommandDescriptionIsHubCommand = js.native
    
    inline def lifecycleManagerActionAction_=(x: GETCommandDescriptionIsHubCommand): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/lifecycle-manager?action=:action")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/selenium", "default./session/:sessionId/file")
    @js.native
    def sessionSessionIdFile: POST = js.native
    
    inline def sessionSessionIdFile_=(x: POST): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/file")(x.asInstanceOf[js.Any])
  }
}
