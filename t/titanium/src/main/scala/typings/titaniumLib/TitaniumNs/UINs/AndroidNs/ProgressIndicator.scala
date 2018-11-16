package typings
package titaniumLib.TitaniumNs.UINs.AndroidNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * A progress dialog or a horizontal progress bar in the title of the window.
			 */
@js.native
trait ProgressIndicator
  extends titaniumLib.TitaniumNs.Proxy {
  /**
  				 * When `true` allows the user to cancel the progress dialog by pressing the BACK button.
  				 */
  var cancelable: scala.Boolean = js.native
  /**
  				 * When `cancelable` is set to `true` and this is set to `true`, the dialog is canceled when touched outside the window's bounds.
  				 */
  var canceledOnTouchOutside: scala.Boolean = js.native
  /**
  				 * Base elevation of the view relative to its parent in pixels.
  				 */
  var elevation: scala.Double = js.native
  /**
  				 * Sets the behavior when hiding an object to release or keep the free space
  				 */
  var hiddenBehavior: scala.Double = js.native
  /**
  				 * Location for the progress indicator.
  				 */
  var location: scala.Double = js.native
  /**
  				 * Maximum value of the progress bar.
  				 */
  var max: scala.Double = js.native
  /**
  				 * Message text.
  				 */
  var message: java.lang.String = js.native
  /**
  				 * Key identifying a string in the locale file to use for the message text.
  				 */
  var messageid: java.lang.String = js.native
  /**
  				 * Minimum value of the progress bar.
  				 */
  var min: scala.Double = js.native
  /**
  				 * Clockwise 2D rotation of the view in degrees.
  				 */
  var rotation: scala.Double = js.native
  /**
  				 * Clockwise rotation of the view in degrees (x-axis).
  				 */
  var rotationX: scala.Double = js.native
  /**
  				 * Clockwise rotation of the view in degrees (y-axis).
  				 */
  var rotationY: scala.Double = js.native
  /**
  				 * Scaling of the view in x-axis in pixels.
  				 */
  var scaleX: scala.Double = js.native
  /**
  				 * Scaling of the view in y-axis in pixels.
  				 */
  var scaleY: scala.Double = js.native
  /**
  				 * A material design visual construct that provides an instantaneous visual confirmation of touch point.
  				 */
  var touchFeedback: scala.Boolean = js.native
  /**
  				 * Optional touch feedback ripple color. This has no effect unless `touchFeedback` is true.
  				 */
  var touchFeedbackColor: java.lang.String = js.native
  /**
  				 * A name to identify this view in activity transition.
  				 */
  var transitionName: java.lang.String = js.native
  /**
  				 * Horizontal location of the view relative to its left position in pixels.
  				 */
  var translationX: scala.Double = js.native
  /**
  				 * Vertical location of the view relative to its top position in pixels.
  				 */
  var translationY: scala.Double = js.native
  /**
  				 * Depth of the view relative to its elevation in pixels.
  				 */
  var translationZ: scala.Double = js.native
  /**
  				 * Type for the progress indicator.
  				 */
  var `type`: scala.Double = js.native
  /**
  				 * Finishes a batch update of the View's layout properties and schedules a layout pass of the
  				 * view tree.
  				 */
  def finishLayout(): scala.Unit = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.ProgressIndicator.cancelable> property.
  				 */
  def getCancelable(): scala.Boolean = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.ProgressIndicator.canceledOnTouchOutside> property.
  				 */
  def getCanceledOnTouchOutside(): scala.Boolean = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.ProgressIndicator.elevation> property.
  				 */
  def getElevation(): scala.Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.ProgressIndicator.hiddenBehavior> property.
  				 */
  def getHiddenBehavior(): scala.Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.ProgressIndicator.location> property.
  				 */
  def getLocation(): scala.Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.ProgressIndicator.max> property.
  				 */
  def getMax(): scala.Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.ProgressIndicator.message> property.
  				 */
  def getMessage(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.ProgressIndicator.messageid> property.
  				 */
  def getMessageid(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.ProgressIndicator.min> property.
  				 */
  def getMin(): scala.Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.ProgressIndicator.rotation> property.
  				 */
  def getRotation(): scala.Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.ProgressIndicator.rotationX> property.
  				 */
  def getRotationX(): scala.Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.ProgressIndicator.rotationY> property.
  				 */
  def getRotationY(): scala.Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.ProgressIndicator.scaleX> property.
  				 */
  def getScaleX(): scala.Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.ProgressIndicator.scaleY> property.
  				 */
  def getScaleY(): scala.Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.ProgressIndicator.touchFeedback> property.
  				 */
  def getTouchFeedback(): scala.Boolean = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.ProgressIndicator.touchFeedbackColor> property.
  				 */
  def getTouchFeedbackColor(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.ProgressIndicator.transitionName> property.
  				 */
  def getTransitionName(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.ProgressIndicator.translationX> property.
  				 */
  def getTranslationX(): scala.Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.ProgressIndicator.translationY> property.
  				 */
  def getTranslationY(): scala.Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.ProgressIndicator.translationZ> property.
  				 */
  def getTranslationZ(): scala.Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.ProgressIndicator.type> property.
  				 */
  def getType(): scala.Double = js.native
  /**
  				 * Returns the matching view of a given view ID.
  				 */
  def getViewById(id: java.lang.String): titaniumLib.TitaniumNs.UINs.View = js.native
  /**
  				 * Hides the progress indicator and stops the animation.
  				 */
  def hide(): scala.Unit = js.native
  /**
  				 * Hides the progress indicator and stops the animation.
  				 */
  def hide(options: titaniumLib.AnimationOption): scala.Unit = js.native
  /**
  				 * Inserts a view at the specified position in the [children](Titanium.UI.View.children) array.
  				 */
  def insertAt(params: js.Any): scala.Unit = js.native
  /**
  				 * Replaces a view at the specified position in the [children](Titanium.UI.View.children) array.
  				 */
  def replaceAt(params: js.Any): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.ProgressIndicator.cancelable> property.
  				 */
  def setCancelable(cancelable: scala.Boolean): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.ProgressIndicator.canceledOnTouchOutside> property.
  				 */
  def setCanceledOnTouchOutside(canceledOnTouchOutside: scala.Boolean): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.ProgressIndicator.elevation> property.
  				 */
  def setElevation(elevation: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.ProgressIndicator.hiddenBehavior> property.
  				 */
  def setHiddenBehavior(hiddenBehavior: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.ProgressIndicator.location> property.
  				 */
  def setLocation(location: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.ProgressIndicator.max> property.
  				 */
  def setMax(max: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.ProgressIndicator.message> property.
  				 */
  def setMessage(message: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.ProgressIndicator.messageid> property.
  				 */
  def setMessageid(messageid: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.ProgressIndicator.min> property.
  				 */
  def setMin(min: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.ProgressIndicator.rotation> property.
  				 */
  def setRotation(rotation: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.ProgressIndicator.rotationX> property.
  				 */
  def setRotationX(rotationX: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.ProgressIndicator.rotationY> property.
  				 */
  def setRotationY(rotationY: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.ProgressIndicator.scaleX> property.
  				 */
  def setScaleX(scaleX: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.ProgressIndicator.scaleY> property.
  				 */
  def setScaleY(scaleY: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.ProgressIndicator.touchFeedback> property.
  				 */
  def setTouchFeedback(touchFeedback: scala.Boolean): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.ProgressIndicator.touchFeedbackColor> property.
  				 */
  def setTouchFeedbackColor(touchFeedbackColor: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.ProgressIndicator.transitionName> property.
  				 */
  def setTransitionName(transitionName: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.ProgressIndicator.translationX> property.
  				 */
  def setTranslationX(translationX: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.ProgressIndicator.translationY> property.
  				 */
  def setTranslationY(translationY: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.ProgressIndicator.translationZ> property.
  				 */
  def setTranslationZ(translationZ: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.ProgressIndicator.type> property.
  				 */
  def setType(`type`: scala.Double): scala.Unit = js.native
  /**
  				 * Shows the progress indicator and starts the animation.
  				 */
  def show(): scala.Unit = js.native
  /**
  				 * Shows the progress indicator and starts the animation.
  				 */
  def show(options: titaniumLib.AnimationOption): scala.Unit = js.native
  /**
  				 * Starts a batch update of this view's layout properties.
  				 */
  def startLayout(): scala.Unit = js.native
  /**
  				 * Performs a batch update of all supplied layout properties and schedules a layout pass after
  				 * they have been updated.
  				 */
  def updateLayout(params: js.Any): scala.Unit = js.native
}

