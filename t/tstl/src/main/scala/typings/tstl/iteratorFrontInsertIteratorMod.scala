package typings.tstl

import typings.tstl.baseDisposableIPartialContainersMod._IPushFront
import typings.tstl.baseIteratorUnderscoreInsertIteratorMod._InsertIterator
import typings.tstl.iteratorFrontInsertIteratorMod.FrontInsertIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/iterator/FrontInsertIterator", JSImport.Namespace)
@js.native
object iteratorFrontInsertIteratorMod extends js.Object {
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
  
}

