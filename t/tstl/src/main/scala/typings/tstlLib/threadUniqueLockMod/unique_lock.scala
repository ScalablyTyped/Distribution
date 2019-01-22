package typings
package tstlLib.threadUniqueLockMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/thread/UniqueLock", "unique_lock")
@js.native
class unique_lock[Mutex /* <: IMutex */] protected () extends UniqueLock[Mutex] {
  def this(mutex: Mutex) = this()
}

