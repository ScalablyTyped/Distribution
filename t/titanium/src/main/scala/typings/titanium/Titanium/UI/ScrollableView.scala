package typings.titanium.Titanium.UI

import typings.titanium.Dimension
import typings.titanium.Padding
import typings.titanium.titaniumStrings.click
import typings.titanium.titaniumStrings.dblclick
import typings.titanium.titaniumStrings.doubletap
import typings.titanium.titaniumStrings.dragend_
import typings.titanium.titaniumStrings.focus
import typings.titanium.titaniumStrings.keypressed
import typings.titanium.titaniumStrings.longclick
import typings.titanium.titaniumStrings.longpress
import typings.titanium.titaniumStrings.pinch
import typings.titanium.titaniumStrings.postlayout
import typings.titanium.titaniumStrings.scroll
import typings.titanium.titaniumStrings.scrollend
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
		 * A view that encapsulates a horizontally-scrolling set of child views, known as pages, navigable
		 * using its built-in horizontal swipe gestures.
		 */
@JSGlobal("Titanium.UI.ScrollableView")
@js.native
class ScrollableView () extends View {
  /**
  			 * Number of pages to cache (pre-render).
  			 */
  var cacheSize: Double = js.native
  /**
  			 * Determines whether the previous and next pages are clipped, so that they are not visible
  			 * adjacent to the current page.
  			 */
  var clipViews: Boolean = js.native
  /**
  			 * Index of the active page.
  			 */
  var currentPage: Double = js.native
  /**
  			 * Color for the current page of the paging control, as a color name or hex triplet.
  			 */
  var currentPageIndicatorColor: String = js.native
  /**
  			 * Determines whether page bouncing effect is disabled.
  			 */
  var disableBounce: Boolean = js.native
  /**
  			 * Sets the region where this view responds to gestures.
  			 */
  var hitRect: Dimension = js.native
  /**
  			 * Determines the behavior when the user overscolls the view.
  			 */
  var overScrollMode: Double = js.native
  /**
  			 * Determines whether the paging control is added as an overlay to the view.
  			 */
  var overlayEnabled: Boolean = js.native
  /**
  			 * The padding applied to the scrollable view.
  			 */
  var padding: Padding = js.native
  /**
  			 * Color of the paging control, as a color name or hex triplet.
  			 */
  var pageIndicatorColor: String = js.native
  /**
  			 * Alpha value of the paging control.
  			 */
  var pagingControlAlpha: Double = js.native
  /**
  			 * Color of the paging control, as a color name or hex triplet.
  			 */
  var pagingControlColor: String = js.native
  /**
  			 * Height of the paging control, in pixels.
  			 */
  var pagingControlHeight: Double = js.native
  /**
  			 * Determines whether the paging control is displayed at the top or bottom of the view.
  			 */
  var pagingControlOnTop: Boolean = js.native
  /**
  			 * Number of milliseconds to wait before hiding the paging control.
  			 */
  var pagingControlTimeout: Double = js.native
  /**
  			 * Determines whether scrolling is enabled for the view.
  			 */
  var scrollingEnabled: Boolean = js.native
  /**
  			 * Determines whether the paging control is visible.
  			 */
  var showPagingControl: Boolean = js.native
  /**
  			 * Sets the pages within this Scrollable View.
  			 */
  var views: js.Array[View] = js.native
  @JSName("addEventListener")
  def addEventListener_dragend(
    name: dragend_,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ ScrollableViewDragendEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scroll(
    name: scroll,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ ScrollableViewScrollEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scrollend(
    name: scrollend,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ ScrollableViewScrollendEvent, Unit]
  ): Unit = js.native
  /**
  			 * Adds a new page to this Scrollable View.
  			 */
  def addView(view: View): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_click(name: click, event: ScrollableViewClickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_dblclick(name: dblclick, event: ScrollableViewDblclickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_doubletap(name: doubletap, event: ScrollableViewDoubletapEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_dragend(name: dragend_): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_dragend(name: dragend_, event: ScrollableViewDragendEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_focus(name: focus, event: ScrollableViewFocusEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_keypressed(name: keypressed, event: ScrollableViewKeypressedEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_longclick(name: longclick, event: ScrollableViewLongclickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_longpress(name: longpress, event: ScrollableViewLongpressEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_pinch(name: pinch, event: ScrollableViewPinchEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_postlayout(name: postlayout, event: ScrollableViewPostlayoutEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_scroll(name: scroll): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_scroll(name: scroll, event: ScrollableViewScrollEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_scrollend(name: scrollend): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_scrollend(name: scrollend, event: ScrollableViewScrollendEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_singletap(name: singletap, event: ScrollableViewSingletapEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_swipe(name: swipe, event: ScrollableViewSwipeEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchcancel(name: touchcancel, event: ScrollableViewTouchcancelEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchend(name: touchend, event: ScrollableViewTouchendEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchmove(name: touchmove, event: ScrollableViewTouchmoveEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchstart(name: touchstart, event: ScrollableViewTouchstartEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_twofingertap(name: twofingertap, event: ScrollableViewTwofingertapEvent): Unit = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ScrollableView.cacheSize> property.
  			 * @deprecated Access <Titanium.UI.ScrollableView.cacheSize> instead.
  			 */
  def getCacheSize(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ScrollableView.clipViews> property.
  			 * @deprecated Access <Titanium.UI.ScrollableView.clipViews> instead.
  			 */
  def getClipViews(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ScrollableView.currentPage> property.
  			 * @deprecated Access <Titanium.UI.ScrollableView.currentPage> instead.
  			 */
  def getCurrentPage(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ScrollableView.currentPageIndicatorColor> property.
  			 * @deprecated Access <Titanium.UI.ScrollableView.currentPageIndicatorColor> instead.
  			 */
  def getCurrentPageIndicatorColor(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ScrollableView.disableBounce> property.
  			 * @deprecated Access <Titanium.UI.ScrollableView.disableBounce> instead.
  			 */
  def getDisableBounce(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ScrollableView.hitRect> property.
  			 * @deprecated Access <Titanium.UI.ScrollableView.hitRect> instead.
  			 */
  def getHitRect(): Dimension = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ScrollableView.overScrollMode> property.
  			 * @deprecated Access <Titanium.UI.ScrollableView.overScrollMode> instead.
  			 */
  def getOverScrollMode(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ScrollableView.overlayEnabled> property.
  			 * @deprecated Access <Titanium.UI.ScrollableView.overlayEnabled> instead.
  			 */
  def getOverlayEnabled(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ScrollableView.padding> property.
  			 * @deprecated Access <Titanium.UI.ScrollableView.padding> instead.
  			 */
  def getPadding(): Padding = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ScrollableView.pageIndicatorColor> property.
  			 * @deprecated Access <Titanium.UI.ScrollableView.pageIndicatorColor> instead.
  			 */
  def getPageIndicatorColor(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ScrollableView.pagingControlAlpha> property.
  			 * @deprecated Access <Titanium.UI.ScrollableView.pagingControlAlpha> instead.
  			 */
  def getPagingControlAlpha(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ScrollableView.pagingControlColor> property.
  			 * @deprecated Access <Titanium.UI.ScrollableView.pagingControlColor> instead.
  			 */
  def getPagingControlColor(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ScrollableView.pagingControlHeight> property.
  			 * @deprecated Access <Titanium.UI.ScrollableView.pagingControlHeight> instead.
  			 */
  def getPagingControlHeight(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ScrollableView.pagingControlOnTop> property.
  			 * @deprecated Access <Titanium.UI.ScrollableView.pagingControlOnTop> instead.
  			 */
  def getPagingControlOnTop(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ScrollableView.pagingControlTimeout> property.
  			 * @deprecated Access <Titanium.UI.ScrollableView.pagingControlTimeout> instead.
  			 */
  def getPagingControlTimeout(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ScrollableView.scrollingEnabled> property.
  			 * @deprecated Access <Titanium.UI.ScrollableView.scrollingEnabled> instead.
  			 */
  def getScrollingEnabled(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ScrollableView.showPagingControl> property.
  			 * @deprecated Access <Titanium.UI.ScrollableView.showPagingControl> instead.
  			 */
  def getShowPagingControl(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ScrollableView.views> property.
  			 * @deprecated Access <Titanium.UI.ScrollableView.views> instead.
  			 */
  def getViews(): js.Array[View] = js.native
  /**
  			 * Inserts views at the specified position in the [views](Titanium.UI.ScrollableView.views) array.
  			 */
  def insertViewsAt(position: Double, views: js.Array[View]): Unit = js.native
  /**
  			 * Sets the current page to the next consecutive page in <Titanium.UI.ScrollableView.views>.
  			 */
  def moveNext(): Unit = js.native
  /**
  			 * Sets the current page to the previous consecutive page in <Titanium.UI.ScrollableView.views>.
  			 */
  def movePrevious(): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragend(
    name: dragend_,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ ScrollableViewDragendEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_scroll(
    name: scroll,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ ScrollableViewScrollEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_scrollend(
    name: scrollend,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ ScrollableViewScrollendEvent, Unit]
  ): Unit = js.native
  /**
  			 * Removes an existing page from this Scrollable View.
  			 */
  def removeView(view: Double): Unit = js.native
  def removeView(view: View): Unit = js.native
  /**
  			 * Scrolls to the specified page in <Titanium.UI.ScrollableView.views>.
  			 */
  def scrollToView(view: Double): Unit = js.native
  def scrollToView(view: View): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ScrollableView.cacheSize> property.
  			 * @deprecated Set the value using <Titanium.UI.ScrollableView.cacheSize> instead.
  			 */
  def setCacheSize(cacheSize: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ScrollableView.clipViews> property.
  			 * @deprecated Set the value using <Titanium.UI.ScrollableView.clipViews> instead.
  			 */
  def setClipViews(clipViews: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ScrollableView.currentPage> property.
  			 * @deprecated Set the value using <Titanium.UI.ScrollableView.currentPage> instead.
  			 */
  def setCurrentPage(currentPage: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ScrollableView.currentPageIndicatorColor> property.
  			 * @deprecated Set the value using <Titanium.UI.ScrollableView.currentPageIndicatorColor> instead.
  			 */
  def setCurrentPageIndicatorColor(currentPageIndicatorColor: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ScrollableView.disableBounce> property.
  			 * @deprecated Set the value using <Titanium.UI.ScrollableView.disableBounce> instead.
  			 */
  def setDisableBounce(disableBounce: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ScrollableView.hitRect> property.
  			 * @deprecated Set the value using <Titanium.UI.ScrollableView.hitRect> instead.
  			 */
  def setHitRect(hitRect: Dimension): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ScrollableView.overScrollMode> property.
  			 * @deprecated Set the value using <Titanium.UI.ScrollableView.overScrollMode> instead.
  			 */
  def setOverScrollMode(overScrollMode: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ScrollableView.overlayEnabled> property.
  			 * @deprecated Set the value using <Titanium.UI.ScrollableView.overlayEnabled> instead.
  			 */
  def setOverlayEnabled(overlayEnabled: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ScrollableView.padding> property.
  			 * @deprecated Set the value using <Titanium.UI.ScrollableView.padding> instead.
  			 */
  def setPadding(padding: Padding): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ScrollableView.pageIndicatorColor> property.
  			 * @deprecated Set the value using <Titanium.UI.ScrollableView.pageIndicatorColor> instead.
  			 */
  def setPageIndicatorColor(pageIndicatorColor: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ScrollableView.pagingControlAlpha> property.
  			 * @deprecated Set the value using <Titanium.UI.ScrollableView.pagingControlAlpha> instead.
  			 */
  def setPagingControlAlpha(pagingControlAlpha: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ScrollableView.pagingControlColor> property.
  			 * @deprecated Set the value using <Titanium.UI.ScrollableView.pagingControlColor> instead.
  			 */
  def setPagingControlColor(pagingControlColor: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ScrollableView.pagingControlHeight> property.
  			 * @deprecated Set the value using <Titanium.UI.ScrollableView.pagingControlHeight> instead.
  			 */
  def setPagingControlHeight(pagingControlHeight: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ScrollableView.pagingControlOnTop> property.
  			 * @deprecated Set the value using <Titanium.UI.ScrollableView.pagingControlOnTop> instead.
  			 */
  def setPagingControlOnTop(pagingControlOnTop: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ScrollableView.pagingControlTimeout> property.
  			 * @deprecated Set the value using <Titanium.UI.ScrollableView.pagingControlTimeout> instead.
  			 */
  def setPagingControlTimeout(pagingControlTimeout: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ScrollableView.scrollingEnabled> property.
  			 * @deprecated Set the value using <Titanium.UI.ScrollableView.scrollingEnabled> instead.
  			 */
  def setScrollingEnabled(scrollingEnabled: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ScrollableView.showPagingControl> property.
  			 * @deprecated Set the value using <Titanium.UI.ScrollableView.showPagingControl> instead.
  			 */
  def setShowPagingControl(showPagingControl: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ScrollableView.views> property.
  			 * @deprecated Set the value using <Titanium.UI.ScrollableView.views> instead.
  			 */
  def setViews(views: js.Array[View]): Unit = js.native
}

