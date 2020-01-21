package typings.webcola.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webcola", "PairingHeap")
@js.native
class PairingHeap[T] protected ()
  extends typings.webcola.pqueueMod.PairingHeap[T] {
  def this(elem: T) = this()
}

