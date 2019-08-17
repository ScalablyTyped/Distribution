package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object toastr {
  import typings.jquery.JQuery
  import typings.std.HTMLElement

  type ToastrDisplayMethod = js.Function3[
    /* message */ String, 
    /* title */ js.UndefOr[String], 
    /* overrides */ js.UndefOr[ToastrOptions], 
    JQuery[HTMLElement]
  ]
}
