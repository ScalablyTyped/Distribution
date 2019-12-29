package typings.tstl

import typings.tstl.baseContainerArrayContainerMod.ArrayContainer
import typings.tstl.baseContainerIContainerMod.IContainer
import typings.tstl.baseIteratorArrayIteratorBaseMod.ArrayIteratorBase
import typings.tstl.baseIteratorArrayIteratorBaseMod.ArrayReverseIteratorBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/base/container/VectorContainer", JSImport.Namespace)
@js.native
object baseContainerVectorContainerMod extends js.Object {
  @js.native
  /**
    * Default Constructor.
    */
  abstract class VectorContainer[T /* <: ElemT */, SourceT /* <: IContainer[T, SourceT, IteratorT, ReverseT, ElemT] */, ArrayT /* <: VectorContainer[T, SourceT, ArrayT, IteratorT, ReverseT, ElemT] */, IteratorT /* <: ArrayIteratorBase[T, SourceT, ArrayT, IteratorT, ReverseT, ElemT] */, ReverseT /* <: ArrayReverseIteratorBase[T, SourceT, ArrayT, IteratorT, ReverseT, ElemT] */, ElemT] protected () extends ArrayContainer[T, SourceT, ArrayT, IteratorT, ReverseT, ElemT] {
    /**
      * @hidden
      */
    var data_ : js.Array[T] = js.native
    /**
      * @inheritDoc
      */
    def assign(n: Double, `val`: T): Unit = js.native
    /**
      * Access data.
      *
      * @return An array capsuled by this {@link Vector}.
      */
    def data(): js.Array[T] = js.native
  }
  
}

