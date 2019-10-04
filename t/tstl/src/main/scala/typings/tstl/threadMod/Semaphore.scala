package typings.tstl.threadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/thread", "Semaphore")
@js.native
class Semaphore[Max /* <: Double */] protected ()
  extends typings.tstl.threadSemaphoreMod.Semaphore[Max] {
  /**
    * Initializer Constructor.
    *
    * @param max Number of maximum sections lockable.
    */
  def this(max: Max) = this()
}

