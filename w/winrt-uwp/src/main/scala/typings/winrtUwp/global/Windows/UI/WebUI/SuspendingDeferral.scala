package typings.winrtUwp.global.Windows.UI.WebUI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Manages delayed suspension for an app. GetDeferral */
/* note: abstract class */ @JSGlobal("Windows.UI.WebUI.SuspendingDeferral")
@js.native
open class SuspendingDeferral ()
  extends StObject
     with typings.winrtUwp.Windows.UI.WebUI.SuspendingDeferral {
  
  /** Notifies the system that the app has saved its data and is ready to be suspended. */
  /* CompleteClass */
  override def complete(): Unit = js.native
}
