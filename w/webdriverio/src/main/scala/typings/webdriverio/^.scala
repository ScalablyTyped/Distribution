package typings.webdriverio

import typings.webdriverio.WebdriverIO.BrowserObject
import typings.webdriverio.WebdriverIO.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object ^ extends js.Object {
  /**
    * find a single element on the page.
    */
  @JSName("$")
  var $: (js.Function1[/* selector */ String | js.Function, js.Promise[Element]]) with typings.webdriverio.$ = js.native
  /**
    * find multiple elements on the page.
    */
  @JSName("$$")
  var $$: (js.Function1[/* selector */ String | js.Function, js.Promise[js.Array[Element]]]) with typings.webdriverio.$$ = js.native
  var browser: BrowserObject with typings.webdriverio.WebdriverIOAsync.BrowserObject = js.native
}

