package typings.winrtUwp.global.Windows.UI.WebUI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for an app suspension event. */
/* note: abstract class */ @JSGlobal("Windows.UI.WebUI.SuspendingEventArgs")
@js.native
open class SuspendingEventArgs ()
  extends StObject
     with typings.winrtUwp.Windows.UI.WebUI.SuspendingEventArgs {
  
  /** Gets the app suspension operation. */
  /* CompleteClass */
  var suspendingOperation: typings.winrtUwp.Windows.ApplicationModel.SuspendingOperation = js.native
}
