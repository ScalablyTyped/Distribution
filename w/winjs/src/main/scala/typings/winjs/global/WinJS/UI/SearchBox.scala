package typings.winjs.global.WinJS.UI

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Enables the user to perform search queries and select suggestions.
  **/
@JSGlobal("WinJS.UI.SearchBox")
@js.native
//#region Constructors
/**
  * Creates a new SearchBox.
  * @constructor
  * @param element The DOM element hosts the new SearchBox.
  * @param options An object that contains one or more property/value pairs to apply to the new control. Each property of the options object corresponds to one of the control's properties or events.
  **/
class SearchBox ()
  extends typings.winjs.WinJS.UI.SearchBox {
  def this(element: HTMLElement) = this()
  def this(element: js.UndefOr[scala.Nothing], options: js.Any) = this()
  def this(element: HTMLElement, options: js.Any) = this()
}

/* static members */
@JSGlobal("WinJS.UI.SearchBox")
@js.native
object SearchBox extends js.Object {
  /**
    * Indicates that the object is compatibile with declarative processing.
    **/
  var supportedForProcessing: Boolean = js.native
  //#endregion Properties
  def createResultSuggestionImage(url: String): js.Any = js.native
}

