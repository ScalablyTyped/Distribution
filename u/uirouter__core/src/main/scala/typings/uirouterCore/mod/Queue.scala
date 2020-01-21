package typings.uirouterCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core", "Queue")
@js.native
class Queue[T] ()
  extends typings.uirouterCore.commonMod.Queue[T] {
  def this(_items: js.Array[T]) = this()
  def this(_items: js.Array[T], _limit: Double) = this()
}

