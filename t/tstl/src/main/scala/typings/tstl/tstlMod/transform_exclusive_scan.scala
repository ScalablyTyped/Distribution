package typings.tstl.tstlMod

import typings.tstl.iteratorIFakeMod.General
import typings.tstl.iteratorIForwardIteratorMod.IForwardIterator
import typings.tstl.numericOperationsMod.BinaryOperator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "transform_exclusive_scan")
@js.native
object transform_exclusive_scan extends js.Object {
  def apply[T, Ret, InputIterator /* <: IForwardIterator[T, InputIterator] */, OutputIterator /* <: General[IForwardIterator[Ret, OutputIterator]] */](
    first: InputIterator,
    last: InputIterator,
    output: OutputIterator,
    init: T,
    binary: BinaryOperator[Ret, Ret],
    unary: js.Function1[/* val */ T, Ret]
  ): OutputIterator = js.native
}

