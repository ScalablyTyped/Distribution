package typings
package uniDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object PageNs {
  type GetCurrentPages = js.Function0[
    js.Array[
      (PageInstance[uniDashAppLib.AnyObject, uniDashAppLib.AnyObject]) with uniDashAppLib.AnyObject
    ]
  ]
  type PageConstructor = js.Function1[
    /* options */ (PageInstance[uniDashAppLib.AnyObject, uniDashAppLib.AnyObject with (PageInstance[_, _])]) with uniDashAppLib.AnyObject with (PageInstance[_, _]), 
    scala.Unit
  ]
}
