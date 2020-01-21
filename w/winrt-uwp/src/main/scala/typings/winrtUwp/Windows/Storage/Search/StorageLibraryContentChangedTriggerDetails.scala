package typings.winrtUwp.Windows.Storage.Search

import typings.std.Date
import typings.winrtUwp.Windows.Storage.StorageFolder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Details about a change to storage library content. */
@JSGlobal("Windows.Storage.Search.StorageLibraryContentChangedTriggerDetails")
@js.native
abstract class StorageLibraryContentChangedTriggerDetails () extends js.Object {
  /** Gets the StorageFolder that has been changed. */
  var folder: StorageFolder = js.native
  /**
    * Query for the creation/modified changes since a previous such query.
    * @param lastQueryTime The time the previous query was made.
    * @return The query result.
    */
  def createModifiedSinceQuery(lastQueryTime: Date): StorageItemQueryResult = js.native
}

