package typings.tstl

import typings.tstl.arrayContainerMod.ArrayContainer
import typings.tstl.arrayIteratorBaseMod.ArrayIteratorBase
import typings.tstl.arrayReverseIteratorMod.ArrayReverseIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/internal/iterator/ArrayIterator", JSImport.Namespace)
@js.native
object arrayIteratorMod extends js.Object {
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.tstl.iarraycontainerMod.IArrayContainer.Iterator because var conflicts: equals_Original, value. Inlined  */ @js.native
  class ArrayIterator[T, SourceT /* <: ArrayContainer[T, SourceT, SourceT, ArrayIterator[T, SourceT], ArrayReverseIterator[T, SourceT], T] */] () extends ArrayIteratorBase[T, SourceT, SourceT, ArrayIterator[T, SourceT], ArrayReverseIterator[T, SourceT], T]
  
}

