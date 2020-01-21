package typings.tstl

import typings.tstl.comparatorMod.Comparator
import typings.tstl.iforwardcontainerMod.IForwardContainer
import typings.tstl.iforwardcontainerMod.IForwardContainer.IteratorType
import typings.tstl.iforwardcontainerMod.IForwardContainer.ValueType
import typings.tstl.irandomaccesscontainerMod.IRandomAccessContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/ranges/algorithm/sorting", JSImport.Namespace)
@js.native
object algorithmSortingMod extends js.Object {
  @JSName("is_sorted")
  def isSorted[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range): Boolean = js.native
  @JSName("is_sorted")
  def isSorted[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, comp: Comparator[ValueType[Range], ValueType[Range]]): Boolean = js.native
  @JSName("is_sorted_until")
  def isSortedUntil[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range): IteratorType[Range] = js.native
  @JSName("is_sorted_until")
  def isSortedUntil[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, comp: Comparator[ValueType[Range], ValueType[Range]]): IteratorType[Range] = js.native
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
  def sort[Range /* <: js.Array[_] | IRandomAccessContainer[_] */](range: Range): Unit = js.native
  def sort[Range /* <: js.Array[_] | IRandomAccessContainer[_] */](range: Range, comp: Comparator[ValueType[Range], ValueType[Range]]): Unit = js.native
  @JSName("stable_sort")
  def stableSort[Range /* <: js.Array[_] | IRandomAccessContainer[_] */](range: Range): Unit = js.native
  @JSName("stable_sort")
  def stableSort[Range /* <: js.Array[_] | IRandomAccessContainer[_] */](range: Range, comp: Comparator[ValueType[Range], ValueType[Range]]): Unit = js.native
}

