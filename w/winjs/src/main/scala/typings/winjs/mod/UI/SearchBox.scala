package typings.winjs.mod.UI

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Enables the user to perform search queries and select suggestions.
  **/
@JSImport("winjs", "UI.SearchBox")
@js.native
//#region Constructors
/**
  * Creates a new SearchBox.
  * @constructor
  * @param element The DOM element hosts the new SearchBox.
  * @param options An object that contains one or more property/value pairs to apply to the new control. Each property of the options object corresponds to one of the control's properties or events.
  **/
class SearchBox ()
  extends StObject
     with typings.winjs.WinJS.UI.SearchBox {
  def this(element: HTMLElement) = this()
  def this(element: Unit, options: js.Any) = this()
  def this(element: HTMLElement, options: js.Any) = this()
}
object SearchBox {
  
  @JSImport("winjs", "UI.SearchBox")
  @js.native
  val ^ : js.Any = js.native
  
  //#endregion Properties
  /* static member */
  inline def createResultSuggestionImage(url: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createResultSuggestionImage")(url.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  /**
    * Indicates that the object is compatibile with declarative processing.
    **/
  /* static member */
  @JSImport("winjs", "UI.SearchBox.supportedForProcessing")
  @js.native
  def supportedForProcessing: Boolean = js.native
  inline def supportedForProcessing_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("supportedForProcessing")(x.asInstanceOf[js.Any])
}
