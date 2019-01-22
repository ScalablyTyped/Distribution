package typings
package tstlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/iterator/global", JSImport.Namespace)
@js.native
object iteratorGlobalMod extends js.Object {
  def advance[T, InputIterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator] */](it: InputIterator, n: scala.Double): InputIterator = js.native
  def distance[T, InputIterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator] */](first: InputIterator, last: InputIterator): scala.Double = js.native
  def empty(source: tstlLib.baseDisposableIPartialContainersMod._IEmpty): scala.Boolean = js.native
  def empty[T](source: js.Array[T]): scala.Boolean = js.native
  def next[T, ForwardIterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, ForwardIterator] */](it: ForwardIterator): ForwardIterator = js.native
  def next[T, ForwardIterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, ForwardIterator] */](it: ForwardIterator, n: scala.Double): ForwardIterator = js.native
  def prev[T, BidirectionalIterator /* <: tstlLib.iteratorIBidirectionalIteratorMod.IBidirectionalIterator[T, BidirectionalIterator] */](it: BidirectionalIterator): BidirectionalIterator = js.native
  def prev[T, BidirectionalIterator /* <: tstlLib.iteratorIBidirectionalIteratorMod.IBidirectionalIterator[T, BidirectionalIterator] */](it: BidirectionalIterator, n: scala.Double): BidirectionalIterator = js.native
  def size(source: tstlLib.baseDisposableIPartialContainersMod._ISize): scala.Double = js.native
  def size[T](source: js.Array[T]): scala.Double = js.native
}

