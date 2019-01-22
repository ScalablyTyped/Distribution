package typings
package tstlLib.baseIteratorReverseIteratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {readonly [ P in keyof tstl.tstl/iterator/IReverseIterator.IReverseIterator<tstl.tstl/iterator/IReverseIterator.IReverseIterator<T, Base, This>, Base, This> ]: tstl.tstl/iterator/IReverseIterator.IReverseIterator<tstl.tstl/iterator/IReverseIterator.IReverseIterator<T, Base, This>, Base, This>[P]} */ @JSImport("tstl/base/iterator/ReverseIterator", "ReverseIterator")
@js.native
abstract class ReverseIterator[T, Source /* <: tstlLib.baseContainerIContainerMod.IContainer[T, Source, Base, This] */, Base /* <: tstlLib.baseIteratorIteratorMod.Iterator[T, Source, Base, This] */, This /* <: ReverseIterator[T, Source, Base, This] */] protected () extends js.Object {
  /**
    * Initializer Constructor.
    *
    * @param base The base iterator.
    */
  protected def this(base: Base) = this()
  /**
    * @hidden
    */
  var `base_`: Base = js.native
  /**
    * @inheritDoc
    */
  val value: T = js.native
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
  def source(): Source = js.native
}

