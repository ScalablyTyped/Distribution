package typings.ultraDashStrftime

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ultraDashStrftimeMod {
  type StrftimeFunction = js.Function3[/* fmt */ String, /* d */ js.UndefOr[Date], /* options */ js.UndefOr[Options], String]
}
