package typings.tstl.containerForwardListMod

import typings.tstl.containerForwardListMod.ForwardListNs.Iterator
import typings.tstl.iteratorIForwardIteratorMod.IForwardIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/container/ForwardList", "ForwardList")
@js.native
object ForwardListNs extends js.Object {
  /**
    * Iterator of the ForwardList.
    *
    * @author Jeongho Nam <http://samchon.org>
    */
  @js.native
  /**
    * @hidden
    */
  class Iterator[T] protected () extends IForwardIterator[T, Iterator[T]] {
    /**
      * @hidden
      */
    var next_ : js.Any = js.native
    /**
      * @hidden
      */
    var source_ptr_ : js.Any = js.native
    /**
      * Reference of the value.
      */
    /* CompleteClass */
    override var value: T = js.native
    /**
      * @hidden
      */
    var value_ : js.Any = js.native
    /**
      * Get next iterator.
      *
      * @return The next iterator.
      */
    /* CompleteClass */
    override def next(): Iterator[T] = js.native
    /**
      * Get source container.
      *
      * @return The source container.
      */
    def source(): ForwardList[T] = js.native
  }
  
}

