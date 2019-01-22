package typings
package tstlLib.containerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/container", "List")
@js.native
object ListNs extends js.Object {
  /**
    * Iterator of the List.
    *
    * @author Jeongho Nam <http://samchon.org>
    */
  @js.native
  class Iterator[T] protected ()
    extends tstlLib.containerListMod.ListNs.Iterator[T] {
    /**
      * @hidden
      */
    def this(sourcePtr: tstlLib.functionalIPointerMod.IPointer[tstlLib.containerListMod.List[T]], prev: tstlLib.containerListMod.ListNs.Iterator[T], next: tstlLib.containerListMod.ListNs.Iterator[T], value: T) = this()
  }
  
  /**
    * Reverse iterator of the List.
    *
    * @author Jeongho Nam <http://samchon.org>
    */
  @js.native
  class ReverseIterator[T] protected ()
    extends tstlLib.containerListMod.ListNs.ReverseIterator[T] {
    def this(base: tstlLib.containerListMod.ListNs.Iterator[T]) = this()
  }
  
}

@JSImport("tstl/container", "list")
@js.native
object listNs extends js.Object {
  /**
    * Iterator of the List.
    *
    * @author Jeongho Nam <http://samchon.org>
    */
  @js.native
  class Iterator[T] protected ()
    extends tstlLib.containerListMod.listNs.Iterator[T] {
    /**
      * @hidden
      */
    def this(sourcePtr: tstlLib.functionalIPointerMod.IPointer[tstlLib.containerListMod.List[T]], prev: tstlLib.containerListMod.ListNs.Iterator[T], next: tstlLib.containerListMod.ListNs.Iterator[T], value: T) = this()
  }
  
  /**
    * Reverse iterator of the List.
    *
    * @author Jeongho Nam <http://samchon.org>
    */
  @js.native
  class ReverseIterator[T] protected ()
    extends tstlLib.containerListMod.listNs.ReverseIterator[T] {
    def this(base: tstlLib.containerListMod.ListNs.Iterator[T]) = this()
  }
  
}

