package typings
package titaniumLib.TitaniumNs.UINs.iOSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * Continuous or instantaneous force to apply to an item.
			 */

trait PushBehavior
  extends titaniumLib.TitaniumNs.Proxy {
  /**
  				 * State of the push behavior's force.
  				 */
  var active: scala.Boolean
  /**
  				 * Specifies the angle of the force vector in radians.
  				 */
  var angle: scala.Double
  /**
  				 * Items added to this behavior.
  				 */
  val items: js.Array[titaniumLib.TitaniumNs.UINs.View]
  /**
  				 * Specifies the magnitude of the force vector.
  				 */
  var magnitude: scala.Double
  /**
  				 * Specifies the direction of the force vector as an x, y pair.
  				 */
  var pushDirection: titaniumLib.Point
  /**
  				 * Specifies the push mode.
  				 */
  var pushMode: scala.Double
  /**
  				 * Adds an item to this behavior.
  				 */
  def addItem(item: js.Any): scala.Unit
  /**
  				 * Gets the value of the <Titanium.UI.iOS.PushBehavior.active> property.
  				 */
  def getActive(): scala.Boolean
  /**
  				 * Gets the value of the <Titanium.UI.iOS.PushBehavior.angle> property.
  				 */
  def getAngle(): scala.Double
  /**
  				 * Gets the value of the <Titanium.UI.iOS.PushBehavior.items> property.
  				 */
  def getItems(): js.Array[titaniumLib.TitaniumNs.UINs.View]
  /**
  				 * Gets the value of the <Titanium.UI.iOS.PushBehavior.magnitude> property.
  				 */
  def getMagnitude(): scala.Double
  /**
  				 * Gets the value of the <Titanium.UI.iOS.PushBehavior.pushDirection> property.
  				 */
  def getPushDirection(): titaniumLib.Point
  /**
  				 * Gets the value of the <Titanium.UI.iOS.PushBehavior.pushMode> property.
  				 */
  def getPushMode(): scala.Double
  /**
  				 * Removes the specified item from this behavior.
  				 */
  def removeItem(item: js.Any): scala.Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.PushBehavior.active> property.
  				 */
  def setActive(active: scala.Boolean): scala.Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.PushBehavior.angle> property.
  				 */
  def setAngle(angle: scala.Double): scala.Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.PushBehavior.magnitude> property.
  				 */
  def setMagnitude(magnitude: scala.Double): scala.Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.PushBehavior.pushDirection> property.
  				 */
  def setPushDirection(pushDirection: titaniumLib.Point): scala.Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.PushBehavior.pushMode> property.
  				 */
  def setPushMode(pushMode: scala.Double): scala.Unit
}

