package typings
package titaniumLib.TitaniumNs.UINs.iOSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * Dynamic behavior to support connections between an anchor point and an item.
			 */
trait AnchorAttachmentBehavior
  extends titaniumLib.TitaniumNs.Proxy {
  /**
  				 * Anchor point for the attachment behavior relative to the animator's coordinate system.
  				 */
  var anchor: titaniumLib.Point
  /**
  				 * Amount of damping to apply to the attachment behavior.
  				 */
  var damping: scala.Double
  /**
  				 * Distance, in points, between the two attachment points.
  				 */
  var distance: scala.Double
  /**
  				 * Frequency of oscillation for the behavior.
  				 */
  var frequency: scala.Double
  /**
  				 * Item to connect to use the attachment behavior.
  				 */
  var item: titaniumLib.TitaniumNs.UINs.View
  /**
  				 * Offset from the center point of the item for the attachment.
  				 */
  var offset: titaniumLib.Point
  /**
  				 * Gets the value of the <Titanium.UI.iOS.AnchorAttachmentBehavior.anchor> property.
  				 */
  def getAnchor(): titaniumLib.Point
  /**
  				 * Gets the value of the <Titanium.UI.iOS.AnchorAttachmentBehavior.damping> property.
  				 */
  def getDamping(): scala.Double
  /**
  				 * Gets the value of the <Titanium.UI.iOS.AnchorAttachmentBehavior.distance> property.
  				 */
  def getDistance(): scala.Double
  /**
  				 * Gets the value of the <Titanium.UI.iOS.AnchorAttachmentBehavior.frequency> property.
  				 */
  def getFrequency(): scala.Double
  /**
  				 * Gets the value of the <Titanium.UI.iOS.AnchorAttachmentBehavior.item> property.
  				 */
  def getItem(): titaniumLib.TitaniumNs.UINs.View
  /**
  				 * Gets the value of the <Titanium.UI.iOS.AnchorAttachmentBehavior.offset> property.
  				 */
  def getOffset(): titaniumLib.Point
  /**
  				 * Sets the value of the <Titanium.UI.iOS.AnchorAttachmentBehavior.anchor> property.
  				 */
  def setAnchor(anchor: titaniumLib.Point): scala.Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.AnchorAttachmentBehavior.damping> property.
  				 */
  def setDamping(damping: scala.Double): scala.Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.AnchorAttachmentBehavior.distance> property.
  				 */
  def setDistance(distance: scala.Double): scala.Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.AnchorAttachmentBehavior.frequency> property.
  				 */
  def setFrequency(frequency: scala.Double): scala.Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.AnchorAttachmentBehavior.item> property.
  				 */
  def setItem(item: js.Any): scala.Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.AnchorAttachmentBehavior.offset> property.
  				 */
  def setOffset(offset: titaniumLib.Point): scala.Unit
}

object AnchorAttachmentBehavior {
  @scala.inline
  def apply(
    addEventListener: (java.lang.String, js.Function1[/* param0 */ js.Any, _]) => scala.Unit,
    anchor: titaniumLib.Point,
    apiName: java.lang.String,
    applyProperties: js.Any => scala.Unit,
    bubbleParent: scala.Boolean,
    damping: scala.Double,
    distance: scala.Double,
    fireEvent: (java.lang.String, js.Any) => scala.Unit,
    frequency: scala.Double,
    getAnchor: () => titaniumLib.Point,
    getApiName: () => java.lang.String,
    getBubbleParent: () => scala.Boolean,
    getDamping: () => scala.Double,
    getDistance: () => scala.Double,
    getFrequency: () => scala.Double,
    getItem: () => titaniumLib.TitaniumNs.UINs.View,
    getOffset: () => titaniumLib.Point,
    item: titaniumLib.TitaniumNs.UINs.View,
    offset: titaniumLib.Point,
    removeEventListener: (java.lang.String, js.Function1[/* param0 */ js.Any, _]) => scala.Unit,
    setAnchor: titaniumLib.Point => scala.Unit,
    setBubbleParent: scala.Boolean => scala.Unit,
    setDamping: scala.Double => scala.Unit,
    setDistance: scala.Double => scala.Unit,
    setFrequency: scala.Double => scala.Unit,
    setItem: js.Any => scala.Unit,
    setOffset: titaniumLib.Point => scala.Unit,
    getLifecycleContainer: () => titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.Window, scala.Unit]) with (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.TabGroup, scala.Unit]) = null
  ): AnchorAttachmentBehavior = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), anchor = anchor, apiName = apiName, applyProperties = js.Any.fromFunction1(applyProperties), bubbleParent = bubbleParent, damping = damping, distance = distance, fireEvent = js.Any.fromFunction2(fireEvent), frequency = frequency, getAnchor = js.Any.fromFunction0(getAnchor), getApiName = js.Any.fromFunction0(getApiName), getBubbleParent = js.Any.fromFunction0(getBubbleParent), getDamping = js.Any.fromFunction0(getDamping), getDistance = js.Any.fromFunction0(getDistance), getFrequency = js.Any.fromFunction0(getFrequency), getItem = js.Any.fromFunction0(getItem), getOffset = js.Any.fromFunction0(getOffset), item = item, offset = offset, removeEventListener = js.Any.fromFunction2(removeEventListener), setAnchor = js.Any.fromFunction1(setAnchor), setBubbleParent = js.Any.fromFunction1(setBubbleParent), setDamping = js.Any.fromFunction1(setDamping), setDistance = js.Any.fromFunction1(setDistance), setFrequency = js.Any.fromFunction1(setFrequency), setItem = js.Any.fromFunction1(setItem), setOffset = js.Any.fromFunction1(setOffset))
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(js.Any.fromFunction0(getLifecycleContainer))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[AnchorAttachmentBehavior]
  }
}

