package typings.tstl

import typings.std.Date
import typings.std.Pick
import typings.tstl.ilockableMod.ILockable
import typings.tstl.tstlStrings.lock
import typings.tstl.tstlStrings.try_lock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/thread/global", JSImport.Namespace)
@js.native
object threadGlobalMod extends js.Object {
  @JSName("lock")
  def lock_lock(items: (Pick[ILockable, lock])*): js.Promise[Unit] = js.native
  @JSName("sleep_for")
  def sleepFor(ms: Double): js.Promise[Unit] = js.native
  @JSName("sleep_until")
  def sleepUntil(at: Date): js.Promise[Unit] = js.native
  @JSName("try_lock")
  def tryLock_trylock(items: (Pick[ILockable, try_lock])*): js.Promise[Double] = js.native
}

