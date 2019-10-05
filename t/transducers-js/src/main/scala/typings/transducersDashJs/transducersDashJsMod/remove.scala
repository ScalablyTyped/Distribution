package typings.transducersDashJs.transducersDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("transducers-js", "remove")
@js.native
object remove extends js.Object {
  def apply[TInput](pred: js.Function1[/* x */ TInput, Boolean]): Transducer[TInput, TInput] = js.native
}

