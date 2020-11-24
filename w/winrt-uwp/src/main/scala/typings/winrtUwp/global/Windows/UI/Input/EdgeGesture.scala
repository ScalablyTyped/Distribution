package typings.winrtUwp.global.Windows.UI.Input

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides access to the events that notify an app of triggers to its edge-based UI. */
@JSGlobal("Windows.UI.Input.EdgeGesture")
@js.native
abstract class EdgeGesture ()
  extends typings.winrtUwp.Windows.UI.Input.EdgeGesture
/* static members */
@JSGlobal("Windows.UI.Input.EdgeGesture")
@js.native
object EdgeGesture extends js.Object {
  
  /**
    * Gets an instance of the EdgeGesture class that is used to add and remove event delegate handlers for the current view.
    * @return The currently relevant instance of the EdgeGesture object.
    */
  def getForCurrentView(): typings.winrtUwp.Windows.UI.Input.EdgeGesture = js.native
}
