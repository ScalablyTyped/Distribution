package typings.tstl.experimentalThreadLatchMod

import typings.std.Date
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
  def this(size: Double) = this()
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
  def arrive(): js.Promise[Unit] = js.native
  def arrive(n: Double): js.Promise[Unit] = js.native
  def arrive_and_wait(): js.Promise[Unit] = js.native
  def is_ready(): js.Promise[Boolean] = js.native
  def wait_for(ms: Double): js.Promise[Boolean] = js.native
  def wait_until(at: Date): js.Promise[Boolean] = js.native
}

