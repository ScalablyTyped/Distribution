package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object toastrLib {
  type ToastrDisplayMethod = js.Function3[
    /* message */ java.lang.String, 
    /* title */ js.UndefOr[java.lang.String], 
    /* overrides */ js.UndefOr[ToastrOptions], 
    jqueryLib.JQuery[stdLib.HTMLElement]
  ]
}
