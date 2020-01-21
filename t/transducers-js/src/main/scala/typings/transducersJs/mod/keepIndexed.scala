package typings.transducersJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("transducers-js", "keepIndexed")
@js.native
object keepIndexed extends js.Object {
  def apply[TInput](f: js.Function2[/* i */ Double, /* x */ TInput, _]): Transducer[TInput, TInput] = js.native
}

