package typings.unlCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("unl-core", "adjacent")
@js.native
object adjacent extends js.Object {
  def apply(geohash: String, direction: String): String = js.native
  def apply(geohash: String, direction: Direction): String = js.native
}

