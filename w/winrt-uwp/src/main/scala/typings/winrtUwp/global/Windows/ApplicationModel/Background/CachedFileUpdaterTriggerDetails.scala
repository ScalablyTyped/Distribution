package typings.winrtUwp.global.Windows.ApplicationModel.Background

import typings.winrtUwp.Windows.Storage.Provider.CachedFileTarget
import typings.winrtUwp.Windows.Storage.Provider.FileUpdateRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides details about the cached file operation that invoked the trigger. */
/* note: abstract class */ @JSGlobal("Windows.ApplicationModel.Background.CachedFileUpdaterTriggerDetails")
@js.native
open class CachedFileUpdaterTriggerDetails ()
  extends StObject
     with typings.winrtUwp.Windows.ApplicationModel.Background.CachedFileUpdaterTriggerDetails {
  
  /** Gets whether the system can display UI allowing the user to launch provider app in response to the cached file updater trigger. */
  /* CompleteClass */
  var canRequestUserInput: Boolean = js.native
  
  /** Gets the FileUpdateRequest object associated with the cached file update. */
  /* CompleteClass */
  var updateRequest: FileUpdateRequest = js.native
  
  /** Gets the CachedFileTarget object associated with cached file update that indicates whether the local or remote file should be updated. */
  /* CompleteClass */
  var updateTarget: CachedFileTarget = js.native
}
