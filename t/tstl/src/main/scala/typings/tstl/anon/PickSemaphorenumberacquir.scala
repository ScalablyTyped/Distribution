package typings.tstl.anon

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<tstl.tstl/thread/Semaphore.Semaphore<number>, 'acquire' | 'try_acquire' | 'try_acquire_for' | 'try_acquire_until' | 'release'> */
@js.native
trait PickSemaphorenumberacquir extends js.Object {
  
  def acquire(): js.Promise[Unit] = js.native
  @JSName("acquire")
  var acquire_Original: js.Function0[js.Promise[Unit]] = js.native
  
  def release(): js.Promise[Unit] = js.native
  def release(n: Double): js.Promise[Unit] = js.native
  @JSName("release")
  var release_Original: js.Function1[/* n */ js.UndefOr[Double], js.Promise[Unit]] = js.native
  
  def try_acquire(): js.Promise[Boolean] = js.native
  @JSName("try_acquire")
  var try_acquire_Original: js.Function0[js.Promise[Boolean]] = js.native
  
  def try_acquire_for(ms: Double): js.Promise[Boolean] = js.native
  @JSName("try_acquire_for")
  var try_acquire_for_Original: js.Function1[/* ms */ Double, js.Promise[Boolean]] = js.native
  
  def try_acquire_until(at: Date): js.Promise[Boolean] = js.native
  @JSName("try_acquire_until")
  var try_acquire_until_Original: js.Function1[/* at */ Date, js.Promise[Boolean]] = js.native
}
