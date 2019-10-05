package typings.tstl

import typings.tstl.baseIteratorUnderscoreInsertIteratorMod._InsertIterator
import typings.tstl.iteratorIFakeMod.Writeonly
import typings.tstl.iteratorIForwardIteratorMod.IForwardIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/base/iterator/_InsertIterator", JSImport.Namespace)
@js.native
object baseIteratorUnderscoreInsertIteratorMod extends js.Object {
  @js.native
  abstract class _InsertIterator[T, This /* <: _InsertIterator[T, This] */] () extends Writeonly[IForwardIterator[T, This]] {
    /**
      * Reference of the value.
      */
    /* CompleteClass */
    override var value: T = js.native
    /**
      * Get next iterator.
      *
      * @return The next iterator.
      */
    /* CompleteClass */
    override def next(): This = js.native
  }
  
}

