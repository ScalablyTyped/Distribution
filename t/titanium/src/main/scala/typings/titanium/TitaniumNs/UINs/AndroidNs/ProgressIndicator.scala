package typings.titanium.TitaniumNs.UINs.AndroidNs

import typings.titanium.AnimationOption
import typings.titanium.TitaniumNs.Proxy
import typings.titanium.TitaniumNs.UINs.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * A progress dialog or a horizontal progress bar in the title of the window.
			 */
@js.native
trait ProgressIndicator extends Proxy {
  /**
  				 * When `true` allows the user to cancel the progress dialog by pressing the BACK button.
  				 */
  var cancelable: Boolean = js.native
  /**
  				 * When `cancelable` is set to `true` and this is set to `true`, the dialog is canceled when touched outside the window's bounds.
  				 */
  var canceledOnTouchOutside: Boolean = js.native
  /**
  				 * Base elevation of the view relative to its parent in pixels.
  				 */
  var elevation: Double = js.native
  /**
  				 * Sets the behavior when hiding an object to release or keep the free space
  				 */
  var hiddenBehavior: Double = js.native
  /**
  				 * Location for the progress indicator.
  				 */
  var location: Double = js.native
  /**
  				 * Maximum value of the progress bar.
  				 */
  var max: Double = js.native
  /**
  				 * Message text.
  				 */
  var message: String = js.native
  /**
  				 * Key identifying a string in the locale file to use for the message text.
  				 */
  var messageid: String = js.native
  /**
  				 * Minimum value of the progress bar.
  				 */
  var min: Double = js.native
  /**
  				 * Clockwise 2D rotation of the view in degrees.
  				 */
  var rotation: Double = js.native
  /**
  				 * Clockwise rotation of the view in degrees (x-axis).
  				 */
  var rotationX: Double = js.native
  /**
  				 * Clockwise rotation of the view in degrees (y-axis).
  				 */
  var rotationY: Double = js.native
  /**
  				 * Scaling of the view in x-axis in pixels.
  				 */
  var scaleX: Double = js.native
  /**
  				 * Scaling of the view in y-axis in pixels.
  				 */
  var scaleY: Double = js.native
  /**
  				 * A material design visual construct that provides an instantaneous visual confirmation of touch point.
  				 */
  var touchFeedback: Boolean = js.native
  /**
  				 * Optional touch feedback ripple color. This has no effect unless `touchFeedback` is true.
  				 */
  var touchFeedbackColor: String = js.native
  /**
  				 * A name to identify this view in activity transition.
  				 */
  var transitionName: String = js.native
  /**
  				 * Horizontal location of the view relative to its left position in pixels.
  				 */
  var translationX: Double = js.native
  /**
  				 * Vertical location of the view relative to its top position in pixels.
  				 */
  var translationY: Double = js.native
  /**
  				 * Depth of the view relative to its elevation in pixels.
  				 */
  var translationZ: Double = js.native
  /**
  				 * Type for the progress indicator.
  				 */
  var `type`: Double = js.native
  /**
  				 * Finishes a batch update of the View's layout properties and schedules a layout pass of the
  				 * view tree.
  				 */
  def finishLayout(): Unit = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.ProgressIndicator.cancelable> property.
  				 */
  def getCancelable(): Boolean = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.ProgressIndicator.canceledOnTouchOutside> property.
  				 */
  def getCanceledOnTouchOutside(): Boolean = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.ProgressIndicator.elevation> property.
  				 */
  def getElevation(): Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.ProgressIndicator.hiddenBehavior> property.
  				 */
  def getHiddenBehavior(): Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.ProgressIndicator.location> property.
  				 */
  def getLocation(): Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.ProgressIndicator.max> property.
  				 */
  def getMax(): Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.ProgressIndicator.message> property.
  				 */
  def getMessage(): String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.ProgressIndicator.messageid> property.
  				 */
  def getMessageid(): String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.ProgressIndicator.min> property.
  				 */
  def getMin(): Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.ProgressIndicator.rotation> property.
  				 */
  def getRotation(): Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.ProgressIndicator.rotationX> property.
  				 */
  def getRotationX(): Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.ProgressIndicator.rotationY> property.
  				 */
  def getRotationY(): Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.ProgressIndicator.scaleX> property.
  				 */
  def getScaleX(): Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.ProgressIndicator.scaleY> property.
  				 */
  def getScaleY(): Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.ProgressIndicator.touchFeedback> property.
  				 */
  def getTouchFeedback(): Boolean = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.ProgressIndicator.touchFeedbackColor> property.
  				 */
  def getTouchFeedbackColor(): String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.ProgressIndicator.transitionName> property.
  				 */
  def getTransitionName(): String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.ProgressIndicator.translationX> property.
  				 */
  def getTranslationX(): Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.ProgressIndicator.translationY> property.
  				 */
  def getTranslationY(): Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.ProgressIndicator.translationZ> property.
  				 */
  def getTranslationZ(): Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.ProgressIndicator.type> property.
  				 */
  def getType(): Double = js.native
  /**
  				 * Returns the matching view of a given view ID.
  				 */
  def getViewById(id: String): View = js.native
  /**
  				 * Hides the progress indicator and stops the animation.
  				 */
  def hide(): Unit = js.native
  def hide(options: AnimationOption): Unit = js.native
  /**
  				 * Inserts a view at the specified position in the [children](Titanium.UI.View.children) array.
  				 */
  def insertAt(params: js.Any): Unit = js.native
  /**
  				 * Replaces a view at the specified position in the [children](Titanium.UI.View.children) array.
  				 */
  def replaceAt(params: js.Any): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.ProgressIndicator.cancelable> property.
  				 */
  def setCancelable(cancelable: Boolean): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.ProgressIndicator.canceledOnTouchOutside> property.
  				 */
  def setCanceledOnTouchOutside(canceledOnTouchOutside: Boolean): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.ProgressIndicator.elevation> property.
  				 */
  def setElevation(elevation: Double): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.ProgressIndicator.hiddenBehavior> property.
  				 */
  def setHiddenBehavior(hiddenBehavior: Double): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.ProgressIndicator.location> property.
  				 */
  def setLocation(location: Double): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.ProgressIndicator.max> property.
  				 */
  def setMax(max: Double): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.ProgressIndicator.message> property.
  				 */
  def setMessage(message: String): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.ProgressIndicator.messageid> property.
  				 */
  def setMessageid(messageid: String): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.ProgressIndicator.min> property.
  				 */
  def setMin(min: Double): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.ProgressIndicator.rotation> property.
  				 */
  def setRotation(rotation: Double): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.ProgressIndicator.rotationX> property.
  				 */
  def setRotationX(rotationX: Double): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.ProgressIndicator.rotationY> property.
  				 */
  def setRotationY(rotationY: Double): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.ProgressIndicator.scaleX> property.
  				 */
  def setScaleX(scaleX: Double): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.ProgressIndicator.scaleY> property.
  				 */
  def setScaleY(scaleY: Double): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.ProgressIndicator.touchFeedback> property.
  				 */
  def setTouchFeedback(touchFeedback: Boolean): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.ProgressIndicator.touchFeedbackColor> property.
  				 */
  def setTouchFeedbackColor(touchFeedbackColor: String): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.ProgressIndicator.transitionName> property.
  				 */
  def setTransitionName(transitionName: String): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.ProgressIndicator.translationX> property.
  				 */
  def setTranslationX(translationX: Double): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.ProgressIndicator.translationY> property.
  				 */
  def setTranslationY(translationY: Double): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.ProgressIndicator.translationZ> property.
  				 */
  def setTranslationZ(translationZ: Double): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.ProgressIndicator.type> property.
  				 */
  def setType(`type`: Double): Unit = js.native
  /**
  				 * Shows the progress indicator and starts the animation.
  				 */
  def show(): Unit = js.native
  def show(options: AnimationOption): Unit = js.native
  /**
  				 * Starts a batch update of this view's layout properties.
  				 */
  def startLayout(): Unit = js.native
  /**
  				 * Performs a batch update of all supplied layout properties and schedules a layout pass after
  				 * they have been updated.
  				 */
  def updateLayout(params: js.Any): Unit = js.native
}

