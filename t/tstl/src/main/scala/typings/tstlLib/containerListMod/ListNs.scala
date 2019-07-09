package typings
package tstlLib.containerListMod

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
  class Iterator[T] protected ()
    extends tstlLib.baseIteratorListIteratorMod.ListIterator[T, tstlLib.containerListMod.List[T], Iterator[T], ReverseIterator[T], T] {
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
    extends tstlLib.baseIteratorReverseIteratorMod.ReverseIterator[T, tstlLib.containerListMod.List[T], Iterator[T], ReverseIterator[T], T]
  
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
    extends tstlLib.containerListMod.ListNs.Iterator[T]
  
  /**
    * Reverse iterator of the List.
    *
    * @author Jeongho Nam <http://samchon.org>
    */
  @js.native
  class ReverseIterator[T] ()
    extends tstlLib.containerListMod.ListNs.ReverseIterator[T]
  
}

