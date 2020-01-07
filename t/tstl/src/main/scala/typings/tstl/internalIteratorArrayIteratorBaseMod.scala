package typings.tstl

import typings.tstl.baseContainerIContainerMod.IContainer
import typings.tstl.internalContainerLinearArrayContainerMod.ArrayContainer
import typings.tstl.internalIteratorArrayReverseIteratorBaseMod.ArrayReverseIteratorBase
import typings.tstl.iteratorIRandomAccessIteratorMod.IRandomAccessIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/internal/iterator/ArrayIteratorBase", JSImport.Namespace)
@js.native
object internalIteratorArrayIteratorBaseMod extends js.Object {
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer.Iterator<T, SourceT, IteratorT, ReverseT, ElemT> * / any */ @js.native
  abstract class ArrayIteratorBase[T /* <: ElemT */, SourceT /* <: IContainer[T, SourceT, IteratorT, ReverseT, ElemT] */, ArrayT /* <: ArrayContainer[T, SourceT, ArrayT, IteratorT, ReverseT, ElemT] */, IteratorT /* <: ArrayIteratorBase[T, SourceT, ArrayT, IteratorT, ReverseT, ElemT] */, ReverseT /* <: ArrayReverseIteratorBase[T, SourceT, ArrayT, IteratorT, ReverseT, ElemT] */, ElemT] protected () extends IRandomAccessIterator[T, IteratorT] {
    /**
      * Initializer Constructor.
      *
      * @param source Source container.
      * @param index Index number.
      */
    def this(array: ArrayT, index: Double) = this()
    var array_ : js.Any = js.native
    var index_ : js.Any = js.native
    /**
      * Reference of the value.
      */
    /* CompleteClass */
    override var value: T = js.native
    /**
      * Advance iterator.
      *
      * @param n Step to advance.
      * @return The advanced iterator.
      */
    /* CompleteClass */
    override def advance(n: Double): IteratorT = js.native
    /**
      * Get index.
      *
      * @return The index.
      */
    /* CompleteClass */
    override def index(): Double = js.native
    /**
      * Get next iterator.
      *
      * @return The next iterator.
      */
    /* CompleteClass */
    override def next(): IteratorT = js.native
    /**
      * Get previous iterator.
      *
      * @return The previous iterator.
      */
    /* CompleteClass */
    override def prev(): IteratorT = js.native
    /**
      * @inheritDoc
      */
    def reverse(): ReverseT = js.native
    /**
      * @inheritDoc
      */
    def source(): SourceT = js.native
    /**
      * @inheritDoc
      */
    @JSName("value")
    def value_MArrayIteratorBase(): T = js.native
    /**
      * @inheritDoc
      */
    @JSName("value")
    def value_MArrayIteratorBase(`val`: T): js.Any = js.native
  }
  
}

