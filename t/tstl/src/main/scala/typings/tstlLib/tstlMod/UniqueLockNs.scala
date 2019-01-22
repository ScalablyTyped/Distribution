package typings
package tstlLib.tstlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "UniqueLock")
@js.native
object UniqueLockNs extends js.Object {
  def lock[Mutex /* <: stdLib.Pick[
    tstlLib.threadILockableMod.ILockable, 
    tstlLib.tstlLibStrings.lock | tstlLib.tstlLibStrings.unlock
  ] */](mutex: Mutex, closure: tstlLib.threadUniqueLockMod.Closure): js.Promise[scala.Unit] = js.native
  def try_lock[Mutex /* <: stdLib.Pick[
    tstlLib.threadILockableMod.ILockable, 
    tstlLib.tstlLibStrings.try_lock | tstlLib.tstlLibStrings.unlock
  ] */](mutex: Mutex, closure: tstlLib.threadUniqueLockMod.Closure): js.Promise[scala.Boolean] = js.native
  def try_lock_for[Mutex /* <: stdLib.Pick[
    tstlLib.threadITimedLockableMod.ITimedLockable, 
    tstlLib.tstlLibStrings.try_lock_for | tstlLib.tstlLibStrings.unlock
  ] */](mutex: Mutex, ms: scala.Double, closure: tstlLib.threadUniqueLockMod.Closure): js.Promise[scala.Boolean] = js.native
  def try_lock_until[Mutex /* <: stdLib.Pick[
    tstlLib.threadITimedLockableMod.ITimedLockable, 
    tstlLib.tstlLibStrings.try_lock_until | tstlLib.tstlLibStrings.unlock
  ] */](mutex: Mutex, at: stdLib.Date, closure: tstlLib.threadUniqueLockMod.Closure): js.Promise[scala.Boolean] = js.native
}

