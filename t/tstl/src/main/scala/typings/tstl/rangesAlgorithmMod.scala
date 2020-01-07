package typings.tstl

import typings.tstl.internalFunctionalBinaryPredicatorMod.BinaryPredicator
import typings.tstl.internalFunctionalComparatorMod.Comparator
import typings.tstl.internalFunctionalUnaryPredicatorMod.UnaryPredicator
import typings.tstl.internalFunctionalWriteonlyMod.Writeonly
import typings.tstl.iteratorIBidirectionalIteratorMod.IBidirectionalIterator
import typings.tstl.iteratorIForwardIteratorMod.IForwardIterator
import typings.tstl.rangesAlgorithmIterationsMod.BinaryPredicatorInferrer
import typings.tstl.rangesAlgorithmModifiersMod.BinaryOperatorInferrer
import typings.tstl.rangesAlgorithmModifiersMod.UnaryOperatorInferrer
import typings.tstl.rangesContainerIBidirectionalContainerMod.IBidirectionalContainer
import typings.tstl.rangesContainerIForwardContainerMod.IForwardContainer
import typings.tstl.rangesContainerIForwardContainerMod.IForwardContainer.IteratorType
import typings.tstl.rangesContainerIForwardContainerMod.IForwardContainer.ValueType
import typings.tstl.rangesContainerIRandomAccessContainerMod.IRandomAccessContainer
import typings.tstl.utilityPairMod.Pair
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/ranges/algorithm", JSImport.Namespace)
@js.native
object rangesAlgorithmMod extends js.Object {
  def adjacent_find[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range): IteratorType[Range] = js.native
  def adjacent_find[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, pred: Comparator[ValueType[Range], ValueType[Range]]): IteratorType[Range] = js.native
  def all_of[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, pred: UnaryPredicator[ValueType[Range]]): Boolean = js.native
  def any_of[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, pred: UnaryPredicator[ValueType[Range]]): Boolean = js.native
  def binary_search[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, `val`: ValueType[Range]): Boolean = js.native
  def binary_search[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, `val`: ValueType[Range], comp: Comparator[ValueType[Range], ValueType[Range]]): Boolean = js.native
  def copy[Range /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[Range], OutputIterator]] */](range: Range, output: OutputIterator): OutputIterator = js.native
  def copy_backward[Range /* <: js.Array[_] | (IBidirectionalContainer[_, _]) */, OutputIterator /* <: Writeonly[
    IBidirectionalIterator[
      typings.tstl.rangesContainerIBidirectionalContainerMod.IBidirectionalContainer.ValueType[Range], 
      OutputIterator
    ]
  ] */](range: Range, output: OutputIterator): OutputIterator = js.native
  def copy_if[Range /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[Range], OutputIterator]] */](range: Range, output: OutputIterator, pred: UnaryPredicator[ValueType[Range]]): OutputIterator = js.native
  def copy_n[Range /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[Range], OutputIterator]] */](range: Range, n: Double, output: OutputIterator): OutputIterator = js.native
  def count[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, `val`: ValueType[Range]): Double = js.native
  def count_if[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, pred: UnaryPredicator[ValueType[Range]]): Double = js.native
  def equal[Range1 /* <: js.Array[_] | IForwardContainer[_] */](range1: Range1, range2: js.Array[ValueType[Range1]]): Boolean = js.native
  def equal[Range1 /* <: js.Array[_] | IForwardContainer[_] */](range1: Range1, range2: IForwardContainer[IForwardIterator[ValueType[Range1], _]]): Boolean = js.native
  def equal[Range1 /* <: js.Array[_] | IForwardContainer[_] */, Range2 /* <: js.Array[_] | IForwardContainer[_] */](range1: Range1, range2: Range2, pred: BinaryPredicatorInferrer[Range1, Range2]): Boolean = js.native
  def equal_range[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, `val`: ValueType[Range]): Pair[IteratorType[Range], IteratorType[Range]] = js.native
  def equal_range[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, `val`: ValueType[Range], comp: Comparator[ValueType[Range], ValueType[Range]]): Pair[IteratorType[Range], IteratorType[Range]] = js.native
  def fill[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, value: ValueType[Range]): Unit = js.native
  def fill_n[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, n: Double, value: ValueType[Range]): IteratorType[Range] = js.native
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
  def generate[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, gen: js.Function0[ValueType[Range]]): Unit = js.native
  def generate_n[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, n: Double, gen: js.Function0[ValueType[Range]]): IteratorType[Range] = js.native
  def includes[Range1 /* <: js.Array[_] | IForwardContainer[_] */](range1: Range1, range2: js.Array[ValueType[Range1]]): Boolean = js.native
  def includes[Range1 /* <: js.Array[_] | IForwardContainer[_] */](
    range1: Range1,
    range2: js.Array[ValueType[Range1]],
    comp: Comparator[ValueType[Range1], ValueType[Range1]]
  ): Boolean = js.native
  def includes[Range1 /* <: js.Array[_] | IForwardContainer[_] */](range1: Range1, range2: IForwardContainer[IForwardIterator[ValueType[Range1], _]]): Boolean = js.native
  def includes[Range1 /* <: js.Array[_] | IForwardContainer[_] */](
    range1: Range1,
    range2: IForwardContainer[IForwardIterator[ValueType[Range1], _]],
    comp: Comparator[ValueType[Range1], ValueType[Range1]]
  ): Boolean = js.native
  def inplace_merge[Range /* <: js.Array[_] | (IBidirectionalContainer[_, _]) */](
    range: Range,
    middle: typings.tstl.rangesContainerIBidirectionalContainerMod.IBidirectionalContainer.IteratorType[Range]
  ): Unit = js.native
  def inplace_merge[Range /* <: js.Array[_] | (IBidirectionalContainer[_, _]) */](
    range: Range,
    middle: typings.tstl.rangesContainerIBidirectionalContainerMod.IBidirectionalContainer.IteratorType[Range],
    comp: Comparator[ValueType[Range], ValueType[Range]]
  ): Unit = js.native
  def is_heap[Range /* <: js.Array[_] | IRandomAccessContainer[_] */](range: Range): Boolean = js.native
  def is_heap[Range /* <: js.Array[_] | IRandomAccessContainer[_] */](
    range: Range,
    comp: Comparator[
      typings.tstl.rangesContainerIRandomAccessContainerMod.IRandomAccessContainer.ValueType[Range], 
      typings.tstl.rangesContainerIRandomAccessContainerMod.IRandomAccessContainer.ValueType[Range]
    ]
  ): Boolean = js.native
  def is_heap_until[Range /* <: js.Array[_] | IRandomAccessContainer[_] */](range: Range): typings.tstl.rangesContainerIRandomAccessContainerMod.IRandomAccessContainer.IteratorType[Range] = js.native
  def is_heap_until[Range /* <: js.Array[_] | IRandomAccessContainer[_] */](
    range: Range,
    comp: Comparator[
      typings.tstl.rangesContainerIRandomAccessContainerMod.IRandomAccessContainer.ValueType[Range], 
      typings.tstl.rangesContainerIRandomAccessContainerMod.IRandomAccessContainer.ValueType[Range]
    ]
  ): typings.tstl.rangesContainerIRandomAccessContainerMod.IRandomAccessContainer.IteratorType[Range] = js.native
  def is_partitioned[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, pred: UnaryPredicator[ValueType[Range]]): Boolean = js.native
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
  def is_sorted[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range): Boolean = js.native
  def is_sorted[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, comp: Comparator[ValueType[Range], ValueType[Range]]): Boolean = js.native
  def is_sorted_until[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range): IteratorType[Range] = js.native
  def is_sorted_until[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, comp: Comparator[ValueType[Range], ValueType[Range]]): IteratorType[Range] = js.native
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
  def lower_bound[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, `val`: ValueType[Range]): IteratorType[Range] = js.native
  def lower_bound[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, `val`: ValueType[Range], comp: Comparator[ValueType[Range], ValueType[Range]]): IteratorType[Range] = js.native
  def make_heap[Range /* <: js.Array[_] | IRandomAccessContainer[_] */](range: Range): Unit = js.native
  def make_heap[Range /* <: js.Array[_] | IRandomAccessContainer[_] */](
    range: Range,
    comp: Comparator[
      typings.tstl.rangesContainerIRandomAccessContainerMod.IRandomAccessContainer.ValueType[Range], 
      typings.tstl.rangesContainerIRandomAccessContainerMod.IRandomAccessContainer.ValueType[Range]
    ]
  ): Unit = js.native
  def max_element[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range): IteratorType[Range] = js.native
  def max_element[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, comp: Comparator[ValueType[Range], ValueType[Range]]): IteratorType[Range] = js.native
  def merge[Range1 /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[Range1], OutputIterator]] */](range1: Range1, range2: js.Array[ValueType[Range1]], output: OutputIterator): OutputIterator = js.native
  def merge[Range1 /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[Range1], OutputIterator]] */](
    range1: Range1,
    range2: js.Array[ValueType[Range1]],
    output: OutputIterator,
    comp: Comparator[ValueType[Range1], ValueType[Range1]]
  ): OutputIterator = js.native
  def merge[Range1 /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[Range1], OutputIterator]] */](
    range1: Range1,
    range2: IForwardContainer[IForwardIterator[ValueType[Range1], _]],
    output: OutputIterator
  ): OutputIterator = js.native
  def merge[Range1 /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[Range1], OutputIterator]] */](
    range1: Range1,
    range2: IForwardContainer[IForwardIterator[ValueType[Range1], _]],
    output: OutputIterator,
    comp: Comparator[ValueType[Range1], ValueType[Range1]]
  ): OutputIterator = js.native
  def min_element[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range): IteratorType[Range] = js.native
  def min_element[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, comp: Comparator[ValueType[Range], ValueType[Range]]): IteratorType[Range] = js.native
  def minmax_element[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range): Pair[IteratorType[Range], IteratorType[Range]] = js.native
  def minmax_element[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, comp: Comparator[ValueType[Range], ValueType[Range]]): Pair[IteratorType[Range], IteratorType[Range]] = js.native
  def mismatch[Range1 /* <: js.Array[_] | IForwardContainer[_] */](range1: Range1, range2: js.Array[ValueType[Range1]]): Pair[IteratorType[Range1], IteratorType[js.Array[ValueType[Range1]]]] = js.native
  def mismatch[Range1 /* <: js.Array[_] | IForwardContainer[_] */](range1: Range1, range2: IForwardContainer[IForwardIterator[ValueType[Range1], _]]): Pair[
    IteratorType[Range1], 
    IteratorType[IForwardContainer[IForwardIterator[ValueType[Range1], _]]]
  ] = js.native
  def mismatch[Range1 /* <: js.Array[_] | IForwardContainer[_] */, Range2 /* <: js.Array[_] */](range1: Range1, range2: Range2): Pair[IteratorType[Range1], IteratorType[Range2]] = js.native
  def mismatch[Range1 /* <: js.Array[_] | IForwardContainer[_] */, Range2 /* <: js.Array[_] | IForwardContainer[_] */](range1: Range1, range2: Range2, pred: BinaryPredicatorInferrer[Range1, Range2]): Pair[IteratorType[Range1], IteratorType[Range2]] = js.native
  def next_permutation[Range /* <: js.Array[_] | (IBidirectionalContainer[_, _]) */](range: Range): Boolean = js.native
  def next_permutation[Range /* <: js.Array[_] | (IBidirectionalContainer[_, _]) */](range: Range, comp: Comparator[ValueType[Range], ValueType[Range]]): Boolean = js.native
  def none_of[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, pred: UnaryPredicator[ValueType[Range]]): Boolean = js.native
  def nth_element[Range /* <: js.Array[_] | IRandomAccessContainer[_] */](
    range: Range,
    nth: typings.tstl.rangesContainerIRandomAccessContainerMod.IRandomAccessContainer.IteratorType[Range]
  ): Unit = js.native
  def nth_element[Range /* <: js.Array[_] | IRandomAccessContainer[_] */](
    range: Range,
    nth: typings.tstl.rangesContainerIRandomAccessContainerMod.IRandomAccessContainer.IteratorType[Range],
    comp: Comparator[ValueType[Range], ValueType[Range]]
  ): Unit = js.native
  def partial_sort[Range /* <: js.Array[_] | IRandomAccessContainer[_] */](
    range: Range,
    middle: typings.tstl.rangesContainerIRandomAccessContainerMod.IRandomAccessContainer.IteratorType[Range]
  ): Unit = js.native
  def partial_sort[Range /* <: js.Array[_] | IRandomAccessContainer[_] */](
    range: Range,
    middle: typings.tstl.rangesContainerIRandomAccessContainerMod.IRandomAccessContainer.IteratorType[Range],
    comp: Comparator[ValueType[Range], ValueType[Range]]
  ): Unit = js.native
  def partial_sort_copy[Range /* <: js.Array[_] | IForwardContainer[_] */, Output /* <: js.Array[_] | IForwardContainer[_] */](range: Range, output: Output): IteratorType[Output] = js.native
  def partial_sort_copy[Range /* <: js.Array[_] | IForwardContainer[_] */, Output /* <: js.Array[_] | IForwardContainer[_] */](range: Range, output: Output, comp: Comparator[ValueType[Range], ValueType[Range]]): IteratorType[Output] = js.native
  def partition[Range /* <: js.Array[_] | (IBidirectionalContainer[_, _]) */](range: Range, pred: UnaryPredicator[ValueType[Range]]): typings.tstl.rangesContainerIBidirectionalContainerMod.IBidirectionalContainer.IteratorType[Range] = js.native
  def partition_copy[Range /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator1 /* <: Writeonly[IForwardIterator[ValueType[Range], OutputIterator1]] */, OutputIterator2 /* <: Writeonly[IForwardIterator[ValueType[Range], OutputIterator2]] */](
    range: Range,
    output_true: OutputIterator1,
    output_false: OutputIterator2,
    pred: UnaryPredicator[ValueType[Range]]
  ): Pair[OutputIterator1, OutputIterator2] = js.native
  def partition_point[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, pred: UnaryPredicator[ValueType[Range]]): IteratorType[Range] = js.native
  def pop_heap[Range /* <: js.Array[_] | IRandomAccessContainer[_] */](range: Range): Unit = js.native
  def pop_heap[Range /* <: js.Array[_] | IRandomAccessContainer[_] */](
    range: Range,
    comp: Comparator[
      typings.tstl.rangesContainerIRandomAccessContainerMod.IRandomAccessContainer.ValueType[Range], 
      typings.tstl.rangesContainerIRandomAccessContainerMod.IRandomAccessContainer.ValueType[Range]
    ]
  ): Unit = js.native
  def prev_permutation[Range /* <: js.Array[_] | (IBidirectionalContainer[_, _]) */](range: Range): Boolean = js.native
  def prev_permutation[Range /* <: js.Array[_] | (IBidirectionalContainer[_, _]) */](range: Range, comp: Comparator[ValueType[Range], ValueType[Range]]): Boolean = js.native
  def push_heap[Range /* <: js.Array[_] | IRandomAccessContainer[_] */](range: Range): Unit = js.native
  def push_heap[Range /* <: js.Array[_] | IRandomAccessContainer[_] */](
    range: Range,
    comp: Comparator[
      typings.tstl.rangesContainerIRandomAccessContainerMod.IRandomAccessContainer.ValueType[Range], 
      typings.tstl.rangesContainerIRandomAccessContainerMod.IRandomAccessContainer.ValueType[Range]
    ]
  ): Unit = js.native
  def remove[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, `val`: ValueType[Range]): IteratorType[Range] = js.native
  def remove_copy[Range /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[Range], OutputIterator]] */](range: Range, output: OutputIterator, `val`: ValueType[Range]): OutputIterator = js.native
  def remove_copy_if[Range /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[Range], OutputIterator]] */](range: Range, output: OutputIterator, pred: UnaryPredicator[ValueType[Range]]): OutputIterator = js.native
  def remove_if[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, pred: UnaryPredicator[ValueType[Range]]): IteratorType[Range] = js.native
  def replace[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, old_val: ValueType[Range], new_val: ValueType[Range]): Unit = js.native
  def replace_copy[Range /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[Range], OutputIterator]] */](range: Range, output: OutputIterator, old_val: ValueType[Range], new_val: ValueType[Range]): OutputIterator = js.native
  def replace_copy_if[Range /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[Range], OutputIterator]] */](
    range: Range,
    output: OutputIterator,
    pred: UnaryPredicator[ValueType[Range]],
    new_val: ValueType[Range]
  ): OutputIterator = js.native
  def replace_if[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, pred: UnaryPredicator[ValueType[Range]], new_val: ValueType[Range]): Unit = js.native
  def reverse[Range /* <: js.Array[_] | (IBidirectionalContainer[_, _]) */](range: Range): Unit = js.native
  def reverse_copy[Range /* <: js.Array[_] | (IBidirectionalContainer[_, _]) */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[Range], OutputIterator]] */](range: Range, output: OutputIterator): OutputIterator = js.native
  def rotate[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, middle: IteratorType[Range]): IteratorType[Range] = js.native
  def rotate_copy[Range /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[Range], OutputIterator]] */](range: Range, middle: IteratorType[Range], output: OutputIterator): OutputIterator = js.native
  def sample[Range /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: Writeonly[
    IForwardIterator[
      typings.tstl.functionalIPointerMod.IPointer.ValueType[OutputIterator], 
      OutputIterator
    ]
  ] */](range: Range, first: OutputIterator, n: Double): OutputIterator = js.native
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
  def set_difference[Range1 /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[Range1], OutputIterator]] */](range1: Range1, range2: js.Array[ValueType[Range1]], output: OutputIterator): OutputIterator = js.native
  def set_difference[Range1 /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[Range1], OutputIterator]] */](
    range1: Range1,
    range2: js.Array[ValueType[Range1]],
    output: OutputIterator,
    comp: Comparator[ValueType[Range1], ValueType[Range1]]
  ): OutputIterator = js.native
  def set_difference[Range1 /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[Range1], OutputIterator]] */](
    range1: Range1,
    range2: IForwardContainer[IForwardIterator[ValueType[Range1], _]],
    output: OutputIterator
  ): OutputIterator = js.native
  def set_difference[Range1 /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[Range1], OutputIterator]] */](
    range1: Range1,
    range2: IForwardContainer[IForwardIterator[ValueType[Range1], _]],
    output: OutputIterator,
    comp: Comparator[ValueType[Range1], ValueType[Range1]]
  ): OutputIterator = js.native
  def set_intersection[Range1 /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[Range1], OutputIterator]] */](range1: Range1, range2: js.Array[ValueType[Range1]], output: OutputIterator): OutputIterator = js.native
  def set_intersection[Range1 /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[Range1], OutputIterator]] */](
    range1: Range1,
    range2: js.Array[ValueType[Range1]],
    output: OutputIterator,
    comp: Comparator[ValueType[Range1], ValueType[Range1]]
  ): OutputIterator = js.native
  def set_intersection[Range1 /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[Range1], OutputIterator]] */](
    range1: Range1,
    range2: IForwardContainer[IForwardIterator[ValueType[Range1], _]],
    output: OutputIterator
  ): OutputIterator = js.native
  def set_intersection[Range1 /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[Range1], OutputIterator]] */](
    range1: Range1,
    range2: IForwardContainer[IForwardIterator[ValueType[Range1], _]],
    output: OutputIterator,
    comp: Comparator[ValueType[Range1], ValueType[Range1]]
  ): OutputIterator = js.native
  def set_symmetric_difference[Range1 /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[Range1], OutputIterator]] */](range1: Range1, range2: js.Array[ValueType[Range1]], output: OutputIterator): OutputIterator = js.native
  def set_symmetric_difference[Range1 /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[Range1], OutputIterator]] */](
    range1: Range1,
    range2: js.Array[ValueType[Range1]],
    output: OutputIterator,
    comp: Comparator[ValueType[Range1], ValueType[Range1]]
  ): OutputIterator = js.native
  def set_symmetric_difference[Range1 /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[Range1], OutputIterator]] */](
    range1: Range1,
    range2: IForwardContainer[IForwardIterator[ValueType[Range1], _]],
    output: OutputIterator
  ): OutputIterator = js.native
  def set_symmetric_difference[Range1 /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[Range1], OutputIterator]] */](
    range1: Range1,
    range2: IForwardContainer[IForwardIterator[ValueType[Range1], _]],
    output: OutputIterator,
    comp: Comparator[ValueType[Range1], ValueType[Range1]]
  ): OutputIterator = js.native
  def set_union[Range1 /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[Range1], OutputIterator]] */](range1: Range1, range2: js.Array[ValueType[Range1]], output: OutputIterator): OutputIterator = js.native
  def set_union[Range1 /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[Range1], OutputIterator]] */](
    range1: Range1,
    range2: js.Array[ValueType[Range1]],
    output: OutputIterator,
    comp: Comparator[ValueType[Range1], ValueType[Range1]]
  ): OutputIterator = js.native
  def set_union[Range1 /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[Range1], OutputIterator]] */](
    range1: Range1,
    range2: IForwardContainer[IForwardIterator[ValueType[Range1], _]],
    output: OutputIterator
  ): OutputIterator = js.native
  def set_union[Range1 /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[Range1], OutputIterator]] */](
    range1: Range1,
    range2: IForwardContainer[IForwardIterator[ValueType[Range1], _]],
    output: OutputIterator,
    comp: Comparator[ValueType[Range1], ValueType[Range1]]
  ): OutputIterator = js.native
  def shift_left[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, n: Double): Unit = js.native
  def shift_right[Range /* <: js.Array[_] | (IBidirectionalContainer[_, _]) */](range: Range, n: Double): Unit = js.native
  def shuffle[Range /* <: js.Array[_] | IRandomAccessContainer[_] */](range: Range): Unit = js.native
  def sort[Range /* <: js.Array[_] | IRandomAccessContainer[_] */](range: Range): Unit = js.native
  def sort[Range /* <: js.Array[_] | IRandomAccessContainer[_] */](range: Range, comp: Comparator[ValueType[Range], ValueType[Range]]): Unit = js.native
  def sort_heap[Range /* <: js.Array[_] | IRandomAccessContainer[_] */](range: Range): Unit = js.native
  def sort_heap[Range /* <: js.Array[_] | IRandomAccessContainer[_] */](
    range: Range,
    comp: Comparator[
      typings.tstl.rangesContainerIRandomAccessContainerMod.IRandomAccessContainer.ValueType[Range], 
      typings.tstl.rangesContainerIRandomAccessContainerMod.IRandomAccessContainer.ValueType[Range]
    ]
  ): Unit = js.native
  def stable_partition[Range /* <: js.Array[_] | (IBidirectionalContainer[_, _]) */](range: Range, pred: UnaryPredicator[ValueType[Range]]): typings.tstl.rangesContainerIBidirectionalContainerMod.IBidirectionalContainer.IteratorType[Range] = js.native
  def stable_sort[Range /* <: js.Array[_] | IRandomAccessContainer[_] */](range: Range): Unit = js.native
  def stable_sort[Range /* <: js.Array[_] | IRandomAccessContainer[_] */](range: Range, comp: Comparator[ValueType[Range], ValueType[Range]]): Unit = js.native
  def swap_ranges[Range1 /* <: js.Array[_] | IForwardContainer[_] */](range1: Range1, range2: js.Array[ValueType[Range1]]): IteratorType[js.Array[ValueType[Range1]]] = js.native
  def swap_ranges[Range1 /* <: js.Array[_] | IForwardContainer[_] */](range1: Range1, range2: IForwardContainer[IForwardIterator[ValueType[Range1], _]]): IteratorType[IForwardContainer[IForwardIterator[ValueType[Range1], _]]] = js.native
  def transform[Range /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: Writeonly[
    IForwardIterator[
      typings.tstl.functionalIPointerMod.IPointer.ValueType[OutputIterator], 
      OutputIterator
    ]
  ] */](range: Range, result: OutputIterator, op: UnaryOperatorInferrer[Range, OutputIterator]): OutputIterator = js.native
  def transform[Range1 /* <: js.Array[_] | IForwardContainer[_] */, Range2 /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: Writeonly[
    IForwardIterator[
      typings.tstl.functionalIPointerMod.IPointer.ValueType[OutputIterator], 
      OutputIterator
    ]
  ] */](
    range: Range1,
    first: Range2,
    result: OutputIterator,
    op: BinaryOperatorInferrer[Range1, Range2, OutputIterator]
  ): OutputIterator = js.native
  def unique[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range): IteratorType[Range] = js.native
  def unique[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, pred: BinaryPredicator[ValueType[Range], ValueType[Range]]): IteratorType[Range] = js.native
  def unique_copy[Range /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[Range], OutputIterator]] */](range: Range, output: OutputIterator): OutputIterator = js.native
  def unique_copy[Range /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[Range], OutputIterator]] */](range: Range, output: OutputIterator, pred: BinaryPredicator[ValueType[Range], ValueType[Range]]): OutputIterator = js.native
  def upper_bound[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, `val`: ValueType[Range]): IteratorType[Range] = js.native
  def upper_bound[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, `val`: ValueType[Range], comp: Comparator[ValueType[Range], ValueType[Range]]): IteratorType[Range] = js.native
}

