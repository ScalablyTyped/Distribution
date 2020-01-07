package typings.tstl

import typings.tstl.iteratorIForwardIteratorMod.IForwardIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/internal/iterator/InsertIteratorBase", JSImport.Namespace)
@js.native
object internalIteratorInsertIteratorBaseMod extends js.Object {
  @js.native
  abstract class InsertIteratorBase[T, This /* <: InsertIteratorBase[T, This] */] () extends IForwardIterator[T, This] {
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
    /**
      * Set value.
      *
      * @param val The value to set.
      */
    @JSName("value")
    def value_MInsertIteratorBase(`val`: T): js.Any = js.native
  }
  
}

