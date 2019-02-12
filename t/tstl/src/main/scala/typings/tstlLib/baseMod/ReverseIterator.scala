package typings
package tstlLib.baseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/base", "ReverseIterator")
@js.native
abstract class ReverseIterator[T /* <: Elem */, Source /* <: tstlLib.baseContainerIContainerMod.IContainer[T, Source, Base, This, Elem] */, Base /* <: tstlLib.baseIteratorIteratorMod.Iterator[T, Source, Base, This, Elem] */, This /* <: tstlLib.baseIteratorReverseIteratorMod.ReverseIterator[T, Source, Base, This, Elem] */, Elem] protected ()
  extends tstlLib.baseIteratorReverseIteratorMod.ReverseIterator[T, Source, Base, This, Elem] {
  /**
    * Initializer Constructor.
    *
    * @param base The base iterator.
    */
  protected def this(base: Base) = this()
}

