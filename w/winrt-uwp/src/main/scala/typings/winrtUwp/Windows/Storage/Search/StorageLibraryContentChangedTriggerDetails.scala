package typings.winrtUwp.Windows.Storage.Search

import typings.std.Date
import typings.winrtUwp.Windows.Storage.StorageFolder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Details about a change to storage library content. */
@js.native
trait StorageLibraryContentChangedTriggerDetails extends js.Object {
  
  /**
    * Query for the creation/modified changes since a previous such query.
    * @param lastQueryTime The time the previous query was made.
    * @return The query result.
    */
  def createModifiedSinceQuery(lastQueryTime: Date): StorageItemQueryResult = js.native
  
  /** Gets the StorageFolder that has been changed. */
  var folder: StorageFolder = js.native
}
object StorageLibraryContentChangedTriggerDetails {
  
  @scala.inline
  def apply(createModifiedSinceQuery: Date => StorageItemQueryResult, folder: StorageFolder): StorageLibraryContentChangedTriggerDetails = {
    val __obj = js.Dynamic.literal(createModifiedSinceQuery = js.Any.fromFunction1(createModifiedSinceQuery), folder = folder.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorageLibraryContentChangedTriggerDetails]
  }
  
  @scala.inline
  implicit class StorageLibraryContentChangedTriggerDetailsOps[Self <: StorageLibraryContentChangedTriggerDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCreateModifiedSinceQuery(value: Date => StorageItemQueryResult): Self = this.set("createModifiedSinceQuery", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFolder(value: StorageFolder): Self = this.set("folder", value.asInstanceOf[js.Any])
  }
}
