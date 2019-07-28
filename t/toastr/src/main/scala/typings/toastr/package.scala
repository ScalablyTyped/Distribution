package typings

import typings.jquery.JQuery
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object toastr {
  type ToastrDisplayMethod = js.Function3[
    /* message */ String, 
    /* title */ js.UndefOr[String], 
    /* overrides */ js.UndefOr[ToastrOptions], 
    JQuery[HTMLElement]
  ]
}
