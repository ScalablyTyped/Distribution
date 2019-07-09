package typings
package tstlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/algorithm/partition", JSImport.Namespace)
@js.native
object algorithmPartitionMod extends js.Object {
  def is_partitioned[ForwardIterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
    tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator], 
    ForwardIterator
  ] */](
    first: ForwardIterator,
    last: ForwardIterator,
    pred: js.Function1[
      /* x */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator], 
      scala.Boolean
    ]
  ): scala.Boolean = js.native
  def partition[BidirectionalIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIBidirectionalIteratorMod.IBidirectionalIterator[
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[BidirectionalIterator], 
      BidirectionalIterator
    ]
  ] */](
    first: BidirectionalIterator,
    last: BidirectionalIterator,
    pred: js.Function1[
      /* x */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[BidirectionalIterator], 
      scala.Boolean
    ]
  ): BidirectionalIterator = js.native
  def partition_copy[InputIterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], InputIterator] */, OutputIterator1 /* <: tstlLib.iteratorIFakeMod.Writeonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], OutputIterator1]
  ] */, OutputIterator2 /* <: tstlLib.iteratorIFakeMod.Writeonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], OutputIterator2]
  ] */](
    first: InputIterator,
    last: InputIterator,
    output_true: OutputIterator1,
    output_false: OutputIterator2,
    pred: js.Function1[
      /* val */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], 
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator]
    ]
  ): tstlLib.utilityPairMod.Pair[OutputIterator1, OutputIterator2] = js.native
  def partition_point[ForwardIterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
    tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator], 
    ForwardIterator
  ] */](
    first: ForwardIterator,
    last: ForwardIterator,
    pred: js.Function1[
      /* x */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator], 
      scala.Boolean
    ]
  ): ForwardIterator = js.native
  def stable_partition[BidirectionalIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIBidirectionalIteratorMod.IBidirectionalIterator[
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[BidirectionalIterator], 
      BidirectionalIterator
    ]
  ] */](
    first: BidirectionalIterator,
    last: BidirectionalIterator,
    pred: js.Function1[
      /* x */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[BidirectionalIterator], 
      scala.Boolean
    ]
  ): BidirectionalIterator = js.native
}

