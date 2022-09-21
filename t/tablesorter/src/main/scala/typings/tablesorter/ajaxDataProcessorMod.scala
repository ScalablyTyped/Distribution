package typings.tablesorter

import typings.jquery.JQuery.jqXHR
import typings.tablesorter.mod.global.HTMLElement
import typings.tablesorter.mod.global.JQuery
import typings.tablesorter.pagerDataPartMod.PagerDataPart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ajaxDataProcessorMod {
  
  type AjaxDataProcessor[TElement] = js.Function3[
    /* data */ Any, 
    /* table */ TElement, 
    /* request */ jqXHR[Any], 
    PagerDataPart[TElement] | js.Array[Double] | (js.Tuple3[Double, JQuery[HTMLElement] | js.Array[js.Array[Any]], js.UndefOr[js.Array[String]]])
  ]
}
