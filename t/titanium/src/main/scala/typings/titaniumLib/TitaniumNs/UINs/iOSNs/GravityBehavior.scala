package typings
package titaniumLib.TitaniumNs.UINs.iOSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * Gravitational force to apply to an item.
			 */

trait GravityBehavior
  extends titaniumLib.TitaniumNs.Proxy {
  /**
  				 * Specifies the angle of the gravity vector in radians.
  				 */
  var angle: scala.Double
  /**
  				 * Specifies the direction of the gravity vector as an x, y pair.
  				 */
  var gravityDirection: titaniumLib.Point
  /**
  				 * Items added to this behavior.
  				 */
  val items: js.Array[titaniumLib.TitaniumNs.UINs.View]
  /**
  				 * Specifies the magnitude of the gravity vector.
  				 */
  var magnitude: scala.Double
  /**
  				 * Adds an item to this behavior.
  				 */
  def addItem(item: js.Any): scala.Unit
  /**
  				 * Gets the value of the <Titanium.UI.iOS.GravityBehavior.angle> property.
  				 */
  def getAngle(): scala.Double
  /**
  				 * Gets the value of the <Titanium.UI.iOS.GravityBehavior.gravityDirection> property.
  				 */
  def getGravityDirection(): titaniumLib.Point
  /**
  				 * Gets the value of the <Titanium.UI.iOS.GravityBehavior.items> property.
  				 */
  def getItems(): js.Array[titaniumLib.TitaniumNs.UINs.View]
  /**
  				 * Gets the value of the <Titanium.UI.iOS.GravityBehavior.magnitude> property.
  				 */
  def getMagnitude(): scala.Double
  /**
  				 * Removes the specified item from this behavior.
  				 */
  def removeItem(item: js.Any): scala.Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.GravityBehavior.angle> property.
  				 */
  def setAngle(angle: scala.Double): scala.Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.GravityBehavior.gravityDirection> property.
  				 */
  def setGravityDirection(gravityDirection: titaniumLib.Point): scala.Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.GravityBehavior.magnitude> property.
  				 */
  def setMagnitude(magnitude: scala.Double): scala.Unit
}

