package typings.webdriverio

import typings.webdriver.WebDriver.AttachSessionOptions
import typings.webdriverio.WebdriverIO.BrowserObject
import typings.webdriverio.WebdriverIO.Element
import typings.webdriverio.WebdriverIO.ElementArray
import typings.webdriverio.WebdriverIO.MultiRemoteOptions
import typings.webdriverio.WebdriverIO.RemoteOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  /**
    * find multiple elements on the page.
    */
  @JSName("$$")
  var $: (js.Function1[/* selector */ String | js.Function, js.Promise[ElementArray]]) with typings.webdriverio.$ = js.native
  /**
    * find a single element on the page.
    */
  @JSName("$")
  var _empty: (js.Function1[/* selector */ String | js.Function, js.Promise[Element]]) with typings.webdriverio._empty = js.native
  var browser: BrowserObject with typings.webdriverio.WebdriverIOAsync.BrowserObject = js.native
  /**
    * should replace `webdriverio.d.ts` in v6
    */
  @js.native
  object WebdriverIO extends js.Object {
    def attach(options: AttachSessionOptions): BrowserObject = js.native
    def multiremote(options: MultiRemoteOptions): BrowserObject = js.native
    def remote(): BrowserObject = js.native
    def remote(options: RemoteOptions): BrowserObject = js.native
    def remote(options: RemoteOptions, modifier: js.Function1[/* repeated */ js.Any, _]): BrowserObject = js.native
  }
  
  @js.native
  object WebdriverIOAsync extends js.Object {
    def attach(options: AttachSessionOptions): typings.webdriverio.WebdriverIOAsync.BrowserObject = js.native
    def multiremote(options: MultiRemoteOptions): typings.webdriverio.WebdriverIOAsync.BrowserObject = js.native
    def remote(): typings.webdriverio.WebdriverIOAsync.BrowserObject = js.native
    def remote(options: RemoteOptions): typings.webdriverio.WebdriverIOAsync.BrowserObject = js.native
    def remote(options: RemoteOptions, modifier: js.Function1[/* repeated */ js.Any, _]): typings.webdriverio.WebdriverIOAsync.BrowserObject = js.native
  }
  
}

