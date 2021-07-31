package typings.webdriverio.webdriverioCoreMod.WebdriverIO

import typings.node.childProcessMod.ChildProcess
import typings.puppeteer.mod.BrowserContext
import typings.puppeteer.mod.EventEmitter
import typings.puppeteer.mod.EventType
import typings.puppeteer.mod.Handler
import typings.puppeteer.mod.Page
import typings.puppeteer.mod.Target
import typings.webdriverio.webdriverioStrings.disconnected
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<puppeteer.puppeteer.Browser> */
trait PuppeteerBrowser extends StObject {
  
  var addListener: js.UndefOr[js.Function2[/* event */ EventType, /* handler */ Handler[js.Any], EventEmitter]] = js.undefined
  
  var browserContexts: js.UndefOr[js.Function0[js.Array[BrowserContext]]] = js.undefined
  
  var close: js.UndefOr[js.Function0[js.Promise[Unit]]] = js.undefined
  
  var createIncognitoBrowserContext: js.UndefOr[js.Function0[js.Promise[BrowserContext]]] = js.undefined
  
  var defaultBrowserContext: js.UndefOr[js.Function0[BrowserContext]] = js.undefined
  
  var disconnect: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var emit: js.UndefOr[js.Function1[/* event */ EventType, Boolean]] = js.undefined
  
  var isConnected: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  var listenerCount: js.UndefOr[js.Function1[/* event */ String, Double]] = js.undefined
  
  var newPage: js.UndefOr[js.Function0[js.Promise[Page]]] = js.undefined
  
  var off: js.UndefOr[js.Function2[/* event */ EventType, /* handler */ Handler[js.Any], EventEmitter]] = js.undefined
  
  var on: js.UndefOr[
    js.Function2[
      disconnected, 
      /* handler */ js.Function2[/* e */ Unit, /* repeated */ js.Any, Unit], 
      this.type
    ]
  ] = js.undefined
  
  var once: js.UndefOr[
    js.Function2[
      disconnected, 
      /* handler */ js.Function2[/* e */ Unit, /* repeated */ js.Any, Unit], 
      this.type
    ]
  ] = js.undefined
  
  var pages: js.UndefOr[js.Function0[js.Promise[js.Array[Page]]]] = js.undefined
  
  var process: js.UndefOr[js.Function0[ChildProcess]] = js.undefined
  
  var removeAllListeners: js.UndefOr[js.Function0[EventEmitter]] = js.undefined
  
  var removeListener: js.UndefOr[js.Function2[/* event */ EventType, /* handler */ Handler[js.Any], EventEmitter]] = js.undefined
  
  var target: js.UndefOr[js.Function0[Target]] = js.undefined
  
  var targets: js.UndefOr[js.Function0[js.Promise[js.Array[Target]]]] = js.undefined
  
  var userAgent: js.UndefOr[js.Function0[js.Promise[String]]] = js.undefined
  
  var version: js.UndefOr[js.Function0[js.Promise[String]]] = js.undefined
  
  var waitForTarget: js.UndefOr[
    js.Function1[/* predicate */ js.Function1[/* target */ Target, Boolean], js.Promise[Target]]
  ] = js.undefined
  
  var wsEndpoint: js.UndefOr[js.Function0[String]] = js.undefined
}
object PuppeteerBrowser {
  
  @scala.inline
  def apply(): PuppeteerBrowser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PuppeteerBrowser]
  }
  
  @scala.inline
  implicit class PuppeteerBrowserMutableBuilder[Self <: PuppeteerBrowser] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddListener(value: (/* event */ EventType, /* handler */ Handler[js.Any]) => EventEmitter): Self = StObject.set(x, "addListener", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAddListenerUndefined: Self = StObject.set(x, "addListener", js.undefined)
    
    @scala.inline
    def setBrowserContexts(value: () => js.Array[BrowserContext]): Self = StObject.set(x, "browserContexts", js.Any.fromFunction0(value))
    
    @scala.inline
    def setBrowserContextsUndefined: Self = StObject.set(x, "browserContexts", js.undefined)
    
    @scala.inline
    def setClose(value: () => js.Promise[Unit]): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    @scala.inline
    def setCreateIncognitoBrowserContext(value: () => js.Promise[BrowserContext]): Self = StObject.set(x, "createIncognitoBrowserContext", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreateIncognitoBrowserContextUndefined: Self = StObject.set(x, "createIncognitoBrowserContext", js.undefined)
    
    @scala.inline
    def setDefaultBrowserContext(value: () => BrowserContext): Self = StObject.set(x, "defaultBrowserContext", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDefaultBrowserContextUndefined: Self = StObject.set(x, "defaultBrowserContext", js.undefined)
    
    @scala.inline
    def setDisconnect(value: () => Unit): Self = StObject.set(x, "disconnect", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDisconnectUndefined: Self = StObject.set(x, "disconnect", js.undefined)
    
    @scala.inline
    def setEmit(value: /* event */ EventType => Boolean): Self = StObject.set(x, "emit", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEmitUndefined: Self = StObject.set(x, "emit", js.undefined)
    
    @scala.inline
    def setIsConnected(value: () => Boolean): Self = StObject.set(x, "isConnected", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsConnectedUndefined: Self = StObject.set(x, "isConnected", js.undefined)
    
    @scala.inline
    def setListenerCount(value: /* event */ String => Double): Self = StObject.set(x, "listenerCount", js.Any.fromFunction1(value))
    
    @scala.inline
    def setListenerCountUndefined: Self = StObject.set(x, "listenerCount", js.undefined)
    
    @scala.inline
    def setNewPage(value: () => js.Promise[Page]): Self = StObject.set(x, "newPage", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewPageUndefined: Self = StObject.set(x, "newPage", js.undefined)
    
    @scala.inline
    def setOff(value: (/* event */ EventType, /* handler */ Handler[js.Any]) => EventEmitter): Self = StObject.set(x, "off", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOffUndefined: Self = StObject.set(x, "off", js.undefined)
    
    @scala.inline
    def setOn(
      value: (disconnected, /* handler */ js.Function2[/* e */ Unit, /* repeated */ js.Any, Unit]) => PuppeteerBrowser
    ): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnUndefined: Self = StObject.set(x, "on", js.undefined)
    
    @scala.inline
    def setOnce(
      value: (disconnected, /* handler */ js.Function2[/* e */ Unit, /* repeated */ js.Any, Unit]) => PuppeteerBrowser
    ): Self = StObject.set(x, "once", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnceUndefined: Self = StObject.set(x, "once", js.undefined)
    
    @scala.inline
    def setPages(value: () => js.Promise[js.Array[Page]]): Self = StObject.set(x, "pages", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPagesUndefined: Self = StObject.set(x, "pages", js.undefined)
    
    @scala.inline
    def setProcess(value: () => ChildProcess): Self = StObject.set(x, "process", js.Any.fromFunction0(value))
    
    @scala.inline
    def setProcessUndefined: Self = StObject.set(x, "process", js.undefined)
    
    @scala.inline
    def setRemoveAllListeners(value: () => EventEmitter): Self = StObject.set(x, "removeAllListeners", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemoveAllListenersUndefined: Self = StObject.set(x, "removeAllListeners", js.undefined)
    
    @scala.inline
    def setRemoveListener(value: (/* event */ EventType, /* handler */ Handler[js.Any]) => EventEmitter): Self = StObject.set(x, "removeListener", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRemoveListenerUndefined: Self = StObject.set(x, "removeListener", js.undefined)
    
    @scala.inline
    def setTarget(value: () => Target): Self = StObject.set(x, "target", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    @scala.inline
    def setTargets(value: () => js.Promise[js.Array[Target]]): Self = StObject.set(x, "targets", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTargetsUndefined: Self = StObject.set(x, "targets", js.undefined)
    
    @scala.inline
    def setUserAgent(value: () => js.Promise[String]): Self = StObject.set(x, "userAgent", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUserAgentUndefined: Self = StObject.set(x, "userAgent", js.undefined)
    
    @scala.inline
    def setVersion(value: () => js.Promise[String]): Self = StObject.set(x, "version", js.Any.fromFunction0(value))
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    @scala.inline
    def setWaitForTarget(value: /* predicate */ js.Function1[/* target */ Target, Boolean] => js.Promise[Target]): Self = StObject.set(x, "waitForTarget", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWaitForTargetUndefined: Self = StObject.set(x, "waitForTarget", js.undefined)
    
    @scala.inline
    def setWsEndpoint(value: () => String): Self = StObject.set(x, "wsEndpoint", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWsEndpointUndefined: Self = StObject.set(x, "wsEndpoint", js.undefined)
  }
}
