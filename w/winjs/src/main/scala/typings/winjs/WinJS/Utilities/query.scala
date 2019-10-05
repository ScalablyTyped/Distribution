package typings.winjs.WinJS.Utilities

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WinJS.Utilities.query")
@js.native
object query extends js.Object {
  /**
    * Returns a QueryCollection with zero or one elements matching the specified selector query.
    * @param query The CSS selector to use. See Selectors for more information.
    * @param element Optional. The root element at which to start the query. If this parameter is omitted, the scope of the query is the entire document.
    * @returns A QueryCollection with zero or one elements matching the specified selector query.
    **/
  def apply(query: js.Any): QueryCollection[HTMLElement] = js.native
  def apply(query: js.Any, element: HTMLElement): QueryCollection[HTMLElement] = js.native
}

