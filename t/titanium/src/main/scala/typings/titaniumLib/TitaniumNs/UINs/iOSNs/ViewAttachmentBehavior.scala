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
    addEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    anchorItem: titaniumLib.TitaniumNs.UINs.View,
    anchorOffset: titaniumLib.Point,
    apiName: java.lang.String,
    applyProperties: js.Function1[js.Any, scala.Unit],
    bubbleParent: scala.Boolean,
    damping: scala.Double,
    distance: scala.Double,
    fireEvent: js.Function2[java.lang.String, js.Any, scala.Unit],
    frequency: scala.Double,
    getAnchorItem: js.Function0[titaniumLib.TitaniumNs.UINs.View],
    getAnchorOffset: js.Function0[titaniumLib.Point],
    getApiName: js.Function0[java.lang.String],
    getBubbleParent: js.Function0[scala.Boolean],
    getDamping: js.Function0[scala.Double],
    getDistance: js.Function0[scala.Double],
    getFrequency: js.Function0[scala.Double],
    getItem: js.Function0[titaniumLib.TitaniumNs.UINs.View],
    getItemOffset: js.Function0[titaniumLib.Point],
    item: titaniumLib.TitaniumNs.UINs.View,
    itemOffset: titaniumLib.Point,
    removeEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    setAnchorItem: js.Function1[js.Any, scala.Unit],
    setAnchorOffset: js.Function1[titaniumLib.Point, scala.Unit],
    setBubbleParent: js.Function1[scala.Boolean, scala.Unit],
    setDamping: js.Function1[scala.Double, scala.Unit],
    setDistance: js.Function1[scala.Double, scala.Unit],
    setFrequency: js.Function1[scala.Double, scala.Unit],
    setItem: js.Function1[js.Any, scala.Unit],
    setItemOffset: js.Function1[titaniumLib.Point, scala.Unit],
    getLifecycleContainer: js.Function0[titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup] = null,
    lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.Window, scala.Unit]) with (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.TabGroup, scala.Unit]) = null
  ): ViewAttachmentBehavior = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addEventListener")(addEventListener)
    __obj.updateDynamic("anchorItem")(anchorItem)
    __obj.updateDynamic("anchorOffset")(anchorOffset)
    __obj.updateDynamic("apiName")(apiName)
    __obj.updateDynamic("applyProperties")(applyProperties)
    __obj.updateDynamic("bubbleParent")(bubbleParent)
    __obj.updateDynamic("damping")(damping)
    __obj.updateDynamic("distance")(distance)
    __obj.updateDynamic("fireEvent")(fireEvent)
    __obj.updateDynamic("frequency")(frequency)
    __obj.updateDynamic("getAnchorItem")(getAnchorItem)
    __obj.updateDynamic("getAnchorOffset")(getAnchorOffset)
    __obj.updateDynamic("getApiName")(getApiName)
    __obj.updateDynamic("getBubbleParent")(getBubbleParent)
    __obj.updateDynamic("getDamping")(getDamping)
    __obj.updateDynamic("getDistance")(getDistance)
    __obj.updateDynamic("getFrequency")(getFrequency)
    __obj.updateDynamic("getItem")(getItem)
    __obj.updateDynamic("getItemOffset")(getItemOffset)
    __obj.updateDynamic("item")(item)
    __obj.updateDynamic("itemOffset")(itemOffset)
    __obj.updateDynamic("removeEventListener")(removeEventListener)
    __obj.updateDynamic("setAnchorItem")(setAnchorItem)
    __obj.updateDynamic("setAnchorOffset")(setAnchorOffset)
    __obj.updateDynamic("setBubbleParent")(setBubbleParent)
    __obj.updateDynamic("setDamping")(setDamping)
    __obj.updateDynamic("setDistance")(setDistance)
    __obj.updateDynamic("setFrequency")(setFrequency)
    __obj.updateDynamic("setItem")(setItem)
    __obj.updateDynamic("setItemOffset")(setItemOffset)
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(getLifecycleContainer)
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[ViewAttachmentBehavior]
  }
}

