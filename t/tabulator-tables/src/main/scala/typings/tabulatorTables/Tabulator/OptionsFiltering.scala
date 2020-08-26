package typings.tabulatorTables.Tabulator

import typings.tabulatorTables.anon.PickFilterfieldvalue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionsFiltering extends js.Object {
  /** The dataFiltered callback is triggered after the table dataset is filtered. */
  var dataFiltered: js.UndefOr[
    js.Function2[/* filters */ js.Array[Filter], /* rows */ js.Array[RowComponent], Unit]
  ] = js.native
  /** The dataFiltering callback is triggered whenever a filter event occurs, before the filter happens. */
  var dataFiltering: js.UndefOr[js.Function1[/* filters */ js.Array[Filter], Unit]] = js.native
  /**When using real time header filtering, Tabulator will wait 300 miliseconds after a keystroke before triggering the filter. You can customise this delay by using the headerFilterLiveFilterDelay table setup option */
  var headerFilterLiveFilterDelay: js.UndefOr[Double] = js.native
  /** Array of filters to be applied on load.     */
  var initialFilter: js.UndefOr[js.Array[Filter]] = js.native
  /** array of initial values for header filters.     */
  var initialHeaderFilter: js.UndefOr[js.Array[PickFilterfieldvalue]] = js.native
}

object OptionsFiltering {
  @scala.inline
  def apply(): OptionsFiltering = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsFiltering]
  }
  @scala.inline
  implicit class OptionsFilteringOps[Self <: OptionsFiltering] (val x: Self) extends AnyVal {
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
    def setDataFiltered(value: (/* filters */ js.Array[Filter], /* rows */ js.Array[RowComponent]) => Unit): Self = this.set("dataFiltered", js.Any.fromFunction2(value))
    @scala.inline
    def deleteDataFiltered: Self = this.set("dataFiltered", js.undefined)
    @scala.inline
    def setDataFiltering(value: /* filters */ js.Array[Filter] => Unit): Self = this.set("dataFiltering", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDataFiltering: Self = this.set("dataFiltering", js.undefined)
    @scala.inline
    def setHeaderFilterLiveFilterDelay(value: Double): Self = this.set("headerFilterLiveFilterDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderFilterLiveFilterDelay: Self = this.set("headerFilterLiveFilterDelay", js.undefined)
    @scala.inline
    def setInitialFilterVarargs(value: Filter*): Self = this.set("initialFilter", js.Array(value :_*))
    @scala.inline
    def setInitialFilter(value: js.Array[Filter]): Self = this.set("initialFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialFilter: Self = this.set("initialFilter", js.undefined)
    @scala.inline
    def setInitialHeaderFilterVarargs(value: PickFilterfieldvalue*): Self = this.set("initialHeaderFilter", js.Array(value :_*))
    @scala.inline
    def setInitialHeaderFilter(value: js.Array[PickFilterfieldvalue]): Self = this.set("initialHeaderFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialHeaderFilter: Self = this.set("initialHeaderFilter", js.undefined)
  }
  
}

