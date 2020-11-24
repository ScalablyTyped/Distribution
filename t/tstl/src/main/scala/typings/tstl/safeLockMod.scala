package typings.tstl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tstl/internal/thread/SafeLock", JSImport.Namespace)
@js.native
object safeLockMod extends js.Object {
  
  @js.native
  object SafeLock extends js.Object {
    
    def lock(
      locker: js.Function0[js.Promise[Unit]],
      unlocker: js.Function0[js.Promise[Unit]],
      lambda: js.Function0[Unit | js.Promise[Unit]]
    ): js.Promise[Unit] = js.native
    
    @JSName("try_lock")
    def tryLock(
      locker: js.Function0[js.Promise[Boolean]],
      unlocker: js.Function0[js.Promise[Unit]],
      lambda: js.Function0[Unit | js.Promise[Unit]]
    ): js.Promise[Boolean] = js.native
  }
}
