package typings.wdioProtocols

import typings.wdioProtocols.anon.GETCommandParameters
import typings.wdioProtocols.anon.GETCommandParametersRef
import typings.wdioProtocols.anon.GETCommandParametersRefReturns
import typings.wdioProtocols.anon.GETCommandString
import typings.wdioProtocols.anon.POSTCommandParametersRef
import typings.wdioProtocols.anon.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildProtocolsMjsonwpMod {
  
  object default {
    
    @JSImport("@wdio/protocols/build/protocols/mjsonwp", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@wdio/protocols/build/protocols/mjsonwp", "default./session/:sessionId/context")
    @js.native
    def sessionSessionIdContext: GETCommandParameters = js.native
    
    inline def sessionSessionIdContext_=(x: GETCommandParameters): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/context")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/mjsonwp", "default./session/:sessionId/contexts")
    @js.native
    def sessionSessionIdContexts: `2` = js.native
    
    inline def sessionSessionIdContexts_=(x: `2`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/contexts")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/mjsonwp", "default./session/:sessionId/element/:elementId/pageIndex")
    @js.native
    def sessionSessionIdElementElementIdPageIndex: GETCommandParametersRefReturns = js.native
    
    inline def sessionSessionIdElementElementIdPageIndex_=(x: GETCommandParametersRefReturns): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/element/:elementId/pageIndex")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/mjsonwp", "default./session/:sessionId/network_connection")
    @js.native
    def sessionSessionIdNetworkConnection: GETCommandParameters = js.native
    
    inline def sessionSessionIdNetworkConnection_=(x: GETCommandParameters): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/network_connection")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/mjsonwp", "default./session/:sessionId/receive_async_response")
    @js.native
    def sessionSessionIdReceiveAsyncResponse: POSTCommandParametersRef = js.native
    
    inline def sessionSessionIdReceiveAsyncResponse_=(x: POSTCommandParametersRef): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/receive_async_response")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/mjsonwp", "default./session/:sessionId/touch/multi/perform")
    @js.native
    def sessionSessionIdTouchMultiPerform: GETCommandString = js.native
    
    inline def sessionSessionIdTouchMultiPerform_=(x: GETCommandString): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/touch/multi/perform")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/mjsonwp", "default./session/:sessionId/touch/perform")
    @js.native
    def sessionSessionIdTouchPerform: GETCommandParametersRef = js.native
    
    inline def sessionSessionIdTouchPerform_=(x: GETCommandParametersRef): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/touch/perform")(x.asInstanceOf[js.Any])
  }
}
