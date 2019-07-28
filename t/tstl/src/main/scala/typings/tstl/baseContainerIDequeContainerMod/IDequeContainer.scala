package typings.tstl.baseContainerIDequeContainerMod

import typings.tstl.baseContainerIContainerMod.IContainer
import typings.tstl.baseContainerILinearContainerMod.ILinearContainer
import typings.tstl.baseIteratorIteratorMod.Iterator
import typings.tstl.baseIteratorReverseIteratorMod.ReverseIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDequeContainer[T /* <: ElemT */, SourceT /* <: IContainer[T, SourceT, IteratorT, ReverseIteratorT, ElemT] */, IteratorT /* <: Iterator[T, SourceT, IteratorT, ReverseIteratorT, ElemT] */, ReverseIteratorT /* <: ReverseIterator[T, SourceT, IteratorT, ReverseIteratorT, ElemT] */, ElemT]
  extends ILinearContainer[T, SourceT, IteratorT, ReverseIteratorT, ElemT]
     with _IDeque[T]

