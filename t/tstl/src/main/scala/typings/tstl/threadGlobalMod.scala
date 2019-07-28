package typings.tstl

import typings.std.Date
import typings.std.Pick
import typings.tstl.threadILockableMod.ILockable
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
  def sleep_for(ms: Double): js.Promise[Unit] = js.native
  def sleep_until(at: Date): js.Promise[Unit] = js.native
  @JSName("try_lock")
  def try_lock_trylock(items: (Pick[ILockable, try_lock])*): js.Promise[Double] = js.native
}

