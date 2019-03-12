package typings
package winrtLib.WindowsNs.UINs.InputNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGestureRecognizer extends js.Object {
  var autoProcessInertia: scala.Boolean
  var crossSlideExact: scala.Boolean
  var crossSlideHorizontally: scala.Boolean
  var crossSlideThresholds: CrossSlideThresholds
  var gestureSettings: GestureSettings
  var inertiaExpansion: scala.Double
  var inertiaExpansionDeceleration: scala.Double
  var inertiaRotationAngle: scala.Double
  var inertiaRotationDeceleration: scala.Double
  var inertiaTranslationDeceleration: scala.Double
  var inertiaTranslationDisplacement: scala.Double
  var isActive: scala.Boolean
  var isInertial: scala.Boolean
  var manipulationExact: scala.Boolean
  var mouseWheelParameters: MouseWheelParameters
  var oncrosssliding: js.Any
  var ondragging: js.Any
  var onholding: js.Any
  var onmanipulationcompleted: js.Any
  var onmanipulationinertiastarting: js.Any
  var onmanipulationstarted: js.Any
  var onmanipulationupdated: js.Any
  var onrighttapped: js.Any
  var ontapped: js.Any
  var pivotCenter: winrtLib.WindowsNs.FoundationNs.Point
  var pivotRadius: scala.Double
  var showGestureFeedback: scala.Boolean
  def canBeDoubleTap(value: PointerPoint): scala.Boolean
  def completeGesture(): scala.Unit
  def processDownEvent(value: PointerPoint): scala.Unit
  def processInertia(): scala.Unit
  def processMouseWheelEvent(value: PointerPoint, isShiftKeyDown: scala.Boolean, isControlKeyDown: scala.Boolean): scala.Unit
  def processMoveEvents(value: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[PointerPoint]): scala.Unit
  def processUpEvent(value: PointerPoint): scala.Unit
}

object IGestureRecognizer {
  @scala.inline
  def apply(
    autoProcessInertia: scala.Boolean,
    canBeDoubleTap: PointerPoint => scala.Boolean,
    completeGesture: () => scala.Unit,
    crossSlideExact: scala.Boolean,
    crossSlideHorizontally: scala.Boolean,
    crossSlideThresholds: CrossSlideThresholds,
    gestureSettings: GestureSettings,
    inertiaExpansion: scala.Double,
    inertiaExpansionDeceleration: scala.Double,
    inertiaRotationAngle: scala.Double,
    inertiaRotationDeceleration: scala.Double,
    inertiaTranslationDeceleration: scala.Double,
    inertiaTranslationDisplacement: scala.Double,
    isActive: scala.Boolean,
    isInertial: scala.Boolean,
    manipulationExact: scala.Boolean,
    mouseWheelParameters: MouseWheelParameters,
    oncrosssliding: js.Any,
    ondragging: js.Any,
    onholding: js.Any,
    onmanipulationcompleted: js.Any,
    onmanipulationinertiastarting: js.Any,
    onmanipulationstarted: js.Any,
    onmanipulationupdated: js.Any,
    onrighttapped: js.Any,
    ontapped: js.Any,
    pivotCenter: winrtLib.WindowsNs.FoundationNs.Point,
    pivotRadius: scala.Double,
    processDownEvent: PointerPoint => scala.Unit,
    processInertia: () => scala.Unit,
    processMouseWheelEvent: (PointerPoint, scala.Boolean, scala.Boolean) => scala.Unit,
    processMoveEvents: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[PointerPoint] => scala.Unit,
    processUpEvent: PointerPoint => scala.Unit,
    showGestureFeedback: scala.Boolean
  ): IGestureRecognizer = {
    val __obj = js.Dynamic.literal(autoProcessInertia = autoProcessInertia, canBeDoubleTap = js.Any.fromFunction1(canBeDoubleTap), completeGesture = js.Any.fromFunction0(completeGesture), crossSlideExact = crossSlideExact, crossSlideHorizontally = crossSlideHorizontally, crossSlideThresholds = crossSlideThresholds, gestureSettings = gestureSettings, inertiaExpansion = inertiaExpansion, inertiaExpansionDeceleration = inertiaExpansionDeceleration, inertiaRotationAngle = inertiaRotationAngle, inertiaRotationDeceleration = inertiaRotationDeceleration, inertiaTranslationDeceleration = inertiaTranslationDeceleration, inertiaTranslationDisplacement = inertiaTranslationDisplacement, isActive = isActive, isInertial = isInertial, manipulationExact = manipulationExact, mouseWheelParameters = mouseWheelParameters, oncrosssliding = oncrosssliding, ondragging = ondragging, onholding = onholding, onmanipulationcompleted = onmanipulationcompleted, onmanipulationinertiastarting = onmanipulationinertiastarting, onmanipulationstarted = onmanipulationstarted, onmanipulationupdated = onmanipulationupdated, onrighttapped = onrighttapped, ontapped = ontapped, pivotCenter = pivotCenter, pivotRadius = pivotRadius, processDownEvent = js.Any.fromFunction1(processDownEvent), processInertia = js.Any.fromFunction0(processInertia), processMouseWheelEvent = js.Any.fromFunction3(processMouseWheelEvent), processMoveEvents = js.Any.fromFunction1(processMoveEvents), processUpEvent = js.Any.fromFunction1(processUpEvent), showGestureFeedback = showGestureFeedback)
  
    __obj.asInstanceOf[IGestureRecognizer]
  }
}

