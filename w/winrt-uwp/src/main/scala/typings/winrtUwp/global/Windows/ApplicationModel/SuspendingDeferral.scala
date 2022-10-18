package typings.winrtUwp.global.Windows.ApplicationModel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Manages a delayed app suspending operation. */
/* note: abstract class */ @JSGlobal("Windows.ApplicationModel.SuspendingDeferral")
@js.native
open class SuspendingDeferral ()
  extends StObject
     with typings.winrtUwp.Windows.ApplicationModel.SuspendingDeferral {
  
  /** Notifies the operating system that the app has saved its data and is ready to be suspended. */
  /* CompleteClass */
  override def complete(): Unit = js.native
}
