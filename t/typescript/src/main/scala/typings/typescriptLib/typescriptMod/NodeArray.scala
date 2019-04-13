package typings
package typescriptLib.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeArray[T /* <: Node */]
  extends stdLib.ReadonlyArray[T]
     with TextRange {
  var hasTrailingComma: js.UndefOr[scala.Boolean] = js.native
}

