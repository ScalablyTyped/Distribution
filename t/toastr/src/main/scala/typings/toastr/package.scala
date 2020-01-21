package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object toastr {
  type ToastrDisplayMethod = js.Function3[
    /* message */ java.lang.String, 
    /* title */ js.UndefOr[java.lang.String], 
    /* overrides */ js.UndefOr[typings.toastr.ToastrOptions], 
    typings.jquery.JQuery_[typings.std.HTMLElement]
  ]
}
