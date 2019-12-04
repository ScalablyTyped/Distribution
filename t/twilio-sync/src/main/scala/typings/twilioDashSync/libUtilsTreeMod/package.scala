package typings.twilioDashSync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libUtilsTreeMod {
  type Equal[T] = js.Function2[/* x */ T, /* y */ T, Boolean]
  type Less[T] = js.Function2[/* x */ T, /* y */ T, Boolean]
}
