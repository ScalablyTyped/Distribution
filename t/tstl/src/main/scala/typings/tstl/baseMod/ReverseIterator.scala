package typings.tstl.baseMod

import typings.tstl.baseContainerIContainerMod.IContainer
import typings.tstl.baseIteratorIteratorMod.Iterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/base", "ReverseIterator")
@js.native
abstract class ReverseIterator[T /* <: Elem */, Source /* <: IContainer[T, Source, Base, This, Elem] */, Base /* <: Iterator[T, Source, Base, This, Elem] */, This /* <: typings.tstl.baseIteratorReverseIteratorMod.ReverseIterator[T, Source, Base, This, Elem] */, Elem] protected ()
  extends typings.tstl.baseIteratorReverseIteratorMod.ReverseIterator[T, Source, Base, This, Elem] {
  /**
    * Initializer Constructor.
    *
    * @param base The base iterator.
    */
  def this(base: Base) = this()
}

