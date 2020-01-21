package typings.webdriverio

import typings.webdriverio.WebdriverIO.BrowserObject
import typings.webdriverio.WebdriverIO.Element
import typings.webdriverio.WebdriverIO.ElementArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object ^ extends js.Object {
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
}

