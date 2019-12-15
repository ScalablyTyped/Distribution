package typings.tstl.baseIteratorReverseIteratorMod

import typings.tstl.baseContainerIContainerMod.IContainer
import typings.tstl.baseIteratorIteratorMod.Iterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/base/iterator/ReverseIterator", "ReverseIterator")
@js.native
abstract class ReverseIterator[T /* <: Elem */, Source /* <: IContainer[T, Source, Base, This, Elem] */, Base /* <: Iterator[T, Source, Base, This, Elem] */, This /* <: ReverseIterator[T, Source, Base, This, Elem] */, Elem] protected () extends IReverseIterator[T, Source, Base, This, Elem] {
  /**
    * Initializer Constructor.
    *
    * @param base The base iterator.
    */
  def this(base: Base) = this()
  /**
    * @hidden
    */
  var base_ : Base = js.native
  /**
    * @hidden
    */
  /* protected */ def _Create_neighbor(base: Base): This = js.native
  /**
    * @inheritDoc
    */
  def base(): Base = js.native
  /**
    * @inheritDoc
    */
  def next(): This = js.native
  /**
    * @inheritDoc
    */
  def prev(): This = js.native
  /**
    * Get source container.
    *
    * @return The source container.
    */
  /* CompleteClass */
  override def source(): Source = js.native
  /**
    * @inheritDoc
    */
  def value(): T = js.native
}

