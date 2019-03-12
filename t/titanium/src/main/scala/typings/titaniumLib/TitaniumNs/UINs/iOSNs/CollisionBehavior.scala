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

object CollisionBehavior {
  @scala.inline
  def apply(
    addBoundary: titaniumLib.BoundaryIdentifier => scala.Unit,
    addEventListener: (java.lang.String, js.Function1[/* param0 */ js.Any, _]) => scala.Unit,
    addItem: js.Any => scala.Unit,
    apiName: java.lang.String,
    applyProperties: js.Any => scala.Unit,
    boundaryIdentifiers: js.Array[titaniumLib.BoundaryIdentifier],
    bubbleParent: scala.Boolean,
    collisionMode: scala.Double,
    fireEvent: (java.lang.String, js.Any) => scala.Unit,
    getApiName: () => java.lang.String,
    getBoundaryIdentifiers: () => js.Array[titaniumLib.BoundaryIdentifier],
    getBubbleParent: () => scala.Boolean,
    getCollisionMode: () => scala.Double,
    getItems: () => js.Array[titaniumLib.TitaniumNs.UINs.View],
    getReferenceInsets: () => titaniumLib.ReferenceInsets,
    getTreatReferenceAsBoundary: () => scala.Boolean,
    items: js.Array[titaniumLib.TitaniumNs.UINs.View],
    referenceInsets: titaniumLib.ReferenceInsets,
    removeAllBoundaries: () => scala.Unit,
    removeBoundary: titaniumLib.BoundaryIdentifier => scala.Unit,
    removeEventListener: (java.lang.String, js.Function1[/* param0 */ js.Any, _]) => scala.Unit,
    removeItem: js.Any => scala.Unit,
    setBubbleParent: scala.Boolean => scala.Unit,
    setCollisionMode: scala.Double => scala.Unit,
    setReferenceInsets: titaniumLib.ReferenceInsets => scala.Unit,
    setTreatReferenceAsBoundary: scala.Boolean => scala.Unit,
    treatReferenceAsBoundary: scala.Boolean,
    getLifecycleContainer: () => titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.Window, scala.Unit]) with (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.TabGroup, scala.Unit]) = null
  ): CollisionBehavior = {
    val __obj = js.Dynamic.literal(addBoundary = js.Any.fromFunction1(addBoundary), addEventListener = js.Any.fromFunction2(addEventListener), addItem = js.Any.fromFunction1(addItem), apiName = apiName, applyProperties = js.Any.fromFunction1(applyProperties), boundaryIdentifiers = boundaryIdentifiers, bubbleParent = bubbleParent, collisionMode = collisionMode, fireEvent = js.Any.fromFunction2(fireEvent), getApiName = js.Any.fromFunction0(getApiName), getBoundaryIdentifiers = js.Any.fromFunction0(getBoundaryIdentifiers), getBubbleParent = js.Any.fromFunction0(getBubbleParent), getCollisionMode = js.Any.fromFunction0(getCollisionMode), getItems = js.Any.fromFunction0(getItems), getReferenceInsets = js.Any.fromFunction0(getReferenceInsets), getTreatReferenceAsBoundary = js.Any.fromFunction0(getTreatReferenceAsBoundary), items = items, referenceInsets = referenceInsets, removeAllBoundaries = js.Any.fromFunction0(removeAllBoundaries), removeBoundary = js.Any.fromFunction1(removeBoundary), removeEventListener = js.Any.fromFunction2(removeEventListener), removeItem = js.Any.fromFunction1(removeItem), setBubbleParent = js.Any.fromFunction1(setBubbleParent), setCollisionMode = js.Any.fromFunction1(setCollisionMode), setReferenceInsets = js.Any.fromFunction1(setReferenceInsets), setTreatReferenceAsBoundary = js.Any.fromFunction1(setTreatReferenceAsBoundary), treatReferenceAsBoundary = treatReferenceAsBoundary)
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(js.Any.fromFunction0(getLifecycleContainer))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[CollisionBehavior]
  }
}

