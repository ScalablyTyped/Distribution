package typings.winjs.WinJS.UI.Pages

import typings.std.HTMLElement
import typings.winjs.WinJS.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WinJS.UI.Pages.render")
@js.native
object render extends js.Object {
  /**
    * Creates a PageControl from the specified URI and inserts it inside the specified element.
    * @param uri The URI for the content that defines the page.
    * @param element The DOM element to which the PageControl is appended.
    * @param options An object that contains one or more property/value pairs to apply to the new PageControl. How these property/value pairs are used (or not used) depends on the implementation of that particular PageControl.
    * @param parentedPromise A Promise that is fulfilled when the new PageControl is done rendering and its contents becomes the child of element.
    * @returns A promise that is fulfilled when rendering is complete, if asynchronous processing is necessary. If not, returns nothing.
    **/
  def apply(uri: String): Promise[_] = js.native
  def apply(uri: String, element: HTMLElement): Promise[_] = js.native
  def apply(uri: String, element: HTMLElement, options: js.Any): Promise[_] = js.native
  def apply(uri: String, element: HTMLElement, options: js.Any, parentedPromise: Promise[_]): Promise[_] = js.native
}

