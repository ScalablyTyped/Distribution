package typings.tstl.threadSharedLockMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/thread/SharedLock", "SharedLock")
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

