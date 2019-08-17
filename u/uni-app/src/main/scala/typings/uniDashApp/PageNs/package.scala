package typings.uniDashApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object PageNs {
  import typings.uniDashApp.AnyObject

  type GetCurrentPages = js.Function0[js.Array[(PageInstance[AnyObject, AnyObject]) with AnyObject]]
  type PageConstructor = js.Function1[
    /* options */ (PageInstance[AnyObject, AnyObject with (PageInstance[_, _])]) with AnyObject with (PageInstance[_, _]), 
    Unit
  ]
}
