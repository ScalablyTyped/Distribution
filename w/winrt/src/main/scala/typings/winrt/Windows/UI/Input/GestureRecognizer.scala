package typings.winrt.Windows.UI.Input

import typings.winrt.Windows.Foundation.Collections.IVector
import typings.winrt.Windows.Foundation.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.UI.Input.GestureRecognizer")
@js.native
class GestureRecognizer () extends IGestureRecognizer {
  /* CompleteClass */
  override var autoProcessInertia: Boolean = js.native
  /* CompleteClass */
  override var crossSlideExact: Boolean = js.native
  /* CompleteClass */
  override var crossSlideHorizontally: Boolean = js.native
  /* CompleteClass */
  override var crossSlideThresholds: CrossSlideThresholds = js.native
  /* CompleteClass */
  override var gestureSettings: GestureSettings = js.native
  /* CompleteClass */
  override var inertiaExpansion: Double = js.native
  /* CompleteClass */
  override var inertiaExpansionDeceleration: Double = js.native
  /* CompleteClass */
  override var inertiaRotationAngle: Double = js.native
  /* CompleteClass */
  override var inertiaRotationDeceleration: Double = js.native
  /* CompleteClass */
  override var inertiaTranslationDeceleration: Double = js.native
  /* CompleteClass */
  override var inertiaTranslationDisplacement: Double = js.native
  /* CompleteClass */
  override var isActive: Boolean = js.native
  /* CompleteClass */
  override var isInertial: Boolean = js.native
  /* CompleteClass */
  override var manipulationExact: Boolean = js.native
  /* CompleteClass */
  override var mouseWheelParameters: MouseWheelParameters = js.native
  /* CompleteClass */
  override var oncrosssliding: js.Any = js.native
  /* CompleteClass */
  override var ondragging: js.Any = js.native
  /* CompleteClass */
  override var onholding: js.Any = js.native
  /* CompleteClass */
  override var onmanipulationcompleted: js.Any = js.native
  /* CompleteClass */
  override var onmanipulationinertiastarting: js.Any = js.native
  /* CompleteClass */
  override var onmanipulationstarted: js.Any = js.native
  /* CompleteClass */
  override var onmanipulationupdated: js.Any = js.native
  /* CompleteClass */
  override var onrighttapped: js.Any = js.native
  /* CompleteClass */
  override var ontapped: js.Any = js.native
  /* CompleteClass */
  override var pivotCenter: Point = js.native
  /* CompleteClass */
  override var pivotRadius: Double = js.native
  /* CompleteClass */
  override var showGestureFeedback: Boolean = js.native
  /* CompleteClass */
  override def canBeDoubleTap(value: PointerPoint): Boolean = js.native
  /* CompleteClass */
  override def completeGesture(): Unit = js.native
  /* CompleteClass */
  override def processDownEvent(value: PointerPoint): Unit = js.native
  /* CompleteClass */
  override def processInertia(): Unit = js.native
  /* CompleteClass */
  override def processMouseWheelEvent(value: PointerPoint, isShiftKeyDown: Boolean, isControlKeyDown: Boolean): Unit = js.native
  /* CompleteClass */
  override def processMoveEvents(value: IVector[PointerPoint]): Unit = js.native
  /* CompleteClass */
  override def processUpEvent(value: PointerPoint): Unit = js.native
}

