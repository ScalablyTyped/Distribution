package typings.winrtUwp.Windows.Storage.Search

import typings.std.Date
import typings.winrtUwp.Windows.Storage.StorageFolder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Details about a change to storage library content. */
@js.native
trait StorageLibraryContentChangedTriggerDetails extends StObject {
  
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
  implicit class StorageLibraryContentChangedTriggerDetailsMutableBuilder[Self <: StorageLibraryContentChangedTriggerDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateModifiedSinceQuery(value: Date => StorageItemQueryResult): Self = StObject.set(x, "createModifiedSinceQuery", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFolder(value: StorageFolder): Self = StObject.set(x, "folder", value.asInstanceOf[js.Any])
  }
}
