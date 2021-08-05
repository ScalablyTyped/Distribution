package typings.winjs.global.WinJS.UI

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A rich input box that provides suggestions as the user types.
  **/
@JSGlobal("WinJS.UI.AutoSuggestBox")
@js.native
//#region Constructors
/**
  * Creates a new AutoSuggestBox.
  * @constructor
  * @param element The DOM element hosts the new AutoSuggestBox.
  * @param options An object that contains one or more property/value pairs to apply to the new control. Each property of the options object corresponds to one of the control's properties or events.
  **/
class AutoSuggestBox ()
  extends StObject
     with typings.winjs.WinJS.UI.AutoSuggestBox {
  def this(element: HTMLElement) = this()
  def this(element: Unit, options: js.Any) = this()
  def this(element: HTMLElement, options: js.Any) = this()
}
object AutoSuggestBox {
  
  @JSGlobal("WinJS.UI.AutoSuggestBox")
  @js.native
  val ^ : js.Any = js.native
  
  //#endregion Properties
  /**
    * Creates the image argument for SearchSuggestionCollection.appendResultSuggestion.
    * @param url The url of the image.
    **/
  /* static member */
  inline def createResultSuggestionImage(url: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createResultSuggestionImage")(url.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  /**
    * Indicates that the object is compatibile with declarative processing.
    **/
  /* static member */
  @JSGlobal("WinJS.UI.AutoSuggestBox.supportedForProcessing")
  @js.native
  def supportedForProcessing: Boolean = js.native
  inline def supportedForProcessing_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("supportedForProcessing")(x.asInstanceOf[js.Any])
}
