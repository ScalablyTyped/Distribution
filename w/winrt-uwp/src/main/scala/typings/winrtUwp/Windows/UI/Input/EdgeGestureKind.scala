package typings.winrtUwp.Windows.UI.Input

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EdgeGestureKind extends StObject
/** Specifies the type of user input that triggered the edge gesture event. */
@JSGlobal("Windows.UI.Input.EdgeGestureKind")
@js.native
object EdgeGestureKind extends StObject {
  
  /** The user entered the Win+Z key sequence on the keyboard. */
  @js.native
  sealed trait keyboard
    extends StObject
       with EdgeGestureKind
  
  /** The user performed a right mouse click. */
  @js.native
  sealed trait mouse
    extends StObject
       with EdgeGestureKind
  
  /** The user made a swipe gesture on a touch-enabled screen. */
  @js.native
  sealed trait touch
    extends StObject
       with EdgeGestureKind
}
