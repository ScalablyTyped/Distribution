package typings
package tstlLib.threadSharedLockMod

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
  var try_lock_for: js.UndefOr[
    js.Function2[/* ms */ scala.Double, /* closure */ Closure, js.Promise[scala.Boolean]]
  ] = js.native
  var try_lock_until: js.UndefOr[
    js.Function2[/* at */ stdLib.Date, /* closure */ Closure, js.Promise[scala.Boolean]]
  ] = js.native
  def lock(closure: Closure): js.Promise[scala.Unit] = js.native
  def try_lock(closure: Closure): js.Promise[scala.Boolean] = js.native
}

