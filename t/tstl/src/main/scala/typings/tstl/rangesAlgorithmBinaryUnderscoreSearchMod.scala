package typings.tstl

import typings.tstl.internalFunctionalComparatorMod.Comparator
import typings.tstl.rangesContainerIForwardContainerMod.IForwardContainer
import typings.tstl.rangesContainerIForwardContainerMod.IForwardContainer.IteratorType
import typings.tstl.rangesContainerIForwardContainerMod.IForwardContainer.ValueType
import typings.tstl.utilityPairMod.Pair
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/ranges/algorithm/binary_search", JSImport.Namespace)
@js.native
object rangesAlgorithmBinaryUnderscoreSearchMod extends js.Object {
  def binary_search[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, `val`: ValueType[Range]): Boolean = js.native
  def binary_search[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, `val`: ValueType[Range], comp: Comparator[ValueType[Range], ValueType[Range]]): Boolean = js.native
  def equal_range[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, `val`: ValueType[Range]): Pair[IteratorType[Range], IteratorType[Range]] = js.native
  def equal_range[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, `val`: ValueType[Range], comp: Comparator[ValueType[Range], ValueType[Range]]): Pair[IteratorType[Range], IteratorType[Range]] = js.native
  def lower_bound[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, `val`: ValueType[Range]): IteratorType[Range] = js.native
  def lower_bound[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, `val`: ValueType[Range], comp: Comparator[ValueType[Range], ValueType[Range]]): IteratorType[Range] = js.native
  def upper_bound[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, `val`: ValueType[Range]): IteratorType[Range] = js.native
  def upper_bound[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, `val`: ValueType[Range], comp: Comparator[ValueType[Range], ValueType[Range]]): IteratorType[Range] = js.native
}

