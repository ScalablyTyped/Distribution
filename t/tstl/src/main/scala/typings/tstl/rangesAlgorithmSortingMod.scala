package typings.tstl

import typings.tstl.internalFunctionalComparatorMod.Comparator
import typings.tstl.rangesContainerIForwardContainerMod.IForwardContainer
import typings.tstl.rangesContainerIForwardContainerMod.IForwardContainer.IteratorType
import typings.tstl.rangesContainerIForwardContainerMod.IForwardContainer.ValueType
import typings.tstl.rangesContainerIRandomAccessContainerMod.IRandomAccessContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/ranges/algorithm/sorting", JSImport.Namespace)
@js.native
object rangesAlgorithmSortingMod extends js.Object {
  def is_sorted[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range): Boolean = js.native
  def is_sorted[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, comp: Comparator[ValueType[Range], ValueType[Range]]): Boolean = js.native
  def is_sorted_until[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range): IteratorType[Range] = js.native
  def is_sorted_until[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, comp: Comparator[ValueType[Range], ValueType[Range]]): IteratorType[Range] = js.native
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
  def sort[Range /* <: js.Array[_] | IRandomAccessContainer[_] */](range: Range): Unit = js.native
  def sort[Range /* <: js.Array[_] | IRandomAccessContainer[_] */](range: Range, comp: Comparator[ValueType[Range], ValueType[Range]]): Unit = js.native
  def stable_sort[Range /* <: js.Array[_] | IRandomAccessContainer[_] */](range: Range): Unit = js.native
  def stable_sort[Range /* <: js.Array[_] | IRandomAccessContainer[_] */](range: Range, comp: Comparator[ValueType[Range], ValueType[Range]]): Unit = js.native
}

