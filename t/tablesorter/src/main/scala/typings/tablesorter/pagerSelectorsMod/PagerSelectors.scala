package typings.tablesorter.pagerSelectorsMod

import typings.jquery.JQuery.Selector
import typings.tablesorter.mod.global.HTMLElement
import typings.tablesorter.mod.global.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PagerSelectors extends js.Object {
  /**
    * The selector for querying the pager-container.
    */
  var container: js.UndefOr[Selector | JQuery[HTMLElement]] = js.native
  /**
    * The selector for querying the control to jump to the first page.
    */
  var first: js.UndefOr[Selector | JQuery[HTMLElement]] = js.native
  /**
    * The selector for querying the dropdown-control to jump to a specific page.
    */
  var gotoPage: js.UndefOr[Selector | JQuery[HTMLElement]] = js.native
  /**
    * The selector for querying the control to jump to the last page.
    */
  var last: js.UndefOr[Selector | JQuery[HTMLElement]] = js.native
  /**
    * The selector for querying the control to jump to the next page.
    */
  var next: js.UndefOr[Selector | JQuery[HTMLElement]] = js.native
  /**
    * The selector for querying the container to print the output to.
    */
  var pageDisplay: js.UndefOr[Selector | JQuery[HTMLElement]] = js.native
  /**
    * The selector for querying the control to set the page-size.
    */
  var pageSize: js.UndefOr[Selector | JQuery[HTMLElement]] = js.native
  /**
    * The selector for querying the control to jump to the previous page.
    */
  var prev: js.UndefOr[Selector | JQuery[HTMLElement]] = js.native
}

object PagerSelectors {
  @scala.inline
  def apply(): PagerSelectors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PagerSelectors]
  }
  @scala.inline
  implicit class PagerSelectorsOps[Self <: PagerSelectors] (val x: Self) extends AnyVal {
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
    def setContainer(value: Selector | JQuery[HTMLElement]): Self = this.set("container", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    @scala.inline
    def setFirst(value: Selector | JQuery[HTMLElement]): Self = this.set("first", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirst: Self = this.set("first", js.undefined)
    @scala.inline
    def setGotoPage(value: Selector | JQuery[HTMLElement]): Self = this.set("gotoPage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGotoPage: Self = this.set("gotoPage", js.undefined)
    @scala.inline
    def setLast(value: Selector | JQuery[HTMLElement]): Self = this.set("last", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLast: Self = this.set("last", js.undefined)
    @scala.inline
    def setNext(value: Selector | JQuery[HTMLElement]): Self = this.set("next", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNext: Self = this.set("next", js.undefined)
    @scala.inline
    def setPageDisplay(value: Selector | JQuery[HTMLElement]): Self = this.set("pageDisplay", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageDisplay: Self = this.set("pageDisplay", js.undefined)
    @scala.inline
    def setPageSize(value: Selector | JQuery[HTMLElement]): Self = this.set("pageSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageSize: Self = this.set("pageSize", js.undefined)
    @scala.inline
    def setPrev(value: Selector | JQuery[HTMLElement]): Self = this.set("prev", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrev: Self = this.set("prev", js.undefined)
  }
  
}

