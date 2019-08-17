package typings.tsmonad

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libSrcMaybeMod {
  import typings.std.Partial

  type OptionalMaybePatterns[T, U] = Partial[MaybePatterns[T, U]]
}
