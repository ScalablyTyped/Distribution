package typings
package tstlLib.tstlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "SharedLock")
@js.native
class SharedLock[Mutex /* <: tstlLib.threadSharedLockMod.IMutex */] protected ()
  extends tstlLib.threadMod.SharedLock[Mutex] {
  def this(mutex: Mutex) = this()
}

