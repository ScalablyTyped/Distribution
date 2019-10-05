package typings.winrtDashUwp.Windows.ApplicationModel.Search

import typings.winrtDashUwp.Windows.Foundation.Collections.IVector
import typings.winrtDashUwp.Windows.Storage.StorageFolder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Stores settings that determine whether the app provides suggestions based on local files, and that define the criteria used to locate and filter these suggestions. */
@JSGlobal("Windows.ApplicationModel.Search.LocalContentSuggestionSettings")
@js.native
/** Creates a new instance of the localContentSuggestionSettings class. */
class LocalContentSuggestionSettings () extends js.Object {
  /** An Advanced Query Syntax (AQS) string that limits the types and kinds of files that are used to provide suggestions. If no AQS string is specified, suggestions are provided from all local files in locations specified by the locations property. */
  var aqsFilter: String = js.native
  /** Indicates whether suggestions based on local files are displayed in the search pane. */
  var enabled: Boolean = js.native
  /** A list of the storageFolder objects that contain files that are used to provide suggestions. If the list is empty, suggestions are provided from files in all of the local libraries for which the app declared capabilities. */
  var locations: IVector[StorageFolder] = js.native
  /** A list of the file properties whose values are used to provide suggestions from local files. If the list is empty, all of the file properties that are available for suggestions are used. */
  var propertiesToMatch: IVector[String] = js.native
}

