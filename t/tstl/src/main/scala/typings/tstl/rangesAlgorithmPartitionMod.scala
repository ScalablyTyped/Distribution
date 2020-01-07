package typings.tstl

import typings.tstl.internalFunctionalUnaryPredicatorMod.UnaryPredicator
import typings.tstl.internalFunctionalWriteonlyMod.Writeonly
import typings.tstl.iteratorIForwardIteratorMod.IForwardIterator
import typings.tstl.rangesContainerIBidirectionalContainerMod.IBidirectionalContainer
import typings.tstl.rangesContainerIBidirectionalContainerMod.IBidirectionalContainer.IteratorType
import typings.tstl.rangesContainerIForwardContainerMod.IForwardContainer
import typings.tstl.rangesContainerIForwardContainerMod.IForwardContainer.ValueType
import typings.tstl.utilityPairMod.Pair
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/ranges/algorithm/partition", JSImport.Namespace)
@js.native
object rangesAlgorithmPartitionMod extends js.Object {
  def is_partitioned[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, pred: UnaryPredicator[ValueType[Range]]): Boolean = js.native
  def partition[Range /* <: js.Array[_] | (IBidirectionalContainer[_, _]) */](range: Range, pred: UnaryPredicator[ValueType[Range]]): IteratorType[Range] = js.native
  def partition_copy[Range /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator1 /* <: Writeonly[IForwardIterator[ValueType[Range], OutputIterator1]] */, OutputIterator2 /* <: Writeonly[IForwardIterator[ValueType[Range], OutputIterator2]] */](
    range: Range,
    output_true: OutputIterator1,
    output_false: OutputIterator2,
    pred: UnaryPredicator[ValueType[Range]]
  ): Pair[OutputIterator1, OutputIterator2] = js.native
  def partition_point[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, pred: UnaryPredicator[ValueType[Range]]): typings.tstl.rangesContainerIForwardContainerMod.IForwardContainer.IteratorType[Range] = js.native
  def stable_partition[Range /* <: js.Array[_] | (IBidirectionalContainer[_, _]) */](range: Range, pred: UnaryPredicator[ValueType[Range]]): IteratorType[Range] = js.native
}

