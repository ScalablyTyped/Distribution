package typings.thepiratebay.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("thepiratebay", "getComments")
@js.native
object getComments extends js.Object {
  def apply(id: String): js.Promise[js.Array[Comment]] = js.native
  def apply(id: Double): js.Promise[js.Array[Comment]] = js.native
}

