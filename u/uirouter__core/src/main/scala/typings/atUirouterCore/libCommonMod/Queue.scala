package typings.atUirouterCore.libCommonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core/lib/common", "Queue")
@js.native
class Queue[T] ()
  extends typings.atUirouterCore.libCommonQueueMod.Queue[T] {
  def this(_items: js.Array[T]) = this()
  def this(_items: js.Array[T], _limit: Double) = this()
}

