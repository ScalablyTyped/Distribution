package typings.titanium.Titanium.UI.iOS

import typings.titanium.Point
import typings.titanium.Titanium.Proxy
import typings.titanium.Titanium.UI.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * Dynamic behavior to support connections between an anchor point and an item.
			 */
@JSGlobal("Titanium.UI.iOS.AnchorAttachmentBehavior")
@js.native
class AnchorAttachmentBehavior () extends Proxy {
  /**
  				 * Anchor point for the attachment behavior relative to the animator's coordinate system.
  				 */
  var anchor: Point = js.native
  /**
  				 * Amount of damping to apply to the attachment behavior.
  				 */
  var damping: Double = js.native
  /**
  				 * Distance, in points, between the two attachment points.
  				 */
  var distance: Double = js.native
  /**
  				 * Frequency of oscillation for the behavior.
  				 */
  var frequency: Double = js.native
  /**
  				 * Item to connect to use the attachment behavior.
  				 */
  var item: View = js.native
  /**
  				 * Offset from the center point of the item for the attachment.
  				 */
  var offset: Point = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.AnchorAttachmentBehavior.anchor> property.
  				 * @deprecated Access <Titanium.UI.iOS.AnchorAttachmentBehavior.anchor> instead.
  				 */
  def getAnchor(): Point = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.AnchorAttachmentBehavior.damping> property.
  				 * @deprecated Access <Titanium.UI.iOS.AnchorAttachmentBehavior.damping> instead.
  				 */
  def getDamping(): Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.AnchorAttachmentBehavior.distance> property.
  				 * @deprecated Access <Titanium.UI.iOS.AnchorAttachmentBehavior.distance> instead.
  				 */
  def getDistance(): Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.AnchorAttachmentBehavior.frequency> property.
  				 * @deprecated Access <Titanium.UI.iOS.AnchorAttachmentBehavior.frequency> instead.
  				 */
  def getFrequency(): Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.AnchorAttachmentBehavior.item> property.
  				 * @deprecated Access <Titanium.UI.iOS.AnchorAttachmentBehavior.item> instead.
  				 */
  def getItem(): View = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.AnchorAttachmentBehavior.offset> property.
  				 * @deprecated Access <Titanium.UI.iOS.AnchorAttachmentBehavior.offset> instead.
  				 */
  def getOffset(): Point = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.AnchorAttachmentBehavior.anchor> property.
  				 * @deprecated Set the value using <Titanium.UI.iOS.AnchorAttachmentBehavior.anchor> instead.
  				 */
  def setAnchor(anchor: Point): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.AnchorAttachmentBehavior.damping> property.
  				 * @deprecated Set the value using <Titanium.UI.iOS.AnchorAttachmentBehavior.damping> instead.
  				 */
  def setDamping(damping: Double): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.AnchorAttachmentBehavior.distance> property.
  				 * @deprecated Set the value using <Titanium.UI.iOS.AnchorAttachmentBehavior.distance> instead.
  				 */
  def setDistance(distance: Double): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.AnchorAttachmentBehavior.frequency> property.
  				 * @deprecated Set the value using <Titanium.UI.iOS.AnchorAttachmentBehavior.frequency> instead.
  				 */
  def setFrequency(frequency: Double): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.AnchorAttachmentBehavior.item> property.
  				 * @deprecated Set the value using <Titanium.UI.iOS.AnchorAttachmentBehavior.item> instead.
  				 */
  def setItem(item: View): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.AnchorAttachmentBehavior.offset> property.
  				 * @deprecated Set the value using <Titanium.UI.iOS.AnchorAttachmentBehavior.offset> instead.
  				 */
  def setOffset(offset: Point): Unit = js.native
}

