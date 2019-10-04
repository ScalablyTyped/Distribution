package typings.tstl.threadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/thread", "couting_semaphore")
@js.native
class couting_semaphore[Max /* <: Double */] protected ()
  extends typings.tstl.threadSemaphoreMod.couting_semaphore[Max] {
  /**
    * Initializer Constructor.
    *
    * @param max Number of maximum sections lockable.
    */
  def this(max: Max) = this()
}

