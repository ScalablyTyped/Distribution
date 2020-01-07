package typings.tstl

import typings.tstl.internalFunctionalComparatorMod.Comparator
import typings.tstl.internalFunctionalWriteonlyMod.Writeonly
import typings.tstl.iteratorIForwardIteratorMod.IForwardIterator
import typings.tstl.rangesContainerIBidirectionalContainerMod.IBidirectionalContainer
import typings.tstl.rangesContainerIBidirectionalContainerMod.IBidirectionalContainer.IteratorType
import typings.tstl.rangesContainerIForwardContainerMod.IForwardContainer
import typings.tstl.rangesContainerIForwardContainerMod.IForwardContainer.ValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/ranges/algorithm/merge", JSImport.Namespace)
@js.native
object rangesAlgorithmMergeMod extends js.Object {
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
  def inplace_merge[Range /* <: js.Array[_] | (IBidirectionalContainer[_, _]) */](range: Range, middle: IteratorType[Range]): Unit = js.native
  def inplace_merge[Range /* <: js.Array[_] | (IBidirectionalContainer[_, _]) */](range: Range, middle: IteratorType[Range], comp: Comparator[ValueType[Range], ValueType[Range]]): Unit = js.native
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
}

