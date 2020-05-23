package typings.winrtUwp.global.Windows.ApplicationModel.Background

import typings.winrtUwp.Windows.Storage.Provider.CachedFileTarget
import typings.winrtUwp.Windows.Storage.Provider.FileUpdateRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides details about the cached file operation that invoked the trigger. */
@JSGlobal("Windows.ApplicationModel.Background.CachedFileUpdaterTriggerDetails")
@js.native
abstract class CachedFileUpdaterTriggerDetails ()
  extends typings.winrtUwp.Windows.ApplicationModel.Background.CachedFileUpdaterTriggerDetails {
  /** Gets whether the system can display UI allowing the user to launch provider app in response to the cached file updater trigger. */
  /* CompleteClass */
  override var canRequestUserInput: Boolean = js.native
  /** Gets the FileUpdateRequest object associated with the cached file update. */
  /* CompleteClass */
  override var updateRequest: FileUpdateRequest = js.native
  /** Gets the CachedFileTarget object associated with cached file update that indicates whether the local or remote file should be updated. */
  /* CompleteClass */
  override var updateTarget: CachedFileTarget = js.native
}

