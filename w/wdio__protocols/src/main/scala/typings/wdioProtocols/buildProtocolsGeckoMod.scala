package typings.wdioProtocols

import typings.wdioProtocols.anon.GETDescriptionParameters
import typings.wdioProtocols.anon.GETExamples
import typings.wdioProtocols.anon.GETExamplesParametersPOSTExamples
import typings.wdioProtocols.anon.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildProtocolsGeckoMod {
  
  object default {
    
    @JSImport("@wdio/protocols/build/protocols/gecko", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@wdio/protocols/build/protocols/gecko", "default./session/:sessionId/moz/addon/install")
    @js.native
    def sessionSessionIdMozAddonInstall: `3` = js.native
    
    inline def sessionSessionIdMozAddonInstall_=(x: `3`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/moz/addon/install")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/gecko", "default./session/:sessionId/moz/addon/uninstall")
    @js.native
    def sessionSessionIdMozAddonUninstall: GETExamples = js.native
    
    inline def sessionSessionIdMozAddonUninstall_=(x: GETExamples): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/moz/addon/uninstall")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/gecko", "default./session/:sessionId/moz/context")
    @js.native
    def sessionSessionIdMozContext: GETExamplesParametersPOSTExamples = js.native
    
    inline def sessionSessionIdMozContext_=(x: GETExamplesParametersPOSTExamples): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/moz/context")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/gecko", "default./session/:sessionId/moz/screenshot/full")
    @js.native
    def sessionSessionIdMozScreenshotFull: GETDescriptionParameters = js.native
    
    inline def sessionSessionIdMozScreenshotFull_=(x: GETDescriptionParameters): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/moz/screenshot/full")(x.asInstanceOf[js.Any])
  }
}
