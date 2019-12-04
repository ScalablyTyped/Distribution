package typings.tablesorter

import typings.jquery.JQuery.jqXHR
import typings.tablesorter.pagingPagerDataPartMod.PagerDataPart
import typings.tablesorter.tablesorterMod._Global_.HTMLElement
import typings.tablesorter.tablesorterMod._Global_.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tablesorter/Paging/AjaxDataProcessor", JSImport.Namespace)
@js.native
object pagingAjaxDataProcessorMod extends js.Object {
  type AjaxDataProcessor[TElement] = js.Function3[
    /* data */ js.Any, 
    /* table */ TElement, 
    /* request */ jqXHR[js.Any], 
    PagerDataPart[TElement] | js.Array[Double] | (js.Tuple3[
      Double, 
      JQuery[HTMLElement] | js.Array[js.Array[js.Any]], 
      js.UndefOr[js.Array[String]]
    ])
  ]
}

