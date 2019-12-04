package typings.tablesorter.widgetsStickyHeaderOptionsMod

import typings.jquery.JQuery.Selector
import typings.tablesorter.tablesorterMod._Global_.HTMLElement
import typings.tablesorter.tablesorterMod._Global_.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StickyHeaderOptions extends js.Object {
  /**
    * A set of classes to add to the sticky header.
    */
  var stickyHeaders: js.UndefOr[String] = js.undefined
  /**
    * A value indicating whether the table should be resized automatically when data is added to or removed from the table.
    */
  var stickyHeaders_addResizeEvent: js.UndefOr[Boolean] = js.undefined
  /**
    * A jQuery-selector to get an element to append the sticky header to.
    */
  var stickyHeaders_appendTo: js.UndefOr[Selector | JQuery[HTMLElement]] = js.undefined
  /**
    * A jQuery-selector to get an element to attach the sticky header to.
    */
  var stickyHeaders_attachTo: js.UndefOr[Selector | JQuery[HTMLElement]] = js.undefined
  /**
    * A string to append to the table-id for the cloned sticky table.
    */
  var stickyHeaders_cloneId: js.UndefOr[String] = js.undefined
  /**
    * A value indicating whether the filter should be scrolled into view when inputing a filter.
    */
  var stickyHeaders_filteredToTop: js.UndefOr[Boolean] = js.undefined
  /**
    * A value indicating whether the caption should be included in the sticky header.
    */
  var stickyHeaders_includeCaption: js.UndefOr[Boolean] = js.undefined
  /**
    * Either a number of the offset to the top of the browser-window or a jQuery-selector or -object for the elemtn which represents the offset.
    */
  var stickyHeaders_offset: js.UndefOr[Double | Selector | JQuery[HTMLElement]] = js.undefined
  /**
    * The jQuery-selector or -object to monitor for horizontal scrolling.
    */
  var stickyHeaders_xScroll: js.UndefOr[Selector | JQuery[HTMLElement]] = js.undefined
  /**
    * The jQuery-selector or -object to monitor for vertical scrolling.
    */
  var stickyHeaders_yScroll: js.UndefOr[Selector | JQuery[HTMLElement]] = js.undefined
  /**
    * The z-index of the sticky header.
    */
  var stickyHeaders_zindex: js.UndefOr[Double] = js.undefined
}

object StickyHeaderOptions {
  @scala.inline
  def apply(
    stickyHeaders: String = null,
    stickyHeaders_addResizeEvent: js.UndefOr[Boolean] = js.undefined,
    stickyHeaders_appendTo: Selector | JQuery[HTMLElement] = null,
    stickyHeaders_attachTo: Selector | JQuery[HTMLElement] = null,
    stickyHeaders_cloneId: String = null,
    stickyHeaders_filteredToTop: js.UndefOr[Boolean] = js.undefined,
    stickyHeaders_includeCaption: js.UndefOr[Boolean] = js.undefined,
    stickyHeaders_offset: Double | Selector | JQuery[HTMLElement] = null,
    stickyHeaders_xScroll: Selector | JQuery[HTMLElement] = null,
    stickyHeaders_yScroll: Selector | JQuery[HTMLElement] = null,
    stickyHeaders_zindex: Int | Double = null
  ): StickyHeaderOptions = {
    val __obj = js.Dynamic.literal()
    if (stickyHeaders != null) __obj.updateDynamic("stickyHeaders")(stickyHeaders.asInstanceOf[js.Any])
    if (!js.isUndefined(stickyHeaders_addResizeEvent)) __obj.updateDynamic("stickyHeaders_addResizeEvent")(stickyHeaders_addResizeEvent.asInstanceOf[js.Any])
    if (stickyHeaders_appendTo != null) __obj.updateDynamic("stickyHeaders_appendTo")(stickyHeaders_appendTo.asInstanceOf[js.Any])
    if (stickyHeaders_attachTo != null) __obj.updateDynamic("stickyHeaders_attachTo")(stickyHeaders_attachTo.asInstanceOf[js.Any])
    if (stickyHeaders_cloneId != null) __obj.updateDynamic("stickyHeaders_cloneId")(stickyHeaders_cloneId.asInstanceOf[js.Any])
    if (!js.isUndefined(stickyHeaders_filteredToTop)) __obj.updateDynamic("stickyHeaders_filteredToTop")(stickyHeaders_filteredToTop.asInstanceOf[js.Any])
    if (!js.isUndefined(stickyHeaders_includeCaption)) __obj.updateDynamic("stickyHeaders_includeCaption")(stickyHeaders_includeCaption.asInstanceOf[js.Any])
    if (stickyHeaders_offset != null) __obj.updateDynamic("stickyHeaders_offset")(stickyHeaders_offset.asInstanceOf[js.Any])
    if (stickyHeaders_xScroll != null) __obj.updateDynamic("stickyHeaders_xScroll")(stickyHeaders_xScroll.asInstanceOf[js.Any])
    if (stickyHeaders_yScroll != null) __obj.updateDynamic("stickyHeaders_yScroll")(stickyHeaders_yScroll.asInstanceOf[js.Any])
    if (stickyHeaders_zindex != null) __obj.updateDynamic("stickyHeaders_zindex")(stickyHeaders_zindex.asInstanceOf[js.Any])
    __obj.asInstanceOf[StickyHeaderOptions]
  }
}

