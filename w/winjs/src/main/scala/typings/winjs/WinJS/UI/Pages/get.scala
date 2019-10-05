package typings.winjs.WinJS.UI.Pages

import typings.std.HTMLElement
import typings.winjs.WinJS.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WinJS.UI.Pages.get")
@js.native
object get extends js.Object {
  /**
    * Gets an already-defined page control for the specified URI, or creates a new one.
    * @param uri The URI for the content that defines the page.
    * @returns A constructor function that creates the page.
    **/
  def apply(uri: String): js.Function4[
    /* element */ js.UndefOr[HTMLElement], 
    /* options */ js.UndefOr[js.Any], 
    /* complete */ js.UndefOr[js.Function1[/* page */ js.Any, Unit]], 
    /* parentedPromise */ js.UndefOr[Promise[_]], 
    Unit
  ] = js.native
}

