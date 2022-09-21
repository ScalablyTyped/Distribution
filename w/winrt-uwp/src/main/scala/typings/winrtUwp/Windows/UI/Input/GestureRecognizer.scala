package typings.winrtUwp.Windows.UI.Input

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.Point
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.crosssliding
import typings.winrtUwp.winrtUwpStrings.dragging
import typings.winrtUwp.winrtUwpStrings.holding
import typings.winrtUwp.winrtUwpStrings.manipulationcompleted
import typings.winrtUwp.winrtUwpStrings.manipulationinertiastarting
import typings.winrtUwp.winrtUwpStrings.manipulationstarted
import typings.winrtUwp.winrtUwpStrings.manipulationupdated
import typings.winrtUwp.winrtUwpStrings.righttapped
import typings.winrtUwp.winrtUwpStrings.tapped
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides gesture and manipulation recognition, event listeners, and settings. */
@js.native
trait GestureRecognizer extends StObject {
  
  def addEventListener(`type`: String, listener: EventHandler[Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_crosssliding(`type`: crosssliding, listener: TypedEventHandler[GestureRecognizer, CrossSlidingEventArgs]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragging(`type`: dragging, listener: TypedEventHandler[GestureRecognizer, DraggingEventArgs]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_holding(`type`: holding, listener: TypedEventHandler[GestureRecognizer, HoldingEventArgs]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_manipulationcompleted(
    `type`: manipulationcompleted,
    listener: TypedEventHandler[GestureRecognizer, ManipulationCompletedEventArgs]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_manipulationinertiastarting(
    `type`: manipulationinertiastarting,
    listener: TypedEventHandler[GestureRecognizer, ManipulationInertiaStartingEventArgs]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_manipulationstarted(
    `type`: manipulationstarted,
    listener: TypedEventHandler[GestureRecognizer, ManipulationStartedEventArgs]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_manipulationupdated(
    `type`: manipulationupdated,
    listener: TypedEventHandler[GestureRecognizer, ManipulationUpdatedEventArgs]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_righttapped(`type`: righttapped, listener: TypedEventHandler[GestureRecognizer, RightTappedEventArgs]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_tapped(`type`: tapped, listener: TypedEventHandler[GestureRecognizer, TappedEventArgs]): Unit = js.native
  
  /** Gets or sets a value that indicates whether manipulations during inertia are generated automatically. */
  var autoProcessInertia: Boolean = js.native
  
  /**
    * Identifies whether a tap can still be interpreted as the second tap of a double tap gesture.
    * @param value The last input pointer.
    * @return True if a UI element supports the double tap gesture and the time threshold to complete the gesture has not been crossed; otherwise false.
    */
  def canBeDoubleTap(value: PointerPoint): Boolean = js.native
  
  /** Causes the gesture recognizer to finalize an interaction. */
  def completeGesture(): Unit = js.native
  
  /** Gets or sets a value that indicates whether the exact distance from initial contact to end of the cross-slide interaction is reported. */
  var crossSlideExact: Boolean = js.native
  
  /** Gets or sets a value that indicates whether the cross-slide axis is horizontal. */
  var crossSlideHorizontally: Boolean = js.native
  
  /** Gets or sets values that indicate the distance thresholds for a CrossSliding interaction. */
  var crossSlideThresholds: CrossSlideThresholds = js.native
  
  /** Gets or sets a value that indicates the gesture and manipulation settings supported by an application. */
  var gestureSettings: GestureSettings = js.native
  
  /** Gets or sets a value that indicates the relative change in size of an object from the start of inertia to the end of inertia (when resizing, or scaling, is complete). */
  var inertiaExpansion: Double = js.native
  
  /** Gets or sets a value that indicates the rate of deceleration from the start of inertia to the end of inertia (when the resizing, or expansion, manipulation is complete). */
  var inertiaExpansionDeceleration: Double = js.native
  
  /** Gets or sets a value that indicates the final angle of rotation of an object at the end of inertia (when the rotation manipulation is complete). */
  var inertiaRotationAngle: Double = js.native
  
  /** Gets or sets a value that indicates the rate of deceleration from the start of inertia to the end of inertia (when the rotation manipulation is complete). */
  var inertiaRotationDeceleration: Double = js.native
  
  /** Gets or sets a value that indicates the rate of deceleration from the start of inertia to the end of inertia (when the translation manipulation is complete). */
  var inertiaTranslationDeceleration: Double = js.native
  
  /** Gets or sets a value that indicates the relative change in the screen location of an object from the start of inertia to the end of inertia (when the translation manipulation is complete). */
  var inertiaTranslationDisplacement: Double = js.native
  
  /** Gets a value that indicates whether an interaction is being processed. */
  var isActive: Boolean = js.native
  
  /** Gets a value that indicates whether a manipulation is still being processed during inertia (no input points are active). */
  var isInertial: Boolean = js.native
  
  /** Gets or sets a value that indicates whether the exact distance from initial contact to end of the interaction is reported. */
  var manipulationExact: Boolean = js.native
  
  /** Gets a set of properties that are associated with the wheel button of a mouse device. */
  var mouseWheelParameters: MouseWheelParameters = js.native
  
  /** Occurs when a user performs a slide or swipe gesture (through a single touch contact) within a content area that supports panning along a single axis only. The gesture must occur in a direction that is perpendicular to this panning axis. */
  def oncrosssliding(ev: CrossSlidingEventArgs & WinRTEvent[GestureRecognizer]): Unit = js.native
  /** Occurs when a user performs a slide or swipe gesture (through a single touch contact) within a content area that supports panning along a single axis only. The gesture must occur in a direction that is perpendicular to this panning axis. */
  @JSName("oncrosssliding")
  var oncrosssliding_Original: TypedEventHandler[GestureRecognizer, CrossSlidingEventArgs] = js.native
  
  /** Occurs when a user performs a slide or swipe gesture with a mouse or pen/stylus (single contact). */
  def ondragging(ev: DraggingEventArgs & WinRTEvent[GestureRecognizer]): Unit = js.native
  /** Occurs when a user performs a slide or swipe gesture with a mouse or pen/stylus (single contact). */
  @JSName("ondragging")
  var ondragging_Original: TypedEventHandler[GestureRecognizer, DraggingEventArgs] = js.native
  
  /** Occurs when a user performs a press and hold gesture (with a single touch, mouse, or pen/stylus contact). */
  def onholding(ev: HoldingEventArgs & WinRTEvent[GestureRecognizer]): Unit = js.native
  /** Occurs when a user performs a press and hold gesture (with a single touch, mouse, or pen/stylus contact). */
  @JSName("onholding")
  var onholding_Original: TypedEventHandler[GestureRecognizer, HoldingEventArgs] = js.native
  
  /** Occurs when the input points are lifted and all subsequent motion (translation, expansion, or rotation) through inertia has ended. */
  def onmanipulationcompleted(ev: ManipulationCompletedEventArgs & WinRTEvent[GestureRecognizer]): Unit = js.native
  /** Occurs when the input points are lifted and all subsequent motion (translation, expansion, or rotation) through inertia has ended. */
  @JSName("onmanipulationcompleted")
  var onmanipulationcompleted_Original: TypedEventHandler[GestureRecognizer, ManipulationCompletedEventArgs] = js.native
  
  /** Occurs when all contact points are lifted during a manipulation and the velocity of the manipulation is significant enough to initiate inertia behavior (translation, expansion, or rotation continue after the input pointers are lifted). */
  def onmanipulationinertiastarting(ev: ManipulationInertiaStartingEventArgs & WinRTEvent[GestureRecognizer]): Unit = js.native
  /** Occurs when all contact points are lifted during a manipulation and the velocity of the manipulation is significant enough to initiate inertia behavior (translation, expansion, or rotation continue after the input pointers are lifted). */
  @JSName("onmanipulationinertiastarting")
  var onmanipulationinertiastarting_Original: TypedEventHandler[GestureRecognizer, ManipulationInertiaStartingEventArgs] = js.native
  
  /** Occurs when one or more input points have been initiated and subsequent motion (translation, expansion, or rotation) has begun. */
  def onmanipulationstarted(ev: ManipulationStartedEventArgs & WinRTEvent[GestureRecognizer]): Unit = js.native
  /** Occurs when one or more input points have been initiated and subsequent motion (translation, expansion, or rotation) has begun. */
  @JSName("onmanipulationstarted")
  var onmanipulationstarted_Original: TypedEventHandler[GestureRecognizer, ManipulationStartedEventArgs] = js.native
  
  /** Occurs after one or more input points have been initiated and subsequent motion (translation, expansion, or rotation) is under way. */
  def onmanipulationupdated(ev: ManipulationUpdatedEventArgs & WinRTEvent[GestureRecognizer]): Unit = js.native
  /** Occurs after one or more input points have been initiated and subsequent motion (translation, expansion, or rotation) is under way. */
  @JSName("onmanipulationupdated")
  var onmanipulationupdated_Original: TypedEventHandler[GestureRecognizer, ManipulationUpdatedEventArgs] = js.native
  
  /** Occurs when the pointer input is interpreted as a right-tap gesture, regardless of input device. */
  def onrighttapped(ev: RightTappedEventArgs & WinRTEvent[GestureRecognizer]): Unit = js.native
  /** Occurs when the pointer input is interpreted as a right-tap gesture, regardless of input device. */
  @JSName("onrighttapped")
  var onrighttapped_Original: TypedEventHandler[GestureRecognizer, RightTappedEventArgs] = js.native
  
  /** Occurs when the pointer input is interpreted as a tap gesture. */
  def ontapped(ev: TappedEventArgs & WinRTEvent[GestureRecognizer]): Unit = js.native
  /** Occurs when the pointer input is interpreted as a tap gesture. */
  @JSName("ontapped")
  var ontapped_Original: TypedEventHandler[GestureRecognizer, TappedEventArgs] = js.native
  
  /** Gets or sets the center point for a rotation interaction when single pointer input is detected. */
  var pivotCenter: Point = js.native
  
  /** Gets or sets the radius, from the PivotCenter to the pointer input, for a rotation interaction when single pointer input is detected. */
  var pivotRadius: Double = js.native
  
  /**
    * Processes pointer input and raises the GestureRecognizer events appropriate to a pointer down action for the gestures and manipulations specified by the GestureSettings property.
    * @param value The input point.
    */
  def processDownEvent(value: PointerPoint): Unit = js.native
  
  /** Performs inertia calculations and raises the various inertia events. */
  def processInertia(): Unit = js.native
  
  /**
    * Processes pointer input and raises the GestureRecognizer events appropriate to a mouse wheel action for the gestures and manipulations specified by the GestureSettings property.
    * @param value The input point.
    * @param isShiftKeyDown True if the Shift key is pressed; otherwise false.
    * @param isControlKeyDown True if the Ctrl key is pressed.
    */
  def processMouseWheelEvent(value: PointerPoint, isShiftKeyDown: Boolean, isControlKeyDown: Boolean): Unit = js.native
  
  /**
    * Processes pointer input and raises the GestureRecognizer events appropriate to a pointer move action for the gestures and manipulations specified by the GestureSettings property.
    * @param value The pointer location history based on the PointerId . If no history is available then the value is the current location of the input pointer.
    */
  def processMoveEvents(value: IVector[PointerPoint]): Unit = js.native
  
  /**
    * Processes pointer input and raises the GestureRecognizer events appropriate to a pointer up action for the gestures and manipulations specified by the GestureSettings property.
    * @param value The input point.
    */
  def processUpEvent(value: PointerPoint): Unit = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_crosssliding(`type`: crosssliding, listener: TypedEventHandler[GestureRecognizer, CrossSlidingEventArgs]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragging(`type`: dragging, listener: TypedEventHandler[GestureRecognizer, DraggingEventArgs]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_holding(`type`: holding, listener: TypedEventHandler[GestureRecognizer, HoldingEventArgs]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_manipulationcompleted(
    `type`: manipulationcompleted,
    listener: TypedEventHandler[GestureRecognizer, ManipulationCompletedEventArgs]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_manipulationinertiastarting(
    `type`: manipulationinertiastarting,
    listener: TypedEventHandler[GestureRecognizer, ManipulationInertiaStartingEventArgs]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_manipulationstarted(
    `type`: manipulationstarted,
    listener: TypedEventHandler[GestureRecognizer, ManipulationStartedEventArgs]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_manipulationupdated(
    `type`: manipulationupdated,
    listener: TypedEventHandler[GestureRecognizer, ManipulationUpdatedEventArgs]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_righttapped(`type`: righttapped, listener: TypedEventHandler[GestureRecognizer, RightTappedEventArgs]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_tapped(`type`: tapped, listener: TypedEventHandler[GestureRecognizer, TappedEventArgs]): Unit = js.native
  
  /** Gets or sets a value that indicates whether visual feedback is displayed during an interaction. */
  var showGestureFeedback: Boolean = js.native
}
