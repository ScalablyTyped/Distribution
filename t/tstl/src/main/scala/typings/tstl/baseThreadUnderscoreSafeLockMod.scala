package typings.tstl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/base/thread/_SafeLock", JSImport.Namespace)
@js.native
object baseThreadUnderscoreSafeLockMod extends js.Object {
  @js.native
  object _SafeLock extends js.Object {
    def lock(
      locker: js.Function0[js.Promise[Unit]],
      unlocker: js.Function0[js.Promise[Unit]],
      lambda: js.Function0[Unit | js.Promise[Unit]]
    ): js.Promise[Unit] = js.native
    def try_lock(
      locker: js.Function0[js.Promise[Boolean]],
      unlocker: js.Function0[js.Promise[Unit]],
      lambda: js.Function0[Unit | js.Promise[Unit]]
    ): js.Promise[Boolean] = js.native
  }
  
}

