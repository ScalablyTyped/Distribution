package typings.winrtUwp.Windows.Storage.Search

import typings.std.Date
import typings.winrtUwp.Windows.Storage.StorageFolder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Details about a change to storage library content. */
trait StorageLibraryContentChangedTriggerDetails extends js.Object {
  /** Gets the StorageFolder that has been changed. */
  var folder: StorageFolder
  /**
    * Query for the creation/modified changes since a previous such query.
    * @param lastQueryTime The time the previous query was made.
    * @return The query result.
    */
  def createModifiedSinceQuery(lastQueryTime: Date): StorageItemQueryResult
}

object StorageLibraryContentChangedTriggerDetails {
  @scala.inline
  def apply(createModifiedSinceQuery: Date => StorageItemQueryResult, folder: StorageFolder): StorageLibraryContentChangedTriggerDetails = {
    val __obj = js.Dynamic.literal(createModifiedSinceQuery = js.Any.fromFunction1(createModifiedSinceQuery), folder = folder.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorageLibraryContentChangedTriggerDetails]
  }
}

