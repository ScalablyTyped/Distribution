package typings.tstl.containerListMod

import typings.tstl.baseIteratorListIteratorMod.ListIterator
import typings.tstl.containerListMod.ListNs.Iterator
import typings.tstl.containerListMod.ListNs.ReverseIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/container/List", "List")
@js.native
object ListNs extends js.Object {
  /**
    * Iterator of the List.
    *
    * @author Jeongho Nam <http://samchon.org>
    */
  @js.native
  /**
    * @hidden
    */
  class Iterator[T] protected () extends ListIterator[T, List[T], Iterator[T], ReverseIterator[T], T] {
    /**
      * @hidden
      */
    var source_ptr_ : js.Any = js.native
  }
  
  /**
    * Reverse iterator of the List.
    *
    * @author Jeongho Nam <http://samchon.org>
    */
  @js.native
  class ReverseIterator[T] ()
    extends typings.tstl.baseIteratorReverseIteratorMod.ReverseIterator[T, List[T], Iterator[T], ReverseIterator[T], T]
  
}

@JSImport("tstl/container/List", "list")
@js.native
object listNs extends js.Object {
  /**
    * Iterator of the List.
    *
    * @author Jeongho Nam <http://samchon.org>
    */
  @js.native
  /**
    * @hidden
    */
  class Iterator[T] protected ()
    extends typings.tstl.containerListMod.ListNs.Iterator[T]
  
  /**
    * Reverse iterator of the List.
    *
    * @author Jeongho Nam <http://samchon.org>
    */
  @js.native
  class ReverseIterator[T] ()
    extends typings.tstl.containerListMod.ListNs.ReverseIterator[T]
  
}

