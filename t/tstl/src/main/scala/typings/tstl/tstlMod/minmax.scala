package typings.tstl.tstlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "minmax")
@js.native
object minmax extends js.Object {
  def apply[T](items: js.Array[T], comp: js.Function2[/* x */ T, /* y */ T, Boolean]): typings.tstl.utilityPairMod.Pair[T, T] = js.native
}

