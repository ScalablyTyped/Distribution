package typings
package winrtLib.WindowsNs.UINs.InputNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.UI.Input.GestureRecognizer")
@js.native
class GestureRecognizer () extends IGestureRecognizer {
  /* CompleteClass */
  override var autoProcessInertia: scala.Boolean = js.native
  /* CompleteClass */
  override var crossSlideExact: scala.Boolean = js.native
  /* CompleteClass */
  override var crossSlideHorizontally: scala.Boolean = js.native
  /* CompleteClass */
  override var crossSlideThresholds: CrossSlideThresholds = js.native
  /* CompleteClass */
  override var gestureSettings: GestureSettings = js.native
  /* CompleteClass */
  override var inertiaExpansion: scala.Double = js.native
  /* CompleteClass */
  override var inertiaExpansionDeceleration: scala.Double = js.native
  /* CompleteClass */
  override var inertiaRotationAngle: scala.Double = js.native
  /* CompleteClass */
  override var inertiaRotationDeceleration: scala.Double = js.native
  /* CompleteClass */
  override var inertiaTranslationDeceleration: scala.Double = js.native
  /* CompleteClass */
  override var inertiaTranslationDisplacement: scala.Double = js.native
  /* CompleteClass */
  override var isActive: scala.Boolean = js.native
  /* CompleteClass */
  override var isInertial: scala.Boolean = js.native
  /* CompleteClass */
  override var manipulationExact: scala.Boolean = js.native
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
  override var pivotCenter: winrtLib.WindowsNs.FoundationNs.Point = js.native
  /* CompleteClass */
  override var pivotRadius: scala.Double = js.native
  /* CompleteClass */
  override var showGestureFeedback: scala.Boolean = js.native
  /* CompleteClass */
  override def canBeDoubleTap(value: PointerPoint): scala.Boolean = js.native
  /* CompleteClass */
  override def completeGesture(): scala.Unit = js.native
  /* CompleteClass */
  override def processDownEvent(value: PointerPoint): scala.Unit = js.native
  /* CompleteClass */
  override def processInertia(): scala.Unit = js.native
  /* CompleteClass */
  override def processMouseWheelEvent(value: PointerPoint, isShiftKeyDown: scala.Boolean, isControlKeyDown: scala.Boolean): scala.Unit = js.native
  /* CompleteClass */
  override def processMoveEvents(value: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[PointerPoint]): scala.Unit = js.native
  /* CompleteClass */
  override def processUpEvent(value: PointerPoint): scala.Unit = js.native
}

