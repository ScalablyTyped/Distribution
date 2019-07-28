package typings.winrt.WindowsNs.UINs.InputNs

import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IVector
import typings.winrt.WindowsNs.FoundationNs.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGestureRecognizer extends js.Object {
  var autoProcessInertia: Boolean
  var crossSlideExact: Boolean
  var crossSlideHorizontally: Boolean
  var crossSlideThresholds: CrossSlideThresholds
  var gestureSettings: GestureSettings
  var inertiaExpansion: Double
  var inertiaExpansionDeceleration: Double
  var inertiaRotationAngle: Double
  var inertiaRotationDeceleration: Double
  var inertiaTranslationDeceleration: Double
  var inertiaTranslationDisplacement: Double
  var isActive: Boolean
  var isInertial: Boolean
  var manipulationExact: Boolean
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
  var pivotCenter: Point
  var pivotRadius: Double
  var showGestureFeedback: Boolean
  def canBeDoubleTap(value: PointerPoint): Boolean
  def completeGesture(): Unit
  def processDownEvent(value: PointerPoint): Unit
  def processInertia(): Unit
  def processMouseWheelEvent(value: PointerPoint, isShiftKeyDown: Boolean, isControlKeyDown: Boolean): Unit
  def processMoveEvents(value: IVector[PointerPoint]): Unit
  def processUpEvent(value: PointerPoint): Unit
}

object IGestureRecognizer {
  @scala.inline
  def apply(
    autoProcessInertia: Boolean,
    canBeDoubleTap: PointerPoint => Boolean,
    completeGesture: () => Unit,
    crossSlideExact: Boolean,
    crossSlideHorizontally: Boolean,
    crossSlideThresholds: CrossSlideThresholds,
    gestureSettings: GestureSettings,
    inertiaExpansion: Double,
    inertiaExpansionDeceleration: Double,
    inertiaRotationAngle: Double,
    inertiaRotationDeceleration: Double,
    inertiaTranslationDeceleration: Double,
    inertiaTranslationDisplacement: Double,
    isActive: Boolean,
    isInertial: Boolean,
    manipulationExact: Boolean,
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
    pivotCenter: Point,
    pivotRadius: Double,
    processDownEvent: PointerPoint => Unit,
    processInertia: () => Unit,
    processMouseWheelEvent: (PointerPoint, Boolean, Boolean) => Unit,
    processMoveEvents: IVector[PointerPoint] => Unit,
    processUpEvent: PointerPoint => Unit,
    showGestureFeedback: Boolean
  ): IGestureRecognizer = {
    val __obj = js.Dynamic.literal(autoProcessInertia = autoProcessInertia, canBeDoubleTap = js.Any.fromFunction1(canBeDoubleTap), completeGesture = js.Any.fromFunction0(completeGesture), crossSlideExact = crossSlideExact, crossSlideHorizontally = crossSlideHorizontally, crossSlideThresholds = crossSlideThresholds, gestureSettings = gestureSettings, inertiaExpansion = inertiaExpansion, inertiaExpansionDeceleration = inertiaExpansionDeceleration, inertiaRotationAngle = inertiaRotationAngle, inertiaRotationDeceleration = inertiaRotationDeceleration, inertiaTranslationDeceleration = inertiaTranslationDeceleration, inertiaTranslationDisplacement = inertiaTranslationDisplacement, isActive = isActive, isInertial = isInertial, manipulationExact = manipulationExact, mouseWheelParameters = mouseWheelParameters, oncrosssliding = oncrosssliding, ondragging = ondragging, onholding = onholding, onmanipulationcompleted = onmanipulationcompleted, onmanipulationinertiastarting = onmanipulationinertiastarting, onmanipulationstarted = onmanipulationstarted, onmanipulationupdated = onmanipulationupdated, onrighttapped = onrighttapped, ontapped = ontapped, pivotCenter = pivotCenter, pivotRadius = pivotRadius, processDownEvent = js.Any.fromFunction1(processDownEvent), processInertia = js.Any.fromFunction0(processInertia), processMouseWheelEvent = js.Any.fromFunction3(processMouseWheelEvent), processMoveEvents = js.Any.fromFunction1(processMoveEvents), processUpEvent = js.Any.fromFunction1(processUpEvent), showGestureFeedback = showGestureFeedback)
  
    __obj.asInstanceOf[IGestureRecognizer]
  }
}

