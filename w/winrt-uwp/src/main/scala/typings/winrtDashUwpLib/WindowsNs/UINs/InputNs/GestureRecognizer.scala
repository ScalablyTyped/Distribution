package typings
package winrtDashUwpLib.WindowsNs.UINs.InputNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides gesture and manipulation recognition, event listeners, and settings. */
@JSGlobal("Windows.UI.Input.GestureRecognizer")
@js.native
/** Initializes a new instance of a GestureRecognizer object. */
class GestureRecognizer () extends js.Object {
  /** Gets or sets a value that indicates whether manipulations during inertia are generated automatically. */
  var autoProcessInertia: scala.Boolean = js.native
  /** Gets or sets a value that indicates whether the exact distance from initial contact to end of the cross-slide interaction is reported. */
  var crossSlideExact: scala.Boolean = js.native
  /** Gets or sets a value that indicates whether the cross-slide axis is horizontal. */
  var crossSlideHorizontally: scala.Boolean = js.native
  /** Gets or sets values that indicate the distance thresholds for a CrossSliding interaction. */
  var crossSlideThresholds: CrossSlideThresholds = js.native
  /** Gets or sets a value that indicates the gesture and manipulation settings supported by an application. */
  var gestureSettings: GestureSettings = js.native
  /** Gets or sets a value that indicates the relative change in size of an object from the start of inertia to the end of inertia (when resizing, or scaling, is complete). */
  var inertiaExpansion: scala.Double = js.native
  /** Gets or sets a value that indicates the rate of deceleration from the start of inertia to the end of inertia (when the resizing, or expansion, manipulation is complete). */
  var inertiaExpansionDeceleration: scala.Double = js.native
  /** Gets or sets a value that indicates the final angle of rotation of an object at the end of inertia (when the rotation manipulation is complete). */
  var inertiaRotationAngle: scala.Double = js.native
  /** Gets or sets a value that indicates the rate of deceleration from the start of inertia to the end of inertia (when the rotation manipulation is complete). */
  var inertiaRotationDeceleration: scala.Double = js.native
  /** Gets or sets a value that indicates the rate of deceleration from the start of inertia to the end of inertia (when the translation manipulation is complete). */
  var inertiaTranslationDeceleration: scala.Double = js.native
  /** Gets or sets a value that indicates the relative change in the screen location of an object from the start of inertia to the end of inertia (when the translation manipulation is complete). */
  var inertiaTranslationDisplacement: scala.Double = js.native
  /** Gets a value that indicates whether an interaction is being processed. */
  var isActive: scala.Boolean = js.native
  /** Gets a value that indicates whether a manipulation is still being processed during inertia (no input points are active). */
  var isInertial: scala.Boolean = js.native
  /** Gets or sets a value that indicates whether the exact distance from initial contact to end of the interaction is reported. */
  var manipulationExact: scala.Boolean = js.native
  /** Gets a set of properties that are associated with the wheel button of a mouse device. */
  var mouseWheelParameters: MouseWheelParameters = js.native
  /** Occurs when a user performs a slide or swipe gesture (through a single touch contact) within a content area that supports panning along a single axis only. The gesture must occur in a direction that is perpendicular to this panning axis. */
  @JSName("oncrosssliding")
  var oncrosssliding_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[GestureRecognizer, CrossSlidingEventArgs] = js.native
  /** Occurs when a user performs a slide or swipe gesture with a mouse or pen/stylus (single contact). */
  @JSName("ondragging")
  var ondragging_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[GestureRecognizer, DraggingEventArgs] = js.native
  /** Occurs when a user performs a press and hold gesture (with a single touch, mouse, or pen/stylus contact). */
  @JSName("onholding")
  var onholding_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[GestureRecognizer, HoldingEventArgs] = js.native
  /** Occurs when the input points are lifted and all subsequent motion (translation, expansion, or rotation) through inertia has ended. */
  @JSName("onmanipulationcompleted")
  var onmanipulationcompleted_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[GestureRecognizer, ManipulationCompletedEventArgs] = js.native
  /** Occurs when all contact points are lifted during a manipulation and the velocity of the manipulation is significant enough to initiate inertia behavior (translation, expansion, or rotation continue after the input pointers are lifted). */
  @JSName("onmanipulationinertiastarting")
  var onmanipulationinertiastarting_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[GestureRecognizer, ManipulationInertiaStartingEventArgs] = js.native
  /** Occurs when one or more input points have been initiated and subsequent motion (translation, expansion, or rotation) has begun. */
  @JSName("onmanipulationstarted")
  var onmanipulationstarted_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[GestureRecognizer, ManipulationStartedEventArgs] = js.native
  /** Occurs after one or more input points have been initiated and subsequent motion (translation, expansion, or rotation) is under way. */
  @JSName("onmanipulationupdated")
  var onmanipulationupdated_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[GestureRecognizer, ManipulationUpdatedEventArgs] = js.native
  /** Occurs when the pointer input is interpreted as a right-tap gesture, regardless of input device. */
  @JSName("onrighttapped")
  var onrighttapped_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[GestureRecognizer, RightTappedEventArgs] = js.native
  /** Occurs when the pointer input is interpreted as a tap gesture. */
  @JSName("ontapped")
  var ontapped_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[GestureRecognizer, TappedEventArgs] = js.native
  /** Gets or sets the center point for a rotation interaction when single pointer input is detected. */
  var pivotCenter: winrtDashUwpLib.WindowsNs.FoundationNs.Point = js.native
  /** Gets or sets the radius, from the PivotCenter to the pointer input, for a rotation interaction when single pointer input is detected. */
  var pivotRadius: scala.Double = js.native
  /** Gets or sets a value that indicates whether visual feedback is displayed during an interaction. */
  var showGestureFeedback: scala.Boolean = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_crosssliding(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.crosssliding,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[GestureRecognizer, CrossSlidingEventArgs]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragging(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.dragging,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[GestureRecognizer, DraggingEventArgs]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_holding(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.holding,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[GestureRecognizer, HoldingEventArgs]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_manipulationcompleted(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.manipulationcompleted,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[GestureRecognizer, ManipulationCompletedEventArgs]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_manipulationinertiastarting(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.manipulationinertiastarting,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[GestureRecognizer, ManipulationInertiaStartingEventArgs]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_manipulationstarted(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.manipulationstarted,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[GestureRecognizer, ManipulationStartedEventArgs]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_manipulationupdated(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.manipulationupdated,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[GestureRecognizer, ManipulationUpdatedEventArgs]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_righttapped(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.righttapped,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[GestureRecognizer, RightTappedEventArgs]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_tapped(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.tapped,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[GestureRecognizer, TappedEventArgs]
  ): scala.Unit = js.native
  /**
    * Identifies whether a tap can still be interpreted as the second tap of a double tap gesture.
    * @param value The last input pointer.
    * @return True if a UI element supports the double tap gesture and the time threshold to complete the gesture has not been crossed; otherwise false.
    */
  def canBeDoubleTap(value: PointerPoint): scala.Boolean = js.native
  /** Causes the gesture recognizer to finalize an interaction. */
  def completeGesture(): scala.Unit = js.native
  /** Occurs when a user performs a slide or swipe gesture (through a single touch contact) within a content area that supports panning along a single axis only. The gesture must occur in a direction that is perpendicular to this panning axis. */
  def oncrosssliding(ev: CrossSlidingEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[GestureRecognizer]): scala.Unit = js.native
  /** Occurs when a user performs a slide or swipe gesture with a mouse or pen/stylus (single contact). */
  def ondragging(ev: DraggingEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[GestureRecognizer]): scala.Unit = js.native
  /** Occurs when a user performs a press and hold gesture (with a single touch, mouse, or pen/stylus contact). */
  def onholding(ev: HoldingEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[GestureRecognizer]): scala.Unit = js.native
  /** Occurs when the input points are lifted and all subsequent motion (translation, expansion, or rotation) through inertia has ended. */
  def onmanipulationcompleted(ev: ManipulationCompletedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[GestureRecognizer]): scala.Unit = js.native
  /** Occurs when all contact points are lifted during a manipulation and the velocity of the manipulation is significant enough to initiate inertia behavior (translation, expansion, or rotation continue after the input pointers are lifted). */
  def onmanipulationinertiastarting(
    ev: ManipulationInertiaStartingEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[GestureRecognizer]
  ): scala.Unit = js.native
  /** Occurs when one or more input points have been initiated and subsequent motion (translation, expansion, or rotation) has begun. */
  def onmanipulationstarted(ev: ManipulationStartedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[GestureRecognizer]): scala.Unit = js.native
  /** Occurs after one or more input points have been initiated and subsequent motion (translation, expansion, or rotation) is under way. */
  def onmanipulationupdated(ev: ManipulationUpdatedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[GestureRecognizer]): scala.Unit = js.native
  /** Occurs when the pointer input is interpreted as a right-tap gesture, regardless of input device. */
  def onrighttapped(ev: RightTappedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[GestureRecognizer]): scala.Unit = js.native
  /** Occurs when the pointer input is interpreted as a tap gesture. */
  def ontapped(ev: TappedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[GestureRecognizer]): scala.Unit = js.native
  /**
    * Processes pointer input and raises the GestureRecognizer events appropriate to a pointer down action for the gestures and manipulations specified by the GestureSettings property.
    * @param value The input point.
    */
  def processDownEvent(value: PointerPoint): scala.Unit = js.native
  /** Performs inertia calculations and raises the various inertia events. */
  def processInertia(): scala.Unit = js.native
  /**
    * Processes pointer input and raises the GestureRecognizer events appropriate to a mouse wheel action for the gestures and manipulations specified by the GestureSettings property.
    * @param value The input point.
    * @param isShiftKeyDown True if the Shift key is pressed; otherwise false.
    * @param isControlKeyDown True if the Ctrl key is pressed.
    */
  def processMouseWheelEvent(value: PointerPoint, isShiftKeyDown: scala.Boolean, isControlKeyDown: scala.Boolean): scala.Unit = js.native
  /**
    * Processes pointer input and raises the GestureRecognizer events appropriate to a pointer move action for the gestures and manipulations specified by the GestureSettings property.
    * @param value The pointer location history based on the PointerId . If no history is available then the value is the current location of the input pointer.
    */
  def processMoveEvents(value: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[PointerPoint]): scala.Unit = js.native
  /**
    * Processes pointer input and raises the GestureRecognizer events appropriate to a pointer up action for the gestures and manipulations specified by the GestureSettings property.
    * @param value The input point.
    */
  def processUpEvent(value: PointerPoint): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_crosssliding(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.crosssliding,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[GestureRecognizer, CrossSlidingEventArgs]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragging(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.dragging,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[GestureRecognizer, DraggingEventArgs]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_holding(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.holding,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[GestureRecognizer, HoldingEventArgs]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_manipulationcompleted(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.manipulationcompleted,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[GestureRecognizer, ManipulationCompletedEventArgs]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_manipulationinertiastarting(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.manipulationinertiastarting,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[GestureRecognizer, ManipulationInertiaStartingEventArgs]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_manipulationstarted(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.manipulationstarted,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[GestureRecognizer, ManipulationStartedEventArgs]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_manipulationupdated(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.manipulationupdated,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[GestureRecognizer, ManipulationUpdatedEventArgs]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_righttapped(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.righttapped,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[GestureRecognizer, RightTappedEventArgs]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_tapped(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.tapped,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[GestureRecognizer, TappedEventArgs]
  ): scala.Unit = js.native
}

