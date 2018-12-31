package typings
package titaniumLib.TitaniumNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * A view that contains a horizontally and/or vertically-scrollable region of content.
		 */
@js.native
trait ScrollView extends View {
  /**
  			 * Determines whether this scroll view can cancel subview touches in order to scroll instead.
  			 */
  var canCancelEvents: scala.Boolean = js.native
  /**
  			 * Height of the scrollable region.
  			 */
  var contentHeight: scala.Double | java.lang.String = js.native
  /**
  			 * X and Y coordinates to which to reposition the top-left point of the scrollable region.
  			 */
  var contentOffset: js.Any = js.native
  /**
  			 * Width of the scrollable region.
  			 */
  var contentWidth: scala.Double | java.lang.String = js.native
  /**
  			 * The deceleration rate of the ScrollView.
  			 */
  var decelerationRate: scala.Double = js.native
  /**
  			 * Determines whether scroll bounce of the scrollable region is enabled.
  			 */
  var disableBounce: scala.Boolean = js.native
  /**
  			 * Determines whether horizontal scroll bounce of the scrollable region is enabled.
  			 */
  var horizontalBounce: scala.Boolean = js.native
  /**
  			 * The manner in which the keyboard is dismissed when a drag begins in the scroll view.
  			 */
  var keyboardDismissMode: scala.Double = js.native
  /**
  			 * Maximum scaling factor of the scrollable region and its content.
  			 */
  var maxZoomScale: scala.Double = js.native
  /**
  			 * Minimum scaling factor of the scrollable region and its content.
  			 */
  var minZoomScale: scala.Double = js.native
  /**
  			 * Determines the behavior when the user overscolls the view.
  			 */
  var overScrollMode: scala.Double = js.native
  /**
  			 * View positioned above the first row that is only revealed when the user drags the scroll view contents down.
  			 */
  var refreshControl: RefreshControl = js.native
  /**
  			 * Style of the scrollbar.
  			 */
  var scrollIndicatorStyle: scala.Double = js.native
  /**
  			 * Limits the direction of the scrollable region, overriding the deduced setting. Set to
  			 * `horizontal` or `vertical`.
  			 */
  var scrollType: java.lang.String = js.native
  /**
  			 * Determines whether scrolling is enabled for the view.
  			 */
  var scrollingEnabled: scala.Boolean = js.native
  /**
  			 * Controls whether the scroll-to-top gesture is effective.
  			 */
  var scrollsToTop: scala.Boolean = js.native
  /**
  			 * Determines whether the horizontal scroll indicator is visible.
  			 */
  var showHorizontalScrollIndicator: scala.Boolean = js.native
  /**
  			 * Determines whether the vertical scroll indicator is visible.
  			 */
  var showVerticalScrollIndicator: scala.Boolean = js.native
  /**
  			 * Determines whether vertical scroll bounce of the scrollable region is enabled.
  			 */
  var verticalBounce: scala.Boolean = js.native
  /**
  			 * Scaling factor of the scroll view's content.
  			 */
  var zoomScale: scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ScrollView.canCancelEvents> property.
  			 */
  def getCanCancelEvents(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ScrollView.contentHeight> property.
  			 */
  def getContentHeight(): scala.Double | java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ScrollView.contentOffset> property.
  			 */
  def getContentOffset(): js.Any = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ScrollView.contentWidth> property.
  			 */
  def getContentWidth(): scala.Double | java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ScrollView.decelerationRate> property.
  			 */
  def getDecelerationRate(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ScrollView.disableBounce> property.
  			 */
  def getDisableBounce(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ScrollView.horizontalBounce> property.
  			 */
  def getHorizontalBounce(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ScrollView.keyboardDismissMode> property.
  			 */
  def getKeyboardDismissMode(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ScrollView.maxZoomScale> property.
  			 */
  def getMaxZoomScale(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ScrollView.minZoomScale> property.
  			 */
  def getMinZoomScale(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ScrollView.overScrollMode> property.
  			 */
  def getOverScrollMode(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ScrollView.refreshControl> property.
  			 */
  def getRefreshControl(): RefreshControl = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ScrollView.scrollIndicatorStyle> property.
  			 */
  def getScrollIndicatorStyle(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ScrollView.scrollType> property.
  			 */
  def getScrollType(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ScrollView.scrollingEnabled> property.
  			 */
  def getScrollingEnabled(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ScrollView.scrollsToTop> property.
  			 */
  def getScrollsToTop(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ScrollView.showHorizontalScrollIndicator> property.
  			 */
  def getShowHorizontalScrollIndicator(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ScrollView.showVerticalScrollIndicator> property.
  			 */
  def getShowVerticalScrollIndicator(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ScrollView.verticalBounce> property.
  			 */
  def getVerticalBounce(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ScrollView.zoomScale> property.
  			 */
  def getZoomScale(): scala.Double = js.native
  /**
  			 * Moves the specified coordinate of the scrollable region into the viewable area.
  			 */
  def scrollTo(x: scala.Double, y: scala.Double): scala.Unit = js.native
  def scrollTo(x: scala.Double, y: scala.Double, animation: titaniumLib.ScrollViewAnimationProperties): scala.Unit = js.native
  /**
  			 * Moves the end of the scrollable region into the viewable area.
  			 */
  def scrollToBottom(): scala.Unit = js.native
  /**
  			 * Moves the top of the scrollable region into the viewable area.
  			 */
  def scrollToTop(): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ScrollView.canCancelEvents> property.
  			 */
  def setCanCancelEvents(canCancelEvents: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ScrollView.contentHeight> property.
  			 */
  def setContentHeight(contentHeight: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ScrollView.contentHeight> property.
  			 */
  def setContentHeight(contentHeight: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the [contentOffset](Titanium.UI.ScrollView.contentOffset) property.
  			 */
  def setContentOffset(contentOffset: js.Any): scala.Unit = js.native
  def setContentOffset(contentOffset: js.Any, animated: titaniumLib.contentOffsetOption): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ScrollView.contentWidth> property.
  			 */
  def setContentWidth(contentWidth: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ScrollView.contentWidth> property.
  			 */
  def setContentWidth(contentWidth: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ScrollView.decelerationRate> property.
  			 */
  def setDecelerationRate(decelerationRate: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ScrollView.disableBounce> property.
  			 */
  def setDisableBounce(disableBounce: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ScrollView.horizontalBounce> property.
  			 */
  def setHorizontalBounce(horizontalBounce: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ScrollView.keyboardDismissMode> property.
  			 */
  def setKeyboardDismissMode(keyboardDismissMode: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ScrollView.maxZoomScale> property.
  			 */
  def setMaxZoomScale(maxZoomScale: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ScrollView.minZoomScale> property.
  			 */
  def setMinZoomScale(minZoomScale: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ScrollView.overScrollMode> property.
  			 */
  def setOverScrollMode(overScrollMode: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ScrollView.refreshControl> property.
  			 */
  def setRefreshControl(refreshControl: RefreshControl): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ScrollView.scrollIndicatorStyle> property.
  			 */
  def setScrollIndicatorStyle(scrollIndicatorStyle: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ScrollView.scrollType> property.
  			 */
  def setScrollType(scrollType: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ScrollView.scrollingEnabled> property.
  			 */
  def setScrollingEnabled(scrollingEnabled: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ScrollView.scrollsToTop> property.
  			 */
  def setScrollsToTop(scrollsToTop: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ScrollView.showHorizontalScrollIndicator> property.
  			 */
  def setShowHorizontalScrollIndicator(showHorizontalScrollIndicator: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ScrollView.showVerticalScrollIndicator> property.
  			 */
  def setShowVerticalScrollIndicator(showVerticalScrollIndicator: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ScrollView.verticalBounce> property.
  			 */
  def setVerticalBounce(verticalBounce: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the [zoomScale](Titanium.UI.ScrollView.zoomScale) property.
  			 */
  def setZoomScale(zoomScale: scala.Double): scala.Unit = js.native
  def setZoomScale(zoomScale: scala.Double, animated: titaniumLib.zoomScaleOption): scala.Unit = js.native
}

