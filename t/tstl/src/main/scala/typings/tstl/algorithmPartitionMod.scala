package typings.tstl

import typings.tstl.ibidirectionalcontainerMod.IBidirectionalContainer
import typings.tstl.ibidirectionalcontainerMod.IBidirectionalContainer.IteratorType
import typings.tstl.iforwardcontainerMod.IForwardContainer
import typings.tstl.iforwardcontainerMod.IForwardContainer.ValueType
import typings.tstl.iforwarditeratorMod.IForwardIterator
import typings.tstl.pairMod.Pair
import typings.tstl.unaryPredicatorMod.UnaryPredicator
import typings.tstl.writeonlyMod.Writeonly
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/ranges/algorithm/partition", JSImport.Namespace)
@js.native
object algorithmPartitionMod extends js.Object {
  @JSName("is_partitioned")
  def isPartitioned[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, pred: UnaryPredicator[ValueType[Range]]): Boolean = js.native
  def partition[Range /* <: js.Array[_] | (IBidirectionalContainer[_, _]) */](range: Range, pred: UnaryPredicator[ValueType[Range]]): IteratorType[Range] = js.native
  @JSName("partition_copy")
  def partitionCopy[Range /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator1 /* <: Writeonly[IForwardIterator[ValueType[Range], OutputIterator1]] */, OutputIterator2 /* <: Writeonly[IForwardIterator[ValueType[Range], OutputIterator2]] */](
    range: Range,
    output_true: OutputIterator1,
    output_false: OutputIterator2,
    pred: UnaryPredicator[ValueType[Range]]
  ): Pair[OutputIterator1, OutputIterator2] = js.native
  @JSName("partition_point")
  def partitionPoint[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, pred: UnaryPredicator[ValueType[Range]]): typings.tstl.iforwardcontainerMod.IForwardContainer.IteratorType[Range] = js.native
  @JSName("stable_partition")
  def stablePartition[Range /* <: js.Array[_] | (IBidirectionalContainer[_, _]) */](range: Range, pred: UnaryPredicator[ValueType[Range]]): IteratorType[Range] = js.native
}

