package typings.titanium.Titanium.UI.iOS

import typings.titanium.Titanium.Proxy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * The feedback generator API is introduced in iOS 10 to handle the haptic feedback when using an iPhone 7 or
			 * later devices.
			 */
@JSGlobal("Titanium.UI.iOS.FeedbackGenerator")
@js.native
class FeedbackGenerator () extends Proxy {
  /**
  				 * The style of the feedback generator you want to create. This property is only required when using <Titanium.UI.iOS.FEEDBACK_GENERATOR_TYPE_IMPACT>.
  				 */
  var style: js.UndefOr[Double] = js.native
  /**
  				 * The type of feedback generator you want to create.
  				 */
  var `type`: Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.FeedbackGenerator.style> property.
  				 * @deprecated Access <Titanium.UI.iOS.FeedbackGenerator.style> instead.
  				 */
  def getStyle(): Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.FeedbackGenerator.type> property.
  				 * @deprecated Access <Titanium.UI.iOS.FeedbackGenerator.type> instead.
  				 */
  def getType(): Double = js.native
  /**
  				 * Used to trigger a haptic feedback after an impact occurred.
  				 */
  def impactOccurred(): Unit = js.native
  /**
  				 * Used to trigger a haptic feedback after a notification has been received.
  				 */
  def notificationOccurred(notificationType: Double): Unit = js.native
  /**
  				 * Used to prepare the haptic sensor for the upcoming interaction with it.
  				 */
  def prepare(): Unit = js.native
  /**
  				 * Used to trigger a haptic feedback after a selection has been made.
  				 */
  def selectionChanged(): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.FeedbackGenerator.style> property.
  				 * @deprecated Set the value using <Titanium.UI.iOS.FeedbackGenerator.style> instead.
  				 */
  def setStyle(style: Double): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.FeedbackGenerator.type> property.
  				 * @deprecated Set the value using <Titanium.UI.iOS.FeedbackGenerator.type> instead.
  				 */
  def setType(`type`: Double): Unit = js.native
}

