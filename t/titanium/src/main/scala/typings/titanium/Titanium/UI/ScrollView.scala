package typings.titanium.Titanium.UI

import typings.titanium.ScrollViewAnimationProperties
import typings.titanium.contentOffsetOption
import typings.titanium.zoomScaleOption
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
  var canCancelEvents: Boolean = js.native
  /**
  			 * Height of the scrollable region.
  			 */
  var contentHeight: Double | String = js.native
  /**
  			 * X and Y coordinates to which to reposition the top-left point of the scrollable region.
  			 */
  var contentOffset: js.Any = js.native
  /**
  			 * Width of the scrollable region.
  			 */
  var contentWidth: Double | String = js.native
  /**
  			 * The deceleration rate of the ScrollView.
  			 */
  var decelerationRate: Double = js.native
  /**
  			 * Determines whether scroll bounce of the scrollable region is enabled.
  			 */
  var disableBounce: Boolean = js.native
  /**
  			 * Determines whether horizontal scroll bounce of the scrollable region is enabled.
  			 */
  var horizontalBounce: Boolean = js.native
  /**
  			 * The manner in which the keyboard is dismissed when a drag begins in the scroll view.
  			 */
  var keyboardDismissMode: Double = js.native
  /**
  			 * Maximum scaling factor of the scrollable region and its content.
  			 */
  var maxZoomScale: Double = js.native
  /**
  			 * Minimum scaling factor of the scrollable region and its content.
  			 */
  var minZoomScale: Double = js.native
  /**
  			 * Determines the behavior when the user overscolls the view.
  			 */
  var overScrollMode: Double = js.native
  /**
  			 * View positioned above the first row that is only revealed when the user drags the scroll view contents down.
  			 */
  var refreshControl: RefreshControl = js.native
  /**
  			 * Style of the scrollbar.
  			 */
  var scrollIndicatorStyle: Double = js.native
  /**
  			 * Limits the direction of the scrollable region, overriding the deduced setting. Set to
  			 * `horizontal` or `vertical`.
  			 */
  var scrollType: String = js.native
  /**
  			 * Determines whether scrolling is enabled for the view.
  			 */
  var scrollingEnabled: Boolean = js.native
  /**
  			 * Controls whether the scroll-to-top gesture is effective.
  			 */
  var scrollsToTop: Boolean = js.native
  /**
  			 * Determines whether the horizontal scroll indicator is visible.
  			 */
  var showHorizontalScrollIndicator: Boolean = js.native
  /**
  			 * Determines whether the vertical scroll indicator is visible.
  			 */
  var showVerticalScrollIndicator: Boolean = js.native
  /**
  			 * Determines whether vertical scroll bounce of the scrollable region is enabled.
  			 */
  var verticalBounce: Boolean = js.native
  /**
  			 * Scaling factor of the scroll view's content.
  			 */
  var zoomScale: Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ScrollView.canCancelEvents> property.
  			 */
  def getCanCancelEvents(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ScrollView.contentHeight> property.
  			 */
  def getContentHeight(): Double | String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ScrollView.contentOffset> property.
  			 */
  def getContentOffset(): js.Any = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ScrollView.contentWidth> property.
  			 */
  def getContentWidth(): Double | String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ScrollView.decelerationRate> property.
  			 */
  def getDecelerationRate(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ScrollView.disableBounce> property.
  			 */
  def getDisableBounce(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ScrollView.horizontalBounce> property.
  			 */
  def getHorizontalBounce(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ScrollView.keyboardDismissMode> property.
  			 */
  def getKeyboardDismissMode(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ScrollView.maxZoomScale> property.
  			 */
  def getMaxZoomScale(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ScrollView.minZoomScale> property.
  			 */
  def getMinZoomScale(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ScrollView.overScrollMode> property.
  			 */
  def getOverScrollMode(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ScrollView.refreshControl> property.
  			 */
  def getRefreshControl(): RefreshControl = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ScrollView.scrollIndicatorStyle> property.
  			 */
  def getScrollIndicatorStyle(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ScrollView.scrollType> property.
  			 */
  def getScrollType(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ScrollView.scrollingEnabled> property.
  			 */
  def getScrollingEnabled(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ScrollView.scrollsToTop> property.
  			 */
  def getScrollsToTop(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ScrollView.showHorizontalScrollIndicator> property.
  			 */
  def getShowHorizontalScrollIndicator(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ScrollView.showVerticalScrollIndicator> property.
  			 */
  def getShowVerticalScrollIndicator(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ScrollView.verticalBounce> property.
  			 */
  def getVerticalBounce(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ScrollView.zoomScale> property.
  			 */
  def getZoomScale(): Double = js.native
  /**
  			 * Moves the specified coordinate of the scrollable region into the viewable area.
  			 */
  def scrollTo(x: Double, y: Double): Unit = js.native
  def scrollTo(x: Double, y: Double, animation: ScrollViewAnimationProperties): Unit = js.native
  /**
  			 * Moves the end of the scrollable region into the viewable area.
  			 */
  def scrollToBottom(): Unit = js.native
  /**
  			 * Moves the top of the scrollable region into the viewable area.
  			 */
  def scrollToTop(): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ScrollView.canCancelEvents> property.
  			 */
  def setCanCancelEvents(canCancelEvents: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ScrollView.contentHeight> property.
  			 */
  def setContentHeight(contentHeight: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ScrollView.contentHeight> property.
  			 */
  def setContentHeight(contentHeight: Double): Unit = js.native
  /**
  			 * Sets the value of the [contentOffset](Titanium.UI.ScrollView.contentOffset) property.
  			 */
  def setContentOffset(contentOffsetXY: js.Any): Unit = js.native
  def setContentOffset(contentOffsetXY: js.Any, animated: contentOffsetOption): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ScrollView.contentWidth> property.
  			 */
  def setContentWidth(contentWidth: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ScrollView.contentWidth> property.
  			 */
  def setContentWidth(contentWidth: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ScrollView.decelerationRate> property.
  			 */
  def setDecelerationRate(decelerationRate: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ScrollView.disableBounce> property.
  			 */
  def setDisableBounce(disableBounce: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ScrollView.horizontalBounce> property.
  			 */
  def setHorizontalBounce(horizontalBounce: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ScrollView.keyboardDismissMode> property.
  			 */
  def setKeyboardDismissMode(keyboardDismissMode: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ScrollView.maxZoomScale> property.
  			 */
  def setMaxZoomScale(maxZoomScale: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ScrollView.minZoomScale> property.
  			 */
  def setMinZoomScale(minZoomScale: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ScrollView.overScrollMode> property.
  			 */
  def setOverScrollMode(overScrollMode: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ScrollView.refreshControl> property.
  			 */
  def setRefreshControl(refreshControl: RefreshControl): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ScrollView.scrollIndicatorStyle> property.
  			 */
  def setScrollIndicatorStyle(scrollIndicatorStyle: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ScrollView.scrollType> property.
  			 */
  def setScrollType(scrollType: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ScrollView.scrollingEnabled> property.
  			 */
  def setScrollingEnabled(scrollingEnabled: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ScrollView.scrollsToTop> property.
  			 */
  def setScrollsToTop(scrollsToTop: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ScrollView.showHorizontalScrollIndicator> property.
  			 */
  def setShowHorizontalScrollIndicator(showHorizontalScrollIndicator: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ScrollView.showVerticalScrollIndicator> property.
  			 */
  def setShowVerticalScrollIndicator(showVerticalScrollIndicator: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ScrollView.verticalBounce> property.
  			 */
  def setVerticalBounce(verticalBounce: Boolean): Unit = js.native
  /**
  			 * Sets the value of the [zoomScale](Titanium.UI.ScrollView.zoomScale) property.
  			 */
  def setZoomScale(zoomScale: Double): Unit = js.native
  def setZoomScale(zoomScale: Double, animated: zoomScaleOption): Unit = js.native
}

