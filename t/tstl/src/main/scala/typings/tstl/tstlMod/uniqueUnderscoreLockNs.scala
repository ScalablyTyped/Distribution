package typings.tstl.tstlMod

import typings.std.Date
import typings.std.Pick
import typings.tstl.baseThreadUnderscoreITimedLockableMod._ITimedLockable
import typings.tstl.threadILockableMod.ILockable
import typings.tstl.threadUniqueLockMod.Closure
import typings.tstl.tstlStrings.unlock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "unique_lock")
@js.native
object uniqueUnderscoreLockNs extends js.Object {
  def lock[Mutex /* <: Pick[ILockable, typings.tstl.tstlStrings.lock | unlock] */](mutex: Mutex, closure: Closure): js.Promise[Unit] = js.native
  def try_lock[Mutex /* <: Pick[ILockable, typings.tstl.tstlStrings.try_lock | unlock] */](mutex: Mutex, closure: Closure): js.Promise[Boolean] = js.native
  def try_lock_for[Mutex /* <: Pick[_ITimedLockable, typings.tstl.tstlStrings.try_lock_for | unlock] */](mutex: Mutex, ms: Double, closure: Closure): js.Promise[Boolean] = js.native
  def try_lock_until[Mutex /* <: Pick[_ITimedLockable, typings.tstl.tstlStrings.try_lock_until | unlock] */](mutex: Mutex, at: Date, closure: Closure): js.Promise[Boolean] = js.native
}

