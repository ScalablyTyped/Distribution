package typings.tstl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "Semaphore")
@js.native
class Semaphore[Max /* <: Double */] protected ()
  extends typings.tstl.threadMod.Semaphore[Max] {
  /**
    * Initializer Constructor.
    *
    * @param max Number of maximum sections lockable.
    */
  def this(max: Max) = this()
}

@JSImport("tstl", "Semaphore")
@js.native
object Semaphore extends js.Object {
  /**
    * @internal
    */
  @js.native
  class Lockable protected ()
    extends typings.tstl.threadMod.Semaphore.Lockable {
    def this(semaphore: typings.tstl.semaphoreMod.Semaphore[Double]) = this()
  }
  
}

