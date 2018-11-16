package typings
package ultraDashStrftimeLib.ultraDashStrftimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object strftimeNs {
  type StrftimeFunction = js.Function3[
    /* fmt */ java.lang.String, 
    /* d */ js.UndefOr[stdLib.Date], 
    /* options */ js.UndefOr[Options], 
    java.lang.String
  ]
}
