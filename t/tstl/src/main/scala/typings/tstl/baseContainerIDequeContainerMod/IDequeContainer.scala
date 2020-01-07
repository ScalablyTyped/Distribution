package typings.tstl.baseContainerIDequeContainerMod

import typings.std.Iterator
import typings.tstl.baseContainerIContainerMod.IContainer
import typings.tstl.baseContainerILinearContainerMod.ILinearContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDequeContainer[T /* <: ElemT */, SourceT /* <: IContainer[T, SourceT, IteratorT, ReverseIteratorT, ElemT] */, IteratorT /* <: Iterator[T, SourceT, IteratorT] */, ReverseIteratorT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ReverseIterator<T, SourceT, IteratorT, ReverseIteratorT, ElemT> */ js.Any */, ElemT]
  extends ILinearContainer[T, SourceT, IteratorT, ReverseIteratorT, ElemT]
     with _IDeque[T]

