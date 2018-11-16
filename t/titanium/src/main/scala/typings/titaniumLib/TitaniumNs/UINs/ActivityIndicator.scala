package typings
package titaniumLib.TitaniumNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * An activity indicator that lets the user know an action is taking place.
		 */
@js.native
trait ActivityIndicator extends View {
  /**
  			 * Color of the message text, as a color name or hex triplet.
  			 */
  var color: java.lang.String = js.native
  /**
  			 * Font used for the message text.
  			 */
  var font: titaniumLib.Font = js.native
  /**
  			 * Color of the animated indicator.
  			 */
  var indicatorColor: java.lang.String = js.native
  /**
  			 * Message text.
  			 */
  var message: java.lang.String = js.native
  /**
  			 * Key identifying a string in the locale file to use for the message text.
  			 */
  var messageid: java.lang.String = js.native
  /**
  			 * The style for the activity indicator.
  			 */
  var style: scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ActivityIndicator.color> property.
  			 */
  def getColor(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ActivityIndicator.font> property.
  			 */
  def getFont(): titaniumLib.Font = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ActivityIndicator.indicatorColor> property.
  			 */
  def getIndicatorColor(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ActivityIndicator.message> property.
  			 */
  def getMessage(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ActivityIndicator.messageid> property.
  			 */
  def getMessageid(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ActivityIndicator.style> property.
  			 */
  def getStyle(): scala.Double = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ActivityIndicator.color> property.
  			 */
  def setColor(color: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ActivityIndicator.font> property.
  			 */
  def setFont(font: titaniumLib.Font): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ActivityIndicator.indicatorColor> property.
  			 */
  def setIndicatorColor(indicatorColor: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ActivityIndicator.message> property.
  			 */
  def setMessage(message: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ActivityIndicator.messageid> property.
  			 */
  def setMessageid(messageid: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ActivityIndicator.style> property.
  			 */
  def setStyle(style: scala.Double): scala.Unit = js.native
}

