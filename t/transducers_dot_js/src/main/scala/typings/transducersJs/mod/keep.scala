package typings.transducersJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("transducers.js", "keep")
@js.native
object keep extends js.Object {
  def apply[TInput](): Transducer[js.UndefOr[TInput | Null], TInput] = js.native
}

