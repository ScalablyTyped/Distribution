package typings.tstl

import typings.tstl.internalContainerLinearArrayContainerMod.ArrayContainer
import typings.tstl.internalIteratorArrayIteratorBaseMod.ArrayIteratorBase
import typings.tstl.internalIteratorArrayReverseIteratorMod.ArrayReverseIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/internal/iterator/ArrayIterator", JSImport.Namespace)
@js.native
object internalIteratorArrayIteratorMod extends js.Object {
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IArrayContainer.Iterator<T, SourceT, ArrayIterator<T, SourceT>, ArrayReverseIterator<T, SourceT>> * / any */ @js.native
  class ArrayIterator[T, SourceT /* <: ArrayContainer[T, SourceT, SourceT, ArrayIterator[T, SourceT], ArrayReverseIterator[T, SourceT], T] */] () extends ArrayIteratorBase[T, SourceT, SourceT, ArrayIterator[T, SourceT], ArrayReverseIterator[T, SourceT], T]
  
}

