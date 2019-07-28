package typings.titanium.TitaniumNs.UINs.iOSNs

import typings.titanium.BoundaryIdentifier
import typings.titanium.ReferenceInsets
import typings.titanium.TitaniumNs.Proxy
import typings.titanium.TitaniumNs.UINs.TabGroup
import typings.titanium.TitaniumNs.UINs.View
import typings.titanium.TitaniumNs.UINs.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * Dynamic behavior to support collisions between items and boundaries.
			 */
trait CollisionBehavior extends Proxy {
  /**
  				 * Boundary identfiers added to this behavior.
  				 */
  val boundaryIdentifiers: js.Array[BoundaryIdentifier]
  /**
  				 * Specifies the collision behavior.
  				 */
  var collisionMode: Double
  /**
  				 * Items added to this behavior.
  				 */
  val items: js.Array[View]
  /**
  				 * Insets to apply when using the animator's reference view as the boundary.
  				 */
  var referenceInsets: ReferenceInsets
  /**
  				 * Use the animator's reference view as the boundary.
  				 */
  var treatReferenceAsBoundary: Boolean
  /**
  				 * Adds a boundary to this behavior.
  				 */
  def addBoundary(boundary: BoundaryIdentifier): Unit
  /**
  				 * Adds an item to this behavior.
  				 */
  def addItem(item: js.Any): Unit
  /**
  				 * Gets the value of the <Titanium.UI.iOS.CollisionBehavior.boundaryIdentifiers> property.
  				 */
  def getBoundaryIdentifiers(): js.Array[BoundaryIdentifier]
  /**
  				 * Gets the value of the <Titanium.UI.iOS.CollisionBehavior.collisionMode> property.
  				 */
  def getCollisionMode(): Double
  /**
  				 * Gets the value of the <Titanium.UI.iOS.CollisionBehavior.items> property.
  				 */
  def getItems(): js.Array[View]
  /**
  				 * Gets the value of the <Titanium.UI.iOS.CollisionBehavior.referenceInsets> property.
  				 */
  def getReferenceInsets(): ReferenceInsets
  /**
  				 * Gets the value of the <Titanium.UI.iOS.CollisionBehavior.treatReferenceAsBoundary> property.
  				 */
  def getTreatReferenceAsBoundary(): Boolean
  /**
  				 * Removes all boundaries from this behavior.
  				 */
  def removeAllBoundaries(): Unit
  /**
  				 * Removes the specified boundary from this behavior.
  				 */
  def removeBoundary(boundary: BoundaryIdentifier): Unit
  /**
  				 * Removes the specified item from this behavior.
  				 */
  def removeItem(item: js.Any): Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.CollisionBehavior.collisionMode> property.
  				 */
  def setCollisionMode(collisionMode: Double): Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.CollisionBehavior.referenceInsets> property.
  				 */
  def setReferenceInsets(referenceInsets: ReferenceInsets): Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.CollisionBehavior.treatReferenceAsBoundary> property.
  				 */
  def setTreatReferenceAsBoundary(treatReferenceAsBoundary: Boolean): Unit
}

object CollisionBehavior {
  @scala.inline
  def apply(
    addBoundary: BoundaryIdentifier => Unit,
    addEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    addItem: js.Any => Unit,
    apiName: String,
    applyProperties: js.Any => Unit,
    boundaryIdentifiers: js.Array[BoundaryIdentifier],
    bubbleParent: Boolean,
    collisionMode: Double,
    fireEvent: (String, js.Any) => Unit,
    getApiName: () => String,
    getBoundaryIdentifiers: () => js.Array[BoundaryIdentifier],
    getBubbleParent: () => Boolean,
    getCollisionMode: () => Double,
    getItems: () => js.Array[View],
    getReferenceInsets: () => ReferenceInsets,
    getTreatReferenceAsBoundary: () => Boolean,
    items: js.Array[View],
    referenceInsets: ReferenceInsets,
    removeAllBoundaries: () => Unit,
    removeBoundary: BoundaryIdentifier => Unit,
    removeEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    removeItem: js.Any => Unit,
    setBubbleParent: Boolean => Unit,
    setCollisionMode: Double => Unit,
    setReferenceInsets: ReferenceInsets => Unit,
    setTreatReferenceAsBoundary: Boolean => Unit,
    treatReferenceAsBoundary: Boolean,
    getLifecycleContainer: () => Window | TabGroup = null,
    lifecycleContainer: Window | TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ Window, Unit]) with (js.Function1[/* lifecycleContainer */ TabGroup, Unit]) = null
  ): CollisionBehavior = {
    val __obj = js.Dynamic.literal(addBoundary = js.Any.fromFunction1(addBoundary), addEventListener = js.Any.fromFunction2(addEventListener), addItem = js.Any.fromFunction1(addItem), apiName = apiName, applyProperties = js.Any.fromFunction1(applyProperties), boundaryIdentifiers = boundaryIdentifiers, bubbleParent = bubbleParent, collisionMode = collisionMode, fireEvent = js.Any.fromFunction2(fireEvent), getApiName = js.Any.fromFunction0(getApiName), getBoundaryIdentifiers = js.Any.fromFunction0(getBoundaryIdentifiers), getBubbleParent = js.Any.fromFunction0(getBubbleParent), getCollisionMode = js.Any.fromFunction0(getCollisionMode), getItems = js.Any.fromFunction0(getItems), getReferenceInsets = js.Any.fromFunction0(getReferenceInsets), getTreatReferenceAsBoundary = js.Any.fromFunction0(getTreatReferenceAsBoundary), items = items, referenceInsets = referenceInsets, removeAllBoundaries = js.Any.fromFunction0(removeAllBoundaries), removeBoundary = js.Any.fromFunction1(removeBoundary), removeEventListener = js.Any.fromFunction2(removeEventListener), removeItem = js.Any.fromFunction1(removeItem), setBubbleParent = js.Any.fromFunction1(setBubbleParent), setCollisionMode = js.Any.fromFunction1(setCollisionMode), setReferenceInsets = js.Any.fromFunction1(setReferenceInsets), setTreatReferenceAsBoundary = js.Any.fromFunction1(setTreatReferenceAsBoundary), treatReferenceAsBoundary = treatReferenceAsBoundary)
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(js.Any.fromFunction0(getLifecycleContainer))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[CollisionBehavior]
  }
}

