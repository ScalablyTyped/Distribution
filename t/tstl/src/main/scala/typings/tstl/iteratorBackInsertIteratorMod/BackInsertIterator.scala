package typings.tstl.iteratorBackInsertIteratorMod

import typings.tstl.baseDisposableIPartialContainersMod._IPushBack
import typings.tstl.baseIteratorUnderscoreInsertIteratorMod._InsertIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/iterator/BackInsertIterator", "BackInsertIterator")
@js.native
class BackInsertIterator[T, Source /* <: _IPushBack[T] */] protected () extends _InsertIterator[T, BackInsertIterator[T, Source]] {
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

