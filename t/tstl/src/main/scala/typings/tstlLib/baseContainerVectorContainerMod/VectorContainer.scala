package typings
package tstlLib.baseContainerVectorContainerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/base/container/VectorContainer", "VectorContainer")
@js.native
/**
  * Default Constructor.
  */
abstract class VectorContainer[T /* <: ElemT */, SourceT /* <: tstlLib.baseContainerIContainerMod.IContainer[T, SourceT, IteratorT, ReverseT, ElemT] */, ArrayT /* <: VectorContainer[T, SourceT, ArrayT, IteratorT, ReverseT, ElemT] */, IteratorT /* <: tstlLib.baseIteratorArrayIteratorBaseMod.ArrayIteratorBase[T, SourceT, ArrayT, IteratorT, ReverseT, ElemT] */, ReverseT /* <: tstlLib.baseIteratorArrayIteratorBaseMod.ArrayReverseIteratorBase[T, SourceT, ArrayT, IteratorT, ReverseT, ElemT] */, ElemT] protected ()
  extends tstlLib.baseContainerArrayContainerMod.ArrayContainer[T, SourceT, ArrayT, IteratorT, ReverseT, ElemT] {
  /**
    * @hidden
    */
  var data_ : js.Array[T] = js.native
  /**
    * @inheritDoc
    */
  def assign(n: scala.Double, `val`: T): scala.Unit = js.native
  /**
    * Access data.
    *
    * @return An array capsuled by this {@link Vector}.
    */
  def data(): js.Array[T] = js.native
}

