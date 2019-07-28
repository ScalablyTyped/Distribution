package typings.titanium.TitaniumNs.UINs

import typings.titanium.TitaniumNs.Blob
import typings.titanium.TitaniumNs.Proxy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * A dashboard item is a view that is displayed as an icon in a <Titanium.UI.DashboardView>.
		 */
@js.native
trait DashboardItem extends Proxy {
  /**
  			 * Integer value displayed in a badge.
  			 */
  var badge: Double = js.native
  /**
  			 * Determines whether this item can be deleted when it edit mode.
  			 */
  var canDelete: Boolean = js.native
  /**
  			 * Image or path to image to display in the item by default.
  			 */
  var image: String | Blob = js.native
  /**
  			 * Image or path to image to display in the item as it is selected.
  			 */
  var selectedImage: String | Blob = js.native
  /**
  			 * Gets the value of the <Titanium.UI.DashboardItem.badge> property.
  			 */
  def getBadge(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.DashboardItem.canDelete> property.
  			 */
  def getCanDelete(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.DashboardItem.image> property.
  			 */
  def getImage(): String | Blob = js.native
  /**
  			 * Gets the value of the <Titanium.UI.DashboardItem.selectedImage> property.
  			 */
  def getSelectedImage(): String | Blob = js.native
  /**
  			 * Sets the value of the <Titanium.UI.DashboardItem.badge> property.
  			 */
  def setBadge(badge: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.DashboardItem.canDelete> property.
  			 */
  def setCanDelete(canDelete: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.DashboardItem.image> property.
  			 */
  def setImage(image: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.DashboardItem.image> property.
  			 */
  def setImage(image: Blob): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.DashboardItem.selectedImage> property.
  			 */
  def setSelectedImage(selectedImage: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.DashboardItem.selectedImage> property.
  			 */
  def setSelectedImage(selectedImage: Blob): Unit = js.native
}

