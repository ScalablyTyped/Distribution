package typings
package tstlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object threadSharedLockMod {
  type Closure = js.Function0[scala.Unit | js.Promise[scala.Unit]]
  type IMutex = tstlLib.baseThreadUnderscoreISharedLockableMod._ISharedLockable with stdLib.Partial[tstlLib.baseThreadUnderscoreISharedTimedLockableMod._ISharedTimedLockable]
}
