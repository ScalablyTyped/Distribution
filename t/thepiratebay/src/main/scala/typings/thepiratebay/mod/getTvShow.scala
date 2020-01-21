package typings.thepiratebay.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("thepiratebay", "getTvShow")
@js.native
object getTvShow extends js.Object {
  def apply(id: String): js.Promise[js.Array[TVSeason]] = js.native
  def apply(id: Double): js.Promise[js.Array[TVSeason]] = js.native
}

