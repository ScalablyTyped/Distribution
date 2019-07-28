package typings.tstl.experimentalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/experimental", "Semaphore")
@js.native
class Semaphore[Max /* <: Double */] protected ()
  extends typings.tstl.experimentalThreadMod.Semaphore[Max] {
  /**
    * Initializer Constructor.
    *
    * @param max Number of maximum sections lockable.
    */
  def this(max: Max) = this()
}

