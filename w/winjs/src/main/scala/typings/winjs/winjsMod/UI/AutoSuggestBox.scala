package typings.winjs.winjsMod.UI

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A rich input box that provides suggestions as the user types.
  **/
@JSImport("winjs", "UI.AutoSuggestBox")
@js.native
//#region Constructors
/**
  * Creates a new AutoSuggestBox.
  * @constructor
  * @param element The DOM element hosts the new AutoSuggestBox.
  * @param options An object that contains one or more property/value pairs to apply to the new control. Each property of the options object corresponds to one of the control's properties or events.
  **/
class AutoSuggestBox ()
  extends typings.winjs.WinJS.UI.AutoSuggestBox {
  def this(element: HTMLElement) = this()
  def this(element: HTMLElement, options: js.Any) = this()
}

/* static members */
@JSImport("winjs", "UI.AutoSuggestBox")
@js.native
object AutoSuggestBox extends js.Object {
  /**
    * Indicates that the object is compatibile with declarative processing.
    **/
  var supportedForProcessing: Boolean = js.native
  //#endregion Properties
  /**
    * Creates the image argument for SearchSuggestionCollection.appendResultSuggestion.
    * @param url The url of the image.
    **/
  def createResultSuggestionImage(url: String): js.Any = js.native
}

