package typings.tstl.iteratorFrontInsertIteratorMod

import typings.tstl.baseDisposableIPartialContainersMod._IPushFront
import typings.tstl.baseIteratorUnderscoreInsertIteratorMod._InsertIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/iterator/FrontInsertIterator", "FrontInsertIterator")
@js.native
class FrontInsertIterator[T, Source /* <: _IPushFront[T] */] protected () extends _InsertIterator[T, FrontInsertIterator[T, Source]] {
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

