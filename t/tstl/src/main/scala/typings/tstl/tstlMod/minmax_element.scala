package typings.tstl.tstlMod

import typings.tstl.functionalIPointerMod.IPointer.ValueType
import typings.tstl.iteratorIForwardIteratorMod.IForwardIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "minmax_element")
@js.native
object minmax_element extends js.Object {
  def apply[ForwardIterator /* <: IForwardIterator[ValueType[ForwardIterator], ForwardIterator] */](first: ForwardIterator, last: ForwardIterator): typings.tstl.utilityPairMod.Pair[ForwardIterator, ForwardIterator] = js.native
  def apply[ForwardIterator /* <: IForwardIterator[ValueType[ForwardIterator], ForwardIterator] */](
    first: ForwardIterator,
    last: ForwardIterator,
    comp: js.Function2[/* x */ ValueType[ForwardIterator], /* y */ ValueType[ForwardIterator], Boolean]
  ): typings.tstl.utilityPairMod.Pair[ForwardIterator, ForwardIterator] = js.native
}

