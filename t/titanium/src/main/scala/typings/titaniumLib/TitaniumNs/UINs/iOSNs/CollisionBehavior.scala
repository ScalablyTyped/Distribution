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
    addBoundary: js.Function1[titaniumLib.BoundaryIdentifier, scala.Unit],
    addEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    addItem: js.Function1[js.Any, scala.Unit],
    apiName: java.lang.String,
    applyProperties: js.Function1[js.Any, scala.Unit],
    boundaryIdentifiers: js.Array[titaniumLib.BoundaryIdentifier],
    bubbleParent: scala.Boolean,
    collisionMode: scala.Double,
    fireEvent: js.Function2[java.lang.String, js.Any, scala.Unit],
    getApiName: js.Function0[java.lang.String],
    getBoundaryIdentifiers: js.Function0[js.Array[titaniumLib.BoundaryIdentifier]],
    getBubbleParent: js.Function0[scala.Boolean],
    getCollisionMode: js.Function0[scala.Double],
    getItems: js.Function0[js.Array[titaniumLib.TitaniumNs.UINs.View]],
    getReferenceInsets: js.Function0[titaniumLib.ReferenceInsets],
    getTreatReferenceAsBoundary: js.Function0[scala.Boolean],
    items: js.Array[titaniumLib.TitaniumNs.UINs.View],
    referenceInsets: titaniumLib.ReferenceInsets,
    removeAllBoundaries: js.Function0[scala.Unit],
    removeBoundary: js.Function1[titaniumLib.BoundaryIdentifier, scala.Unit],
    removeEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    removeItem: js.Function1[js.Any, scala.Unit],
    setBubbleParent: js.Function1[scala.Boolean, scala.Unit],
    setCollisionMode: js.Function1[scala.Double, scala.Unit],
    setReferenceInsets: js.Function1[titaniumLib.ReferenceInsets, scala.Unit],
    setTreatReferenceAsBoundary: js.Function1[scala.Boolean, scala.Unit],
    treatReferenceAsBoundary: scala.Boolean,
    getLifecycleContainer: js.Function0[titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup] = null,
    lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.Window, scala.Unit]) with (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.TabGroup, scala.Unit]) = null
  ): CollisionBehavior = {
    val __obj = js.Dynamic.literal(addBoundary = addBoundary, addEventListener = addEventListener, addItem = addItem, apiName = apiName, applyProperties = applyProperties, boundaryIdentifiers = boundaryIdentifiers, bubbleParent = bubbleParent, collisionMode = collisionMode, fireEvent = fireEvent, getApiName = getApiName, getBoundaryIdentifiers = getBoundaryIdentifiers, getBubbleParent = getBubbleParent, getCollisionMode = getCollisionMode, getItems = getItems, getReferenceInsets = getReferenceInsets, getTreatReferenceAsBoundary = getTreatReferenceAsBoundary, items = items, referenceInsets = referenceInsets, removeAllBoundaries = removeAllBoundaries, removeBoundary = removeBoundary, removeEventListener = removeEventListener, removeItem = removeItem, setBubbleParent = setBubbleParent, setCollisionMode = setCollisionMode, setReferenceInsets = setReferenceInsets, setTreatReferenceAsBoundary = setTreatReferenceAsBoundary, treatReferenceAsBoundary = treatReferenceAsBoundary)
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(getLifecycleContainer)
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[CollisionBehavior]
  }
}

