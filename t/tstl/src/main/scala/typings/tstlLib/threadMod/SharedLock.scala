package typings
package tstlLib.threadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/thread", "SharedLock")
@js.native
class SharedLock[Mutex /* <: tstlLib.threadSharedLockMod.IMutex */] protected ()
  extends tstlLib.threadSharedLockMod.SharedLock[Mutex] {
  def this(mutex: Mutex) = this()
}

