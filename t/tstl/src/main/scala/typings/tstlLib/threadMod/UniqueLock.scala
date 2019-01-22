package typings
package tstlLib.threadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/thread", "UniqueLock")
@js.native
class UniqueLock[Mutex /* <: tstlLib.threadUniqueLockMod.IMutex */] protected ()
  extends tstlLib.threadUniqueLockMod.UniqueLock[Mutex] {
  def this(mutex: Mutex) = this()
}

