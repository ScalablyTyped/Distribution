package typings.tstl.tstlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "min")
@js.native
object min extends js.Object {
  def apply[T](items: js.Array[T]): T = js.native
  def apply[T](items: js.Array[T], comp: js.Function2[/* x */ T, /* y */ T, Boolean]): T = js.native
}

