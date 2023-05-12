package typings.wdioProtocols

import typings.wdioProtocols.anon.DELETEVariablesArray
import typings.wdioProtocols.anon.POST
import typings.wdioProtocols.anon.POSTExamples
import typings.wdioProtocols.anon.POSTExamplesParameters
import typings.wdioProtocols.anon.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildProtocolsSaucelabsMod {
  
  object default {
    
    @JSImport("@wdio/protocols/build/protocols/saucelabs", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@wdio/protocols/build/protocols/saucelabs", "default./session/:sessionId/sauce/ondemand/intercept")
    @js.native
    def sessionSessionIdSauceOndemandIntercept: POSTExamples = js.native
    
    inline def sessionSessionIdSauceOndemandIntercept_=(x: POSTExamples): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/sauce/ondemand/intercept")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/saucelabs", "default./session/:sessionId/sauce/ondemand/log")
    @js.native
    def sessionSessionIdSauceOndemandLog: `3` = js.native
    
    inline def sessionSessionIdSauceOndemandLog_=(x: `3`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/sauce/ondemand/log")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/saucelabs", "default./session/:sessionId/sauce/ondemand/mock")
    @js.native
    def sessionSessionIdSauceOndemandMock: POST = js.native
    
    @JSImport("@wdio/protocols/build/protocols/saucelabs", "default./session/:sessionId/sauce/ondemand/mock/:mockId")
    @js.native
    def sessionSessionIdSauceOndemandMockMockId: DELETEVariablesArray = js.native
    
    inline def sessionSessionIdSauceOndemandMockMockId_=(x: DELETEVariablesArray): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/sauce/ondemand/mock/:mockId")(x.asInstanceOf[js.Any])
    
    inline def sessionSessionIdSauceOndemandMock_=(x: POST): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/sauce/ondemand/mock")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/saucelabs", "default./session/:sessionId/sauce/ondemand/performance")
    @js.native
    def sessionSessionIdSauceOndemandPerformance: `3` = js.native
    
    @JSImport("@wdio/protocols/build/protocols/saucelabs", "default./session/:sessionId/sauce/ondemand/performance/scroll")
    @js.native
    def sessionSessionIdSauceOndemandPerformanceScroll: POSTExamplesParameters = js.native
    
    inline def sessionSessionIdSauceOndemandPerformanceScroll_=(x: POSTExamplesParameters): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/sauce/ondemand/performance/scroll")(x.asInstanceOf[js.Any])
    
    inline def sessionSessionIdSauceOndemandPerformance_=(x: `3`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/sauce/ondemand/performance")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/saucelabs", "default./session/:sessionId/sauce/ondemand/throttle/cpu")
    @js.native
    def sessionSessionIdSauceOndemandThrottleCpu: POSTExamples = js.native
    
    inline def sessionSessionIdSauceOndemandThrottleCpu_=(x: POSTExamples): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/sauce/ondemand/throttle/cpu")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/saucelabs", "default./session/:sessionId/sauce/ondemand/throttle/network")
    @js.native
    def sessionSessionIdSauceOndemandThrottleNetwork: POSTExamples = js.native
    
    inline def sessionSessionIdSauceOndemandThrottleNetwork_=(x: POSTExamples): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/sauce/ondemand/throttle/network")(x.asInstanceOf[js.Any])
  }
}
