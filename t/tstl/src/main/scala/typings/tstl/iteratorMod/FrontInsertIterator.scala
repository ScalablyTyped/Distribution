package typings.tstl.iteratorMod

import typings.tstl.baseDisposableIPartialContainersMod._IPushFront
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/iterator", "FrontInsertIterator")
@js.native
class FrontInsertIterator[T, Source /* <: _IPushFront[T] */] protected ()
  extends typings.tstl.iteratorFrontInsertIteratorMod.FrontInsertIterator[T, Source] {
  /**
    * Initializer Constructor.
    *
    * @param source The source container.
    */
  def this(source: Source) = this()
}

