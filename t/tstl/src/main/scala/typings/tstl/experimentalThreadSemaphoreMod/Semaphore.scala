package typings.tstl.experimentalThreadSemaphoreMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/experimental/thread/Semaphore", "Semaphore")
@js.native
class Semaphore[Max /* <: Double */] protected () extends js.Object {
  /**
    * Initializer Constructor.
    *
    * @param max Number of maximum sections lockable.
    */
  def this(max: Max) = this()
  var _Cancel: js.Any = js.native
  /**
    * @hidden
    */
  var _Release: js.Any = js.native
  /**
    * @hidden
    */
  var acquiring_ : js.Any = js.native
  /**
    * @hidden
    */
  var max_ : js.Any = js.native
  /**
    * @hidden
    */
  var queue_ : js.Any = js.native
  /**
    * @inheritDoc
    */
  def acquire(): js.Promise[Unit] = js.native
  /**
    * Number of maximum sections lockable.
    */
  def max(): Max = js.native
  /**
    * @inheritDoc
    */
  def release(): js.Promise[Unit] = js.native
  def release(count: Double): js.Promise[Unit] = js.native
  /**
    * @inheritDoc
    */
  def try_acquire(): js.Promise[Boolean] = js.native
  /**
    * Try lock sections until timeout.
    *
    * @param ms The maximum miliseconds for waiting.
    * @param count Count to lock.
    * @return Whether succeded to lock or not.
    */
  def try_acquire_for(ms: Double): js.Promise[Boolean] = js.native
  /**
    * Try lock sections until time expiration.
    *
    * @param at The maximum time point to wait.
    * @param count Count to lock.
    * @return Whether succeded to lock or not.
    */
  def try_acquire_until(at: Date): js.Promise[Boolean] = js.native
}

