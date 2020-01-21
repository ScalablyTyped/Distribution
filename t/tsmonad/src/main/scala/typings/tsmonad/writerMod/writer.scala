package typings.tsmonad.writerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tsmonad/lib/src/writer", "writer")
@js.native
object writer extends js.Object {
  def apply[S, T](story: js.Array[S], value: T): Writer_[S, T] = js.native
}

