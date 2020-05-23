package typings.tstl.mod

import typings.std.Date
import typings.tstl.anon.PickISharedLockablelocksh
import typings.tstl.anon.PickISharedLockabletryloc
import typings.tstl.anon.PickISharedTimedLockablet
import typings.tstl.anon.PickISharedTimedLockabletTrylockshareduntil
import typings.tstl.sharedLockMod.Closure
import typings.tstl.sharedLockMod.IMutex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "SharedLock")
@js.native
class SharedLock[Mutex /* <: IMutex */] protected ()
  extends typings.tstl.threadMod.SharedLock[Mutex] {
  def this(mutex: Mutex) = this()
}

@JSImport("tstl", "SharedLock")
@js.native
object SharedLock extends js.Object {
  def lock[Mutex /* <: PickISharedLockablelocksh */](mutex: Mutex, closure: Closure): js.Promise[Unit] = js.native
  @JSName("try_lock")
  def tryLock[Mutex /* <: PickISharedLockabletryloc */](mutex: Mutex, closure: Closure): js.Promise[Boolean] = js.native
  @JSName("try_lock_for")
  def tryLockFor[Mutex /* <: PickISharedTimedLockablet */](mutex: Mutex, ms: Double, closure: Closure): js.Promise[Boolean] = js.native
  @JSName("try_lock_until")
  def tryLockUntil[Mutex /* <: PickISharedTimedLockabletTrylockshareduntil */](mutex: Mutex, at: Date, closure: Closure): js.Promise[Boolean] = js.native
}

