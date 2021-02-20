package typings.winrtUwp.Windows.UI.Input

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GestureSettings extends StObject
/** Specifies the interactions that are supported by an application. */
@JSGlobal("Windows.UI.Input.GestureSettings")
@js.native
object GestureSettings extends StObject {
  
  /** Enable support for the CrossSliding interaction when using the slide or swipe gesture through a single touch contact. */
  @js.native
  sealed trait crossSlide extends GestureSettings
  
  /** Enable support for the double-tap gesture. */
  @js.native
  sealed trait doubleTap extends GestureSettings
  
  /** Enable support for the slide or swipe gesture with a mouse or pen/stylus (single contact). The Dragging event is raised when either gesture is detected. */
  @js.native
  sealed trait drag extends GestureSettings
  
  /** Enable support for the press and hold gesture (from a single touch or pen/stylus contact). The Holding event is raised if a time threshold is crossed before the contact is lifted, an additional contact is detected, or a gesture is started. */
  @js.native
  sealed trait hold extends GestureSettings
  
  /** Enable support for the press and hold gesture through the left button on a mouse. The Holding event is raised if a time threshold is crossed before the left button is released or a gesture is started. */
  @js.native
  sealed trait holdWithMouse extends GestureSettings
  
  /** Enable panning and disable zoom when two or more touch contacts are detected. */
  @js.native
  sealed trait manipulationMultipleFingerPanning extends GestureSettings
  
  /** Enable support for the rotation gesture through pointer input. The ManipulationStarted , ManipulationUpdated , and ManipulationCompleted events are all raised during the course of this interaction. */
  @js.native
  sealed trait manipulationRotate extends GestureSettings
  
  /** Enable support for rotation inertia after the rotate gesture (through pointer input) is complete. The ManipulationInertiaStarting event is raised if inertia is enabled. */
  @js.native
  sealed trait manipulationRotateInertia extends GestureSettings
  
  /** Enable support for the pinch or stretch gesture through pointer input. */
  @js.native
  sealed trait manipulationScale extends GestureSettings
  
  /** Enable support for scaling inertia after the pinch or stretch gesture (through pointer input) is complete. The ManipulationInertiaStarting event is raised if inertia is enabled. */
  @js.native
  sealed trait manipulationScaleInertia extends GestureSettings
  
  /** Enable support for translation inertia after the slide gesture (through pointer input) is complete. The ManipulationInertiaStarting event is raised if inertia is enabled. */
  @js.native
  sealed trait manipulationTranslateInertia extends GestureSettings
  
  /** Enable support for the slide gesture through pointer input, on the horizontal axis using rails (guides). The ManipulationStarted , ManipulationUpdated , and ManipulationCompleted events are all raised during the course of this interaction. */
  @js.native
  sealed trait manipulationTranslateRailsX extends GestureSettings
  
  /** Enable support for the slide gesture through pointer input, on the vertical axis using rails (guides). The ManipulationStarted , ManipulationUpdated , and ManipulationCompleted events are all raised during the course of this interaction. */
  @js.native
  sealed trait manipulationTranslateRailsY extends GestureSettings
  
  /** Enable support for the slide gesture through pointer input, on the horizontal axis. The ManipulationStarted , ManipulationUpdated , and ManipulationCompleted events are all raised during the course of this interaction. */
  @js.native
  sealed trait manipulationTranslateX extends GestureSettings
  
  /** Enable support for the slide gesture through pointer input, on the vertical axis. The ManipulationStarted , ManipulationUpdated , and ManipulationCompleted events are all raised during the course of this interaction. */
  @js.native
  sealed trait manipulationTranslateY extends GestureSettings
  
  /** Disable support for gestures and manipulations. */
  @js.native
  sealed trait none extends GestureSettings
  
  /** Enable support for a right-tap interaction. The RightTapped event is raised when the contact is lifted or the mouse button released. */
  @js.native
  sealed trait rightTap extends GestureSettings
  
  /** Enable support for the tap gesture. */
  @js.native
  sealed trait tap extends GestureSettings
}
