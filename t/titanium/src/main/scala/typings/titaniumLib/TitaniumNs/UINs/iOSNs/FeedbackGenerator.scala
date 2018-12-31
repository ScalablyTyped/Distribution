package typings
package titaniumLib.TitaniumNs.UINs.iOSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * The feedback generator API is introduced in iOS 10 to handle the haptic feedback when using an iPhone 7 or
			 * later devices.
			 */
trait FeedbackGenerator
  extends titaniumLib.TitaniumNs.Proxy {
  /**
  				 * The type of feedback generator you want to create.
  				 */
  var `type`: scala.Double
  /**
  				 * Gets the value of the <Titanium.UI.iOS.FeedbackGenerator.type> property.
  				 */
  def getType(): scala.Double
  /**
  				 * Used to trigger a haptic feedback after an impact occurred.
  				 */
  def impactOccurred(): scala.Unit
  /**
  				 * Used to trigger a haptic feedback after a notification has been received.
  				 */
  def notificationOccurred(notificationType: scala.Double): scala.Unit
  /**
  				 * Used to prepare the haptic sensor for the upcoming interaction with it.
  				 */
  def prepare(): scala.Unit
  /**
  				 * Used to trigger a haptic feedback after a selection has been made.
  				 */
  def selectionChanged(): scala.Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.FeedbackGenerator.type> property.
  				 */
  def setType(`type`: scala.Double): scala.Unit
}

