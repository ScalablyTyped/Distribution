package typings.tstl

import typings.std.Date
import typings.std.Partial
import typings.std.Pick
import typings.tstl.tstlStrings.lock_shared
import typings.tstl.tstlStrings.try_lock_shared
import typings.tstl.tstlStrings.try_lock_shared_for
import typings.tstl.tstlStrings.try_lock_shared_until
import typings.tstl.tstlStrings.unlock_shared
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/thread/SharedLock", JSImport.Namespace)
@js.native
object threadSharedLockMod extends js.Object {
  @js.native
  class SharedLock[Mutex /* <: IMutex */] protected () extends js.Object {
    def this(mutex: Mutex) = this()
    /**
      * @hidden
      */
    var mutex_ : js.Any = js.native
    var try_lock_for: js.UndefOr[js.Function2[/* ms */ Double, /* closure */ Closure, js.Promise[Boolean]]] = js.native
    var try_lock_until: js.UndefOr[js.Function2[/* at */ Date, /* closure */ Closure, js.Promise[Boolean]]] = js.native
    def lock(closure: Closure): js.Promise[Unit] = js.native
    def try_lock(closure: Closure): js.Promise[Boolean] = js.native
  }
  
  @js.native
  class shared_lock[Mutex /* <: IMutex */] protected () extends SharedLock[Mutex] {
    def this(mutex: Mutex) = this()
  }
  
  @js.native
  object SharedLock extends js.Object {
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
  
  /**
    * @hidden
    */
  type Closure = js.Function0[Unit | js.Promise[Unit]]
  /**
    * @hidden
    */
  type IMutex = (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _ISharedLockable */ js.Any) with (Partial[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _ISharedTimedLockable */ _
  ])
}

