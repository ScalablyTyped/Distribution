package typings.winrtDashUwp.Windows.Storage.Pickers.Provider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  
  /* 0 */ val added: typings.winrtDashUwp.Windows.Storage.Pickers.Provider.AddFileResult.added with Double = js.native
  /* 1 */ val alreadyAdded: typings.winrtDashUwp.Windows.Storage.Pickers.Provider.AddFileResult.alreadyAdded with Double = js.native
  /* 2 */ val notAllowed: typings.winrtDashUwp.Windows.Storage.Pickers.Provider.AddFileResult.notAllowed with Double = js.native
  /* 3 */ val unavailable: typings.winrtDashUwp.Windows.Storage.Pickers.Provider.AddFileResult.unavailable with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AddFileResult with Double] = js.native
}

