package typings
package tstlLib.containerForwardListMod

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
  class Iterator[T] protected ()
    extends tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, Iterator[T]] {
    def this(source: tstlLib.functionalIPointerMod.IPointer[tstlLib.containerForwardListMod.ForwardList[T]], next: Iterator[T], value: T) = this()
    /**
      * @hidden
      */
    var `next_`: js.Any = js.native
    /**
      * @hidden
      */
    var `source_ptr_`: js.Any = js.native
    /**
      * Reference of the value.
      */
    /* CompleteClass */
    override var value: T = js.native
    /**
      * @hidden
      */
    var `value_`: js.Any = js.native
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
    def source(): tstlLib.containerForwardListMod.ForwardList[T] = js.native
  }
  
}

