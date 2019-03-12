package typings
package titaniumLib.TitaniumNs.UINs.iOSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * Dynamic behavior to support connections between two items.
			 */
trait ViewAttachmentBehavior
  extends titaniumLib.TitaniumNs.Proxy {
  /**
  				 * Item to use as the anchor in this behavior.
  				 */
  var anchorItem: titaniumLib.TitaniumNs.UINs.View
  /**
  				 * Offset from the center point of the anchor item for the attachment.
  				 */
  var anchorOffset: titaniumLib.Point
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
  var itemOffset: titaniumLib.Point
  /**
  				 * Gets the value of the <Titanium.UI.iOS.ViewAttachmentBehavior.anchorItem> property.
  				 */
  def getAnchorItem(): titaniumLib.TitaniumNs.UINs.View
  /**
  				 * Gets the value of the <Titanium.UI.iOS.ViewAttachmentBehavior.anchorOffset> property.
  				 */
  def getAnchorOffset(): titaniumLib.Point
  /**
  				 * Gets the value of the <Titanium.UI.iOS.ViewAttachmentBehavior.damping> property.
  				 */
  def getDamping(): scala.Double
  /**
  				 * Gets the value of the <Titanium.UI.iOS.ViewAttachmentBehavior.distance> property.
  				 */
  def getDistance(): scala.Double
  /**
  				 * Gets the value of the <Titanium.UI.iOS.ViewAttachmentBehavior.frequency> property.
  				 */
  def getFrequency(): scala.Double
  /**
  				 * Gets the value of the <Titanium.UI.iOS.ViewAttachmentBehavior.item> property.
  				 */
  def getItem(): titaniumLib.TitaniumNs.UINs.View
  /**
  				 * Gets the value of the <Titanium.UI.iOS.ViewAttachmentBehavior.itemOffset> property.
  				 */
  def getItemOffset(): titaniumLib.Point
  /**
  				 * Sets the value of the <Titanium.UI.iOS.ViewAttachmentBehavior.anchorItem> property.
  				 */
  def setAnchorItem(anchorItem: js.Any): scala.Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.ViewAttachmentBehavior.anchorOffset> property.
  				 */
  def setAnchorOffset(anchorOffset: titaniumLib.Point): scala.Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.ViewAttachmentBehavior.damping> property.
  				 */
  def setDamping(damping: scala.Double): scala.Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.ViewAttachmentBehavior.distance> property.
  				 */
  def setDistance(distance: scala.Double): scala.Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.ViewAttachmentBehavior.frequency> property.
  				 */
  def setFrequency(frequency: scala.Double): scala.Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.ViewAttachmentBehavior.item> property.
  				 */
  def setItem(item: js.Any): scala.Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.ViewAttachmentBehavior.itemOffset> property.
  				 */
  def setItemOffset(itemOffset: titaniumLib.Point): scala.Unit
}

object ViewAttachmentBehavior {
  @scala.inline
  def apply(
    addEventListener: (java.lang.String, js.Function1[/* param0 */ js.Any, _]) => scala.Unit,
    anchorItem: titaniumLib.TitaniumNs.UINs.View,
    anchorOffset: titaniumLib.Point,
    apiName: java.lang.String,
    applyProperties: js.Any => scala.Unit,
    bubbleParent: scala.Boolean,
    damping: scala.Double,
    distance: scala.Double,
    fireEvent: (java.lang.String, js.Any) => scala.Unit,
    frequency: scala.Double,
    getAnchorItem: () => titaniumLib.TitaniumNs.UINs.View,
    getAnchorOffset: () => titaniumLib.Point,
    getApiName: () => java.lang.String,
    getBubbleParent: () => scala.Boolean,
    getDamping: () => scala.Double,
    getDistance: () => scala.Double,
    getFrequency: () => scala.Double,
    getItem: () => titaniumLib.TitaniumNs.UINs.View,
    getItemOffset: () => titaniumLib.Point,
    item: titaniumLib.TitaniumNs.UINs.View,
    itemOffset: titaniumLib.Point,
    removeEventListener: (java.lang.String, js.Function1[/* param0 */ js.Any, _]) => scala.Unit,
    setAnchorItem: js.Any => scala.Unit,
    setAnchorOffset: titaniumLib.Point => scala.Unit,
    setBubbleParent: scala.Boolean => scala.Unit,
    setDamping: scala.Double => scala.Unit,
    setDistance: scala.Double => scala.Unit,
    setFrequency: scala.Double => scala.Unit,
    setItem: js.Any => scala.Unit,
    setItemOffset: titaniumLib.Point => scala.Unit,
    getLifecycleContainer: () => titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.Window, scala.Unit]) with (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.TabGroup, scala.Unit]) = null
  ): ViewAttachmentBehavior = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), anchorItem = anchorItem, anchorOffset = anchorOffset, apiName = apiName, applyProperties = js.Any.fromFunction1(applyProperties), bubbleParent = bubbleParent, damping = damping, distance = distance, fireEvent = js.Any.fromFunction2(fireEvent), frequency = frequency, getAnchorItem = js.Any.fromFunction0(getAnchorItem), getAnchorOffset = js.Any.fromFunction0(getAnchorOffset), getApiName = js.Any.fromFunction0(getApiName), getBubbleParent = js.Any.fromFunction0(getBubbleParent), getDamping = js.Any.fromFunction0(getDamping), getDistance = js.Any.fromFunction0(getDistance), getFrequency = js.Any.fromFunction0(getFrequency), getItem = js.Any.fromFunction0(getItem), getItemOffset = js.Any.fromFunction0(getItemOffset), item = item, itemOffset = itemOffset, removeEventListener = js.Any.fromFunction2(removeEventListener), setAnchorItem = js.Any.fromFunction1(setAnchorItem), setAnchorOffset = js.Any.fromFunction1(setAnchorOffset), setBubbleParent = js.Any.fromFunction1(setBubbleParent), setDamping = js.Any.fromFunction1(setDamping), setDistance = js.Any.fromFunction1(setDistance), setFrequency = js.Any.fromFunction1(setFrequency), setItem = js.Any.fromFunction1(setItem), setItemOffset = js.Any.fromFunction1(setItemOffset))
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(js.Any.fromFunction0(getLifecycleContainer))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[ViewAttachmentBehavior]
  }
}

