package typings.transducersDotJs.transducersDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("transducers.js", "interpose")
@js.native
object interpose extends js.Object {
  def apply[TInput](sep: TInput): Transducer[TInput, TInput] = js.native
}

