package typings.titanium.TitaniumNs.UINs

import typings.titanium.Dimension
import typings.titanium.ViewPadding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * A view that encapsulates a horizontally-scrolling set of child views, known as pages, navigable
		 * using its built-in horizontal swipe gestures.
		 */
@js.native
trait ScrollableView extends View {
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
  var padding: ViewPadding = js.native
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
  /**
  			 * Adds a new page to this Scrollable View.
  			 */
  def addView(view: js.Any): Unit = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ScrollableView.cacheSize> property.
  			 */
  def getCacheSize(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ScrollableView.clipViews> property.
  			 */
  def getClipViews(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ScrollableView.currentPage> property.
  			 */
  def getCurrentPage(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ScrollableView.currentPageIndicatorColor> property.
  			 */
  def getCurrentPageIndicatorColor(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ScrollableView.disableBounce> property.
  			 */
  def getDisableBounce(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ScrollableView.hitRect> property.
  			 */
  def getHitRect(): Dimension = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ScrollableView.overScrollMode> property.
  			 */
  def getOverScrollMode(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ScrollableView.overlayEnabled> property.
  			 */
  def getOverlayEnabled(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ScrollableView.padding> property.
  			 */
  def getPadding(): ViewPadding = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ScrollableView.pageIndicatorColor> property.
  			 */
  def getPageIndicatorColor(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ScrollableView.pagingControlAlpha> property.
  			 */
  def getPagingControlAlpha(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ScrollableView.pagingControlColor> property.
  			 */
  def getPagingControlColor(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ScrollableView.pagingControlHeight> property.
  			 */
  def getPagingControlHeight(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ScrollableView.pagingControlOnTop> property.
  			 */
  def getPagingControlOnTop(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ScrollableView.pagingControlTimeout> property.
  			 */
  def getPagingControlTimeout(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ScrollableView.scrollingEnabled> property.
  			 */
  def getScrollingEnabled(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ScrollableView.showPagingControl> property.
  			 */
  def getShowPagingControl(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ScrollableView.views> property.
  			 */
  def getViews(): js.Array[View] = js.native
  /**
  			 * Inserts views at the specified position in the [views](Titanium.UI.ScrollableView.views) array.
  			 */
  def insertViewsAt(position: Double, views: js.Array[_]): Unit = js.native
  /**
  			 * Sets the current page to the next consecutive page in <Titanium.UI.ScrollableView.views>.
  			 */
  def moveNext(): Unit = js.native
  /**
  			 * Sets the current page to the previous consecutive page in <Titanium.UI.ScrollableView.views>.
  			 */
  def movePrevious(): Unit = js.native
  /**
  			 * Removes an existing page from this Scrollable View.
  			 */
  def removeView(view: js.Any): Unit = js.native
  /**
  			 * Removes an existing page from this Scrollable View.
  			 */
  def removeView(view: Double): Unit = js.native
  /**
  			 * Scrolls to the specified page in <Titanium.UI.ScrollableView.views>.
  			 */
  def scrollToView(view: js.Any): Unit = js.native
  /**
  			 * Scrolls to the specified page in <Titanium.UI.ScrollableView.views>.
  			 */
  def scrollToView(view: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ScrollableView.cacheSize> property.
  			 */
  def setCacheSize(cacheSize: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ScrollableView.clipViews> property.
  			 */
  def setClipViews(clipViews: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ScrollableView.currentPage> property.
  			 */
  def setCurrentPage(currentPage: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ScrollableView.currentPageIndicatorColor> property.
  			 */
  def setCurrentPageIndicatorColor(currentPageIndicatorColor: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ScrollableView.disableBounce> property.
  			 */
  def setDisableBounce(disableBounce: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ScrollableView.hitRect> property.
  			 */
  def setHitRect(hitRect: Dimension): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ScrollableView.overScrollMode> property.
  			 */
  def setOverScrollMode(overScrollMode: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ScrollableView.overlayEnabled> property.
  			 */
  def setOverlayEnabled(overlayEnabled: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ScrollableView.padding> property.
  			 */
  def setPadding(padding: ViewPadding): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ScrollableView.pageIndicatorColor> property.
  			 */
  def setPageIndicatorColor(pageIndicatorColor: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ScrollableView.pagingControlAlpha> property.
  			 */
  def setPagingControlAlpha(pagingControlAlpha: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ScrollableView.pagingControlColor> property.
  			 */
  def setPagingControlColor(pagingControlColor: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ScrollableView.pagingControlHeight> property.
  			 */
  def setPagingControlHeight(pagingControlHeight: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ScrollableView.pagingControlOnTop> property.
  			 */
  def setPagingControlOnTop(pagingControlOnTop: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ScrollableView.pagingControlTimeout> property.
  			 */
  def setPagingControlTimeout(pagingControlTimeout: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ScrollableView.scrollingEnabled> property.
  			 */
  def setScrollingEnabled(scrollingEnabled: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ScrollableView.showPagingControl> property.
  			 */
  def setShowPagingControl(showPagingControl: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ScrollableView.views> property.
  			 */
  def setViews(views: js.Array[_]): Unit = js.native
}

