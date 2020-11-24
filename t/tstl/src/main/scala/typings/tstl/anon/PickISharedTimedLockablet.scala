package typings.tstl.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<tstl.tstl/base/thread/ISharedTimedLockable.ISharedTimedLockable, 'try_lock_shared_for' | 'unlock_shared'> */
@js.native
trait PickISharedTimedLockablet extends js.Object {
  
  def try_lock_shared_for(ms: Double): js.Promise[Boolean] = js.native
  @JSName("try_lock_shared_for")
  var try_lock_shared_for_Original: js.Function1[/* ms */ Double, js.Promise[Boolean]] = js.native
  
  def unlock_shared(): js.Promise[Unit] = js.native
  @JSName("unlock_shared")
  var unlock_shared_Original: js.Function0[js.Promise[Unit]] = js.native
}
