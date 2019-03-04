package typings
package tstlLib.iteratorBackInsertIteratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/iterator/BackInsertIterator", "BackInsertIterator")
@js.native
class BackInsertIterator[T, Source /* <: tstlLib.baseDisposableIPartialContainersMod._IPushBack[T] */] protected ()
  extends tstlLib.baseIteratorUnderscoreInsertIteratorMod._InsertIterator[T, BackInsertIterator[T, Source]] {
  /**
    * Initializer Constructor.
    *
    * @param source The source container.
    */
  def this(source: Source) = this()
  /**
    * @hidden
    */
  var source_ : js.Any = js.native
}

