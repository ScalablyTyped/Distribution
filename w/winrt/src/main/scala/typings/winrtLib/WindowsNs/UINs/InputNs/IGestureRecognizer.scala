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
    canBeDoubleTap: js.Function1[PointerPoint, scala.Boolean],
    completeGesture: js.Function0[scala.Unit],
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
    processDownEvent: js.Function1[PointerPoint, scala.Unit],
    processInertia: js.Function0[scala.Unit],
    processMouseWheelEvent: js.Function3[PointerPoint, scala.Boolean, scala.Boolean, scala.Unit],
    processMoveEvents: js.Function1[winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[PointerPoint], scala.Unit],
    processUpEvent: js.Function1[PointerPoint, scala.Unit],
    showGestureFeedback: scala.Boolean
  ): IGestureRecognizer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("autoProcessInertia")(autoProcessInertia)
    __obj.updateDynamic("canBeDoubleTap")(canBeDoubleTap)
    __obj.updateDynamic("completeGesture")(completeGesture)
    __obj.updateDynamic("crossSlideExact")(crossSlideExact)
    __obj.updateDynamic("crossSlideHorizontally")(crossSlideHorizontally)
    __obj.updateDynamic("crossSlideThresholds")(crossSlideThresholds)
    __obj.updateDynamic("gestureSettings")(gestureSettings)
    __obj.updateDynamic("inertiaExpansion")(inertiaExpansion)
    __obj.updateDynamic("inertiaExpansionDeceleration")(inertiaExpansionDeceleration)
    __obj.updateDynamic("inertiaRotationAngle")(inertiaRotationAngle)
    __obj.updateDynamic("inertiaRotationDeceleration")(inertiaRotationDeceleration)
    __obj.updateDynamic("inertiaTranslationDeceleration")(inertiaTranslationDeceleration)
    __obj.updateDynamic("inertiaTranslationDisplacement")(inertiaTranslationDisplacement)
    __obj.updateDynamic("isActive")(isActive)
    __obj.updateDynamic("isInertial")(isInertial)
    __obj.updateDynamic("manipulationExact")(manipulationExact)
    __obj.updateDynamic("mouseWheelParameters")(mouseWheelParameters)
    __obj.updateDynamic("oncrosssliding")(oncrosssliding)
    __obj.updateDynamic("ondragging")(ondragging)
    __obj.updateDynamic("onholding")(onholding)
    __obj.updateDynamic("onmanipulationcompleted")(onmanipulationcompleted)
    __obj.updateDynamic("onmanipulationinertiastarting")(onmanipulationinertiastarting)
    __obj.updateDynamic("onmanipulationstarted")(onmanipulationstarted)
    __obj.updateDynamic("onmanipulationupdated")(onmanipulationupdated)
    __obj.updateDynamic("onrighttapped")(onrighttapped)
    __obj.updateDynamic("ontapped")(ontapped)
    __obj.updateDynamic("pivotCenter")(pivotCenter)
    __obj.updateDynamic("pivotRadius")(pivotRadius)
    __obj.updateDynamic("processDownEvent")(processDownEvent)
    __obj.updateDynamic("processInertia")(processInertia)
    __obj.updateDynamic("processMouseWheelEvent")(processMouseWheelEvent)
    __obj.updateDynamic("processMoveEvents")(processMoveEvents)
    __obj.updateDynamic("processUpEvent")(processUpEvent)
    __obj.updateDynamic("showGestureFeedback")(showGestureFeedback)
    __obj.asInstanceOf[IGestureRecognizer]
  }
}

