package typings
package tstlLib.tstlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "UniqueLock")
@js.native
class UniqueLock[Mutex /* <: tstlLib.threadUniqueLockMod.IMutex */] protected ()
  extends tstlLib.threadMod.UniqueLock[Mutex] {
  def this(mutex: Mutex) = this()
}

