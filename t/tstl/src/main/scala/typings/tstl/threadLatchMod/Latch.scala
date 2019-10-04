package typings.tstl.threadLatchMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/thread/Latch", "Latch")
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
  var _Try_wait: js.Any = js.native
  /**
    * @hidden
    */
  var count_ : js.Any = js.native
  /**
    * @hidden
    */
  var cv_ : js.Any = js.native
  def arrive_and_wait(): js.Promise[Unit] = js.native
  def count_down(): js.Promise[Unit] = js.native
  def count_down(n: Double): js.Promise[Unit] = js.native
  def try_wait(): js.Promise[Boolean] = js.native
  def wait_for(ms: Double): js.Promise[Boolean] = js.native
  def wait_until(at: Date): js.Promise[Boolean] = js.native
}

