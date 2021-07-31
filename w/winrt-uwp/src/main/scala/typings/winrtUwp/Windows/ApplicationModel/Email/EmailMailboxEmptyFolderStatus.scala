package typings.winrtUwp.Windows.ApplicationModel.Email

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EmailMailboxEmptyFolderStatus extends StObject
/** Indicates the result of a call to TryEmptyFolderAsync . */
@JSGlobal("Windows.ApplicationModel.Email.EmailMailboxEmptyFolderStatus")
@js.native
object EmailMailboxEmptyFolderStatus extends StObject {
  
  /** An error occurred while deleting parts of the folder. */
  @js.native
  sealed trait couldNotDeleteEverything
    extends StObject
       with EmailMailboxEmptyFolderStatus
  
  /** There was a network error while trying to empty the folder. */
  @js.native
  sealed trait networkError
    extends StObject
       with EmailMailboxEmptyFolderStatus
  
  /** There was a permissions error while trying to empty the folder. */
  @js.native
  sealed trait permissionsError
    extends StObject
       with EmailMailboxEmptyFolderStatus
  
  /** There was a server error while trying to empty the folder. */
  @js.native
  sealed trait serverError
    extends StObject
       with EmailMailboxEmptyFolderStatus
  
  /** The folder was successfully emptied. */
  @js.native
  sealed trait success
    extends StObject
       with EmailMailboxEmptyFolderStatus
  
  /** There was an unknown error while trying to empty the folder. */
  @js.native
  sealed trait unknownFailure
    extends StObject
       with EmailMailboxEmptyFolderStatus
}
