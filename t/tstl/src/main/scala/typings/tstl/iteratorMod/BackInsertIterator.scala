package typings.tstl.iteratorMod

import typings.tstl.baseDisposableIPartialContainersMod._IPushBack
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/iterator", "BackInsertIterator")
@js.native
class BackInsertIterator[T, Source /* <: _IPushBack[T] */] protected ()
  extends typings.tstl.iteratorBackInsertIteratorMod.BackInsertIterator[T, Source] {
  /**
    * Initializer Constructor.
    *
    * @param source The source container.
    */
  def this(source: Source) = this()
}

