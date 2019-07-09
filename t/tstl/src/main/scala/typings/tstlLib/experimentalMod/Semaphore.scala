package typings
package tstlLib.experimentalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/experimental", "Semaphore")
@js.native
class Semaphore[Max /* <: scala.Double */] protected ()
  extends tstlLib.experimentalThreadMod.Semaphore[Max] {
  /**
    * Initializer Constructor.
    *
    * @param max Number of maximum sections lockable.
    */
  def this(max: Max) = this()
}

