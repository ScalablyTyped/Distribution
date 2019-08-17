package typings.ultraDashStrftime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ultraDashStrftimeMod {
  import typings.std.Date

  type StrftimeFunction = js.Function3[/* fmt */ String, /* d */ js.UndefOr[Date], /* options */ js.UndefOr[Options], String]
}
