package typings.winrtUwp.global.Windows.ApplicationModel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for an app suspending event. */
/* note: abstract class */ @JSGlobal("Windows.ApplicationModel.SuspendingEventArgs")
@js.native
open class SuspendingEventArgs ()
  extends StObject
     with typings.winrtUwp.Windows.ApplicationModel.SuspendingEventArgs {
  
  /** Gets the app suspending operation. */
  /* CompleteClass */
  var suspendingOperation: typings.winrtUwp.Windows.ApplicationModel.SuspendingOperation = js.native
}
