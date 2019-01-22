package typings
package tstlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object threadUniqueLockMod {
  type Closure = js.Function0[scala.Unit | js.Promise[scala.Unit]]
  type IMutex = tstlLib.threadILockableMod.ILockable with stdLib.Partial[tstlLib.threadITimedLockableMod.ITimedLockable]
}
