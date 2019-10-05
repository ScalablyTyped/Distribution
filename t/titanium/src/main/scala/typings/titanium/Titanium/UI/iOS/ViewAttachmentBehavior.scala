package typings.titanium.Titanium.UI.iOS

import typings.titanium.Point
import typings.titanium.Titanium.Proxy
import typings.titanium.Titanium.UI.TabGroup
import typings.titanium.Titanium.UI.View
import typings.titanium.Titanium.UI.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * Dynamic behavior to support connections between two items.
			 */
trait ViewAttachmentBehavior extends Proxy {
  /**
  				 * Item to use as the anchor in this behavior.
  				 */
  var anchorItem: View
  /**
  				 * Offset from the center point of the anchor item for the attachment.
  				 */
  var anchorOffset: Point
  /**
  				 * Amount of damping to apply to the attachment behavior.
  				 */
  var damping: Double
  /**
  				 * Distance, in points, between the two attachment points.
  				 */
  var distance: Double
  /**
  				 * Frequency of oscillation for the behavior.
  				 */
  var frequency: Double
  /**
  				 * Item to connect to use the attachment behavior.
  				 */
  var item: View
  /**
  				 * Offset from the center point of the item for the attachment.
  				 */
  var itemOffset: Point
  /**
  				 * Gets the value of the <Titanium.UI.iOS.ViewAttachmentBehavior.anchorItem> property.
  				 */
  def getAnchorItem(): View
  /**
  				 * Gets the value of the <Titanium.UI.iOS.ViewAttachmentBehavior.anchorOffset> property.
  				 */
  def getAnchorOffset(): Point
  /**
  				 * Gets the value of the <Titanium.UI.iOS.ViewAttachmentBehavior.damping> property.
  				 */
  def getDamping(): Double
  /**
  				 * Gets the value of the <Titanium.UI.iOS.ViewAttachmentBehavior.distance> property.
  				 */
  def getDistance(): Double
  /**
  				 * Gets the value of the <Titanium.UI.iOS.ViewAttachmentBehavior.frequency> property.
  				 */
  def getFrequency(): Double
  /**
  				 * Gets the value of the <Titanium.UI.iOS.ViewAttachmentBehavior.item> property.
  				 */
  def getItem(): View
  /**
  				 * Gets the value of the <Titanium.UI.iOS.ViewAttachmentBehavior.itemOffset> property.
  				 */
  def getItemOffset(): Point
  /**
  				 * Sets the value of the <Titanium.UI.iOS.ViewAttachmentBehavior.anchorItem> property.
  				 */
  def setAnchorItem(anchorItem: js.Any): Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.ViewAttachmentBehavior.anchorOffset> property.
  				 */
  def setAnchorOffset(anchorOffset: Point): Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.ViewAttachmentBehavior.damping> property.
  				 */
  def setDamping(damping: Double): Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.ViewAttachmentBehavior.distance> property.
  				 */
  def setDistance(distance: Double): Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.ViewAttachmentBehavior.frequency> property.
  				 */
  def setFrequency(frequency: Double): Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.ViewAttachmentBehavior.item> property.
  				 */
  def setItem(item: js.Any): Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.ViewAttachmentBehavior.itemOffset> property.
  				 */
  def setItemOffset(itemOffset: Point): Unit
}

object ViewAttachmentBehavior {
  @scala.inline
  def apply(
    addEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    anchorItem: View,
    anchorOffset: Point,
    apiName: String,
    applyProperties: js.Any => Unit,
    bubbleParent: Boolean,
    damping: Double,
    distance: Double,
    fireEvent: (String, js.Any) => Unit,
    frequency: Double,
    getAnchorItem: () => View,
    getAnchorOffset: () => Point,
    getApiName: () => String,
    getBubbleParent: () => Boolean,
    getDamping: () => Double,
    getDistance: () => Double,
    getFrequency: () => Double,
    getItem: () => View,
    getItemOffset: () => Point,
    item: View,
    itemOffset: Point,
    removeEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    setAnchorItem: js.Any => Unit,
    setAnchorOffset: Point => Unit,
    setBubbleParent: Boolean => Unit,
    setDamping: Double => Unit,
    setDistance: Double => Unit,
    setFrequency: Double => Unit,
    setItem: js.Any => Unit,
    setItemOffset: Point => Unit,
    getLifecycleContainer: () => Window | TabGroup = null,
    lifecycleContainer: Window | TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ Window, Unit]) with (js.Function1[/* lifecycleContainer */ TabGroup, Unit]) = null
  ): ViewAttachmentBehavior = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), anchorItem = anchorItem, anchorOffset = anchorOffset, apiName = apiName, applyProperties = js.Any.fromFunction1(applyProperties), bubbleParent = bubbleParent, damping = damping, distance = distance, fireEvent = js.Any.fromFunction2(fireEvent), frequency = frequency, getAnchorItem = js.Any.fromFunction0(getAnchorItem), getAnchorOffset = js.Any.fromFunction0(getAnchorOffset), getApiName = js.Any.fromFunction0(getApiName), getBubbleParent = js.Any.fromFunction0(getBubbleParent), getDamping = js.Any.fromFunction0(getDamping), getDistance = js.Any.fromFunction0(getDistance), getFrequency = js.Any.fromFunction0(getFrequency), getItem = js.Any.fromFunction0(getItem), getItemOffset = js.Any.fromFunction0(getItemOffset), item = item, itemOffset = itemOffset, removeEventListener = js.Any.fromFunction2(removeEventListener), setAnchorItem = js.Any.fromFunction1(setAnchorItem), setAnchorOffset = js.Any.fromFunction1(setAnchorOffset), setBubbleParent = js.Any.fromFunction1(setBubbleParent), setDamping = js.Any.fromFunction1(setDamping), setDistance = js.Any.fromFunction1(setDistance), setFrequency = js.Any.fromFunction1(setFrequency), setItem = js.Any.fromFunction1(setItem), setItemOffset = js.Any.fromFunction1(setItemOffset))
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(js.Any.fromFunction0(getLifecycleContainer))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[ViewAttachmentBehavior]
  }
}

