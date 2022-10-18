package typings.winrtUwp.global.Windows.ApplicationModel.Email

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the result of a TryCreateFolderAsync operation. */
/* note: abstract class */ @JSGlobal("Windows.ApplicationModel.Email.EmailMailboxCreateFolderResult")
@js.native
open class EmailMailboxCreateFolderResult ()
  extends StObject
     with typings.winrtUwp.Windows.ApplicationModel.Email.EmailMailboxCreateFolderResult {
  
  /** Get the newly created folder after a TryCreateFolderAsync operation. */
  /* CompleteClass */
  var folder: typings.winrtUwp.Windows.ApplicationModel.Email.EmailFolder = js.native
  
  /** Gets the status of a TryCreateFolderAsync operation. */
  /* CompleteClass */
  var status: typings.winrtUwp.Windows.ApplicationModel.Email.EmailMailboxCreateFolderStatus = js.native
}
