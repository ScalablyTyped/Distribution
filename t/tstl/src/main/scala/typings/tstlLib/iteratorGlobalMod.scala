package typings
package tstlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/iterator/global", JSImport.Namespace)
@js.native
object iteratorGlobalMod extends js.Object {
  def advance[InputIterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], InputIterator] */](it: InputIterator, n: scala.Double): InputIterator = js.native
  def distance[InputIterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], InputIterator] */](first: InputIterator, last: InputIterator): scala.Double = js.native
  def empty(source: tstlLib.baseDisposableIPartialContainersMod._IEmpty): scala.Boolean = js.native
  def empty[T](source: js.Array[T]): scala.Boolean = js.native
  def next[ForwardIterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
    tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator], 
    ForwardIterator
  ] */](it: ForwardIterator): ForwardIterator = js.native
  def next[ForwardIterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
    tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator], 
    ForwardIterator
  ] */](it: ForwardIterator, n: scala.Double): ForwardIterator = js.native
  def prev[BidirectionalIterator /* <: tstlLib.iteratorIBidirectionalIteratorMod.IBidirectionalIterator[
    tstlLib.functionalIPointerMod.IPointerNs.ValueType[BidirectionalIterator], 
    BidirectionalIterator
  ] */](it: BidirectionalIterator): BidirectionalIterator = js.native
  def prev[BidirectionalIterator /* <: tstlLib.iteratorIBidirectionalIteratorMod.IBidirectionalIterator[
    tstlLib.functionalIPointerMod.IPointerNs.ValueType[BidirectionalIterator], 
    BidirectionalIterator
  ] */](it: BidirectionalIterator, n: scala.Double): BidirectionalIterator = js.native
  def size(source: tstlLib.baseDisposableIPartialContainersMod._ISize): scala.Double = js.native
  def size[T](source: js.Array[T]): scala.Double = js.native
}

