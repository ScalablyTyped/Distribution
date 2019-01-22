package typings
package tstlLib.threadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/thread", "shared_lock")
@js.native
class shared_lock[Mutex /* <: tstlLib.threadSharedLockMod.IMutex */] protected ()
  extends tstlLib.threadSharedLockMod.shared_lock[Mutex] {
  def this(mutex: Mutex) = this()
}

