package typings.tstl.tstlMod

import typings.std.Date
import typings.std.Pick
import typings.tstl.threadSharedLockMod.Closure
import typings.tstl.threadSharedLockMod.IMutex
import typings.tstl.tstlStrings.lock_shared
import typings.tstl.tstlStrings.try_lock_shared
import typings.tstl.tstlStrings.try_lock_shared_for
import typings.tstl.tstlStrings.try_lock_shared_until
import typings.tstl.tstlStrings.unlock_shared
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "shared_lock")
@js.native
class shared_lock[Mutex /* <: IMutex */] protected ()
  extends typings.tstl.threadMod.shared_lock[Mutex] {
  def this(mutex: Mutex) = this()
}

@JSImport("tstl", "shared_lock")
@js.native
object shared_lock extends js.Object {
  def lock[Mutex /* <: Pick[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _ISharedLockable */ _, 
    lock_shared | unlock_shared
  ] */](mutex: Mutex, closure: Closure): js.Promise[Unit] = js.native
  def try_lock[Mutex /* <: Pick[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _ISharedLockable */ _, 
    try_lock_shared | unlock_shared
  ] */](mutex: Mutex, closure: Closure): js.Promise[Boolean] = js.native
  def try_lock_for[Mutex /* <: Pick[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _ISharedTimedLockable */ _, 
    try_lock_shared_for | unlock_shared
  ] */](mutex: Mutex, ms: Double, closure: Closure): js.Promise[Boolean] = js.native
  def try_lock_until[Mutex /* <: Pick[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _ISharedTimedLockable */ _, 
    try_lock_shared_until | unlock_shared
  ] */](mutex: Mutex, at: Date, closure: Closure): js.Promise[Boolean] = js.native
}

