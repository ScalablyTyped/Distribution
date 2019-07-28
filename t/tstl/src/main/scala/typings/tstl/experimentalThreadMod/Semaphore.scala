package typings.tstl.experimentalThreadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/experimental/thread", "Semaphore")
@js.native
class Semaphore[Max /* <: Double */] protected ()
  extends typings.tstl.experimentalThreadSemaphoreMod.Semaphore[Max] {
  /**
    * Initializer Constructor.
    *
    * @param max Number of maximum sections lockable.
    */
  def this(max: Max) = this()
}

