package typings.tstl.threadSemaphoreMod

import typings.std.Date
import typings.tstl.threadILockableMod.ILockable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/thread/Semaphore", "Semaphore")
@js.native
class Semaphore[Max /* <: Double */] protected () extends js.Object {
  /**
    * Initializer Constructor.
    *
    * @param max Number of maximum sections lockable.
    */
  def this(max: Max) = this()
  /**
    * @hidden
    */
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
    * Acquire a section until be released.
    */
  def acquire(): js.Promise[Unit] = js.native
  def get_lockable(): ILockable = js.native
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
    * Try acquire a section.
    *
    * @return Whether succeeded to acquire or not.
    */
  def try_acquire(): js.Promise[Boolean] = js.native
  /**
    * Try acquire a section until timeout.
    *
    * @param ms The maximum miliseconds for waiting.
    * @return Whether succeded to acquire or not.
    */
  def try_acquire_for(ms: Double): js.Promise[Boolean] = js.native
  /**
    * Try acquire a section until time expiration.
    *
    * @param at The maximum time point to wait.
    * @return Whether succeded to acquire or not.
    */
  def try_acquire_until(at: Date): js.Promise[Boolean] = js.native
}

