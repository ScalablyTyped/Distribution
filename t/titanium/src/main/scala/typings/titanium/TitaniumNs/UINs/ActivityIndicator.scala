package typings.titanium.TitaniumNs.UINs

import typings.titanium.Font
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
  var color: String = js.native
  /**
  			 * Font used for the message text.
  			 */
  var font: Font = js.native
  /**
  			 * Color of the animated indicator.
  			 */
  var indicatorColor: String = js.native
  /**
  			 * Message text.
  			 */
  var message: String = js.native
  /**
  			 * Key identifying a string in the locale file to use for the message text.
  			 */
  var messageid: String = js.native
  /**
  			 * The style for the activity indicator.
  			 */
  var style: Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ActivityIndicator.color> property.
  			 */
  def getColor(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ActivityIndicator.font> property.
  			 */
  def getFont(): Font = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ActivityIndicator.indicatorColor> property.
  			 */
  def getIndicatorColor(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ActivityIndicator.message> property.
  			 */
  def getMessage(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ActivityIndicator.messageid> property.
  			 */
  def getMessageid(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ActivityIndicator.style> property.
  			 */
  def getStyle(): Double = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ActivityIndicator.color> property.
  			 */
  def setColor(color: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ActivityIndicator.font> property.
  			 */
  def setFont(font: Font): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ActivityIndicator.indicatorColor> property.
  			 */
  def setIndicatorColor(indicatorColor: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ActivityIndicator.message> property.
  			 */
  def setMessage(message: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ActivityIndicator.messageid> property.
  			 */
  def setMessageid(messageid: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ActivityIndicator.style> property.
  			 */
  def setStyle(style: Double): Unit = js.native
}

