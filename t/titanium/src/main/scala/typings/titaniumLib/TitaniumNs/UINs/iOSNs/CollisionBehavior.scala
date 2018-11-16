package typings
package titaniumLib.TitaniumNs.UINs.iOSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * Dynamic behavior to support collisions between items and boundaries.
			 */

trait CollisionBehavior
  extends titaniumLib.TitaniumNs.Proxy {
  /**
  				 * Boundary identfiers added to this behavior.
  				 */
  val boundaryIdentifiers: js.Array[titaniumLib.BoundaryIdentifier]
  /**
  				 * Specifies the collision behavior.
  				 */
  var collisionMode: scala.Double
  /**
  				 * Items added to this behavior.
  				 */
  val items: js.Array[titaniumLib.TitaniumNs.UINs.View]
  /**
  				 * Insets to apply when using the animator's reference view as the boundary.
  				 */
  var referenceInsets: titaniumLib.ReferenceInsets
  /**
  				 * Use the animator's reference view as the boundary.
  				 */
  var treatReferenceAsBoundary: scala.Boolean
  /**
  				 * Adds a boundary to this behavior.
  				 */
  def addBoundary(boundary: titaniumLib.BoundaryIdentifier): scala.Unit
  /**
  				 * Adds an item to this behavior.
  				 */
  def addItem(item: js.Any): scala.Unit
  /**
  				 * Gets the value of the <Titanium.UI.iOS.CollisionBehavior.boundaryIdentifiers> property.
  				 */
  def getBoundaryIdentifiers(): js.Array[titaniumLib.BoundaryIdentifier]
  /**
  				 * Gets the value of the <Titanium.UI.iOS.CollisionBehavior.collisionMode> property.
  				 */
  def getCollisionMode(): scala.Double
  /**
  				 * Gets the value of the <Titanium.UI.iOS.CollisionBehavior.items> property.
  				 */
  def getItems(): js.Array[titaniumLib.TitaniumNs.UINs.View]
  /**
  				 * Gets the value of the <Titanium.UI.iOS.CollisionBehavior.referenceInsets> property.
  				 */
  def getReferenceInsets(): titaniumLib.ReferenceInsets
  /**
  				 * Gets the value of the <Titanium.UI.iOS.CollisionBehavior.treatReferenceAsBoundary> property.
  				 */
  def getTreatReferenceAsBoundary(): scala.Boolean
  /**
  				 * Removes all boundaries from this behavior.
  				 */
  def removeAllBoundaries(): scala.Unit
  /**
  				 * Removes the specified boundary from this behavior.
  				 */
  def removeBoundary(boundary: titaniumLib.BoundaryIdentifier): scala.Unit
  /**
  				 * Removes the specified item from this behavior.
  				 */
  def removeItem(item: js.Any): scala.Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.CollisionBehavior.collisionMode> property.
  				 */
  def setCollisionMode(collisionMode: scala.Double): scala.Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.CollisionBehavior.referenceInsets> property.
  				 */
  def setReferenceInsets(referenceInsets: titaniumLib.ReferenceInsets): scala.Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.CollisionBehavior.treatReferenceAsBoundary> property.
  				 */
  def setTreatReferenceAsBoundary(treatReferenceAsBoundary: scala.Boolean): scala.Unit
}

