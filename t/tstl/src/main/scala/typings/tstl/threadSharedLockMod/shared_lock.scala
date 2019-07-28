package typings.tstl.threadSharedLockMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/thread/SharedLock", "shared_lock")
@js.native
class shared_lock[Mutex /* <: IMutex */] protected () extends SharedLock[Mutex] {
  def this(mutex: Mutex) = this()
}

