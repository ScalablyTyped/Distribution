package typings.tstl

import typings.tstl.generalMod.General
import typings.tstl.ibidirectionaliteratorMod.IBidirectionalIterator
import typings.tstl.iforwarditeratorMod.IForwardIterator
import typings.tstl.ipointerMod.IPointer.ValueType
import typings.tstl.pairMod.Pair
import typings.tstl.unaryPredicatorMod.UnaryPredicator
import typings.tstl.writeonlyMod.Writeonly
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tstl/algorithm/partition", JSImport.Namespace)
@js.native
object partitionMod extends js.Object {
  
  @JSName("is_partitioned")
  def isPartitioned[ForwardIterator /* <: IForwardIterator[ValueType[ForwardIterator], ForwardIterator] */](first: ForwardIterator, last: ForwardIterator, pred: UnaryPredicator[ValueType[ForwardIterator]]): Boolean = js.native
  
  def partition[BidirectionalIterator /* <: General[IBidirectionalIterator[ValueType[BidirectionalIterator], BidirectionalIterator]] */](
    first: BidirectionalIterator,
    last: BidirectionalIterator,
    pred: UnaryPredicator[ValueType[BidirectionalIterator]]
  ): BidirectionalIterator = js.native
  
  @JSName("partition_copy")
  def partitionCopy[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */, OutputIterator1 /* <: Writeonly[IForwardIterator[ValueType[InputIterator], OutputIterator1]] */, OutputIterator2 /* <: Writeonly[IForwardIterator[ValueType[InputIterator], OutputIterator2]] */](
    first: InputIterator,
    last: InputIterator,
    output_true: OutputIterator1,
    output_false: OutputIterator2,
    pred: UnaryPredicator[ValueType[InputIterator]]
  ): Pair[OutputIterator1, OutputIterator2] = js.native
  
  @JSName("partition_point")
  def partitionPoint[ForwardIterator /* <: IForwardIterator[ValueType[ForwardIterator], ForwardIterator] */](first: ForwardIterator, last: ForwardIterator, pred: UnaryPredicator[ValueType[ForwardIterator]]): ForwardIterator = js.native
  
  @JSName("stable_partition")
  def stablePartition[BidirectionalIterator /* <: General[IBidirectionalIterator[ValueType[BidirectionalIterator], BidirectionalIterator]] */](
    first: BidirectionalIterator,
    last: BidirectionalIterator,
    pred: UnaryPredicator[ValueType[BidirectionalIterator]]
  ): BidirectionalIterator = js.native
}
