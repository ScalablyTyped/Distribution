package typings
package titaniumLib.TitaniumNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * A dashboard item is a view that is displayed as an icon in a <Titanium.UI.DashboardView>.
		 */
@js.native
trait DashboardItem
  extends titaniumLib.TitaniumNs.Proxy {
  /**
  			 * Integer value displayed in a badge.
  			 */
  var badge: scala.Double = js.native
  /**
  			 * Determines whether this item can be deleted when it edit mode.
  			 */
  var canDelete: scala.Boolean = js.native
  /**
  			 * Image or path to image to display in the item by default.
  			 */
  var image: java.lang.String | titaniumLib.TitaniumNs.Blob = js.native
  /**
  			 * Image or path to image to display in the item as it is selected.
  			 */
  var selectedImage: java.lang.String | titaniumLib.TitaniumNs.Blob = js.native
  /**
  			 * Gets the value of the <Titanium.UI.DashboardItem.badge> property.
  			 */
  def getBadge(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.DashboardItem.canDelete> property.
  			 */
  def getCanDelete(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.DashboardItem.image> property.
  			 */
  def getImage(): java.lang.String | titaniumLib.TitaniumNs.Blob = js.native
  /**
  			 * Gets the value of the <Titanium.UI.DashboardItem.selectedImage> property.
  			 */
  def getSelectedImage(): java.lang.String | titaniumLib.TitaniumNs.Blob = js.native
  /**
  			 * Sets the value of the <Titanium.UI.DashboardItem.badge> property.
  			 */
  def setBadge(badge: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.DashboardItem.canDelete> property.
  			 */
  def setCanDelete(canDelete: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.DashboardItem.image> property.
  			 */
  def setImage(image: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.DashboardItem.image> property.
  			 */
  def setImage(image: titaniumLib.TitaniumNs.Blob): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.DashboardItem.selectedImage> property.
  			 */
  def setSelectedImage(selectedImage: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.DashboardItem.selectedImage> property.
  			 */
  def setSelectedImage(selectedImage: titaniumLib.TitaniumNs.Blob): scala.Unit = js.native
}

