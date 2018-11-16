package typings
package titaniumLib.TitaniumNs.UINs.iOSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * Dynamic behavior defining an item's movement to a specific point.
			 */

trait SnapBehavior
  extends titaniumLib.TitaniumNs.Proxy {
  /**
  				 * Specifies the amount of oscillation during the conclusion of the snap.
  				 */
  var damping: scala.Double
  /**
  				 * Item to add to this behavior.
  				 */
  var item: titaniumLib.TitaniumNs.UINs.View
  /**
  				 * Specifies the point to snap to.
  				 */
  var snapPoint: titaniumLib.Point
  /**
  				 * Gets the value of the <Titanium.UI.iOS.SnapBehavior.damping> property.
  				 */
  def getDamping(): scala.Double
  /**
  				 * Gets the value of the <Titanium.UI.iOS.SnapBehavior.item> property.
  				 */
  def getItem(): titaniumLib.TitaniumNs.UINs.View
  /**
  				 * Gets the value of the <Titanium.UI.iOS.SnapBehavior.snapPoint> property.
  				 */
  def getSnapPoint(): titaniumLib.Point
  /**
  				 * Sets the value of the <Titanium.UI.iOS.SnapBehavior.damping> property.
  				 */
  def setDamping(damping: scala.Double): scala.Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.SnapBehavior.item> property.
  				 */
  def setItem(item: js.Any): scala.Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.SnapBehavior.snapPoint> property.
  				 */
  def setSnapPoint(snapPoint: titaniumLib.Point): scala.Unit
}

