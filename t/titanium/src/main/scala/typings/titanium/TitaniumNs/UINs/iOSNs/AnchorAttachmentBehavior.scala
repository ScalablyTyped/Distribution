package typings.titanium.TitaniumNs.UINs.iOSNs

import typings.titanium.Point
import typings.titanium.TitaniumNs.Proxy
import typings.titanium.TitaniumNs.UINs.TabGroup
import typings.titanium.TitaniumNs.UINs.View
import typings.titanium.TitaniumNs.UINs.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * Dynamic behavior to support connections between an anchor point and an item.
			 */
trait AnchorAttachmentBehavior extends Proxy {
  /**
  				 * Anchor point for the attachment behavior relative to the animator's coordinate system.
  				 */
  var anchor: Point
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
  var offset: Point
  /**
  				 * Gets the value of the <Titanium.UI.iOS.AnchorAttachmentBehavior.anchor> property.
  				 */
  def getAnchor(): Point
  /**
  				 * Gets the value of the <Titanium.UI.iOS.AnchorAttachmentBehavior.damping> property.
  				 */
  def getDamping(): Double
  /**
  				 * Gets the value of the <Titanium.UI.iOS.AnchorAttachmentBehavior.distance> property.
  				 */
  def getDistance(): Double
  /**
  				 * Gets the value of the <Titanium.UI.iOS.AnchorAttachmentBehavior.frequency> property.
  				 */
  def getFrequency(): Double
  /**
  				 * Gets the value of the <Titanium.UI.iOS.AnchorAttachmentBehavior.item> property.
  				 */
  def getItem(): View
  /**
  				 * Gets the value of the <Titanium.UI.iOS.AnchorAttachmentBehavior.offset> property.
  				 */
  def getOffset(): Point
  /**
  				 * Sets the value of the <Titanium.UI.iOS.AnchorAttachmentBehavior.anchor> property.
  				 */
  def setAnchor(anchor: Point): Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.AnchorAttachmentBehavior.damping> property.
  				 */
  def setDamping(damping: Double): Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.AnchorAttachmentBehavior.distance> property.
  				 */
  def setDistance(distance: Double): Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.AnchorAttachmentBehavior.frequency> property.
  				 */
  def setFrequency(frequency: Double): Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.AnchorAttachmentBehavior.item> property.
  				 */
  def setItem(item: js.Any): Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.AnchorAttachmentBehavior.offset> property.
  				 */
  def setOffset(offset: Point): Unit
}

object AnchorAttachmentBehavior {
  @scala.inline
  def apply(
    addEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    anchor: Point,
    apiName: String,
    applyProperties: js.Any => Unit,
    bubbleParent: Boolean,
    damping: Double,
    distance: Double,
    fireEvent: (String, js.Any) => Unit,
    frequency: Double,
    getAnchor: () => Point,
    getApiName: () => String,
    getBubbleParent: () => Boolean,
    getDamping: () => Double,
    getDistance: () => Double,
    getFrequency: () => Double,
    getItem: () => View,
    getOffset: () => Point,
    item: View,
    offset: Point,
    removeEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    setAnchor: Point => Unit,
    setBubbleParent: Boolean => Unit,
    setDamping: Double => Unit,
    setDistance: Double => Unit,
    setFrequency: Double => Unit,
    setItem: js.Any => Unit,
    setOffset: Point => Unit,
    getLifecycleContainer: () => Window | TabGroup = null,
    lifecycleContainer: Window | TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ Window, Unit]) with (js.Function1[/* lifecycleContainer */ TabGroup, Unit]) = null
  ): AnchorAttachmentBehavior = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), anchor = anchor, apiName = apiName, applyProperties = js.Any.fromFunction1(applyProperties), bubbleParent = bubbleParent, damping = damping, distance = distance, fireEvent = js.Any.fromFunction2(fireEvent), frequency = frequency, getAnchor = js.Any.fromFunction0(getAnchor), getApiName = js.Any.fromFunction0(getApiName), getBubbleParent = js.Any.fromFunction0(getBubbleParent), getDamping = js.Any.fromFunction0(getDamping), getDistance = js.Any.fromFunction0(getDistance), getFrequency = js.Any.fromFunction0(getFrequency), getItem = js.Any.fromFunction0(getItem), getOffset = js.Any.fromFunction0(getOffset), item = item, offset = offset, removeEventListener = js.Any.fromFunction2(removeEventListener), setAnchor = js.Any.fromFunction1(setAnchor), setBubbleParent = js.Any.fromFunction1(setBubbleParent), setDamping = js.Any.fromFunction1(setDamping), setDistance = js.Any.fromFunction1(setDistance), setFrequency = js.Any.fromFunction1(setFrequency), setItem = js.Any.fromFunction1(setItem), setOffset = js.Any.fromFunction1(setOffset))
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(js.Any.fromFunction0(getLifecycleContainer))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[AnchorAttachmentBehavior]
  }
}

