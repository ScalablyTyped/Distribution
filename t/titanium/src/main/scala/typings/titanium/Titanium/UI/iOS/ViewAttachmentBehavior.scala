package typings.titanium.Titanium.UI.iOS

import typings.titanium.Point
import typings.titanium.Titanium.Proxy
import typings.titanium.Titanium.UI.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Dynamic behavior to support connections between two items.
  */
@js.native
trait ViewAttachmentBehavior extends Proxy {
  /**
    * Item to use as the anchor in this behavior.
    */
  var anchorItem: View = js.native
  /**
    * Offset from the center point of the anchor item for the attachment.
    */
  var anchorOffset: Point = js.native
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
  var itemOffset: Point = js.native
  /**
    * Gets the value of the <Titanium.UI.iOS.ViewAttachmentBehavior.anchorItem> property.
    * @deprecated Access <Titanium.UI.iOS.ViewAttachmentBehavior.anchorItem> instead.
    */
  def getAnchorItem(): View = js.native
  /**
    * Gets the value of the <Titanium.UI.iOS.ViewAttachmentBehavior.anchorOffset> property.
    * @deprecated Access <Titanium.UI.iOS.ViewAttachmentBehavior.anchorOffset> instead.
    */
  def getAnchorOffset(): Point = js.native
  /**
    * Gets the value of the <Titanium.UI.iOS.ViewAttachmentBehavior.damping> property.
    * @deprecated Access <Titanium.UI.iOS.ViewAttachmentBehavior.damping> instead.
    */
  def getDamping(): Double = js.native
  /**
    * Gets the value of the <Titanium.UI.iOS.ViewAttachmentBehavior.distance> property.
    * @deprecated Access <Titanium.UI.iOS.ViewAttachmentBehavior.distance> instead.
    */
  def getDistance(): Double = js.native
  /**
    * Gets the value of the <Titanium.UI.iOS.ViewAttachmentBehavior.frequency> property.
    * @deprecated Access <Titanium.UI.iOS.ViewAttachmentBehavior.frequency> instead.
    */
  def getFrequency(): Double = js.native
  /**
    * Gets the value of the <Titanium.UI.iOS.ViewAttachmentBehavior.item> property.
    * @deprecated Access <Titanium.UI.iOS.ViewAttachmentBehavior.item> instead.
    */
  def getItem(): View = js.native
  /**
    * Gets the value of the <Titanium.UI.iOS.ViewAttachmentBehavior.itemOffset> property.
    * @deprecated Access <Titanium.UI.iOS.ViewAttachmentBehavior.itemOffset> instead.
    */
  def getItemOffset(): Point = js.native
  /**
    * Sets the value of the <Titanium.UI.iOS.ViewAttachmentBehavior.anchorItem> property.
    * @deprecated Set the value using <Titanium.UI.iOS.ViewAttachmentBehavior.anchorItem> instead.
    */
  def setAnchorItem(anchorItem: View): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.iOS.ViewAttachmentBehavior.anchorOffset> property.
    * @deprecated Set the value using <Titanium.UI.iOS.ViewAttachmentBehavior.anchorOffset> instead.
    */
  def setAnchorOffset(anchorOffset: Point): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.iOS.ViewAttachmentBehavior.damping> property.
    * @deprecated Set the value using <Titanium.UI.iOS.ViewAttachmentBehavior.damping> instead.
    */
  def setDamping(damping: Double): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.iOS.ViewAttachmentBehavior.distance> property.
    * @deprecated Set the value using <Titanium.UI.iOS.ViewAttachmentBehavior.distance> instead.
    */
  def setDistance(distance: Double): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.iOS.ViewAttachmentBehavior.frequency> property.
    * @deprecated Set the value using <Titanium.UI.iOS.ViewAttachmentBehavior.frequency> instead.
    */
  def setFrequency(frequency: Double): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.iOS.ViewAttachmentBehavior.item> property.
    * @deprecated Set the value using <Titanium.UI.iOS.ViewAttachmentBehavior.item> instead.
    */
  def setItem(item: View): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.iOS.ViewAttachmentBehavior.itemOffset> property.
    * @deprecated Set the value using <Titanium.UI.iOS.ViewAttachmentBehavior.itemOffset> instead.
    */
  def setItemOffset(itemOffset: Point): Unit = js.native
}

