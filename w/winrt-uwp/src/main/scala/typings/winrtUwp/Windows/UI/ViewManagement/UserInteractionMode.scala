package typings.winrtUwp.Windows.UI.ViewManagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait UserInteractionMode extends StObject
/** Specifies the UI view, optimized for input device type. */
@JSGlobal("Windows.UI.ViewManagement.UserInteractionMode")
@js.native
object UserInteractionMode extends StObject {
  
  /** The device UI is optimized for mouse input. */
  @js.native
  sealed trait mouse
    extends StObject
       with UserInteractionMode
  
  /** The device UI is optimized for touch input. */
  @js.native
  sealed trait touch
    extends StObject
       with UserInteractionMode
}
