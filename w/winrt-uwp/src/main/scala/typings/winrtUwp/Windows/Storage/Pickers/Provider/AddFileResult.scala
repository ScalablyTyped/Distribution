package typings.winrtUwp.Windows.Storage.Pickers.Provider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AddFileResult extends js.Object
/** Indicates the result of a call to the fileOpenPickerUI.addFile method. */
@JSGlobal("Windows.Storage.Pickers.Provider.AddFileResult")
@js.native
object AddFileResult extends js.Object {
  
  /** The file was successfully added to the file picker UI. */
  @js.native
  sealed trait added extends AddFileResult
  
  /** The file was already in the file picker UI. */
  @js.native
  sealed trait alreadyAdded extends AddFileResult
  
  /** The file wasn't added because it is not one of the allowed file types. */
  @js.native
  sealed trait notAllowed extends AddFileResult
  
  /** The file wasn't added because the file picker UI is unavailable. The file picker UI is only available while the user is interacting with your app. */
  @js.native
  sealed trait unavailable extends AddFileResult
}
