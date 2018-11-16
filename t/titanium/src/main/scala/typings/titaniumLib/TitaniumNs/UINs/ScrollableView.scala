package typings
package titaniumLib.TitaniumNs.UINs

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
  var cacheSize: scala.Double = js.native
  /**
  			 * Determines whether the previous and next pages are clipped, so that they are not visible
  			 * adjacent to the current page.
  			 */
  var clipViews: scala.Boolean = js.native
  /**
  			 * Index of the active page.
  			 */
  var currentPage: scala.Double = js.native
  /**
  			 * Color for the current page of the paging control, as a color name or hex triplet.
  			 */
  var currentPageIndicatorColor: java.lang.String = js.native
  /**
  			 * Determines whether page bouncing effect is disabled.
  			 */
  var disableBounce: scala.Boolean = js.native
  /**
  			 * Sets the region where this view responds to gestures.
  			 */
  var hitRect: titaniumLib.Dimension = js.native
  /**
  			 * Determines the behavior when the user overscolls the view.
  			 */
  var overScrollMode: scala.Double = js.native
  /**
  			 * Determines whether the paging control is added as an overlay to the view.
  			 */
  var overlayEnabled: scala.Boolean = js.native
  /**
  			 * Color of the paging control, as a color name or hex triplet.
  			 */
  var pageIndicatorColor: java.lang.String = js.native
  /**
  			 * Alpha value of the paging control.
  			 */
  var pagingControlAlpha: scala.Double = js.native
  /**
  			 * Color of the paging control, as a color name or hex triplet.
  			 */
  var pagingControlColor: java.lang.String = js.native
  /**
  			 * Height of the paging control, in pixels.
  			 */
  var pagingControlHeight: scala.Double = js.native
  /**
  			 * Determines whether the paging control is displayed at the top or bottom of the view.
  			 */
  var pagingControlOnTop: scala.Boolean = js.native
  /**
  			 * Number of milliseconds to wait before hiding the paging control.
  			 */
  var pagingControlTimeout: scala.Double = js.native
  /**
  			 * Determines whether scrolling is enabled for the view.
  			 */
  var scrollingEnabled: scala.Boolean = js.native
  /**
  			 * Determines whether the paging control is visible.
  			 */
  var showPagingControl: scala.Boolean = js.native
  /**
  			 * Sets the pages within this Scrollable View.
  			 */
  var views: js.Array[View] = js.native
  /**
  			 * Adds a new page to this Scrollable View.
  			 */
  def addView(view: js.Any): scala.Unit = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ScrollableView.cacheSize> property.
  			 */
  def getCacheSize(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ScrollableView.clipViews> property.
  			 */
  def getClipViews(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ScrollableView.currentPage> property.
  			 */
  def getCurrentPage(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ScrollableView.currentPageIndicatorColor> property.
  			 */
  def getCurrentPageIndicatorColor(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ScrollableView.disableBounce> property.
  			 */
  def getDisableBounce(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ScrollableView.hitRect> property.
  			 */
  def getHitRect(): titaniumLib.Dimension = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ScrollableView.overScrollMode> property.
  			 */
  def getOverScrollMode(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ScrollableView.overlayEnabled> property.
  			 */
  def getOverlayEnabled(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ScrollableView.pageIndicatorColor> property.
  			 */
  def getPageIndicatorColor(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ScrollableView.pagingControlAlpha> property.
  			 */
  def getPagingControlAlpha(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ScrollableView.pagingControlColor> property.
  			 */
  def getPagingControlColor(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ScrollableView.pagingControlHeight> property.
  			 */
  def getPagingControlHeight(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ScrollableView.pagingControlOnTop> property.
  			 */
  def getPagingControlOnTop(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ScrollableView.pagingControlTimeout> property.
  			 */
  def getPagingControlTimeout(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ScrollableView.scrollingEnabled> property.
  			 */
  def getScrollingEnabled(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ScrollableView.showPagingControl> property.
  			 */
  def getShowPagingControl(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ScrollableView.views> property.
  			 */
  def getViews(): js.Array[View] = js.native
  /**
  			 * Inserts views at the specified position in the [views](Titanium.UI.ScrollableView.views) array.
  			 */
  def insertViewsAt(position: scala.Double, views: js.Array[_]): scala.Unit = js.native
  /**
  			 * Sets the current page to the next consecutive page in <Titanium.UI.ScrollableView.views>.
  			 */
  def moveNext(): scala.Unit = js.native
  /**
  			 * Sets the current page to the previous consecutive page in <Titanium.UI.ScrollableView.views>.
  			 */
  def movePrevious(): scala.Unit = js.native
  /**
  			 * Removes an existing page from this Scrollable View.
  			 */
  def removeView(view: js.Any): scala.Unit = js.native
  /**
  			 * Removes an existing page from this Scrollable View.
  			 */
  def removeView(view: scala.Double): scala.Unit = js.native
  /**
  			 * Scrolls to the specified page in <Titanium.UI.ScrollableView.views>.
  			 */
  def scrollToView(view: js.Any): scala.Unit = js.native
  /**
  			 * Scrolls to the specified page in <Titanium.UI.ScrollableView.views>.
  			 */
  def scrollToView(view: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ScrollableView.cacheSize> property.
  			 */
  def setCacheSize(cacheSize: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ScrollableView.clipViews> property.
  			 */
  def setClipViews(clipViews: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ScrollableView.currentPage> property.
  			 */
  def setCurrentPage(currentPage: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ScrollableView.currentPageIndicatorColor> property.
  			 */
  def setCurrentPageIndicatorColor(currentPageIndicatorColor: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ScrollableView.disableBounce> property.
  			 */
  def setDisableBounce(disableBounce: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ScrollableView.hitRect> property.
  			 */
  def setHitRect(hitRect: titaniumLib.Dimension): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ScrollableView.overScrollMode> property.
  			 */
  def setOverScrollMode(overScrollMode: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ScrollableView.overlayEnabled> property.
  			 */
  def setOverlayEnabled(overlayEnabled: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ScrollableView.pageIndicatorColor> property.
  			 */
  def setPageIndicatorColor(pageIndicatorColor: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ScrollableView.pagingControlAlpha> property.
  			 */
  def setPagingControlAlpha(pagingControlAlpha: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ScrollableView.pagingControlColor> property.
  			 */
  def setPagingControlColor(pagingControlColor: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ScrollableView.pagingControlHeight> property.
  			 */
  def setPagingControlHeight(pagingControlHeight: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ScrollableView.pagingControlOnTop> property.
  			 */
  def setPagingControlOnTop(pagingControlOnTop: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ScrollableView.pagingControlTimeout> property.
  			 */
  def setPagingControlTimeout(pagingControlTimeout: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ScrollableView.scrollingEnabled> property.
  			 */
  def setScrollingEnabled(scrollingEnabled: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ScrollableView.showPagingControl> property.
  			 */
  def setShowPagingControl(showPagingControl: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ScrollableView.views> property.
  			 */
  def setViews(views: js.Array[_]): scala.Unit = js.native
}

