package typings.titanium.Titanium.UI

import typings.titanium.AnimatedOptions
import typings.titanium.Point
import typings.titanium.titaniumStrings.click
import typings.titanium.titaniumStrings.dblclick
import typings.titanium.titaniumStrings.doubletap
import typings.titanium.titaniumStrings.dragEnd
import typings.titanium.titaniumStrings.dragStart
import typings.titanium.titaniumStrings.dragend_
import typings.titanium.titaniumStrings.dragstart_
import typings.titanium.titaniumStrings.focus
import typings.titanium.titaniumStrings.keypressed
import typings.titanium.titaniumStrings.longclick
import typings.titanium.titaniumStrings.longpress
import typings.titanium.titaniumStrings.pinch
import typings.titanium.titaniumStrings.postlayout
import typings.titanium.titaniumStrings.scale
import typings.titanium.titaniumStrings.scroll
import typings.titanium.titaniumStrings.singletap
import typings.titanium.titaniumStrings.swipe
import typings.titanium.titaniumStrings.touchcancel
import typings.titanium.titaniumStrings.touchend
import typings.titanium.titaniumStrings.touchmove
import typings.titanium.titaniumStrings.touchstart
import typings.titanium.titaniumStrings.twofingertap
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
  var contentOffset: Point = js.native
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
  @JSName("addEventListener")
  def addEventListener_dragEnd(
    name: dragEnd,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ ScrollView_DragEndEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragStart(
    name: dragStart,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ ScrollView_DragStartEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragend(
    name: dragend_,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ ScrollViewDragendEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragstart(
    name: dragstart_,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ ScrollViewDragstartEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scale(
    name: scale,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ ScrollViewScaleEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scroll(
    name: scroll,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ ScrollViewScrollEvent, Unit]
  ): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_click(name: click, event: ScrollViewClickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_dblclick(name: dblclick, event: ScrollViewDblclickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_doubletap(name: doubletap, event: ScrollViewDoubletapEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_dragEnd(name: dragEnd): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_dragEnd(name: dragEnd, event: ScrollView_DragEndEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_dragStart(name: dragStart): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_dragStart(name: dragStart, event: ScrollView_DragStartEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_dragend(name: dragend_): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_dragend(name: dragend_, event: ScrollViewDragendEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_dragstart(name: dragstart_): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_dragstart(name: dragstart_, event: ScrollViewDragstartEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_focus(name: focus, event: ScrollViewFocusEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_keypressed(name: keypressed, event: ScrollViewKeypressedEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_longclick(name: longclick, event: ScrollViewLongclickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_longpress(name: longpress, event: ScrollViewLongpressEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_pinch(name: pinch, event: ScrollViewPinchEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_postlayout(name: postlayout, event: ScrollViewPostlayoutEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_scale(name: scale): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_scale(name: scale, event: ScrollViewScaleEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_scroll(name: scroll): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_scroll(name: scroll, event: ScrollViewScrollEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_singletap(name: singletap, event: ScrollViewSingletapEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_swipe(name: swipe, event: ScrollViewSwipeEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchcancel(name: touchcancel, event: ScrollViewTouchcancelEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchend(name: touchend, event: ScrollViewTouchendEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchmove(name: touchmove, event: ScrollViewTouchmoveEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchstart(name: touchstart, event: ScrollViewTouchstartEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_twofingertap(name: twofingertap, event: ScrollViewTwofingertapEvent): Unit = js.native
  /**
    * Gets the value of the <Titanium.UI.ScrollView.canCancelEvents> property.
    * @deprecated Access <Titanium.UI.ScrollView.canCancelEvents> instead.
    */
  def getCanCancelEvents(): Boolean = js.native
  /**
    * Gets the value of the <Titanium.UI.ScrollView.contentHeight> property.
    * @deprecated Access <Titanium.UI.ScrollView.contentHeight> instead.
    */
  def getContentHeight(): Double | String = js.native
  /**
    * Gets the value of the <Titanium.UI.ScrollView.contentOffset> property.
    * @deprecated Access <Titanium.UI.ScrollView.contentOffset> instead.
    */
  def getContentOffset(): Point = js.native
  /**
    * Gets the value of the <Titanium.UI.ScrollView.contentWidth> property.
    * @deprecated Access <Titanium.UI.ScrollView.contentWidth> instead.
    */
  def getContentWidth(): Double | String = js.native
  /**
    * Gets the value of the <Titanium.UI.ScrollView.decelerationRate> property.
    * @deprecated Access <Titanium.UI.ScrollView.decelerationRate> instead.
    */
  def getDecelerationRate(): Double = js.native
  /**
    * Gets the value of the <Titanium.UI.ScrollView.disableBounce> property.
    * @deprecated Access <Titanium.UI.ScrollView.disableBounce> instead.
    */
  def getDisableBounce(): Boolean = js.native
  /**
    * Gets the value of the <Titanium.UI.ScrollView.horizontalBounce> property.
    * @deprecated Access <Titanium.UI.ScrollView.horizontalBounce> instead.
    */
  def getHorizontalBounce(): Boolean = js.native
  /**
    * Gets the value of the <Titanium.UI.ScrollView.keyboardDismissMode> property.
    * @deprecated Access <Titanium.UI.ScrollView.keyboardDismissMode> instead.
    */
  def getKeyboardDismissMode(): Double = js.native
  /**
    * Gets the value of the <Titanium.UI.ScrollView.maxZoomScale> property.
    * @deprecated Access <Titanium.UI.ScrollView.maxZoomScale> instead.
    */
  def getMaxZoomScale(): Double = js.native
  /**
    * Gets the value of the <Titanium.UI.ScrollView.minZoomScale> property.
    * @deprecated Access <Titanium.UI.ScrollView.minZoomScale> instead.
    */
  def getMinZoomScale(): Double = js.native
  /**
    * Gets the value of the <Titanium.UI.ScrollView.overScrollMode> property.
    * @deprecated Access <Titanium.UI.ScrollView.overScrollMode> instead.
    */
  def getOverScrollMode(): Double = js.native
  /**
    * Gets the value of the <Titanium.UI.ScrollView.refreshControl> property.
    * @deprecated Access <Titanium.UI.ScrollView.refreshControl> instead.
    */
  def getRefreshControl(): RefreshControl = js.native
  /**
    * Gets the value of the <Titanium.UI.ScrollView.scrollIndicatorStyle> property.
    * @deprecated Access <Titanium.UI.ScrollView.scrollIndicatorStyle> instead.
    */
  def getScrollIndicatorStyle(): Double = js.native
  /**
    * Gets the value of the <Titanium.UI.ScrollView.scrollType> property.
    * @deprecated Access <Titanium.UI.ScrollView.scrollType> instead.
    */
  def getScrollType(): String = js.native
  /**
    * Gets the value of the <Titanium.UI.ScrollView.scrollingEnabled> property.
    * @deprecated Access <Titanium.UI.ScrollView.scrollingEnabled> instead.
    */
  def getScrollingEnabled(): Boolean = js.native
  /**
    * Gets the value of the <Titanium.UI.ScrollView.scrollsToTop> property.
    * @deprecated Access <Titanium.UI.ScrollView.scrollsToTop> instead.
    */
  def getScrollsToTop(): Boolean = js.native
  /**
    * Gets the value of the <Titanium.UI.ScrollView.showHorizontalScrollIndicator> property.
    * @deprecated Access <Titanium.UI.ScrollView.showHorizontalScrollIndicator> instead.
    */
  def getShowHorizontalScrollIndicator(): Boolean = js.native
  /**
    * Gets the value of the <Titanium.UI.ScrollView.showVerticalScrollIndicator> property.
    * @deprecated Access <Titanium.UI.ScrollView.showVerticalScrollIndicator> instead.
    */
  def getShowVerticalScrollIndicator(): Boolean = js.native
  /**
    * Gets the value of the <Titanium.UI.ScrollView.verticalBounce> property.
    * @deprecated Access <Titanium.UI.ScrollView.verticalBounce> instead.
    */
  def getVerticalBounce(): Boolean = js.native
  /**
    * Gets the value of the <Titanium.UI.ScrollView.zoomScale> property.
    * @deprecated Access <Titanium.UI.ScrollView.zoomScale> instead.
    */
  def getZoomScale(): Double = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragEnd(
    name: dragEnd,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ ScrollView_DragEndEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragStart(
    name: dragStart,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ ScrollView_DragStartEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragend(
    name: dragend_,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ ScrollViewDragendEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragstart(
    name: dragstart_,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ ScrollViewDragstartEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_scale(
    name: scale,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ ScrollViewScaleEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_scroll(
    name: scroll,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ ScrollViewScrollEvent, Unit]
  ): Unit = js.native
  /**
    * Moves the specified coordinate of the scrollable region into the viewable area.
    */
  def scrollTo(x: Double, y: Double): Unit = js.native
  def scrollTo(x: Double, y: Double, options: AnimatedOptions): Unit = js.native
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
    * @deprecated Set the value using <Titanium.UI.ScrollView.canCancelEvents> instead.
    */
  def setCanCancelEvents(canCancelEvents: Boolean): Unit = js.native
  def setContentHeight(contentHeight: String): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.ScrollView.contentHeight> property.
    * @deprecated Set the value using <Titanium.UI.ScrollView.contentHeight> instead.
    */
  def setContentHeight(contentHeight: Double): Unit = js.native
  /**
    * Sets the value of the [contentOffset](Titanium.UI.ScrollView.contentOffset) property.
    */
  def setContentOffset(contentOffsetXY: Point): Unit = js.native
  def setContentOffset(contentOffsetXY: Point, animated: AnimatedOptions): Unit = js.native
  def setContentWidth(contentWidth: String): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.ScrollView.contentWidth> property.
    * @deprecated Set the value using <Titanium.UI.ScrollView.contentWidth> instead.
    */
  def setContentWidth(contentWidth: Double): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.ScrollView.decelerationRate> property.
    * @deprecated Set the value using <Titanium.UI.ScrollView.decelerationRate> instead.
    */
  def setDecelerationRate(decelerationRate: Double): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.ScrollView.disableBounce> property.
    * @deprecated Set the value using <Titanium.UI.ScrollView.disableBounce> instead.
    */
  def setDisableBounce(disableBounce: Boolean): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.ScrollView.horizontalBounce> property.
    * @deprecated Set the value using <Titanium.UI.ScrollView.horizontalBounce> instead.
    */
  def setHorizontalBounce(horizontalBounce: Boolean): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.ScrollView.keyboardDismissMode> property.
    * @deprecated Set the value using <Titanium.UI.ScrollView.keyboardDismissMode> instead.
    */
  def setKeyboardDismissMode(keyboardDismissMode: Double): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.ScrollView.maxZoomScale> property.
    * @deprecated Set the value using <Titanium.UI.ScrollView.maxZoomScale> instead.
    */
  def setMaxZoomScale(maxZoomScale: Double): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.ScrollView.minZoomScale> property.
    * @deprecated Set the value using <Titanium.UI.ScrollView.minZoomScale> instead.
    */
  def setMinZoomScale(minZoomScale: Double): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.ScrollView.overScrollMode> property.
    * @deprecated Set the value using <Titanium.UI.ScrollView.overScrollMode> instead.
    */
  def setOverScrollMode(overScrollMode: Double): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.ScrollView.refreshControl> property.
    * @deprecated Set the value using <Titanium.UI.ScrollView.refreshControl> instead.
    */
  def setRefreshControl(refreshControl: RefreshControl): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.ScrollView.scrollIndicatorStyle> property.
    * @deprecated Set the value using <Titanium.UI.ScrollView.scrollIndicatorStyle> instead.
    */
  def setScrollIndicatorStyle(scrollIndicatorStyle: Double): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.ScrollView.scrollType> property.
    * @deprecated Set the value using <Titanium.UI.ScrollView.scrollType> instead.
    */
  def setScrollType(scrollType: String): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.ScrollView.scrollingEnabled> property.
    * @deprecated Set the value using <Titanium.UI.ScrollView.scrollingEnabled> instead.
    */
  def setScrollingEnabled(scrollingEnabled: Boolean): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.ScrollView.scrollsToTop> property.
    * @deprecated Set the value using <Titanium.UI.ScrollView.scrollsToTop> instead.
    */
  def setScrollsToTop(scrollsToTop: Boolean): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.ScrollView.showHorizontalScrollIndicator> property.
    * @deprecated Set the value using <Titanium.UI.ScrollView.showHorizontalScrollIndicator> instead.
    */
  def setShowHorizontalScrollIndicator(showHorizontalScrollIndicator: Boolean): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.ScrollView.showVerticalScrollIndicator> property.
    * @deprecated Set the value using <Titanium.UI.ScrollView.showVerticalScrollIndicator> instead.
    */
  def setShowVerticalScrollIndicator(showVerticalScrollIndicator: Boolean): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.ScrollView.verticalBounce> property.
    * @deprecated Set the value using <Titanium.UI.ScrollView.verticalBounce> instead.
    */
  def setVerticalBounce(verticalBounce: Boolean): Unit = js.native
  /**
    * Sets the value of the [zoomScale](Titanium.UI.ScrollView.zoomScale) property.
    */
  def setZoomScale(zoomScale: Double): Unit = js.native
  def setZoomScale(zoomScale: Double, options: AnimatedOptions): Unit = js.native
}

