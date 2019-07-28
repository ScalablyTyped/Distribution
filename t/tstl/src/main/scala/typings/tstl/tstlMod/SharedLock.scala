package typings.tstl.tstlMod

import typings.tstl.threadSharedLockMod.IMutex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "SharedLock")
@js.native
class SharedLock[Mutex /* <: IMutex */] protected ()
  extends typings.tstl.threadMod.SharedLock[Mutex] {
  def this(mutex: Mutex) = this()
}

