package typings.tablesorter.stickyHeaderOptionsMod

import typings.jquery.JQuery.Selector
import typings.tablesorter.mod.global.HTMLElement
import typings.tablesorter.mod.global.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StickyHeaderOptions extends js.Object {
  /**
    * A set of classes to add to the sticky header.
    */
  var stickyHeaders: js.UndefOr[String] = js.native
  /**
    * A value indicating whether the table should be resized automatically when data is added to or removed from the table.
    */
  var stickyHeaders_addResizeEvent: js.UndefOr[Boolean] = js.native
  /**
    * A jQuery-selector to get an element to append the sticky header to.
    */
  var stickyHeaders_appendTo: js.UndefOr[Selector | JQuery[HTMLElement]] = js.native
  /**
    * A jQuery-selector to get an element to attach the sticky header to.
    */
  var stickyHeaders_attachTo: js.UndefOr[Selector | JQuery[HTMLElement]] = js.native
  /**
    * A string to append to the table-id for the cloned sticky table.
    */
  var stickyHeaders_cloneId: js.UndefOr[String] = js.native
  /**
    * A value indicating whether the filter should be scrolled into view when inputing a filter.
    */
  var stickyHeaders_filteredToTop: js.UndefOr[Boolean] = js.native
  /**
    * A value indicating whether the caption should be included in the sticky header.
    */
  var stickyHeaders_includeCaption: js.UndefOr[Boolean] = js.native
  /**
    * Either a number of the offset to the top of the browser-window or a jQuery-selector or -object for the elemtn which represents the offset.
    */
  var stickyHeaders_offset: js.UndefOr[Double | Selector | JQuery[HTMLElement]] = js.native
  /**
    * The jQuery-selector or -object to monitor for horizontal scrolling.
    */
  var stickyHeaders_xScroll: js.UndefOr[Selector | JQuery[HTMLElement]] = js.native
  /**
    * The jQuery-selector or -object to monitor for vertical scrolling.
    */
  var stickyHeaders_yScroll: js.UndefOr[Selector | JQuery[HTMLElement]] = js.native
  /**
    * The z-index of the sticky header.
    */
  var stickyHeaders_zindex: js.UndefOr[Double] = js.native
}

object StickyHeaderOptions {
  @scala.inline
  def apply(): StickyHeaderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StickyHeaderOptions]
  }
  @scala.inline
  implicit class StickyHeaderOptionsOps[Self <: StickyHeaderOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setStickyHeaders(value: String): Self = this.set("stickyHeaders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStickyHeaders: Self = this.set("stickyHeaders", js.undefined)
    @scala.inline
    def setStickyHeaders_addResizeEvent(value: Boolean): Self = this.set("stickyHeaders_addResizeEvent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStickyHeaders_addResizeEvent: Self = this.set("stickyHeaders_addResizeEvent", js.undefined)
    @scala.inline
    def setStickyHeaders_appendTo(value: Selector | JQuery[HTMLElement]): Self = this.set("stickyHeaders_appendTo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStickyHeaders_appendTo: Self = this.set("stickyHeaders_appendTo", js.undefined)
    @scala.inline
    def setStickyHeaders_attachTo(value: Selector | JQuery[HTMLElement]): Self = this.set("stickyHeaders_attachTo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStickyHeaders_attachTo: Self = this.set("stickyHeaders_attachTo", js.undefined)
    @scala.inline
    def setStickyHeaders_cloneId(value: String): Self = this.set("stickyHeaders_cloneId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStickyHeaders_cloneId: Self = this.set("stickyHeaders_cloneId", js.undefined)
    @scala.inline
    def setStickyHeaders_filteredToTop(value: Boolean): Self = this.set("stickyHeaders_filteredToTop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStickyHeaders_filteredToTop: Self = this.set("stickyHeaders_filteredToTop", js.undefined)
    @scala.inline
    def setStickyHeaders_includeCaption(value: Boolean): Self = this.set("stickyHeaders_includeCaption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStickyHeaders_includeCaption: Self = this.set("stickyHeaders_includeCaption", js.undefined)
    @scala.inline
    def setStickyHeaders_offset(value: Double | Selector | JQuery[HTMLElement]): Self = this.set("stickyHeaders_offset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStickyHeaders_offset: Self = this.set("stickyHeaders_offset", js.undefined)
    @scala.inline
    def setStickyHeaders_xScroll(value: Selector | JQuery[HTMLElement]): Self = this.set("stickyHeaders_xScroll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStickyHeaders_xScroll: Self = this.set("stickyHeaders_xScroll", js.undefined)
    @scala.inline
    def setStickyHeaders_yScroll(value: Selector | JQuery[HTMLElement]): Self = this.set("stickyHeaders_yScroll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStickyHeaders_yScroll: Self = this.set("stickyHeaders_yScroll", js.undefined)
    @scala.inline
    def setStickyHeaders_zindex(value: Double): Self = this.set("stickyHeaders_zindex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStickyHeaders_zindex: Self = this.set("stickyHeaders_zindex", js.undefined)
  }
  
}

