package typings
package tstlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/iterator/factory", JSImport.Namespace)
@js.native
object iteratorFactoryMod extends js.Object {
  def back_inserter[T](source: js.Array[T]): tstlLib.iteratorBackInsertIteratorMod.BackInsertIterator[T, tstlLib.containerVectorMod.Vector[T]] = js.native
  def back_inserter[T, Source /* <: tstlLib.baseDisposableIPartialContainersMod._IPushBack[T] */](source: Source): tstlLib.iteratorBackInsertIteratorMod.BackInsertIterator[T, Source] = js.native
  def begin[T](container: js.Array[T]): tstlLib.containerVectorMod.VectorNs.Iterator[T] = js.native
  def begin[Iterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[Iterator], Iterator] */](container: tstlLib.baseDisposableIForwardContainerMod.IForwardContainer[Iterator]): Iterator = js.native
  def end[T](container: js.Array[T]): tstlLib.containerVectorMod.VectorNs.Iterator[T] = js.native
  def end[Iterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[Iterator], Iterator] */](container: tstlLib.baseDisposableIForwardContainerMod.IForwardContainer[Iterator]): Iterator = js.native
  def front_inserter[T, Source /* <: tstlLib.baseDisposableIPartialContainersMod._IPushFront[T] */](source: Source): tstlLib.iteratorFrontInsertIteratorMod.FrontInsertIterator[T, Source] = js.native
  def inserter[T](container: js.Array[T], it: tstlLib.containerVectorMod.VectorNs.Iterator[T]): tstlLib.iteratorInsertIteratorMod.InsertIterator[
    tstlLib.containerVectorMod.Vector[T], 
    tstlLib.containerVectorMod.VectorNs.Iterator[T]
  ] = js.native
  def inserter[Container /* <: tstlLib.baseDisposableIPartialContainersMod._IInsert[Iterator] */, Iterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[Iterator], Iterator] */](container: Container, it: Iterator): tstlLib.iteratorInsertIteratorMod.InsertIterator[Container, Iterator] = js.native
  def make_reverse_iterator[IteratorT /* <: tstlLib.iteratorIReverseIteratorMod.IReversableIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[IteratorT], IteratorT, ReverseT] */, ReverseT /* <: tstlLib.iteratorIReverseIteratorMod.IReverseIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[IteratorT], IteratorT, ReverseT] */](it: IteratorT): ReverseT = js.native
  def rbegin[T](container: js.Array[T]): tstlLib.containerVectorMod.VectorNs.ReverseIterator[T] = js.native
  def rbegin[Iterator /* <: tstlLib.iteratorIReverseIteratorMod.IReversableIterator[
    tstlLib.functionalIPointerMod.IPointerNs.ValueType[Iterator], 
    Iterator, 
    ReverseIterator
  ] */, ReverseIterator /* <: tstlLib.iteratorIReverseIteratorMod.IReverseIterator[
    tstlLib.functionalIPointerMod.IPointerNs.ValueType[Iterator], 
    Iterator, 
    ReverseIterator
  ] */](
    container: tstlLib.baseDisposableIBidirectionalContainerMod.IBidirectionalContainer[Iterator, ReverseIterator]
  ): ReverseIterator = js.native
  def rend[T](container: js.Array[T]): tstlLib.containerVectorMod.VectorNs.ReverseIterator[T] = js.native
  def rend[Iterator /* <: tstlLib.iteratorIReverseIteratorMod.IReversableIterator[
    tstlLib.functionalIPointerMod.IPointerNs.ValueType[Iterator], 
    Iterator, 
    ReverseIterator
  ] */, ReverseIterator /* <: tstlLib.iteratorIReverseIteratorMod.IReverseIterator[
    tstlLib.functionalIPointerMod.IPointerNs.ValueType[Iterator], 
    Iterator, 
    ReverseIterator
  ] */](
    container: tstlLib.baseDisposableIBidirectionalContainerMod.IBidirectionalContainer[Iterator, ReverseIterator]
  ): ReverseIterator = js.native
}

