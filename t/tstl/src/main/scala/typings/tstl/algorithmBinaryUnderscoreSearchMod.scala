package typings.tstl

import typings.tstl.functionalIPointerMod.IPointerNs.ValueType
import typings.tstl.iteratorIForwardIteratorMod.IForwardIterator
import typings.tstl.utilityPairMod.Pair
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/algorithm/binary_search", JSImport.Namespace)
@js.native
object algorithmBinaryUnderscoreSearchMod extends js.Object {
  def binary_search[ForwardIterator /* <: IForwardIterator[ValueType[ForwardIterator], ForwardIterator] */](first: ForwardIterator, last: ForwardIterator, `val`: ValueType[ForwardIterator]): Boolean = js.native
  def binary_search[ForwardIterator /* <: IForwardIterator[ValueType[ForwardIterator], ForwardIterator] */](
    first: ForwardIterator,
    last: ForwardIterator,
    `val`: ValueType[ForwardIterator],
    comp: js.Function2[/* x */ ValueType[ForwardIterator], /* y */ ValueType[ForwardIterator], Boolean]
  ): Boolean = js.native
  def equal_range[ForwardIterator /* <: IForwardIterator[ValueType[ForwardIterator], ForwardIterator] */](first: ForwardIterator, last: ForwardIterator, `val`: ValueType[ForwardIterator]): Pair[ForwardIterator, ForwardIterator] = js.native
  def equal_range[ForwardIterator /* <: IForwardIterator[ValueType[ForwardIterator], ForwardIterator] */](
    first: ForwardIterator,
    last: ForwardIterator,
    `val`: ValueType[ForwardIterator],
    comp: js.Function2[/* x */ ValueType[ForwardIterator], /* y */ ValueType[ForwardIterator], Boolean]
  ): Pair[ForwardIterator, ForwardIterator] = js.native
  def lower_bound[ForwardIterator /* <: IForwardIterator[ValueType[ForwardIterator], ForwardIterator] */](first: ForwardIterator, last: ForwardIterator, `val`: ValueType[ForwardIterator]): ForwardIterator = js.native
  def lower_bound[ForwardIterator /* <: IForwardIterator[ValueType[ForwardIterator], ForwardIterator] */](
    first: ForwardIterator,
    last: ForwardIterator,
    `val`: ValueType[ForwardIterator],
    comp: js.Function2[/* x */ ValueType[ForwardIterator], /* y */ ValueType[ForwardIterator], Boolean]
  ): ForwardIterator = js.native
  def upper_bound[ForwardIterator /* <: IForwardIterator[ValueType[ForwardIterator], ForwardIterator] */](first: ForwardIterator, last: ForwardIterator, `val`: ValueType[ForwardIterator]): ForwardIterator = js.native
  def upper_bound[ForwardIterator /* <: IForwardIterator[ValueType[ForwardIterator], ForwardIterator] */](
    first: ForwardIterator,
    last: ForwardIterator,
    `val`: ValueType[ForwardIterator],
    comp: js.Function2[/* x */ ValueType[ForwardIterator], /* y */ ValueType[ForwardIterator], Boolean]
  ): ForwardIterator = js.native
}

