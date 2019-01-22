package typings
package tstlLib.threadSharedLockMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/thread/SharedLock", "SharedLock")
@js.native
object SharedLockNs extends js.Object {
  def lock[Mutex /* <: stdLib.Pick[
    tstlLib.baseThreadUnderscoreISharedLockableMod._ISharedLockable, 
    tstlLib.tstlLibStrings.lock_shared | tstlLib.tstlLibStrings.unlock_shared
  ] */](mutex: Mutex, closure: tstlLib.threadSharedLockMod.Closure): js.Promise[scala.Unit] = js.native
  def try_lock[Mutex /* <: stdLib.Pick[
    tstlLib.baseThreadUnderscoreISharedLockableMod._ISharedLockable, 
    tstlLib.tstlLibStrings.try_lock_shared | tstlLib.tstlLibStrings.unlock_shared
  ] */](mutex: Mutex, closure: tstlLib.threadSharedLockMod.Closure): js.Promise[scala.Boolean] = js.native
  def try_lock_for[Mutex /* <: stdLib.Pick[
    tstlLib.baseThreadUnderscoreISharedTimedLockableMod._ISharedTimedLockable, 
    tstlLib.tstlLibStrings.try_lock_shared_for | tstlLib.tstlLibStrings.unlock_shared
  ] */](mutex: Mutex, ms: scala.Double, closure: tstlLib.threadSharedLockMod.Closure): js.Promise[scala.Boolean] = js.native
  def try_lock_until[Mutex /* <: stdLib.Pick[
    tstlLib.baseThreadUnderscoreISharedTimedLockableMod._ISharedTimedLockable, 
    tstlLib.tstlLibStrings.try_lock_shared_until | tstlLib.tstlLibStrings.unlock_shared
  ] */](mutex: Mutex, at: stdLib.Date, closure: tstlLib.threadSharedLockMod.Closure): js.Promise[scala.Boolean] = js.native
}

