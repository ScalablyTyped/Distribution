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

