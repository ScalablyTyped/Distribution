package typings.tstl.threadSemaphoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/thread/Semaphore", "couting_semaphore")
@js.native
class couting_semaphore[Max /* <: Double */] protected () extends Semaphore[Max] {
  /**
    * Initializer Constructor.
    *
    * @param max Number of maximum sections lockable.
    */
  def this(max: Max) = this()
}

