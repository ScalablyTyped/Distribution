package typings
package tstlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/algorithm/partition", JSImport.Namespace)
@js.native
object algorithmPartitionMod extends js.Object {
  def is_partitioned[T, ForwardIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, ForwardIterator]] */](first: ForwardIterator, last: ForwardIterator, pred: js.Function1[/* x */ T, scala.Boolean]): scala.Boolean = js.native
  def partition[T, BidirectionalIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIBidirectionalIteratorMod.IBidirectionalIterator[T, BidirectionalIterator]
  ] */](
    first: BidirectionalIterator,
    last: BidirectionalIterator,
    pred: js.Function1[/* x */ T, scala.Boolean]
  ): BidirectionalIterator = js.native
  def partition_copy[T, InputIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator]] */, OutputIterator1 /* <: tstlLib.iteratorIFakeMod.Writeonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, OutputIterator1]] */, OutputIterator2 /* <: tstlLib.iteratorIFakeMod.Writeonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, OutputIterator2]] */](
    first: InputIterator,
    last: InputIterator,
    output_true: OutputIterator1,
    output_false: OutputIterator2,
    pred: js.Function1[/* val */ T, T]
  ): tstlLib.utilityPairMod.Pair[OutputIterator1, OutputIterator2] = js.native
  def partition_point[T, ForwardIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, ForwardIterator]] */](first: ForwardIterator, last: ForwardIterator, pred: js.Function1[/* x */ T, scala.Boolean]): ForwardIterator = js.native
  def stable_partition[T, BidirectionalIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIBidirectionalIteratorMod.IBidirectionalIterator[T, BidirectionalIterator]
  ] */](
    first: BidirectionalIterator,
    last: BidirectionalIterator,
    pred: js.Function1[/* x */ T, scala.Boolean]
  ): BidirectionalIterator = js.native
}

