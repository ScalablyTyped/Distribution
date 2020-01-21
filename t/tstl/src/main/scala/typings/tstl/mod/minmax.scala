package typings.tstl.mod

import typings.tstl.comparatorMod.Comparator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "minmax")
@js.native
object minmax extends js.Object {
  def apply[T](items: js.Array[T], comp: Comparator[T, T]): typings.tstl.pairMod.Pair[T, T] = js.native
}

