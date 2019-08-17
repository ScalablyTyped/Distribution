package typings.tstl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object threadSharedLockMod {
  import typings.std.Partial
  import typings.tstl.baseThreadUnderscoreISharedLockableMod._ISharedLockable
  import typings.tstl.baseThreadUnderscoreISharedTimedLockableMod._ISharedTimedLockable

  /**
    * @hidden
    */
  type Closure = js.Function0[Unit | js.Promise[Unit]]
  /**
    * @hidden
    */
  type IMutex = _ISharedLockable with Partial[_ISharedTimedLockable]
}
