package typings
package titaniumLib.TitaniumNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * The RefreshControl is a representation of the native iOS
		 * [UIRefreshControl](https://developer.apple.com/documentation/uikit/uirefreshcontrol)
		 * and Android [SwipeRefreshLayout](https://developer.android.com/reference/android/support/v4/widget/SwipeRefreshLayout.html).
		 */

trait RefreshControl
  extends titaniumLib.TitaniumNs.Proxy {
  /**
  			 * The tint color for the refresh control, as a color name or hex triplet.
  			 */
  var tintColor: java.lang.String
  /**
  			 * The attributed title of the control.
  			 */
  var title: AttributedString
  /**
  			 * Tells the control that a refresh operation was started programmatically.
  			 */
  def beginRefreshing(): scala.Unit
  /**
  			 * Tells the control that a refresh operation has ended.
  			 */
  def endRefreshing(): scala.Unit
  /**
  			 * Gets the value of the <Titanium.UI.RefreshControl.tintColor> property.
  			 */
  def getTintColor(): java.lang.String
  /**
  			 * Gets the value of the <Titanium.UI.RefreshControl.title> property.
  			 */
  def getTitle(): AttributedString
  /**
  			 * Sets the value of the <Titanium.UI.RefreshControl.tintColor> property.
  			 */
  def setTintColor(tintColor: java.lang.String): scala.Unit
  /**
  			 * Sets the value of the <Titanium.UI.RefreshControl.title> property.
  			 */
  def setTitle(title: AttributedString): scala.Unit
}

