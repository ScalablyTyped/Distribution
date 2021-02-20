package typings.winrtUwp.Windows.Storage.Provider

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FileUpdateStatus extends StObject
/** Describes the status of a file update request. */
@JSGlobal("Windows.Storage.Provider.FileUpdateStatus")
@js.native
object FileUpdateStatus extends StObject {
  
  /** The file update was completed successfully. */
  @js.native
  sealed trait complete extends FileUpdateStatus
  
  /** The file update was completed successfully and the file has been renamed. For example, this could occur if the user chose to save their changes under a different file name because of conflicting changes made to the remote version of the file. */
  @js.native
  sealed trait completeAndRenamed extends FileUpdateStatus
  
  /** The remote version of the file was not updated because the storage location wasn't available. The file remains valid and subsequent updates to the file may succeed. */
  @js.native
  sealed trait currentlyUnavailable extends FileUpdateStatus
  
  /** The file is now invalid and can't be updated now or in the future. For example, this could occur if the remote version of the file was deleted. */
  @js.native
  sealed trait failed extends FileUpdateStatus
  
  /** The file update was not fully completed and should be retried. */
  @js.native
  sealed trait incomplete extends FileUpdateStatus
  
  /** User input (like credentials) is needed to update the file. */
  @js.native
  sealed trait userInputNeeded extends FileUpdateStatus
}
