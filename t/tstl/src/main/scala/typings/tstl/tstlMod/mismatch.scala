package typings.tstl.tstlMod

import typings.tstl.functionalIPointerMod.IPointer.ValueType
import typings.tstl.iteratorIForwardIteratorMod.IForwardIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "mismatch")
@js.native
object mismatch extends js.Object {
  def apply[Iterator1 /* <: IForwardIterator[ValueType[Iterator1], Iterator1] */, Iterator2 /* <: IForwardIterator[ValueType[Iterator1], Iterator2] */](first1: Iterator1, last1: Iterator1, first2: Iterator2): typings.tstl.utilityPairMod.Pair[Iterator1, Iterator2] = js.native
  def apply[Iterator1 /* <: IForwardIterator[ValueType[Iterator1], Iterator1] */, Iterator2 /* <: IForwardIterator[ValueType[Iterator2], Iterator2] */](
    first1: Iterator1,
    last1: Iterator1,
    first2: Iterator2,
    pred: js.Function2[/* x */ ValueType[Iterator1], /* y */ ValueType[Iterator2], Boolean]
  ): typings.tstl.utilityPairMod.Pair[Iterator1, Iterator2] = js.native
}

