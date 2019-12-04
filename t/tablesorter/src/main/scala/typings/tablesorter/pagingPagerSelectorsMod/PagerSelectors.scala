package typings.tablesorter.pagingPagerSelectorsMod

import typings.jquery.JQuery.Selector
import typings.tablesorter.tablesorterMod._Global_.HTMLElement
import typings.tablesorter.tablesorterMod._Global_.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PagerSelectors extends js.Object {
  /**
    * The selector for querying the pager-container.
    */
  var container: js.UndefOr[Selector | JQuery[HTMLElement]] = js.undefined
  /**
    * The selector for querying the control to jump to the first page.
    */
  var first: js.UndefOr[Selector | JQuery[HTMLElement]] = js.undefined
  /**
    * The selector for querying the dropdown-control to jump to a specific page.
    */
  var gotoPage: js.UndefOr[Selector | JQuery[HTMLElement]] = js.undefined
  /**
    * The selector for querying the control to jump to the last page.
    */
  var last: js.UndefOr[Selector | JQuery[HTMLElement]] = js.undefined
  /**
    * The selector for querying the control to jump to the next page.
    */
  var next: js.UndefOr[Selector | JQuery[HTMLElement]] = js.undefined
  /**
    * The selector for querying the container to print the output to.
    */
  var pageDisplay: js.UndefOr[Selector | JQuery[HTMLElement]] = js.undefined
  /**
    * The selector for querying the control to set the page-size.
    */
  var pageSize: js.UndefOr[Selector | JQuery[HTMLElement]] = js.undefined
  /**
    * The selector for querying the control to jump to the previous page.
    */
  var prev: js.UndefOr[Selector | JQuery[HTMLElement]] = js.undefined
}

object PagerSelectors {
  @scala.inline
  def apply(
    container: Selector | JQuery[HTMLElement] = null,
    first: Selector | JQuery[HTMLElement] = null,
    gotoPage: Selector | JQuery[HTMLElement] = null,
    last: Selector | JQuery[HTMLElement] = null,
    next: Selector | JQuery[HTMLElement] = null,
    pageDisplay: Selector | JQuery[HTMLElement] = null,
    pageSize: Selector | JQuery[HTMLElement] = null,
    prev: Selector | JQuery[HTMLElement] = null
  ): PagerSelectors = {
    val __obj = js.Dynamic.literal()
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (first != null) __obj.updateDynamic("first")(first.asInstanceOf[js.Any])
    if (gotoPage != null) __obj.updateDynamic("gotoPage")(gotoPage.asInstanceOf[js.Any])
    if (last != null) __obj.updateDynamic("last")(last.asInstanceOf[js.Any])
    if (next != null) __obj.updateDynamic("next")(next.asInstanceOf[js.Any])
    if (pageDisplay != null) __obj.updateDynamic("pageDisplay")(pageDisplay.asInstanceOf[js.Any])
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (prev != null) __obj.updateDynamic("prev")(prev.asInstanceOf[js.Any])
    __obj.asInstanceOf[PagerSelectors]
  }
}

