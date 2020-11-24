package typings.tstl

import typings.tstl.algorithmIterationsMod.BinaryPredicatorInferrer
import typings.tstl.algorithmModifiersMod.BinaryOperatorInferrer
import typings.tstl.algorithmModifiersMod.UnaryOperatorInferrer
import typings.tstl.binaryPredicatorMod.BinaryPredicator
import typings.tstl.comparatorMod.Comparator
import typings.tstl.ibidirectionalcontainerMod.IBidirectionalContainer
import typings.tstl.ibidirectionaliteratorMod.IBidirectionalIterator
import typings.tstl.iforwardcontainerMod.IForwardContainer
import typings.tstl.iforwardcontainerMod.IForwardContainer.IteratorType
import typings.tstl.iforwardcontainerMod.IForwardContainer.ValueType
import typings.tstl.iforwarditeratorMod.IForwardIterator
import typings.tstl.irandomaccesscontainerMod.IRandomAccessContainer
import typings.tstl.pairMod.Pair
import typings.tstl.unaryPredicatorMod.UnaryPredicator
import typings.tstl.writeonlyMod.Writeonly
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tstl/ranges/algorithm", JSImport.Namespace)
@js.native
object rangesAlgorithmMod extends js.Object {
  
  @JSName("adjacent_find")
  def adjacentFind[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range): IteratorType[Range] = js.native
  @JSName("adjacent_find")
  def adjacentFind[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, pred: Comparator[ValueType[Range], ValueType[Range]]): IteratorType[Range] = js.native
  
  @JSName("all_of")
  def allOf[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, pred: UnaryPredicator[ValueType[Range]]): Boolean = js.native
  
  @JSName("any_of")
  def anyOf[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, pred: UnaryPredicator[ValueType[Range]]): Boolean = js.native
  
  @JSName("binary_search")
  def binarySearch[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, `val`: ValueType[Range]): Boolean = js.native
  @JSName("binary_search")
  def binarySearch[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, `val`: ValueType[Range], comp: Comparator[ValueType[Range], ValueType[Range]]): Boolean = js.native
  
  def copy[Range /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[Range], OutputIterator]] */](range: Range, output: OutputIterator): OutputIterator = js.native
  
  @JSName("copy_backward")
  def copyBackward[Range /* <: js.Array[_] | (IBidirectionalContainer[_, _]) */, OutputIterator /* <: Writeonly[
    IBidirectionalIterator[
      typings.tstl.ibidirectionalcontainerMod.IBidirectionalContainer.ValueType[Range], 
      OutputIterator
    ]
  ] */](range: Range, output: OutputIterator): OutputIterator = js.native
  
  @JSName("copy_if")
  def copyIf[Range /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[Range], OutputIterator]] */](range: Range, output: OutputIterator, pred: UnaryPredicator[ValueType[Range]]): OutputIterator = js.native
  
  @JSName("copy_n")
  def copyN[Range /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[Range], OutputIterator]] */](range: Range, n: Double, output: OutputIterator): OutputIterator = js.native
  
  def count[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, `val`: ValueType[Range]): Double = js.native
  
  @JSName("count_if")
  def countIf[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, pred: UnaryPredicator[ValueType[Range]]): Double = js.native
  
  def equal[Range1 /* <: js.Array[_] | IForwardContainer[_] */](range1: Range1, range2: js.Array[ValueType[Range1]]): Boolean = js.native
  def equal[Range1 /* <: js.Array[_] | IForwardContainer[_] */](range1: Range1, range2: IForwardContainer[IForwardIterator[ValueType[Range1], _]]): Boolean = js.native
  def equal[Range1 /* <: js.Array[_] | IForwardContainer[_] */, Range2 /* <: js.Array[_] | IForwardContainer[_] */](range1: Range1, range2: Range2, pred: BinaryPredicatorInferrer[Range1, Range2]): Boolean = js.native
  
  @JSName("equal_range")
  def equalRange[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, `val`: ValueType[Range]): Pair[IteratorType[Range], IteratorType[Range]] = js.native
  @JSName("equal_range")
  def equalRange[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, `val`: ValueType[Range], comp: Comparator[ValueType[Range], ValueType[Range]]): Pair[IteratorType[Range], IteratorType[Range]] = js.native
  
  def fill[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, value: ValueType[Range]): Unit = js.native
  
  @JSName("fill_n")
  def fillN[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, n: Double, value: ValueType[Range]): IteratorType[Range] = js.native
  
  def find[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, `val`: ValueType[Range]): IteratorType[Range] = js.native
  
  @JSName("find_end")
  def findEnd[Range1 /* <: js.Array[_] | IForwardContainer[_] */](range1: Range1, range2: js.Array[ValueType[Range1]]): IteratorType[Range1] = js.native
  @JSName("find_end")
  def findEnd[Range1 /* <: js.Array[_] | IForwardContainer[_] */](range1: Range1, range2: IForwardContainer[IForwardIterator[ValueType[Range1], _]]): IteratorType[Range1] = js.native
  @JSName("find_end")
  def findEnd[Range1 /* <: js.Array[_] | IForwardContainer[_] */, Range2 /* <: js.Array[_] | IForwardContainer[_] */](range1: Range1, range2: Range2, pred: BinaryPredicatorInferrer[Range1, Range2]): IteratorType[Range1] = js.native
  
  @JSName("find_first_of")
  def findFirstOf[Range1 /* <: js.Array[_] | IForwardContainer[_] */](range1: Range1, range2: js.Array[ValueType[Range1]]): IteratorType[Range1] = js.native
  @JSName("find_first_of")
  def findFirstOf[Range1 /* <: js.Array[_] | IForwardContainer[_] */](range1: Range1, range2: IForwardContainer[IForwardIterator[ValueType[Range1], _]]): IteratorType[Range1] = js.native
  @JSName("find_first_of")
  def findFirstOf[Range1 /* <: js.Array[_] | IForwardContainer[_] */, Range2 /* <: js.Array[_] | IForwardContainer[_] */](range1: Range1, range2: Range2, pred: BinaryPredicatorInferrer[Range1, Range2]): IteratorType[Range1] = js.native
  
  @JSName("find_if")
  def findIf[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, pred: UnaryPredicator[ValueType[Range]]): IteratorType[Range] = js.native
  
  @JSName("find_if_not")
  def findIfNot[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, pred: UnaryPredicator[ValueType[Range]]): IteratorType[Range] = js.native
  
  @JSName("for_each")
  def forEach[Range /* <: js.Array[_] | IForwardContainer[_] */, Func /* <: js.Function1[/* val */ ValueType[Range], _] */](range: Range, fn: Func): Func = js.native
  
  @JSName("for_each_n")
  def forEachN[Range /* <: js.Array[_] | IForwardContainer[_] */, Func /* <: js.Function1[/* val */ ValueType[Range], _] */](range: Range, n: Double, fn: Func): IteratorType[Range] = js.native
  
  def generate[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, gen: js.Function0[ValueType[Range]]): Unit = js.native
  
  @JSName("generate_n")
  def generateN[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, n: Double, gen: js.Function0[ValueType[Range]]): IteratorType[Range] = js.native
  
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
  
  @JSName("inplace_merge")
  def inplaceMerge[Range /* <: js.Array[_] | (IBidirectionalContainer[_, _]) */](
    range: Range,
    middle: typings.tstl.ibidirectionalcontainerMod.IBidirectionalContainer.IteratorType[Range]
  ): Unit = js.native
  @JSName("inplace_merge")
  def inplaceMerge[Range /* <: js.Array[_] | (IBidirectionalContainer[_, _]) */](
    range: Range,
    middle: typings.tstl.ibidirectionalcontainerMod.IBidirectionalContainer.IteratorType[Range],
    comp: Comparator[ValueType[Range], ValueType[Range]]
  ): Unit = js.native
  
  @JSName("is_heap")
  def isHeap[Range /* <: js.Array[_] | IRandomAccessContainer[_] */](range: Range): Boolean = js.native
  @JSName("is_heap")
  def isHeap[Range /* <: js.Array[_] | IRandomAccessContainer[_] */](
    range: Range,
    comp: Comparator[
      typings.tstl.irandomaccesscontainerMod.IRandomAccessContainer.ValueType[Range], 
      typings.tstl.irandomaccesscontainerMod.IRandomAccessContainer.ValueType[Range]
    ]
  ): Boolean = js.native
  
  @JSName("is_heap_until")
  def isHeapUntil[Range /* <: js.Array[_] | IRandomAccessContainer[_] */](range: Range): typings.tstl.irandomaccesscontainerMod.IRandomAccessContainer.IteratorType[Range] = js.native
  @JSName("is_heap_until")
  def isHeapUntil[Range /* <: js.Array[_] | IRandomAccessContainer[_] */](
    range: Range,
    comp: Comparator[
      typings.tstl.irandomaccesscontainerMod.IRandomAccessContainer.ValueType[Range], 
      typings.tstl.irandomaccesscontainerMod.IRandomAccessContainer.ValueType[Range]
    ]
  ): typings.tstl.irandomaccesscontainerMod.IRandomAccessContainer.IteratorType[Range] = js.native
  
  @JSName("is_partitioned")
  def isPartitioned[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, pred: UnaryPredicator[ValueType[Range]]): Boolean = js.native
  
  @JSName("is_permutation")
  def isPermutation[Range1 /* <: js.Array[_] | IForwardContainer[_] */](range1: Range1, range2: js.Array[ValueType[Range1]]): Boolean = js.native
  @JSName("is_permutation")
  def isPermutation[Range1 /* <: js.Array[_] | IForwardContainer[_] */](
    range1: Range1,
    range2: js.Array[ValueType[Range1]],
    pred: Comparator[ValueType[Range1], ValueType[Range1]]
  ): Boolean = js.native
  @JSName("is_permutation")
  def isPermutation[Range1 /* <: js.Array[_] | IForwardContainer[_] */](range1: Range1, range2: IForwardContainer[IForwardIterator[ValueType[Range1], _]]): Boolean = js.native
  @JSName("is_permutation")
  def isPermutation[Range1 /* <: js.Array[_] | IForwardContainer[_] */](
    range1: Range1,
    range2: IForwardContainer[IForwardIterator[ValueType[Range1], _]],
    pred: Comparator[ValueType[Range1], ValueType[Range1]]
  ): Boolean = js.native
  
  @JSName("is_sorted")
  def isSorted[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range): Boolean = js.native
  @JSName("is_sorted")
  def isSorted[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, comp: Comparator[ValueType[Range], ValueType[Range]]): Boolean = js.native
  
  @JSName("is_sorted_until")
  def isSortedUntil[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range): IteratorType[Range] = js.native
  @JSName("is_sorted_until")
  def isSortedUntil[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, comp: Comparator[ValueType[Range], ValueType[Range]]): IteratorType[Range] = js.native
  
  @JSName("lexicographical_compare")
  def lexicographicalCompare[Range1 /* <: js.Array[_] | IForwardContainer[_] */](range1: Range1, range2: js.Array[ValueType[Range1]]): Boolean = js.native
  @JSName("lexicographical_compare")
  def lexicographicalCompare[Range1 /* <: js.Array[_] | IForwardContainer[_] */](
    range1: Range1,
    range2: js.Array[ValueType[Range1]],
    comp: BinaryPredicatorInferrer[Range1, Range1]
  ): Boolean = js.native
  @JSName("lexicographical_compare")
  def lexicographicalCompare[Range1 /* <: js.Array[_] | IForwardContainer[_] */](range1: Range1, range2: IForwardContainer[IForwardIterator[ValueType[Range1], _]]): Boolean = js.native
  @JSName("lexicographical_compare")
  def lexicographicalCompare[Range1 /* <: js.Array[_] | IForwardContainer[_] */](
    range1: Range1,
    range2: IForwardContainer[IForwardIterator[ValueType[Range1], _]],
    comp: BinaryPredicatorInferrer[Range1, Range1]
  ): Boolean = js.native
  
  @JSName("lower_bound")
  def lowerBound[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, `val`: ValueType[Range]): IteratorType[Range] = js.native
  @JSName("lower_bound")
  def lowerBound[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, `val`: ValueType[Range], comp: Comparator[ValueType[Range], ValueType[Range]]): IteratorType[Range] = js.native
  
  @JSName("make_heap")
  def makeHeap[Range /* <: js.Array[_] | IRandomAccessContainer[_] */](range: Range): Unit = js.native
  @JSName("make_heap")
  def makeHeap[Range /* <: js.Array[_] | IRandomAccessContainer[_] */](
    range: Range,
    comp: Comparator[
      typings.tstl.irandomaccesscontainerMod.IRandomAccessContainer.ValueType[Range], 
      typings.tstl.irandomaccesscontainerMod.IRandomAccessContainer.ValueType[Range]
    ]
  ): Unit = js.native
  
  @JSName("max_element")
  def maxElement[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range): IteratorType[Range] = js.native
  @JSName("max_element")
  def maxElement[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, comp: Comparator[ValueType[Range], ValueType[Range]]): IteratorType[Range] = js.native
  
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
  
  @JSName("min_element")
  def minElement[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range): IteratorType[Range] = js.native
  @JSName("min_element")
  def minElement[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, comp: Comparator[ValueType[Range], ValueType[Range]]): IteratorType[Range] = js.native
  
  @JSName("minmax_element")
  def minmaxElement[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range): Pair[IteratorType[Range], IteratorType[Range]] = js.native
  @JSName("minmax_element")
  def minmaxElement[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, comp: Comparator[ValueType[Range], ValueType[Range]]): Pair[IteratorType[Range], IteratorType[Range]] = js.native
  
  def mismatch[Range1 /* <: js.Array[_] | IForwardContainer[_] */](range1: Range1, range2: js.Array[ValueType[Range1]]): Pair[IteratorType[Range1], IteratorType[js.Array[ValueType[Range1]]]] = js.native
  def mismatch[Range1 /* <: js.Array[_] | IForwardContainer[_] */](range1: Range1, range2: IForwardContainer[IForwardIterator[ValueType[Range1], _]]): Pair[
    IteratorType[Range1], 
    IteratorType[IForwardContainer[IForwardIterator[ValueType[Range1], _]]]
  ] = js.native
  def mismatch[Range1 /* <: js.Array[_] | IForwardContainer[_] */, Range2 /* <: js.Array[_] */](range1: Range1, range2: Range2): Pair[IteratorType[Range1], IteratorType[Range2]] = js.native
  def mismatch[Range1 /* <: js.Array[_] | IForwardContainer[_] */, Range2 /* <: js.Array[_] | IForwardContainer[_] */](range1: Range1, range2: Range2, pred: BinaryPredicatorInferrer[Range1, Range2]): Pair[IteratorType[Range1], IteratorType[Range2]] = js.native
  
  @JSName("next_permutation")
  def nextPermutation[Range /* <: js.Array[_] | (IBidirectionalContainer[_, _]) */](range: Range): Boolean = js.native
  @JSName("next_permutation")
  def nextPermutation[Range /* <: js.Array[_] | (IBidirectionalContainer[_, _]) */](range: Range, comp: Comparator[ValueType[Range], ValueType[Range]]): Boolean = js.native
  
  @JSName("none_of")
  def noneOf[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, pred: UnaryPredicator[ValueType[Range]]): Boolean = js.native
  
  @JSName("nth_element")
  def nthElement[Range /* <: js.Array[_] | IRandomAccessContainer[_] */](
    range: Range,
    nth: typings.tstl.irandomaccesscontainerMod.IRandomAccessContainer.IteratorType[Range]
  ): Unit = js.native
  @JSName("nth_element")
  def nthElement[Range /* <: js.Array[_] | IRandomAccessContainer[_] */](
    range: Range,
    nth: typings.tstl.irandomaccesscontainerMod.IRandomAccessContainer.IteratorType[Range],
    comp: Comparator[ValueType[Range], ValueType[Range]]
  ): Unit = js.native
  
  @JSName("partial_sort")
  def partialSort[Range /* <: js.Array[_] | IRandomAccessContainer[_] */](
    range: Range,
    middle: typings.tstl.irandomaccesscontainerMod.IRandomAccessContainer.IteratorType[Range]
  ): Unit = js.native
  @JSName("partial_sort")
  def partialSort[Range /* <: js.Array[_] | IRandomAccessContainer[_] */](
    range: Range,
    middle: typings.tstl.irandomaccesscontainerMod.IRandomAccessContainer.IteratorType[Range],
    comp: Comparator[ValueType[Range], ValueType[Range]]
  ): Unit = js.native
  
  @JSName("partial_sort_copy")
  def partialSortCopy[Range /* <: js.Array[_] | IForwardContainer[_] */, Output /* <: js.Array[_] | IForwardContainer[_] */](range: Range, output: Output): IteratorType[Output] = js.native
  @JSName("partial_sort_copy")
  def partialSortCopy[Range /* <: js.Array[_] | IForwardContainer[_] */, Output /* <: js.Array[_] | IForwardContainer[_] */](range: Range, output: Output, comp: Comparator[ValueType[Range], ValueType[Range]]): IteratorType[Output] = js.native
  
  def partition[Range /* <: js.Array[_] | (IBidirectionalContainer[_, _]) */](range: Range, pred: UnaryPredicator[ValueType[Range]]): typings.tstl.ibidirectionalcontainerMod.IBidirectionalContainer.IteratorType[Range] = js.native
  
  @JSName("partition_copy")
  def partitionCopy[Range /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator1 /* <: Writeonly[IForwardIterator[ValueType[Range], OutputIterator1]] */, OutputIterator2 /* <: Writeonly[IForwardIterator[ValueType[Range], OutputIterator2]] */](
    range: Range,
    output_true: OutputIterator1,
    output_false: OutputIterator2,
    pred: UnaryPredicator[ValueType[Range]]
  ): Pair[OutputIterator1, OutputIterator2] = js.native
  
  @JSName("partition_point")
  def partitionPoint[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, pred: UnaryPredicator[ValueType[Range]]): IteratorType[Range] = js.native
  
  @JSName("pop_heap")
  def popHeap[Range /* <: js.Array[_] | IRandomAccessContainer[_] */](range: Range): Unit = js.native
  @JSName("pop_heap")
  def popHeap[Range /* <: js.Array[_] | IRandomAccessContainer[_] */](
    range: Range,
    comp: Comparator[
      typings.tstl.irandomaccesscontainerMod.IRandomAccessContainer.ValueType[Range], 
      typings.tstl.irandomaccesscontainerMod.IRandomAccessContainer.ValueType[Range]
    ]
  ): Unit = js.native
  
  @JSName("prev_permutation")
  def prevPermutation[Range /* <: js.Array[_] | (IBidirectionalContainer[_, _]) */](range: Range): Boolean = js.native
  @JSName("prev_permutation")
  def prevPermutation[Range /* <: js.Array[_] | (IBidirectionalContainer[_, _]) */](range: Range, comp: Comparator[ValueType[Range], ValueType[Range]]): Boolean = js.native
  
  @JSName("push_heap")
  def pushHeap[Range /* <: js.Array[_] | IRandomAccessContainer[_] */](range: Range): Unit = js.native
  @JSName("push_heap")
  def pushHeap[Range /* <: js.Array[_] | IRandomAccessContainer[_] */](
    range: Range,
    comp: Comparator[
      typings.tstl.irandomaccesscontainerMod.IRandomAccessContainer.ValueType[Range], 
      typings.tstl.irandomaccesscontainerMod.IRandomAccessContainer.ValueType[Range]
    ]
  ): Unit = js.native
  
  def remove[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, `val`: ValueType[Range]): IteratorType[Range] = js.native
  
  @JSName("remove_copy")
  def removeCopy[Range /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[Range], OutputIterator]] */](range: Range, output: OutputIterator, `val`: ValueType[Range]): OutputIterator = js.native
  
  @JSName("remove_copy_if")
  def removeCopyIf[Range /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[Range], OutputIterator]] */](range: Range, output: OutputIterator, pred: UnaryPredicator[ValueType[Range]]): OutputIterator = js.native
  
  @JSName("remove_if")
  def removeIf[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, pred: UnaryPredicator[ValueType[Range]]): IteratorType[Range] = js.native
  
  def replace[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, old_val: ValueType[Range], new_val: ValueType[Range]): Unit = js.native
  
  @JSName("replace_copy")
  def replaceCopy[Range /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[Range], OutputIterator]] */](range: Range, output: OutputIterator, old_val: ValueType[Range], new_val: ValueType[Range]): OutputIterator = js.native
  
  @JSName("replace_copy_if")
  def replaceCopyIf[Range /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[Range], OutputIterator]] */](
    range: Range,
    output: OutputIterator,
    pred: UnaryPredicator[ValueType[Range]],
    new_val: ValueType[Range]
  ): OutputIterator = js.native
  
  @JSName("replace_if")
  def replaceIf[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, pred: UnaryPredicator[ValueType[Range]], new_val: ValueType[Range]): Unit = js.native
  
  def reverse[Range /* <: js.Array[_] | (IBidirectionalContainer[_, _]) */](range: Range): Unit = js.native
  
  @JSName("reverse_copy")
  def reverseCopy[Range /* <: js.Array[_] | (IBidirectionalContainer[_, _]) */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[Range], OutputIterator]] */](range: Range, output: OutputIterator): OutputIterator = js.native
  
  def rotate[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, middle: IteratorType[Range]): IteratorType[Range] = js.native
  
  @JSName("rotate_copy")
  def rotateCopy[Range /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[Range], OutputIterator]] */](range: Range, middle: IteratorType[Range], output: OutputIterator): OutputIterator = js.native
  
  def sample[Range /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: Writeonly[
    IForwardIterator[typings.tstl.ipointerMod.IPointer.ValueType[OutputIterator], OutputIterator]
  ] */](range: Range, first: OutputIterator, n: Double): OutputIterator = js.native
  
  def search[Range1 /* <: js.Array[_] | IForwardContainer[_] */](range1: Range1, range2: js.Array[ValueType[Range1]]): IteratorType[Range1] = js.native
  def search[Range1 /* <: js.Array[_] | IForwardContainer[_] */](range1: Range1, range2: IForwardContainer[IForwardIterator[ValueType[Range1], _]]): IteratorType[Range1] = js.native
  def search[Range1 /* <: js.Array[_] | IForwardContainer[_] */, Range2 /* <: js.Array[_] */](range1: Range1, range2: Range2): IteratorType[Range1] = js.native
  def search[Range1 /* <: js.Array[_] | IForwardContainer[_] */, Range2 /* <: js.Array[_] | IForwardContainer[_] */](range1: Range1, range2: Range2, pred: BinaryPredicatorInferrer[Range1, Range2]): IteratorType[Range1] = js.native
  
  @JSName("search_n")
  def searchN[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, count: Double, `val`: ValueType[Range]): IteratorType[Range] = js.native
  @JSName("search_n")
  def searchN[Range /* <: js.Array[_] | IForwardContainer[_] */](
    range: Range,
    count: Double,
    `val`: ValueType[Range],
    pred: Comparator[ValueType[Range], ValueType[Range]]
  ): IteratorType[Range] = js.native
  
  @JSName("set_difference")
  def setDifference[Range1 /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[Range1], OutputIterator]] */](range1: Range1, range2: js.Array[ValueType[Range1]], output: OutputIterator): OutputIterator = js.native
  @JSName("set_difference")
  def setDifference[Range1 /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[Range1], OutputIterator]] */](
    range1: Range1,
    range2: js.Array[ValueType[Range1]],
    output: OutputIterator,
    comp: Comparator[ValueType[Range1], ValueType[Range1]]
  ): OutputIterator = js.native
  @JSName("set_difference")
  def setDifference[Range1 /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[Range1], OutputIterator]] */](
    range1: Range1,
    range2: IForwardContainer[IForwardIterator[ValueType[Range1], _]],
    output: OutputIterator
  ): OutputIterator = js.native
  @JSName("set_difference")
  def setDifference[Range1 /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[Range1], OutputIterator]] */](
    range1: Range1,
    range2: IForwardContainer[IForwardIterator[ValueType[Range1], _]],
    output: OutputIterator,
    comp: Comparator[ValueType[Range1], ValueType[Range1]]
  ): OutputIterator = js.native
  
  @JSName("set_intersection")
  def setIntersection[Range1 /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[Range1], OutputIterator]] */](range1: Range1, range2: js.Array[ValueType[Range1]], output: OutputIterator): OutputIterator = js.native
  @JSName("set_intersection")
  def setIntersection[Range1 /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[Range1], OutputIterator]] */](
    range1: Range1,
    range2: js.Array[ValueType[Range1]],
    output: OutputIterator,
    comp: Comparator[ValueType[Range1], ValueType[Range1]]
  ): OutputIterator = js.native
  @JSName("set_intersection")
  def setIntersection[Range1 /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[Range1], OutputIterator]] */](
    range1: Range1,
    range2: IForwardContainer[IForwardIterator[ValueType[Range1], _]],
    output: OutputIterator
  ): OutputIterator = js.native
  @JSName("set_intersection")
  def setIntersection[Range1 /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[Range1], OutputIterator]] */](
    range1: Range1,
    range2: IForwardContainer[IForwardIterator[ValueType[Range1], _]],
    output: OutputIterator,
    comp: Comparator[ValueType[Range1], ValueType[Range1]]
  ): OutputIterator = js.native
  
  @JSName("set_symmetric_difference")
  def setSymmetricDifference[Range1 /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[Range1], OutputIterator]] */](range1: Range1, range2: js.Array[ValueType[Range1]], output: OutputIterator): OutputIterator = js.native
  @JSName("set_symmetric_difference")
  def setSymmetricDifference[Range1 /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[Range1], OutputIterator]] */](
    range1: Range1,
    range2: js.Array[ValueType[Range1]],
    output: OutputIterator,
    comp: Comparator[ValueType[Range1], ValueType[Range1]]
  ): OutputIterator = js.native
  @JSName("set_symmetric_difference")
  def setSymmetricDifference[Range1 /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[Range1], OutputIterator]] */](
    range1: Range1,
    range2: IForwardContainer[IForwardIterator[ValueType[Range1], _]],
    output: OutputIterator
  ): OutputIterator = js.native
  @JSName("set_symmetric_difference")
  def setSymmetricDifference[Range1 /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[Range1], OutputIterator]] */](
    range1: Range1,
    range2: IForwardContainer[IForwardIterator[ValueType[Range1], _]],
    output: OutputIterator,
    comp: Comparator[ValueType[Range1], ValueType[Range1]]
  ): OutputIterator = js.native
  
  @JSName("set_union")
  def setUnion[Range1 /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[Range1], OutputIterator]] */](range1: Range1, range2: js.Array[ValueType[Range1]], output: OutputIterator): OutputIterator = js.native
  @JSName("set_union")
  def setUnion[Range1 /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[Range1], OutputIterator]] */](
    range1: Range1,
    range2: js.Array[ValueType[Range1]],
    output: OutputIterator,
    comp: Comparator[ValueType[Range1], ValueType[Range1]]
  ): OutputIterator = js.native
  @JSName("set_union")
  def setUnion[Range1 /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[Range1], OutputIterator]] */](
    range1: Range1,
    range2: IForwardContainer[IForwardIterator[ValueType[Range1], _]],
    output: OutputIterator
  ): OutputIterator = js.native
  @JSName("set_union")
  def setUnion[Range1 /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[Range1], OutputIterator]] */](
    range1: Range1,
    range2: IForwardContainer[IForwardIterator[ValueType[Range1], _]],
    output: OutputIterator,
    comp: Comparator[ValueType[Range1], ValueType[Range1]]
  ): OutputIterator = js.native
  
  @JSName("shift_left")
  def shiftLeft[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, n: Double): Unit = js.native
  
  @JSName("shift_right")
  def shiftRight[Range /* <: js.Array[_] | (IBidirectionalContainer[_, _]) */](range: Range, n: Double): Unit = js.native
  
  def shuffle[Range /* <: js.Array[_] | IRandomAccessContainer[_] */](range: Range): Unit = js.native
  
  def sort[Range /* <: js.Array[_] | IRandomAccessContainer[_] */](range: Range): Unit = js.native
  def sort[Range /* <: js.Array[_] | IRandomAccessContainer[_] */](range: Range, comp: Comparator[ValueType[Range], ValueType[Range]]): Unit = js.native
  
  @JSName("sort_heap")
  def sortHeap[Range /* <: js.Array[_] | IRandomAccessContainer[_] */](range: Range): Unit = js.native
  @JSName("sort_heap")
  def sortHeap[Range /* <: js.Array[_] | IRandomAccessContainer[_] */](
    range: Range,
    comp: Comparator[
      typings.tstl.irandomaccesscontainerMod.IRandomAccessContainer.ValueType[Range], 
      typings.tstl.irandomaccesscontainerMod.IRandomAccessContainer.ValueType[Range]
    ]
  ): Unit = js.native
  
  @JSName("stable_partition")
  def stablePartition[Range /* <: js.Array[_] | (IBidirectionalContainer[_, _]) */](range: Range, pred: UnaryPredicator[ValueType[Range]]): typings.tstl.ibidirectionalcontainerMod.IBidirectionalContainer.IteratorType[Range] = js.native
  
  @JSName("stable_sort")
  def stableSort[Range /* <: js.Array[_] | IRandomAccessContainer[_] */](range: Range): Unit = js.native
  @JSName("stable_sort")
  def stableSort[Range /* <: js.Array[_] | IRandomAccessContainer[_] */](range: Range, comp: Comparator[ValueType[Range], ValueType[Range]]): Unit = js.native
  
  @JSName("swap_ranges")
  def swapRanges[Range1 /* <: js.Array[_] | IForwardContainer[_] */](range1: Range1, range2: js.Array[ValueType[Range1]]): IteratorType[js.Array[ValueType[Range1]]] = js.native
  @JSName("swap_ranges")
  def swapRanges[Range1 /* <: js.Array[_] | IForwardContainer[_] */](range1: Range1, range2: IForwardContainer[IForwardIterator[ValueType[Range1], _]]): IteratorType[IForwardContainer[IForwardIterator[ValueType[Range1], _]]] = js.native
  
  def transform[Range /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: Writeonly[
    IForwardIterator[typings.tstl.ipointerMod.IPointer.ValueType[OutputIterator], OutputIterator]
  ] */](range: Range, result: OutputIterator, op: UnaryOperatorInferrer[Range, OutputIterator]): OutputIterator = js.native
  def transform[Range1 /* <: js.Array[_] | IForwardContainer[_] */, Range2 /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: Writeonly[
    IForwardIterator[typings.tstl.ipointerMod.IPointer.ValueType[OutputIterator], OutputIterator]
  ] */](
    range: Range1,
    first: Range2,
    result: OutputIterator,
    op: BinaryOperatorInferrer[Range1, Range2, OutputIterator]
  ): OutputIterator = js.native
  
  def unique[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range): IteratorType[Range] = js.native
  def unique[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, pred: BinaryPredicator[ValueType[Range], ValueType[Range]]): IteratorType[Range] = js.native
  
  @JSName("unique_copy")
  def uniqueCopy[Range /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[Range], OutputIterator]] */](range: Range, output: OutputIterator): OutputIterator = js.native
  @JSName("unique_copy")
  def uniqueCopy[Range /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[Range], OutputIterator]] */](range: Range, output: OutputIterator, pred: BinaryPredicator[ValueType[Range], ValueType[Range]]): OutputIterator = js.native
  
  @JSName("upper_bound")
  def upperBound[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, `val`: ValueType[Range]): IteratorType[Range] = js.native
  @JSName("upper_bound")
  def upperBound[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, `val`: ValueType[Range], comp: Comparator[ValueType[Range], ValueType[Range]]): IteratorType[Range] = js.native
}
