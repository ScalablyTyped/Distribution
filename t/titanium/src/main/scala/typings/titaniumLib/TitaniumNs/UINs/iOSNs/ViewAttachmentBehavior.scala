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

