package typings.tstl.threadMod

import typings.tstl.threadSharedLockMod.IMutex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/thread", "SharedLock")
@js.native
class SharedLock[Mutex /* <: IMutex */] protected ()
  extends typings.tstl.threadSharedLockMod.SharedLock[Mutex] {
  def this(mutex: Mutex) = this()
}

