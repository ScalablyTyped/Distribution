package typings.tablesorter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tablesorter/Sorting/TextSorter", JSImport.Namespace)
@js.native
object sortingTextSorterMod extends js.Object {
  type TextSorter[TElement] = js.Function5[
    /* x */ String, 
    /* y */ String, 
    /* ascending */ Boolean, 
    /* index */ Double, 
    /* table */ TElement, 
    Double
  ]
}

