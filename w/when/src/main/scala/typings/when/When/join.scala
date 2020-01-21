package typings.when.When

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("When.join")
@js.native
object join extends js.Object {
  /**
    * Joins multiple promises into a single returned promise.
    * @return a promise that will fulfill when *all* the input promises
    * have fulfilled, or will reject when *any one* of the input promises rejects.
    */
  def apply[T](promises: (js.Any | Promise_[T])*): Promise_[js.Array[T]] = js.native
}

