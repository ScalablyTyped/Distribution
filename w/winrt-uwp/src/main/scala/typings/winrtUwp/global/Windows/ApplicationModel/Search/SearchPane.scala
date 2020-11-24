package typings.winrtUwp.global.Windows.ApplicationModel.Search

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents and manages the search pane that opens when a user activates the Search charm. The search pane provides a consistent, touch-friendly search box and optional search suggestions. */
@JSGlobal("Windows.ApplicationModel.Search.SearchPane")
@js.native
abstract class SearchPane ()
  extends typings.winrtUwp.Windows.ApplicationModel.Search.SearchPane
/* static members */
@JSGlobal("Windows.ApplicationModel.Search.SearchPane")
@js.native
object SearchPane extends js.Object {
  
  /**
    * Retrieves an instance of the search pane from which users can search within the app.
    * @return An instance of the search pane, which provides a consistent, touch-friendly search box and optional search suggestions for searching within the current application.
    */
  def getForCurrentView(): typings.winrtUwp.Windows.ApplicationModel.Search.SearchPane = js.native
  
  /** Hides the current app's UI. */
  def hideThisApplication(): Unit = js.native
}
