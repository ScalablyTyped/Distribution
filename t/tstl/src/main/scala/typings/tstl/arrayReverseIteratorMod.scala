package typings.tstl

import typings.tstl.arrayContainerMod.ArrayContainer
import typings.tstl.arrayIteratorMod.ArrayIterator
import typings.tstl.arrayReverseIteratorBaseMod.ArrayReverseIteratorBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/internal/iterator/ArrayReverseIterator", JSImport.Namespace)
@js.native
object arrayReverseIteratorMod extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.tstl.iarraycontainerMod.IArrayContainer.ReverseIterator because var conflicts: equals_Original, value. Inlined  */ @js.native
  class ArrayReverseIterator[T, SourceT /* <: ArrayContainer[T, SourceT, SourceT, ArrayIterator[T, SourceT], ArrayReverseIterator[T, SourceT], T] */] () extends ArrayReverseIteratorBase[T, SourceT, SourceT, ArrayIterator[T, SourceT], ArrayReverseIterator[T, SourceT], T]
  
}

