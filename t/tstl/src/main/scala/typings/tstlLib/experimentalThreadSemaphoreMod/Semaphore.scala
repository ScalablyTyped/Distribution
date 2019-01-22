package typings
package tstlLib.experimentalThreadSemaphoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/experimental/thread/Semaphore", "Semaphore")
@js.native
class Semaphore protected ()
  extends tstlLib.baseThreadUnderscoreISemaphoreMod._ISemaphore {
  def this(size: scala.Double) = this()
  /**
    * @hidden
    */
  var _Compute_excess_count: js.Any = js.native
  /**
    * @hidden
    */
  var `hold_count_`: js.Any = js.native
  /**
    * @hidden
    */
  var `listeners_`: js.Any = js.native
  /**
    * @hidden
    */
  var `locked_count_`: js.Any = js.native
  /**
    * @hidden
    */
  var `size_`: js.Any = js.native
}

