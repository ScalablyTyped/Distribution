package typings.winrtUwp.global.Windows.ApplicationModel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides info about an app suspending operation. */
@JSGlobal("Windows.ApplicationModel.SuspendingOperation")
@js.native
abstract class SuspendingOperation ()
  extends StObject
     with typings.winrtUwp.Windows.ApplicationModel.SuspendingOperation {
  
  /** Gets the time remaining before a delayed app suspending operation continues. */
  /* CompleteClass */
  var deadline: js.Date = js.native
  
  /**
    * Requests that the app suspending operation be delayed.
    * @return The suspension deferral.
    */
  /* CompleteClass */
  override def getDeferral(): typings.winrtUwp.Windows.ApplicationModel.SuspendingDeferral = js.native
}
