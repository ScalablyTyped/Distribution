package typings.tstl

import typings.tstl.internalFunctionalComparatorMod.Comparator
import typings.tstl.rangesContainerIRandomAccessContainerMod.IRandomAccessContainer
import typings.tstl.rangesContainerIRandomAccessContainerMod.IRandomAccessContainer.IteratorType
import typings.tstl.rangesContainerIRandomAccessContainerMod.IRandomAccessContainer.ValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/ranges/algorithm/heap", JSImport.Namespace)
@js.native
object rangesAlgorithmHeapMod extends js.Object {
  def is_heap[Range /* <: js.Array[_] | IRandomAccessContainer[_] */](range: Range): Boolean = js.native
  def is_heap[Range /* <: js.Array[_] | IRandomAccessContainer[_] */](range: Range, comp: Comparator[ValueType[Range], ValueType[Range]]): Boolean = js.native
  def is_heap_until[Range /* <: js.Array[_] | IRandomAccessContainer[_] */](range: Range): IteratorType[Range] = js.native
  def is_heap_until[Range /* <: js.Array[_] | IRandomAccessContainer[_] */](range: Range, comp: Comparator[ValueType[Range], ValueType[Range]]): IteratorType[Range] = js.native
  def make_heap[Range /* <: js.Array[_] | IRandomAccessContainer[_] */](range: Range): Unit = js.native
  def make_heap[Range /* <: js.Array[_] | IRandomAccessContainer[_] */](range: Range, comp: Comparator[ValueType[Range], ValueType[Range]]): Unit = js.native
  def pop_heap[Range /* <: js.Array[_] | IRandomAccessContainer[_] */](range: Range): Unit = js.native
  def pop_heap[Range /* <: js.Array[_] | IRandomAccessContainer[_] */](range: Range, comp: Comparator[ValueType[Range], ValueType[Range]]): Unit = js.native
  def push_heap[Range /* <: js.Array[_] | IRandomAccessContainer[_] */](range: Range): Unit = js.native
  def push_heap[Range /* <: js.Array[_] | IRandomAccessContainer[_] */](range: Range, comp: Comparator[ValueType[Range], ValueType[Range]]): Unit = js.native
  def sort_heap[Range /* <: js.Array[_] | IRandomAccessContainer[_] */](range: Range): Unit = js.native
  def sort_heap[Range /* <: js.Array[_] | IRandomAccessContainer[_] */](range: Range, comp: Comparator[ValueType[Range], ValueType[Range]]): Unit = js.native
}

