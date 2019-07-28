package typings.voca

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object vocaMod {
  type CountPredicate = js.Function3[/* character */ String, /* index */ Double, /* str */ String, Boolean]
  type ReplacementFunction = js.Function2[/* match */ js.UndefOr[String], /* repeated */ String, String]
}
