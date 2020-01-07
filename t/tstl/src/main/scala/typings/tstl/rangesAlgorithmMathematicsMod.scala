package typings.tstl

import typings.tstl.internalFunctionalComparatorMod.Comparator
import typings.tstl.iteratorIForwardIteratorMod.IForwardIterator
import typings.tstl.rangesContainerIBidirectionalContainerMod.IBidirectionalContainer
import typings.tstl.rangesContainerIForwardContainerMod.IForwardContainer
import typings.tstl.rangesContainerIForwardContainerMod.IForwardContainer.IteratorType
import typings.tstl.rangesContainerIForwardContainerMod.IForwardContainer.ValueType
import typings.tstl.utilityPairMod.Pair
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/ranges/algorithm/mathematics", JSImport.Namespace)
@js.native
object rangesAlgorithmMathematicsMod extends js.Object {
  def is_permutation[Range1 /* <: js.Array[_] | IForwardContainer[_] */](range1: Range1, range2: js.Array[ValueType[Range1]]): Boolean = js.native
  def is_permutation[Range1 /* <: js.Array[_] | IForwardContainer[_] */](
    range1: Range1,
    range2: js.Array[ValueType[Range1]],
    pred: Comparator[ValueType[Range1], ValueType[Range1]]
  ): Boolean = js.native
  def is_permutation[Range1 /* <: js.Array[_] | IForwardContainer[_] */](range1: Range1, range2: IForwardContainer[IForwardIterator[ValueType[Range1], _]]): Boolean = js.native
  def is_permutation[Range1 /* <: js.Array[_] | IForwardContainer[_] */](
    range1: Range1,
    range2: IForwardContainer[IForwardIterator[ValueType[Range1], _]],
    pred: Comparator[ValueType[Range1], ValueType[Range1]]
  ): Boolean = js.native
  def max_element[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range): IteratorType[Range] = js.native
  def max_element[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, comp: Comparator[ValueType[Range], ValueType[Range]]): IteratorType[Range] = js.native
  def min_element[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range): IteratorType[Range] = js.native
  def min_element[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, comp: Comparator[ValueType[Range], ValueType[Range]]): IteratorType[Range] = js.native
  def minmax_element[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range): Pair[IteratorType[Range], IteratorType[Range]] = js.native
  def minmax_element[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, comp: Comparator[ValueType[Range], ValueType[Range]]): Pair[IteratorType[Range], IteratorType[Range]] = js.native
  def next_permutation[Range /* <: js.Array[_] | (IBidirectionalContainer[_, _]) */](range: Range): Boolean = js.native
  def next_permutation[Range /* <: js.Array[_] | (IBidirectionalContainer[_, _]) */](range: Range, comp: Comparator[ValueType[Range], ValueType[Range]]): Boolean = js.native
  def prev_permutation[Range /* <: js.Array[_] | (IBidirectionalContainer[_, _]) */](range: Range): Boolean = js.native
  def prev_permutation[Range /* <: js.Array[_] | (IBidirectionalContainer[_, _]) */](range: Range, comp: Comparator[ValueType[Range], ValueType[Range]]): Boolean = js.native
}

