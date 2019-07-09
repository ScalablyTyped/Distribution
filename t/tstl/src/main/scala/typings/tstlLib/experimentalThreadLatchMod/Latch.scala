package typings
package tstlLib.experimentalThreadLatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/experimental/thread/Latch", "Latch")
@js.native
class Latch protected () extends js.Object {
  /**
    * Initializer Constructor.
    *
    * @param size Size of the downward counter.
    */
  def this(size: scala.Double) = this()
  /**
    * @hidden
    */
  var _Is_ready: js.Any = js.native
  /**
    * @hidden
    */
  var count_ : js.Any = js.native
  /**
    * @hidden
    */
  var cv_ : js.Any = js.native
  def arrive(): js.Promise[scala.Unit] = js.native
  def arrive(n: scala.Double): js.Promise[scala.Unit] = js.native
  def arrive_and_wait(): js.Promise[scala.Unit] = js.native
  def is_ready(): js.Promise[scala.Boolean] = js.native
  def wait_for(ms: scala.Double): js.Promise[scala.Boolean] = js.native
  def wait_until(at: stdLib.Date): js.Promise[scala.Boolean] = js.native
}

