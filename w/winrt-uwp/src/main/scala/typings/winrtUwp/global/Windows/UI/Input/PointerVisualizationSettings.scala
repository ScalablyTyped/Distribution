package typings.winrtUwp.global.Windows.UI.Input

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides access to the visual feedback settings for pointer input. */
/* note: abstract class */ @JSGlobal("Windows.UI.Input.PointerVisualizationSettings")
@js.native
open class PointerVisualizationSettings ()
  extends StObject
     with typings.winrtUwp.Windows.UI.Input.PointerVisualizationSettings {
  
  /** Gets or sets a value that indicates whether visual feedback is enabled for pen/stylus input when the barrel button is pressed. */
  /* CompleteClass */
  var isBarrelButtonFeedbackEnabled: Boolean = js.native
  
  /** Gets or sets a value that indicates whether visual feedback is enabled when a pointer contact is detected. */
  /* CompleteClass */
  var isContactFeedbackEnabled: Boolean = js.native
}
object PointerVisualizationSettings {
  
  @JSGlobal("Windows.UI.Input.PointerVisualizationSettings")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Gets a PointerVisualizationSettings object associated with the current app.
    * @return The PointerVisualizationSettings object associated with the current app.
    */
  /* static member */
  inline def getForCurrentView(): typings.winrtUwp.Windows.UI.Input.PointerVisualizationSettings = ^.asInstanceOf[js.Dynamic].applyDynamic("getForCurrentView")().asInstanceOf[typings.winrtUwp.Windows.UI.Input.PointerVisualizationSettings]
}
