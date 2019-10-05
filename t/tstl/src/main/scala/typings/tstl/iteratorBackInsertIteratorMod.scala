package typings.tstl

import typings.tstl.baseDisposableIPartialContainersMod._IPushBack
import typings.tstl.baseIteratorUnderscoreInsertIteratorMod._InsertIterator
import typings.tstl.iteratorBackInsertIteratorMod.BackInsertIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/iterator/BackInsertIterator", JSImport.Namespace)
@js.native
object iteratorBackInsertIteratorMod extends js.Object {
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
  
}

