package typings.winrt.Windows.UI.Input

import typings.winrt.Windows.Foundation.Collections.IVector
import typings.winrt.Windows.Foundation.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGestureRecognizer extends js.Object {
  var autoProcessInertia: Boolean = js.native
  var crossSlideExact: Boolean = js.native
  var crossSlideHorizontally: Boolean = js.native
  var crossSlideThresholds: CrossSlideThresholds = js.native
  var gestureSettings: GestureSettings = js.native
  var inertiaExpansion: Double = js.native
  var inertiaExpansionDeceleration: Double = js.native
  var inertiaRotationAngle: Double = js.native
  var inertiaRotationDeceleration: Double = js.native
  var inertiaTranslationDeceleration: Double = js.native
  var inertiaTranslationDisplacement: Double = js.native
  var isActive: Boolean = js.native
  var isInertial: Boolean = js.native
  var manipulationExact: Boolean = js.native
  var mouseWheelParameters: MouseWheelParameters = js.native
  var oncrosssliding: js.Any = js.native
  var ondragging: js.Any = js.native
  var onholding: js.Any = js.native
  var onmanipulationcompleted: js.Any = js.native
  var onmanipulationinertiastarting: js.Any = js.native
  var onmanipulationstarted: js.Any = js.native
  var onmanipulationupdated: js.Any = js.native
  var onrighttapped: js.Any = js.native
  var ontapped: js.Any = js.native
  var pivotCenter: Point = js.native
  var pivotRadius: Double = js.native
  var showGestureFeedback: Boolean = js.native
  def canBeDoubleTap(value: PointerPoint): Boolean = js.native
  def completeGesture(): Unit = js.native
  def processDownEvent(value: PointerPoint): Unit = js.native
  def processInertia(): Unit = js.native
  def processMouseWheelEvent(value: PointerPoint, isShiftKeyDown: Boolean, isControlKeyDown: Boolean): Unit = js.native
  def processMoveEvents(value: IVector[PointerPoint]): Unit = js.native
  def processUpEvent(value: PointerPoint): Unit = js.native
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
    val __obj = js.Dynamic.literal(autoProcessInertia = autoProcessInertia.asInstanceOf[js.Any], canBeDoubleTap = js.Any.fromFunction1(canBeDoubleTap), completeGesture = js.Any.fromFunction0(completeGesture), crossSlideExact = crossSlideExact.asInstanceOf[js.Any], crossSlideHorizontally = crossSlideHorizontally.asInstanceOf[js.Any], crossSlideThresholds = crossSlideThresholds.asInstanceOf[js.Any], gestureSettings = gestureSettings.asInstanceOf[js.Any], inertiaExpansion = inertiaExpansion.asInstanceOf[js.Any], inertiaExpansionDeceleration = inertiaExpansionDeceleration.asInstanceOf[js.Any], inertiaRotationAngle = inertiaRotationAngle.asInstanceOf[js.Any], inertiaRotationDeceleration = inertiaRotationDeceleration.asInstanceOf[js.Any], inertiaTranslationDeceleration = inertiaTranslationDeceleration.asInstanceOf[js.Any], inertiaTranslationDisplacement = inertiaTranslationDisplacement.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], isInertial = isInertial.asInstanceOf[js.Any], manipulationExact = manipulationExact.asInstanceOf[js.Any], mouseWheelParameters = mouseWheelParameters.asInstanceOf[js.Any], oncrosssliding = oncrosssliding.asInstanceOf[js.Any], ondragging = ondragging.asInstanceOf[js.Any], onholding = onholding.asInstanceOf[js.Any], onmanipulationcompleted = onmanipulationcompleted.asInstanceOf[js.Any], onmanipulationinertiastarting = onmanipulationinertiastarting.asInstanceOf[js.Any], onmanipulationstarted = onmanipulationstarted.asInstanceOf[js.Any], onmanipulationupdated = onmanipulationupdated.asInstanceOf[js.Any], onrighttapped = onrighttapped.asInstanceOf[js.Any], ontapped = ontapped.asInstanceOf[js.Any], pivotCenter = pivotCenter.asInstanceOf[js.Any], pivotRadius = pivotRadius.asInstanceOf[js.Any], processDownEvent = js.Any.fromFunction1(processDownEvent), processInertia = js.Any.fromFunction0(processInertia), processMouseWheelEvent = js.Any.fromFunction3(processMouseWheelEvent), processMoveEvents = js.Any.fromFunction1(processMoveEvents), processUpEvent = js.Any.fromFunction1(processUpEvent), showGestureFeedback = showGestureFeedback.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGestureRecognizer]
  }
  @scala.inline
  implicit class IGestureRecognizerOps[Self <: IGestureRecognizer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAutoProcessInertia(value: Boolean): Self = this.set("autoProcessInertia", value.asInstanceOf[js.Any])
    @scala.inline
    def setCanBeDoubleTap(value: PointerPoint => Boolean): Self = this.set("canBeDoubleTap", js.Any.fromFunction1(value))
    @scala.inline
    def setCompleteGesture(value: () => Unit): Self = this.set("completeGesture", js.Any.fromFunction0(value))
    @scala.inline
    def setCrossSlideExact(value: Boolean): Self = this.set("crossSlideExact", value.asInstanceOf[js.Any])
    @scala.inline
    def setCrossSlideHorizontally(value: Boolean): Self = this.set("crossSlideHorizontally", value.asInstanceOf[js.Any])
    @scala.inline
    def setCrossSlideThresholds(value: CrossSlideThresholds): Self = this.set("crossSlideThresholds", value.asInstanceOf[js.Any])
    @scala.inline
    def setGestureSettings(value: GestureSettings): Self = this.set("gestureSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def setInertiaExpansion(value: Double): Self = this.set("inertiaExpansion", value.asInstanceOf[js.Any])
    @scala.inline
    def setInertiaExpansionDeceleration(value: Double): Self = this.set("inertiaExpansionDeceleration", value.asInstanceOf[js.Any])
    @scala.inline
    def setInertiaRotationAngle(value: Double): Self = this.set("inertiaRotationAngle", value.asInstanceOf[js.Any])
    @scala.inline
    def setInertiaRotationDeceleration(value: Double): Self = this.set("inertiaRotationDeceleration", value.asInstanceOf[js.Any])
    @scala.inline
    def setInertiaTranslationDeceleration(value: Double): Self = this.set("inertiaTranslationDeceleration", value.asInstanceOf[js.Any])
    @scala.inline
    def setInertiaTranslationDisplacement(value: Double): Self = this.set("inertiaTranslationDisplacement", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsActive(value: Boolean): Self = this.set("isActive", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsInertial(value: Boolean): Self = this.set("isInertial", value.asInstanceOf[js.Any])
    @scala.inline
    def setManipulationExact(value: Boolean): Self = this.set("manipulationExact", value.asInstanceOf[js.Any])
    @scala.inline
    def setMouseWheelParameters(value: MouseWheelParameters): Self = this.set("mouseWheelParameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setOncrosssliding(value: js.Any): Self = this.set("oncrosssliding", value.asInstanceOf[js.Any])
    @scala.inline
    def setOndragging(value: js.Any): Self = this.set("ondragging", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnholding(value: js.Any): Self = this.set("onholding", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnmanipulationcompleted(value: js.Any): Self = this.set("onmanipulationcompleted", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnmanipulationinertiastarting(value: js.Any): Self = this.set("onmanipulationinertiastarting", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnmanipulationstarted(value: js.Any): Self = this.set("onmanipulationstarted", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnmanipulationupdated(value: js.Any): Self = this.set("onmanipulationupdated", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnrighttapped(value: js.Any): Self = this.set("onrighttapped", value.asInstanceOf[js.Any])
    @scala.inline
    def setOntapped(value: js.Any): Self = this.set("ontapped", value.asInstanceOf[js.Any])
    @scala.inline
    def setPivotCenter(value: Point): Self = this.set("pivotCenter", value.asInstanceOf[js.Any])
    @scala.inline
    def setPivotRadius(value: Double): Self = this.set("pivotRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def setProcessDownEvent(value: PointerPoint => Unit): Self = this.set("processDownEvent", js.Any.fromFunction1(value))
    @scala.inline
    def setProcessInertia(value: () => Unit): Self = this.set("processInertia", js.Any.fromFunction0(value))
    @scala.inline
    def setProcessMouseWheelEvent(value: (PointerPoint, Boolean, Boolean) => Unit): Self = this.set("processMouseWheelEvent", js.Any.fromFunction3(value))
    @scala.inline
    def setProcessMoveEvents(value: IVector[PointerPoint] => Unit): Self = this.set("processMoveEvents", js.Any.fromFunction1(value))
    @scala.inline
    def setProcessUpEvent(value: PointerPoint => Unit): Self = this.set("processUpEvent", js.Any.fromFunction1(value))
    @scala.inline
    def setShowGestureFeedback(value: Boolean): Self = this.set("showGestureFeedback", value.asInstanceOf[js.Any])
  }
  
}

