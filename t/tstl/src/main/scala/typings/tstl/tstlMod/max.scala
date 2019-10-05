package typings.tstl.tstlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "max")
@js.native
object max extends js.Object {
  def apply[T](items: js.Array[T]): T = js.native
  def apply[T](items: js.Array[T], comp: js.Function2[/* x */ T, /* y */ T, Boolean]): T = js.native
}

