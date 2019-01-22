package typings
package tstlLib.experimentalThreadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/experimental/thread", "TimedSemaphore")
@js.native
class TimedSemaphore protected ()
  extends tstlLib.experimentalThreadTimedSemaphoreMod.TimedSemaphore {
  /**
    * Construct from section size.
    *
    * @param size Number of maximum sections lockable.
    */
  def this(size: scala.Double) = this()
}

