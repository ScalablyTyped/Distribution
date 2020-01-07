package typings.tstl

import typings.tstl.internalFunctionalBinaryPredicatorMod.BinaryPredicator
import typings.tstl.internalFunctionalComparatorMod.Comparator
import typings.tstl.internalFunctionalUnaryPredicatorMod.UnaryPredicator
import typings.tstl.iteratorIForwardIteratorMod.IForwardIterator
import typings.tstl.rangesContainerIForwardContainerMod.IForwardContainer
import typings.tstl.rangesContainerIForwardContainerMod.IForwardContainer.IteratorType
import typings.tstl.rangesContainerIForwardContainerMod.IForwardContainer.ValueType
import typings.tstl.utilityPairMod.Pair
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/ranges/algorithm/iterations", JSImport.Namespace)
@js.native
object rangesAlgorithmIterationsMod extends js.Object {
  def adjacent_find[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range): IteratorType[Range] = js.native
  def adjacent_find[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, pred: Comparator[ValueType[Range], ValueType[Range]]): IteratorType[Range] = js.native
  def all_of[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, pred: UnaryPredicator[ValueType[Range]]): Boolean = js.native
  def any_of[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, pred: UnaryPredicator[ValueType[Range]]): Boolean = js.native
  def count[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, `val`: ValueType[Range]): Double = js.native
  def count_if[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, pred: UnaryPredicator[ValueType[Range]]): Double = js.native
  def equal[Range1 /* <: js.Array[_] | IForwardContainer[_] */](range1: Range1, range2: js.Array[ValueType[Range1]]): Boolean = js.native
  def equal[Range1 /* <: js.Array[_] | IForwardContainer[_] */](range1: Range1, range2: IForwardContainer[IForwardIterator[ValueType[Range1], _]]): Boolean = js.native
  def equal[Range1 /* <: js.Array[_] | IForwardContainer[_] */, Range2 /* <: js.Array[_] | IForwardContainer[_] */](range1: Range1, range2: Range2, pred: BinaryPredicatorInferrer[Range1, Range2]): Boolean = js.native
  def find[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, `val`: ValueType[Range]): IteratorType[Range] = js.native
  def find_end[Range1 /* <: js.Array[_] | IForwardContainer[_] */](range1: Range1, range2: js.Array[ValueType[Range1]]): IteratorType[Range1] = js.native
  def find_end[Range1 /* <: js.Array[_] | IForwardContainer[_] */](range1: Range1, range2: IForwardContainer[IForwardIterator[ValueType[Range1], _]]): IteratorType[Range1] = js.native
  def find_end[Range1 /* <: js.Array[_] | IForwardContainer[_] */, Range2 /* <: js.Array[_] | IForwardContainer[_] */](range1: Range1, range2: Range2, pred: BinaryPredicatorInferrer[Range1, Range2]): IteratorType[Range1] = js.native
  def find_first_of[Range1 /* <: js.Array[_] | IForwardContainer[_] */](range1: Range1, range2: js.Array[ValueType[Range1]]): IteratorType[Range1] = js.native
  def find_first_of[Range1 /* <: js.Array[_] | IForwardContainer[_] */](range1: Range1, range2: IForwardContainer[IForwardIterator[ValueType[Range1], _]]): IteratorType[Range1] = js.native
  def find_first_of[Range1 /* <: js.Array[_] | IForwardContainer[_] */, Range2 /* <: js.Array[_] | IForwardContainer[_] */](range1: Range1, range2: Range2, pred: BinaryPredicatorInferrer[Range1, Range2]): IteratorType[Range1] = js.native
  def find_if[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, pred: UnaryPredicator[ValueType[Range]]): IteratorType[Range] = js.native
  def find_if_not[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, pred: UnaryPredicator[ValueType[Range]]): IteratorType[Range] = js.native
  def for_each[Range /* <: js.Array[_] | IForwardContainer[_] */, Func /* <: js.Function1[/* val */ ValueType[Range], _] */](range: Range, fn: Func): Func = js.native
  def for_each_n[Range /* <: js.Array[_] | IForwardContainer[_] */, Func /* <: js.Function1[/* val */ ValueType[Range], _] */](range: Range, n: Double, fn: Func): IteratorType[Range] = js.native
  def lexicographical_compare[Range1 /* <: js.Array[_] | IForwardContainer[_] */](range1: Range1, range2: js.Array[ValueType[Range1]]): Boolean = js.native
  def lexicographical_compare[Range1 /* <: js.Array[_] | IForwardContainer[_] */](
    range1: Range1,
    range2: js.Array[ValueType[Range1]],
    comp: BinaryPredicatorInferrer[Range1, Range1]
  ): Boolean = js.native
  def lexicographical_compare[Range1 /* <: js.Array[_] | IForwardContainer[_] */](range1: Range1, range2: IForwardContainer[IForwardIterator[ValueType[Range1], _]]): Boolean = js.native
  def lexicographical_compare[Range1 /* <: js.Array[_] | IForwardContainer[_] */](
    range1: Range1,
    range2: IForwardContainer[IForwardIterator[ValueType[Range1], _]],
    comp: BinaryPredicatorInferrer[Range1, Range1]
  ): Boolean = js.native
  def mismatch[Range1 /* <: js.Array[_] | IForwardContainer[_] */](range1: Range1, range2: js.Array[ValueType[Range1]]): Pair[IteratorType[Range1], IteratorType[js.Array[ValueType[Range1]]]] = js.native
  def mismatch[Range1 /* <: js.Array[_] | IForwardContainer[_] */](range1: Range1, range2: IForwardContainer[IForwardIterator[ValueType[Range1], _]]): Pair[
    IteratorType[Range1], 
    IteratorType[IForwardContainer[IForwardIterator[ValueType[Range1], _]]]
  ] = js.native
  def mismatch[Range1 /* <: js.Array[_] | IForwardContainer[_] */, Range2 /* <: js.Array[_] */](range1: Range1, range2: Range2): Pair[IteratorType[Range1], IteratorType[Range2]] = js.native
  def mismatch[Range1 /* <: js.Array[_] | IForwardContainer[_] */, Range2 /* <: js.Array[_] | IForwardContainer[_] */](range1: Range1, range2: Range2, pred: BinaryPredicatorInferrer[Range1, Range2]): Pair[IteratorType[Range1], IteratorType[Range2]] = js.native
  def none_of[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, pred: UnaryPredicator[ValueType[Range]]): Boolean = js.native
  def search[Range1 /* <: js.Array[_] | IForwardContainer[_] */](range1: Range1, range2: js.Array[ValueType[Range1]]): IteratorType[Range1] = js.native
  def search[Range1 /* <: js.Array[_] | IForwardContainer[_] */](range1: Range1, range2: IForwardContainer[IForwardIterator[ValueType[Range1], _]]): IteratorType[Range1] = js.native
  def search[Range1 /* <: js.Array[_] | IForwardContainer[_] */, Range2 /* <: js.Array[_] */](range1: Range1, range2: Range2): IteratorType[Range1] = js.native
  def search[Range1 /* <: js.Array[_] | IForwardContainer[_] */, Range2 /* <: js.Array[_] | IForwardContainer[_] */](range1: Range1, range2: Range2, pred: BinaryPredicatorInferrer[Range1, Range2]): IteratorType[Range1] = js.native
  def search_n[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, count: Double, `val`: ValueType[Range]): IteratorType[Range] = js.native
  def search_n[Range /* <: js.Array[_] | IForwardContainer[_] */](
    range: Range,
    count: Double,
    `val`: ValueType[Range],
    pred: Comparator[ValueType[Range], ValueType[Range]]
  ): IteratorType[Range] = js.native
  type BinaryPredicatorInferrer[Range1 /* <: js.Array[_] | IForwardContainer[_] */, Range2 /* <: js.Array[_] | IForwardContainer[_] */] = BinaryPredicator[ValueType[Range1], ValueType[Range2]]
}

